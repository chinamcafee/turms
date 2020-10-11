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
// source: request/group/enrollment/query_group_invitations_request.proto

package im.turms.common.model.dto.request.group.enrollment;

public final class QueryGroupInvitationsRequestOuterClass {
  private QueryGroupInvitationsRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>request/group/enrollment/query_group_i" +
      "nvitations_request.proto\022\016im.turms.proto" +
      "\032\036google/protobuf/wrappers.proto\"\271\001\n\034Que" +
      "ryGroupInvitationsRequest\022-\n\010group_id\030\001 " +
      "\001(\0132\033.google.protobuf.Int64Value\0222\n\016are_" +
      "sent_by_me\030\002 \001(\0132\032.google.protobuf.BoolV" +
      "alue\0226\n\021last_updated_date\030\003 \001(\0132\033.google" +
      ".protobuf.Int64ValueB9\n2im.turms.common." +
      "model.dto.request.group.enrollmentP\001\272\002\000b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor,
        new java.lang.String[] { "GroupId", "AreSentByMe", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
