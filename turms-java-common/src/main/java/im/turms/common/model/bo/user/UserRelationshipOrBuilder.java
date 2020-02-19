// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_relationship.proto

package im.turms.common.model.bo.user;

public interface UserRelationshipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UserRelationship)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int64Value owner_id = 1;</code>
   * @return Whether the ownerId field is set.
   */
  boolean hasOwnerId();
  /**
   * <code>.google.protobuf.Int64Value owner_id = 1;</code>
   * @return The ownerId.
   */
  com.google.protobuf.Int64Value getOwnerId();
  /**
   * <code>.google.protobuf.Int64Value owner_id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getOwnerIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value related_user_id = 2;</code>
   * @return Whether the relatedUserId field is set.
   */
  boolean hasRelatedUserId();
  /**
   * <code>.google.protobuf.Int64Value related_user_id = 2;</code>
   * @return The relatedUserId.
   */
  com.google.protobuf.Int64Value getRelatedUserId();
  /**
   * <code>.google.protobuf.Int64Value related_user_id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRelatedUserIdOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue is_blocked = 3;</code>
   * @return Whether the isBlocked field is set.
   */
  boolean hasIsBlocked();
  /**
   * <code>.google.protobuf.BoolValue is_blocked = 3;</code>
   * @return The isBlocked.
   */
  com.google.protobuf.BoolValue getIsBlocked();
  /**
   * <code>.google.protobuf.BoolValue is_blocked = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsBlockedOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value group_index = 4;</code>
   * @return Whether the groupIndex field is set.
   */
  boolean hasGroupIndex();
  /**
   * <code>.google.protobuf.Int64Value group_index = 4;</code>
   * @return The groupIndex.
   */
  com.google.protobuf.Int64Value getGroupIndex();
  /**
   * <code>.google.protobuf.Int64Value group_index = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getGroupIndexOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value establishment_date = 5;</code>
   * @return Whether the establishmentDate field is set.
   */
  boolean hasEstablishmentDate();
  /**
   * <code>.google.protobuf.Int64Value establishment_date = 5;</code>
   * @return The establishmentDate.
   */
  com.google.protobuf.Int64Value getEstablishmentDate();
  /**
   * <code>.google.protobuf.Int64Value establishment_date = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getEstablishmentDateOrBuilder();
}
