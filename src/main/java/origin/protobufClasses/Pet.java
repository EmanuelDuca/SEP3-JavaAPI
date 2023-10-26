// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobufClasses;

/**
 * Protobuf type {@code Pet}
 */
public  final class Pet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Pet)
        PetOrBuilder {
  // Use Pet.newBuilder() to construct.
  private Pet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pet() {
    petName_ = "";
    petType_ = "";
    race_ = "";
    weight_ = 0;
    isVaccinated_ = false;
    needWalks_ = false;
    dietDescription_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Pet(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            petName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            petType_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            race_ = s;
            break;
          }
          case 32: {

            weight_ = input.readInt32();
            break;
          }
          case 40: {

            isVaccinated_ = input.readBool();
            break;
          }
          case 48: {

            needWalks_ = input.readBool();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            dietDescription_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Protobuf.internal_static_Pet_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Protobuf.internal_static_Pet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Pet.class, Pet.Builder.class);
  }

  public static final int PETNAME_FIELD_NUMBER = 1;
  private volatile Object petName_;
  /**
   * <code>string petName = 1;</code>
   */
  public String getPetName() {
    Object ref = petName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      petName_ = s;
      return s;
    }
  }
  /**
   * <code>string petName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPetNameBytes() {
    Object ref = petName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      petName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PETTYPE_FIELD_NUMBER = 2;
  private volatile Object petType_;
  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  public String getPetType() {
    Object ref = petType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      petType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPetTypeBytes() {
    Object ref = petType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      petType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RACE_FIELD_NUMBER = 3;
  private volatile Object race_;
  /**
   * <code>string Race = 3;</code>
   */
  public String getRace() {
    Object ref = race_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      race_ = s;
      return s;
    }
  }
  /**
   * <code>string Race = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRaceBytes() {
    Object ref = race_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      race_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 4;
  private int weight_;
  /**
   * <code>int32 weight = 4;</code>
   */
  public int getWeight() {
    return weight_;
  }

  public static final int ISVACCINATED_FIELD_NUMBER = 5;
  private boolean isVaccinated_;
  /**
   * <code>bool isVaccinated = 5;</code>
   */
  public boolean getIsVaccinated() {
    return isVaccinated_;
  }

  public static final int NEEDWALKS_FIELD_NUMBER = 6;
  private boolean needWalks_;
  /**
   * <code>bool needWalks = 6;</code>
   */
  public boolean getNeedWalks() {
    return needWalks_;
  }

  public static final int DIETDESCRIPTION_FIELD_NUMBER = 7;
  private volatile Object dietDescription_;
  /**
   * <code>string dietDescription = 7;</code>
   */
  public String getDietDescription() {
    Object ref = dietDescription_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      dietDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string dietDescription = 7;</code>
   */
  public com.google.protobuf.ByteString
      getDietDescriptionBytes() {
    Object ref = dietDescription_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      dietDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, petName_);
    }
    if (!getPetTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, petType_);
    }
    if (!getRaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, race_);
    }
    if (weight_ != 0) {
      output.writeInt32(4, weight_);
    }
    if (isVaccinated_ != false) {
      output.writeBool(5, isVaccinated_);
    }
    if (needWalks_ != false) {
      output.writeBool(6, needWalks_);
    }
    if (!getDietDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, dietDescription_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, petName_);
    }
    if (!getPetTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, petType_);
    }
    if (!getRaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, race_);
    }
    if (weight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, weight_);
    }
    if (isVaccinated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isVaccinated_);
    }
    if (needWalks_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, needWalks_);
    }
    if (!getDietDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, dietDescription_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Pet)) {
      return super.equals(obj);
    }
    Pet other = (Pet) obj;

    boolean result = true;
    result = result && getPetName()
        .equals(other.getPetName());
    result = result && getPetType()
        .equals(other.getPetType());
    result = result && getRace()
        .equals(other.getRace());
    result = result && (getWeight()
        == other.getWeight());
    result = result && (getIsVaccinated()
        == other.getIsVaccinated());
    result = result && (getNeedWalks()
        == other.getNeedWalks());
    result = result && getDietDescription()
        .equals(other.getDietDescription());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getPetName().hashCode();
    hash = (37 * hash) + PETTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPetType().hashCode();
    hash = (37 * hash) + RACE_FIELD_NUMBER;
    hash = (53 * hash) + getRace().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight();
    hash = (37 * hash) + ISVACCINATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsVaccinated());
    hash = (37 * hash) + NEEDWALKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedWalks());
    hash = (37 * hash) + DIETDESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDietDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Pet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Pet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Pet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Pet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Pet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Pet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Pet prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Pet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Pet)
          PetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_Pet_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_Pet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Pet.class, Pet.Builder.class);
    }

    // Construct using origin.protobuf.Pet.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      petName_ = "";

      petType_ = "";

      race_ = "";

      weight_ = 0;

      isVaccinated_ = false;

      needWalks_ = false;

      dietDescription_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Protobuf.internal_static_Pet_descriptor;
    }

    public Pet getDefaultInstanceForType() {
      return Pet.getDefaultInstance();
    }

    public Pet build() {
      Pet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Pet buildPartial() {
      Pet result = new Pet(this);
      result.petName_ = petName_;
      result.petType_ = petType_;
      result.race_ = race_;
      result.weight_ = weight_;
      result.isVaccinated_ = isVaccinated_;
      result.needWalks_ = needWalks_;
      result.dietDescription_ = dietDescription_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Pet) {
        return mergeFrom((Pet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Pet other) {
      if (other == Pet.getDefaultInstance()) return this;
      if (!other.getPetName().isEmpty()) {
        petName_ = other.petName_;
        onChanged();
      }
      if (!other.getPetType().isEmpty()) {
        petType_ = other.petType_;
        onChanged();
      }
      if (!other.getRace().isEmpty()) {
        race_ = other.race_;
        onChanged();
      }
      if (other.getWeight() != 0) {
        setWeight(other.getWeight());
      }
      if (other.getIsVaccinated() != false) {
        setIsVaccinated(other.getIsVaccinated());
      }
      if (other.getNeedWalks() != false) {
        setNeedWalks(other.getNeedWalks());
      }
      if (!other.getDietDescription().isEmpty()) {
        dietDescription_ = other.dietDescription_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Pet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Pet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object petName_ = "";
    /**
     * <code>string petName = 1;</code>
     */
    public String getPetName() {
      Object ref = petName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        petName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string petName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPetNameBytes() {
      Object ref = petName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        petName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string petName = 1;</code>
     */
    public Builder setPetName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      petName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string petName = 1;</code>
     */
    public Builder clearPetName() {
      
      petName_ = getDefaultInstance().getPetName();
      onChanged();
      return this;
    }
    /**
     * <code>string petName = 1;</code>
     */
    public Builder setPetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      petName_ = value;
      onChanged();
      return this;
    }

    private Object petType_ = "";
    /**
     * <pre>
     * dog, cat ....
     * </pre>
     *
     * <code>string petType = 2;</code>
     */
    public String getPetType() {
      Object ref = petType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        petType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * dog, cat ....
     * </pre>
     *
     * <code>string petType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPetTypeBytes() {
      Object ref = petType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        petType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * dog, cat ....
     * </pre>
     *
     * <code>string petType = 2;</code>
     */
    public Builder setPetType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      petType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dog, cat ....
     * </pre>
     *
     * <code>string petType = 2;</code>
     */
    public Builder clearPetType() {
      
      petType_ = getDefaultInstance().getPetType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dog, cat ....
     * </pre>
     *
     * <code>string petType = 2;</code>
     */
    public Builder setPetTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      petType_ = value;
      onChanged();
      return this;
    }

    private Object race_ = "";
    /**
     * <code>string Race = 3;</code>
     */
    public String getRace() {
      Object ref = race_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        race_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string Race = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRaceBytes() {
      Object ref = race_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        race_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Race = 3;</code>
     */
    public Builder setRace(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      race_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Race = 3;</code>
     */
    public Builder clearRace() {
      
      race_ = getDefaultInstance().getRace();
      onChanged();
      return this;
    }
    /**
     * <code>string Race = 3;</code>
     */
    public Builder setRaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      race_ = value;
      onChanged();
      return this;
    }

    private int weight_ ;
    /**
     * <code>int32 weight = 4;</code>
     */
    public int getWeight() {
      return weight_;
    }
    /**
     * <code>int32 weight = 4;</code>
     */
    public Builder setWeight(int value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 weight = 4;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0;
      onChanged();
      return this;
    }

    private boolean isVaccinated_ ;
    /**
     * <code>bool isVaccinated = 5;</code>
     */
    public boolean getIsVaccinated() {
      return isVaccinated_;
    }
    /**
     * <code>bool isVaccinated = 5;</code>
     */
    public Builder setIsVaccinated(boolean value) {
      
      isVaccinated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isVaccinated = 5;</code>
     */
    public Builder clearIsVaccinated() {
      
      isVaccinated_ = false;
      onChanged();
      return this;
    }

    private boolean needWalks_ ;
    /**
     * <code>bool needWalks = 6;</code>
     */
    public boolean getNeedWalks() {
      return needWalks_;
    }
    /**
     * <code>bool needWalks = 6;</code>
     */
    public Builder setNeedWalks(boolean value) {
      
      needWalks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool needWalks = 6;</code>
     */
    public Builder clearNeedWalks() {
      
      needWalks_ = false;
      onChanged();
      return this;
    }

    private Object dietDescription_ = "";
    /**
     * <code>string dietDescription = 7;</code>
     */
    public String getDietDescription() {
      Object ref = dietDescription_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        dietDescription_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string dietDescription = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDietDescriptionBytes() {
      Object ref = dietDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        dietDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dietDescription = 7;</code>
     */
    public Builder setDietDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dietDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dietDescription = 7;</code>
     */
    public Builder clearDietDescription() {
      
      dietDescription_ = getDefaultInstance().getDietDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string dietDescription = 7;</code>
     */
    public Builder setDietDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dietDescription_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Pet)
  }

  // @@protoc_insertion_point(class_scope:Pet)
  private static final Pet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Pet();
  }

  public static Pet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pet>
      PARSER = new com.google.protobuf.AbstractParser<Pet>() {
    public Pet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Pet> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Pet> getParserForType() {
    return PARSER;
  }

  public Pet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

