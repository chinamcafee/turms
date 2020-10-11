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
// source: request/user/relationship/query_relationship_groups_request.proto

package im.turms.common.model.dto.request.user.relationship;

public final class QueryRelationshipGroupsRequestOuterClass {
  private QueryRelationshipGroupsRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QueryRelationshipGroupsRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QueryRelationshipGroupsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nArequest/user/relationship/query_relati" +
      "onship_groups_request.proto\022\016im.turms.pr" +
      "oto\032\036google/protobuf/wrappers.proto\"X\n\036Q" +
      "ueryRelationshipGroupsRequest\0226\n\021last_up" +
      "dated_date\030\001 \001(\0132\033.google.protobuf.Int64" +
      "ValueB:\n3im.turms.common.model.dto.reque" +
      "st.user.relationshipP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_QueryRelationshipGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QueryRelationshipGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QueryRelationshipGroupsRequest_descriptor,
        new java.lang.String[] { "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
