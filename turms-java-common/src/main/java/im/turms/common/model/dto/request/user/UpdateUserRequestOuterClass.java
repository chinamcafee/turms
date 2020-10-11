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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/update_user_request.proto

package im.turms.common.model.dto.request.user;

public final class UpdateUserRequestOuterClass {
  private UpdateUserRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UpdateUserRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UpdateUserRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&request/user/update_user_request.proto" +
      "\022\016im.turms.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032&constant/profile_access_strate" +
      "gy.proto\"\344\001\n\021UpdateUserRequest\022.\n\010passwo" +
      "rd\030\001 \001(\0132\034.google.protobuf.StringValue\022*" +
      "\n\004name\030\002 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022+\n\005intro\030\003 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022F\n\027profile_access_strategy\030\004 \001(\016" +
      "2%.im.turms.proto.ProfileAccessStrategyB" +
      "-\n&im.turms.common.model.dto.request.use" +
      "rP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.turms.common.constant.ProfileAccessStrategyOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UpdateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UpdateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UpdateUserRequest_descriptor,
        new java.lang.String[] { "Password", "Name", "Intro", "ProfileAccessStrategy", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.common.constant.ProfileAccessStrategyOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
