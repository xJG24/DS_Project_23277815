// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartClimateControl.proto

package ds.SmartClimateControlService;

/**
 * Protobuf type {@code SetHumidityResponse}
 */
public  final class SetHumidityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetHumidityResponse)
    SetHumidityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetHumidityResponse.newBuilder() to construct.
  private SetHumidityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetHumidityResponse() {
    roomID_ = 0;
    humidity_ = 0F;
    result_ = 0;
    statusMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetHumidityResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            roomID_ = input.readInt32();
            break;
          }
          case 21: {

            humidity_ = input.readFloat();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            statusMessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return ds.SmartClimateControlService.SmartClimateControlServiceImpl.internal_static_SetHumidityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.SmartClimateControlService.SmartClimateControlServiceImpl.internal_static_SetHumidityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.SmartClimateControlService.SetHumidityResponse.class, ds.SmartClimateControlService.SetHumidityResponse.Builder.class);
  }

  public static final int ROOMID_FIELD_NUMBER = 1;
  private int roomID_;
  /**
   * <code>int32 roomID = 1;</code>
   */
  public int getRoomID() {
    return roomID_;
  }

  public static final int HUMIDITY_FIELD_NUMBER = 2;
  private float humidity_;
  /**
   * <code>float humidity = 2;</code>
   */
  public float getHumidity() {
    return humidity_;
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private int result_;
  /**
   * <code>.OperationalStatus result = 3;</code>
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.OperationalStatus result = 3;</code>
   */
  public ds.SmartClimateControlService.OperationalStatus getResult() {
    @SuppressWarnings("deprecation")
    ds.SmartClimateControlService.OperationalStatus result = ds.SmartClimateControlService.OperationalStatus.valueOf(result_);
    return result == null ? ds.SmartClimateControlService.OperationalStatus.UNRECOGNIZED : result;
  }

  public static final int STATUSMESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object statusMessage_;
  /**
   * <code>string statusMessage = 4;</code>
   */
  public java.lang.String getStatusMessage() {
    java.lang.Object ref = statusMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      statusMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string statusMessage = 4;</code>
   */
  public com.google.protobuf.ByteString
      getStatusMessageBytes() {
    java.lang.Object ref = statusMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      statusMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (roomID_ != 0) {
      output.writeInt32(1, roomID_);
    }
    if (humidity_ != 0F) {
      output.writeFloat(2, humidity_);
    }
    if (result_ != ds.SmartClimateControlService.OperationalStatus.Undefined.getNumber()) {
      output.writeEnum(3, result_);
    }
    if (!getStatusMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, statusMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roomID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, roomID_);
    }
    if (humidity_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, humidity_);
    }
    if (result_ != ds.SmartClimateControlService.OperationalStatus.Undefined.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, result_);
    }
    if (!getStatusMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, statusMessage_);
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
    if (!(obj instanceof ds.SmartClimateControlService.SetHumidityResponse)) {
      return super.equals(obj);
    }
    ds.SmartClimateControlService.SetHumidityResponse other = (ds.SmartClimateControlService.SetHumidityResponse) obj;

    boolean result = true;
    result = result && (getRoomID()
        == other.getRoomID());
    result = result && (
        java.lang.Float.floatToIntBits(getHumidity())
        == java.lang.Float.floatToIntBits(
            other.getHumidity()));
    result = result && result_ == other.result_;
    result = result && getStatusMessage()
        .equals(other.getStatusMessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROOMID_FIELD_NUMBER;
    hash = (53 * hash) + getRoomID();
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHumidity());
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (37 * hash) + STATUSMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getStatusMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.SmartClimateControlService.SetHumidityResponse parseFrom(
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
  public static Builder newBuilder(ds.SmartClimateControlService.SetHumidityResponse prototype) {
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
   * Protobuf type {@code SetHumidityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetHumidityResponse)
      ds.SmartClimateControlService.SetHumidityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.SmartClimateControlService.SmartClimateControlServiceImpl.internal_static_SetHumidityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.SmartClimateControlService.SmartClimateControlServiceImpl.internal_static_SetHumidityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.SmartClimateControlService.SetHumidityResponse.class, ds.SmartClimateControlService.SetHumidityResponse.Builder.class);
    }

    // Construct using ds.SmartClimateControlService.SetHumidityResponse.newBuilder()
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
      roomID_ = 0;

      humidity_ = 0F;

      result_ = 0;

      statusMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.SmartClimateControlService.SmartClimateControlServiceImpl.internal_static_SetHumidityResponse_descriptor;
    }

    @java.lang.Override
    public ds.SmartClimateControlService.SetHumidityResponse getDefaultInstanceForType() {
      return ds.SmartClimateControlService.SetHumidityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.SmartClimateControlService.SetHumidityResponse build() {
      ds.SmartClimateControlService.SetHumidityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.SmartClimateControlService.SetHumidityResponse buildPartial() {
      ds.SmartClimateControlService.SetHumidityResponse result = new ds.SmartClimateControlService.SetHumidityResponse(this);
      result.roomID_ = roomID_;
      result.humidity_ = humidity_;
      result.result_ = result_;
      result.statusMessage_ = statusMessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.SmartClimateControlService.SetHumidityResponse) {
        return mergeFrom((ds.SmartClimateControlService.SetHumidityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.SmartClimateControlService.SetHumidityResponse other) {
      if (other == ds.SmartClimateControlService.SetHumidityResponse.getDefaultInstance()) return this;
      if (other.getRoomID() != 0) {
        setRoomID(other.getRoomID());
      }
      if (other.getHumidity() != 0F) {
        setHumidity(other.getHumidity());
      }
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (!other.getStatusMessage().isEmpty()) {
        statusMessage_ = other.statusMessage_;
        onChanged();
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
      ds.SmartClimateControlService.SetHumidityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.SmartClimateControlService.SetHumidityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int roomID_ ;
    /**
     * <code>int32 roomID = 1;</code>
     */
    public int getRoomID() {
      return roomID_;
    }
    /**
     * <code>int32 roomID = 1;</code>
     */
    public Builder setRoomID(int value) {
      
      roomID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 roomID = 1;</code>
     */
    public Builder clearRoomID() {
      
      roomID_ = 0;
      onChanged();
      return this;
    }

    private float humidity_ ;
    /**
     * <code>float humidity = 2;</code>
     */
    public float getHumidity() {
      return humidity_;
    }
    /**
     * <code>float humidity = 2;</code>
     */
    public Builder setHumidity(float value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float humidity = 2;</code>
     */
    public Builder clearHumidity() {
      
      humidity_ = 0F;
      onChanged();
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.OperationalStatus result = 3;</code>
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.OperationalStatus result = 3;</code>
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.OperationalStatus result = 3;</code>
     */
    public ds.SmartClimateControlService.OperationalStatus getResult() {
      @SuppressWarnings("deprecation")
      ds.SmartClimateControlService.OperationalStatus result = ds.SmartClimateControlService.OperationalStatus.valueOf(result_);
      return result == null ? ds.SmartClimateControlService.OperationalStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.OperationalStatus result = 3;</code>
     */
    public Builder setResult(ds.SmartClimateControlService.OperationalStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.OperationalStatus result = 3;</code>
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object statusMessage_ = "";
    /**
     * <code>string statusMessage = 4;</code>
     */
    public java.lang.String getStatusMessage() {
      java.lang.Object ref = statusMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        statusMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string statusMessage = 4;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMessageBytes() {
      java.lang.Object ref = statusMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        statusMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string statusMessage = 4;</code>
     */
    public Builder setStatusMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      statusMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string statusMessage = 4;</code>
     */
    public Builder clearStatusMessage() {
      
      statusMessage_ = getDefaultInstance().getStatusMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string statusMessage = 4;</code>
     */
    public Builder setStatusMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      statusMessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SetHumidityResponse)
  }

  // @@protoc_insertion_point(class_scope:SetHumidityResponse)
  private static final ds.SmartClimateControlService.SetHumidityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.SmartClimateControlService.SetHumidityResponse();
  }

  public static ds.SmartClimateControlService.SetHumidityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetHumidityResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetHumidityResponse>() {
    @java.lang.Override
    public SetHumidityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetHumidityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetHumidityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetHumidityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.SmartClimateControlService.SetHumidityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

