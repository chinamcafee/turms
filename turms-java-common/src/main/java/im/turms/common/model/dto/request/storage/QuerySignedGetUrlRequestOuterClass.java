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
// source: request/storage/query_signed_get_url_request.proto

package im.turms.common.model.dto.request.storage;

public final class QuerySignedGetUrlRequestOuterClass {
  private QuerySignedGetUrlRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QuerySignedGetUrlRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QuerySignedGetUrlRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2request/storage/query_signed_get_url_r" +
      "equest.proto\022\016im.turms.proto\032\036google/pro" +
      "tobuf/wrappers.proto\032\033constant/content_t" +
      "ype.proto\"\252\001\n\030QuerySignedGetUrlRequest\0221" +
      "\n\014content_type\030\001 \001(\0162\033.im.turms.proto.Co" +
      "ntentType\022-\n\007key_str\030\002 \001(\0132\034.google.prot" +
      "obuf.StringValue\022,\n\007key_num\030\003 \001(\0132\033.goog" +
      "le.protobuf.Int64ValueB0\n)im.turms.commo" +
      "n.model.dto.request.storageP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.turms.common.constant.ContentTypeOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_QuerySignedGetUrlRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QuerySignedGetUrlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QuerySignedGetUrlRequest_descriptor,
        new java.lang.String[] { "ContentType", "KeyStr", "KeyNum", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.common.constant.ContentTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
