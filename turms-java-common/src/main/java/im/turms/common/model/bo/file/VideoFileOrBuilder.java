// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/file/video_file.proto

package im.turms.common.model.bo.file;

public interface VideoFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.VideoFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.im.turms.proto.VideoFile.Description description = 1;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.im.turms.proto.VideoFile.Description description = 1;</code>
   * @return The description.
   */
  im.turms.common.model.bo.file.VideoFile.Description getDescription();
  /**
   * <code>.im.turms.proto.VideoFile.Description description = 1;</code>
   */
  im.turms.common.model.bo.file.VideoFile.DescriptionOrBuilder getDescriptionOrBuilder();

  /**
   * <code>.google.protobuf.BytesValue data = 2;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.google.protobuf.BytesValue data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.BytesValue getData();
  /**
   * <code>.google.protobuf.BytesValue data = 2;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getDataOrBuilder();
}
