// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobufClasses;

public interface AnnouncementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Announcement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string petOwnerUsername = 1;</code>
   */
  String getPetOwnerUsername();
  /**
   * <code>string petOwnerUsername = 1;</code>
   */
  com.google.protobuf.ByteString
      getPetOwnerUsernameBytes();

  /**
   * <code>string description = 2;</code>
   */
  String getDescription();
  /**
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.TimeInterval timeInterval = 3;</code>
   */
  boolean hasTimeInterval();
  /**
   * <code>.TimeInterval timeInterval = 3;</code>
   */
  TimeInterval getTimeInterval();
  /**
   * <code>.TimeInterval timeInterval = 3;</code>
   */
  TimeIntervalOrBuilder getTimeIntervalOrBuilder();

  /**
   * <code>.Pet pet = 4;</code>
   */
  boolean hasPet();
  /**
   * <code>.Pet pet = 4;</code>
   */
  Pet getPet();
  /**
   * <code>.Pet pet = 4;</code>
   */
  PetOrBuilder getPetOrBuilder();

  /**
   * <code>.Address address = 5;</code>
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 5;</code>
   */
  Address getAddress();
  /**
   * <code>.Address address = 5;</code>
   */
  AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>string dateOfCreation = 6;</code>
   */
  String getDateOfCreation();
  /**
   * <code>string dateOfCreation = 6;</code>
   */
  com.google.protobuf.ByteString
      getDateOfCreationBytes();
}
