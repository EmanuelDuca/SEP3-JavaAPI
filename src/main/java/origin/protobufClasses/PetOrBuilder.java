// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobufClasses;

public interface PetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Pet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string petName = 1;</code>
   */
  String getPetName();
  /**
   * <code>string petName = 1;</code>
   */
  com.google.protobuf.ByteString
      getPetNameBytes();

  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  String getPetType();
  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  com.google.protobuf.ByteString
      getPetTypeBytes();

  /**
   * <code>string Race = 3;</code>
   */
  String getRace();
  /**
   * <code>string Race = 3;</code>
   */
  com.google.protobuf.ByteString
      getRaceBytes();

  /**
   * <code>int32 weight = 4;</code>
   */
  int getWeight();

  /**
   * <code>bool isVaccinated = 5;</code>
   */
  boolean getIsVaccinated();

  /**
   * <code>bool needWalks = 6;</code>
   */
  boolean getNeedWalks();

  /**
   * <code>string dietDescription = 7;</code>
   */
  String getDietDescription();
  /**
   * <code>string dietDescription = 7;</code>
   */
  com.google.protobuf.ByteString
      getDietDescriptionBytes();
}
