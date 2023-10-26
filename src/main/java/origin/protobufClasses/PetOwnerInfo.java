// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobufClasses;

/**
 * Protobuf type {@code PetOwnerInfo}
 */
public  final class PetOwnerInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PetOwnerInfo)
        PetOwnerInfoOrBuilder {
  // Use PetOwnerInfo.newBuilder() to construct.
  private PetOwnerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PetOwnerInfo() {
    username_ = "";
    fName_ = "";
    lName_ = "";
    phone_ = "";
    email_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PetOwnerInfo(
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

            username_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            fName_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            lName_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            phone_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            email_ = s;
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
    return Protobuf.internal_static_PetOwnerInfo_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Protobuf.internal_static_PetOwnerInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PetOwnerInfo.class, PetOwnerInfo.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile Object username_;
  /**
   * <code>string username = 1;</code>
   */
  public String getUsername() {
    Object ref = username_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    Object ref = username_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int F_NAME_FIELD_NUMBER = 2;
  private volatile Object fName_;
  /**
   * <code>string f_name = 2;</code>
   */
  public String getFName() {
    Object ref = fName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      fName_ = s;
      return s;
    }
  }
  /**
   * <code>string f_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFNameBytes() {
    Object ref = fName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      fName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int L_NAME_FIELD_NUMBER = 3;
  private volatile Object lName_;
  /**
   * <code>string l_name = 3;</code>
   */
  public String getLName() {
    Object ref = lName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      lName_ = s;
      return s;
    }
  }
  /**
   * <code>string l_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLNameBytes() {
    Object ref = lName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      lName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 4;
  private volatile Object phone_;
  /**
   * <code>string phone = 4;</code>
   */
  public String getPhone() {
    Object ref = phone_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <code>string phone = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    Object ref = phone_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 5;
  private volatile Object email_;
  /**
   * <code>string email = 5;</code>
   */
  public String getEmail() {
    Object ref = email_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 5;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    Object ref = email_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      email_ = b;
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
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!getFNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fName_);
    }
    if (!getLNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lName_);
    }
    if (!getPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, phone_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, email_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!getFNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fName_);
    }
    if (!getLNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lName_);
    }
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, phone_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, email_);
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
    if (!(obj instanceof PetOwnerInfo)) {
      return super.equals(obj);
    }
    PetOwnerInfo other = (PetOwnerInfo) obj;

    boolean result = true;
    result = result && getUsername()
        .equals(other.getUsername());
    result = result && getFName()
        .equals(other.getFName());
    result = result && getLName()
        .equals(other.getLName());
    result = result && getPhone()
        .equals(other.getPhone());
    result = result && getEmail()
        .equals(other.getEmail());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + F_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFName().hashCode();
    hash = (37 * hash) + L_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getLName().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PetOwnerInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PetOwnerInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PetOwnerInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PetOwnerInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PetOwnerInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PetOwnerInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PetOwnerInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PetOwnerInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PetOwnerInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PetOwnerInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PetOwnerInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PetOwnerInfo parseFrom(
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
  public static Builder newBuilder(PetOwnerInfo prototype) {
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
   * Protobuf type {@code PetOwnerInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PetOwnerInfo)
          PetOwnerInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_PetOwnerInfo_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_PetOwnerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PetOwnerInfo.class, PetOwnerInfo.Builder.class);
    }

    // Construct using origin.protobuf.PetOwnerInfo.newBuilder()
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
      username_ = "";

      fName_ = "";

      lName_ = "";

      phone_ = "";

      email_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Protobuf.internal_static_PetOwnerInfo_descriptor;
    }

    public PetOwnerInfo getDefaultInstanceForType() {
      return PetOwnerInfo.getDefaultInstance();
    }

    public PetOwnerInfo build() {
      PetOwnerInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public PetOwnerInfo buildPartial() {
      PetOwnerInfo result = new PetOwnerInfo(this);
      result.username_ = username_;
      result.fName_ = fName_;
      result.lName_ = lName_;
      result.phone_ = phone_;
      result.email_ = email_;
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
      if (other instanceof PetOwnerInfo) {
        return mergeFrom((PetOwnerInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PetOwnerInfo other) {
      if (other == PetOwnerInfo.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getFName().isEmpty()) {
        fName_ = other.fName_;
        onChanged();
      }
      if (!other.getLName().isEmpty()) {
        lName_ = other.lName_;
        onChanged();
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
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
      PetOwnerInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PetOwnerInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object username_ = "";
    /**
     * <code>string username = 1;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     */
    public Builder setUsername(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private Object fName_ = "";
    /**
     * <code>string f_name = 2;</code>
     */
    public String getFName() {
      Object ref = fName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        fName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string f_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFNameBytes() {
      Object ref = fName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        fName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string f_name = 2;</code>
     */
    public Builder setFName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string f_name = 2;</code>
     */
    public Builder clearFName() {
      
      fName_ = getDefaultInstance().getFName();
      onChanged();
      return this;
    }
    /**
     * <code>string f_name = 2;</code>
     */
    public Builder setFNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fName_ = value;
      onChanged();
      return this;
    }

    private Object lName_ = "";
    /**
     * <code>string l_name = 3;</code>
     */
    public String getLName() {
      Object ref = lName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        lName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string l_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLNameBytes() {
      Object ref = lName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        lName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string l_name = 3;</code>
     */
    public Builder setLName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string l_name = 3;</code>
     */
    public Builder clearLName() {
      
      lName_ = getDefaultInstance().getLName();
      onChanged();
      return this;
    }
    /**
     * <code>string l_name = 3;</code>
     */
    public Builder setLNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lName_ = value;
      onChanged();
      return this;
    }

    private Object phone_ = "";
    /**
     * <code>string phone = 4;</code>
     */
    public String getPhone() {
      Object ref = phone_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string phone = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phone = 4;</code>
     */
    public Builder setPhone(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 4;</code>
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 4;</code>
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value;
      onChanged();
      return this;
    }

    private Object email_ = "";
    /**
     * <code>string email = 5;</code>
     */
    public String getEmail() {
      Object ref = email_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     */
    public Builder setEmail(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
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


    // @@protoc_insertion_point(builder_scope:PetOwnerInfo)
  }

  // @@protoc_insertion_point(class_scope:PetOwnerInfo)
  private static final PetOwnerInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PetOwnerInfo();
  }

  public static PetOwnerInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PetOwnerInfo>
      PARSER = new com.google.protobuf.AbstractParser<PetOwnerInfo>() {
    public PetOwnerInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PetOwnerInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PetOwnerInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PetOwnerInfo> getParserForType() {
    return PARSER;
  }

  public PetOwnerInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
