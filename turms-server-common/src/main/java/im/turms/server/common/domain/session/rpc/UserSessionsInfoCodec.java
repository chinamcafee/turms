/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.domain.session.rpc;

import im.turms.server.common.access.client.dto.constant.DeviceType;
import im.turms.server.common.access.client.dto.constant.UserStatus;
import im.turms.server.common.domain.location.bo.Location;
import im.turms.server.common.domain.session.bo.UserSessionInfo;
import im.turms.server.common.domain.session.bo.UserSessionsInfo;
import im.turms.server.common.infra.cluster.service.codec.codec.Codec;
import im.turms.server.common.infra.cluster.service.codec.codec.CodecId;
import im.turms.server.common.infra.cluster.service.codec.codec.CodecUtil;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author James Chen
 */
public class UserSessionsInfoCodec implements Codec<UserSessionsInfo> {

    @Override
    public CodecId getCodecId() {
        return CodecId.BO_USER_SESSIONS;
    }

    @Override
    public void write(ByteBuf output, UserSessionsInfo data) {
        output.writeLong(data.userId());
        output.writeByte(data.status().getNumber());
        List<UserSessionInfo> sessions = data.sessions();
        CodecUtil.writeVarint32(output, sessions.size());
        for (UserSessionInfo session : sessions) {
            Location location = session.loginLocation();
            output.writeInt(session.id());
            output.writeByte(session.version());
            output.writeByte(session.deviceType().getNumber());
            CodecUtil.writeStringMap(output, session.deviceDetails());
            output.writeLong(session.loginDate().getTime());
            output.writeLong(session.lastHeartbeatRequestDate().getTime());
            output.writeLong(session.lastRequestDate().getTime());
            output.writeBoolean(session.isSessionOpen());
            CodecUtil.writeIp(output, session.ipBytes());
            if (location == null) {
                output.writeByte(0);
            } else {
                output.writeByte(1);
                output.writeFloat(location.longitude());
                output.writeFloat(location.latitude());
                Date timestamp = location.timestamp();
                output.writeLong(timestamp == null ? Long.MIN_VALUE : timestamp.getTime());
                CodecUtil.writeStringMap(output, location.details());
            }
        }
    }

    @Override
    public UserSessionsInfo read(ByteBuf input) {
        long userId = input.readLong();
        UserStatus status = UserStatus.forNumber(input.readByte());
        int size = CodecUtil.readVarint32(input);
        List<UserSessionInfo> sessions = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int sessionId = input.readInt();
            int version = input.readByte();
            DeviceType deviceType = DeviceType.forNumber(input.readByte());
            Map<String, String> deviceDetails = CodecUtil.readStringMap(input);
            Date loginDate = new Date(input.readLong());
            Date lastHeartbeatRequestDate = new Date(input.readLong());
            Date lastRequestDate = new Date(input.readLong());
            boolean isSessionOpen = input.readBoolean();
            byte[] ipBytes = CodecUtil.readIp(input);
            Location loginLocation = null;
            if (input.readByte() == 1) {
                float longitude = input.readFloat();
                float latitude = input.readFloat();
                long timestamp = input.readLong();
                loginLocation = new Location(longitude,
                        latitude,
                        timestamp == Long.MIN_VALUE ? null : new Date(timestamp),
                        CodecUtil.readStringMap(input));
            }
            sessions.add(new UserSessionInfo(sessionId,
                    version,
                    deviceType,
                    deviceDetails,
                    loginDate,
                    loginLocation,
                    lastHeartbeatRequestDate,
                    lastRequestDate,
                    isSessionOpen,
                    ipBytes,
                    null));
        }
        return new UserSessionsInfo(userId, status, sessions);
    }

    @Override
    public int initialCapacity(UserSessionsInfo data) {
        int size = data.sessions().size();
        return Long.BYTES + Byte.BYTES + CodecUtil.computeVarint32Size(size) + 64 * size;
    }

}
