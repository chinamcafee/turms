// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/common/int64_values_with_version.proto

package im.turms.common.model.bo.common;

public final class Int64ValuesWithVersionOuterClass {
  private Int64ValuesWithVersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_Int64ValuesWithVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,model/common/int64_values_with_version" +
      ".proto\022\016im.turms.proto\032\036google/protobuf/" +
      "wrappers.proto\"`\n\026Int64ValuesWithVersion" +
      "\022\016\n\006values\030\001 \003(\003\0226\n\021last_updated_date\030\002 " +
      "\001(\0132\033.google.protobuf.Int64ValueB#\n\037im.t" +
      "urms.common.model.bo.commonP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_Int64ValuesWithVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor,
        new java.lang.String[] { "Values", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
