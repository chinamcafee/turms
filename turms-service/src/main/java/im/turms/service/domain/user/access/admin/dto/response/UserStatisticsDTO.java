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

package im.turms.service.domain.user.access.admin.dto.response;

import im.turms.service.domain.common.access.admin.dto.response.StatisticsRecordDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;

/**
 * @author James Chen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
public final class UserStatisticsDTO {
    private Long deletedUsers;
    private Long usersWhoSentMessages;
    private Long loggedInUsers;
    private Long maxOnlineUsers;
    private Long registeredUsers;

    private List<StatisticsRecordDTO> deletedUsersRecords;
    private List<StatisticsRecordDTO> usersWhoSentMessagesRecords;
    private List<StatisticsRecordDTO> loggedInUsersRecords;
    private List<StatisticsRecordDTO> maxOnlineUsersRecords;
    private List<StatisticsRecordDTO> registeredUsersRecords;
}
