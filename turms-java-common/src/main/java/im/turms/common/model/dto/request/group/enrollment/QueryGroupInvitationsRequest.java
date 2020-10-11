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

/**
 * Protobuf type {@code im.turms.proto.QueryGroupInvitationsRequest}
 */
public final class QueryGroupInvitationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.QueryGroupInvitationsRequest)
    QueryGroupInvitationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGroupInvitationsRequest.newBuilder() to construct.
  private QueryGroupInvitationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGroupInvitationsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGroupInvitationsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryGroupInvitationsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (groupId_ != null) {
              subBuilder = groupId_.toBuilder();
            }
            groupId_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(groupId_);
              groupId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (areSentByMe_ != null) {
              subBuilder = areSentByMe_.toBuilder();
            }
            areSentByMe_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(areSentByMe_);
              areSentByMe_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (lastUpdatedDate_ != null) {
              subBuilder = lastUpdatedDate_.toBuilder();
            }
            lastUpdatedDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdatedDate_);
              lastUpdatedDate_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOuterClass.internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOuterClass.internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.class, im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value groupId_;
  /**
   * <code>.google.protobuf.Int64Value group_id = 1;</code>
   * @return Whether the groupId field is set.
   */
  @java.lang.Override
  public boolean hasGroupId() {
    return groupId_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value group_id = 1;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getGroupId() {
    return groupId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
  }
  /**
   * <code>.google.protobuf.Int64Value group_id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder() {
    return getGroupId();
  }

  public static final int ARE_SENT_BY_ME_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue areSentByMe_;
  /**
   * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
   * @return Whether the areSentByMe field is set.
   */
  @java.lang.Override
  public boolean hasAreSentByMe() {
    return areSentByMe_ != null;
  }
  /**
   * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
   * @return The areSentByMe.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getAreSentByMe() {
    return areSentByMe_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : areSentByMe_;
  }
  /**
   * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getAreSentByMeOrBuilder() {
    return getAreSentByMe();
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value lastUpdatedDate_;
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdatedDate() {
    return lastUpdatedDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   * @return The lastUpdatedDate.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getLastUpdatedDate() {
    return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
    return getLastUpdatedDate();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (groupId_ != null) {
      output.writeMessage(1, getGroupId());
    }
    if (areSentByMe_ != null) {
      output.writeMessage(2, getAreSentByMe());
    }
    if (lastUpdatedDate_ != null) {
      output.writeMessage(3, getLastUpdatedDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroupId());
    }
    if (areSentByMe_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAreSentByMe());
    }
    if (lastUpdatedDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastUpdatedDate());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest other = (im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest) obj;

    if (hasGroupId() != other.hasGroupId()) return false;
    if (hasGroupId()) {
      if (!getGroupId()
          .equals(other.getGroupId())) return false;
    }
    if (hasAreSentByMe() != other.hasAreSentByMe()) return false;
    if (hasAreSentByMe()) {
      if (!getAreSentByMe()
          .equals(other.getAreSentByMe())) return false;
    }
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (!getLastUpdatedDate()
          .equals(other.getLastUpdatedDate())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGroupId()) {
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId().hashCode();
    }
    if (hasAreSentByMe()) {
      hash = (37 * hash) + ARE_SENT_BY_ME_FIELD_NUMBER;
      hash = (53 * hash) + getAreSentByMe().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.QueryGroupInvitationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.QueryGroupInvitationsRequest)
      im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOuterClass.internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOuterClass.internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.class, im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (groupIdBuilder_ == null) {
        groupId_ = null;
      } else {
        groupId_ = null;
        groupIdBuilder_ = null;
      }
      if (areSentByMeBuilder_ == null) {
        areSentByMe_ = null;
      } else {
        areSentByMe_ = null;
        areSentByMeBuilder_ = null;
      }
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequestOuterClass.internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest build() {
      im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest buildPartial() {
      im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest result = new im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest(this);
      if (groupIdBuilder_ == null) {
        result.groupId_ = groupId_;
      } else {
        result.groupId_ = groupIdBuilder_.build();
      }
      if (areSentByMeBuilder_ == null) {
        result.areSentByMe_ = areSentByMe_;
      } else {
        result.areSentByMe_ = areSentByMeBuilder_.build();
      }
      if (lastUpdatedDateBuilder_ == null) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
      } else {
        result.lastUpdatedDate_ = lastUpdatedDateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest other) {
      if (other == im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest.getDefaultInstance()) return this;
      if (other.hasGroupId()) {
        mergeGroupId(other.getGroupId());
      }
      if (other.hasAreSentByMe()) {
        mergeAreSentByMe(other.getAreSentByMe());
      }
      if (other.hasLastUpdatedDate()) {
        mergeLastUpdatedDate(other.getLastUpdatedDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value groupId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> groupIdBuilder_;
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     * @return Whether the groupId field is set.
     */
    public boolean hasGroupId() {
      return groupIdBuilder_ != null || groupId_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     * @return The groupId.
     */
    public com.google.protobuf.Int64Value getGroupId() {
      if (groupIdBuilder_ == null) {
        return groupId_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
      } else {
        return groupIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public Builder setGroupId(com.google.protobuf.Int64Value value) {
      if (groupIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupId_ = value;
        onChanged();
      } else {
        groupIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public Builder setGroupId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (groupIdBuilder_ == null) {
        groupId_ = builderForValue.build();
        onChanged();
      } else {
        groupIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public Builder mergeGroupId(com.google.protobuf.Int64Value value) {
      if (groupIdBuilder_ == null) {
        if (groupId_ != null) {
          groupId_ =
            com.google.protobuf.Int64Value.newBuilder(groupId_).mergeFrom(value).buildPartial();
        } else {
          groupId_ = value;
        }
        onChanged();
      } else {
        groupIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public Builder clearGroupId() {
      if (groupIdBuilder_ == null) {
        groupId_ = null;
        onChanged();
      } else {
        groupId_ = null;
        groupIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getGroupIdBuilder() {

      onChanged();
      return getGroupIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder() {
      if (groupIdBuilder_ != null) {
        return groupIdBuilder_.getMessageOrBuilder();
      } else {
        return groupId_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : groupId_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value group_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
        getGroupIdFieldBuilder() {
      if (groupIdBuilder_ == null) {
        groupIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getGroupId(),
                getParentForChildren(),
                isClean());
        groupId_ = null;
      }
      return groupIdBuilder_;
    }

    private com.google.protobuf.BoolValue areSentByMe_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> areSentByMeBuilder_;
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     * @return Whether the areSentByMe field is set.
     */
    public boolean hasAreSentByMe() {
      return areSentByMeBuilder_ != null || areSentByMe_ != null;
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     * @return The areSentByMe.
     */
    public com.google.protobuf.BoolValue getAreSentByMe() {
      if (areSentByMeBuilder_ == null) {
        return areSentByMe_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : areSentByMe_;
      } else {
        return areSentByMeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public Builder setAreSentByMe(com.google.protobuf.BoolValue value) {
      if (areSentByMeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        areSentByMe_ = value;
        onChanged();
      } else {
        areSentByMeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public Builder setAreSentByMe(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (areSentByMeBuilder_ == null) {
        areSentByMe_ = builderForValue.build();
        onChanged();
      } else {
        areSentByMeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public Builder mergeAreSentByMe(com.google.protobuf.BoolValue value) {
      if (areSentByMeBuilder_ == null) {
        if (areSentByMe_ != null) {
          areSentByMe_ =
            com.google.protobuf.BoolValue.newBuilder(areSentByMe_).mergeFrom(value).buildPartial();
        } else {
          areSentByMe_ = value;
        }
        onChanged();
      } else {
        areSentByMeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public Builder clearAreSentByMe() {
      if (areSentByMeBuilder_ == null) {
        areSentByMe_ = null;
        onChanged();
      } else {
        areSentByMe_ = null;
        areSentByMeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAreSentByMeBuilder() {

      onChanged();
      return getAreSentByMeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAreSentByMeOrBuilder() {
      if (areSentByMeBuilder_ != null) {
        return areSentByMeBuilder_.getMessageOrBuilder();
      } else {
        return areSentByMe_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : areSentByMe_;
      }
    }
    /**
     * <code>.google.protobuf.BoolValue are_sent_by_me = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>
        getAreSentByMeFieldBuilder() {
      if (areSentByMeBuilder_ == null) {
        areSentByMeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getAreSentByMe(),
                getParentForChildren(),
                isClean());
        areSentByMe_ = null;
      }
      return areSentByMeBuilder_;
    }

    private com.google.protobuf.Int64Value lastUpdatedDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> lastUpdatedDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    public boolean hasLastUpdatedDate() {
      return lastUpdatedDateBuilder_ != null || lastUpdatedDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     * @return The lastUpdatedDate.
     */
    public com.google.protobuf.Int64Value getLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      } else {
        return lastUpdatedDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public Builder setLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdatedDate_ = value;
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public Builder setLastUpdatedDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public Builder mergeLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (lastUpdatedDate_ != null) {
          lastUpdatedDate_ =
            com.google.protobuf.Int64Value.newBuilder(lastUpdatedDate_).mergeFrom(value).buildPartial();
        } else {
          lastUpdatedDate_ = value;
        }
        onChanged();
      } else {
        lastUpdatedDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public Builder clearLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
        onChanged();
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public com.google.protobuf.Int64Value.Builder getLastUpdatedDateBuilder() {

      onChanged();
      return getLastUpdatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
      if (lastUpdatedDateBuilder_ != null) {
        return lastUpdatedDateBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdatedDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
        getLastUpdatedDateFieldBuilder() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getLastUpdatedDate(),
                getParentForChildren(),
                isClean());
        lastUpdatedDate_ = null;
      }
      return lastUpdatedDateBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.QueryGroupInvitationsRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.QueryGroupInvitationsRequest)
  private static final im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest();
  }

  public static im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGroupInvitationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGroupInvitationsRequest>() {
    @java.lang.Override
    public QueryGroupInvitationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryGroupInvitationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryGroupInvitationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGroupInvitationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.enrollment.QueryGroupInvitationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

