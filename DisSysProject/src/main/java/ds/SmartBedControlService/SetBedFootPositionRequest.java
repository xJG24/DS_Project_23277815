// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartBedControl.proto

package ds.SmartBedControlService;

/**
 * Protobuf type {@code ds.SmartBedControlService.SetBedFootPositionRequest}
 */
public  final class SetBedFootPositionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.SmartBedControlService.SetBedFootPositionRequest)
    SetBedFootPositionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetBedFootPositionRequest.newBuilder() to construct.
  private SetBedFootPositionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetBedFootPositionRequest() {
    bedFootPosition_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetBedFootPositionRequest(
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
          case 13: {

            bedFootPosition_ = input.readFloat();
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
    return ds.SmartBedControlService.SmartBedControlServiceImpl.internal_static_ds_SmartBedControlService_SetBedFootPositionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.SmartBedControlService.SmartBedControlServiceImpl.internal_static_ds_SmartBedControlService_SetBedFootPositionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.SmartBedControlService.SetBedFootPositionRequest.class, ds.SmartBedControlService.SetBedFootPositionRequest.Builder.class);
  }

  public static final int BEDFOOTPOSITION_FIELD_NUMBER = 1;
  private float bedFootPosition_;
  /**
   * <code>float bedFootPosition = 1;</code>
   */
  public float getBedFootPosition() {
    return bedFootPosition_;
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
    if (bedFootPosition_ != 0F) {
      output.writeFloat(1, bedFootPosition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bedFootPosition_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, bedFootPosition_);
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
    if (!(obj instanceof ds.SmartBedControlService.SetBedFootPositionRequest)) {
      return super.equals(obj);
    }
    ds.SmartBedControlService.SetBedFootPositionRequest other = (ds.SmartBedControlService.SetBedFootPositionRequest) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getBedFootPosition())
        == java.lang.Float.floatToIntBits(
            other.getBedFootPosition()));
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
    hash = (37 * hash) + BEDFOOTPOSITION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBedFootPosition());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.SmartBedControlService.SetBedFootPositionRequest parseFrom(
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
  public static Builder newBuilder(ds.SmartBedControlService.SetBedFootPositionRequest prototype) {
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
   * Protobuf type {@code ds.SmartBedControlService.SetBedFootPositionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.SmartBedControlService.SetBedFootPositionRequest)
      ds.SmartBedControlService.SetBedFootPositionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.SmartBedControlService.SmartBedControlServiceImpl.internal_static_ds_SmartBedControlService_SetBedFootPositionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.SmartBedControlService.SmartBedControlServiceImpl.internal_static_ds_SmartBedControlService_SetBedFootPositionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.SmartBedControlService.SetBedFootPositionRequest.class, ds.SmartBedControlService.SetBedFootPositionRequest.Builder.class);
    }

    // Construct using ds.SmartBedControlService.SetBedFootPositionRequest.newBuilder()
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
      bedFootPosition_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.SmartBedControlService.SmartBedControlServiceImpl.internal_static_ds_SmartBedControlService_SetBedFootPositionRequest_descriptor;
    }

    @java.lang.Override
    public ds.SmartBedControlService.SetBedFootPositionRequest getDefaultInstanceForType() {
      return ds.SmartBedControlService.SetBedFootPositionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.SmartBedControlService.SetBedFootPositionRequest build() {
      ds.SmartBedControlService.SetBedFootPositionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.SmartBedControlService.SetBedFootPositionRequest buildPartial() {
      ds.SmartBedControlService.SetBedFootPositionRequest result = new ds.SmartBedControlService.SetBedFootPositionRequest(this);
      result.bedFootPosition_ = bedFootPosition_;
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
      if (other instanceof ds.SmartBedControlService.SetBedFootPositionRequest) {
        return mergeFrom((ds.SmartBedControlService.SetBedFootPositionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.SmartBedControlService.SetBedFootPositionRequest other) {
      if (other == ds.SmartBedControlService.SetBedFootPositionRequest.getDefaultInstance()) return this;
      if (other.getBedFootPosition() != 0F) {
        setBedFootPosition(other.getBedFootPosition());
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
      ds.SmartBedControlService.SetBedFootPositionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.SmartBedControlService.SetBedFootPositionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float bedFootPosition_ ;
    /**
     * <code>float bedFootPosition = 1;</code>
     */
    public float getBedFootPosition() {
      return bedFootPosition_;
    }
    /**
     * <code>float bedFootPosition = 1;</code>
     */
    public Builder setBedFootPosition(float value) {
      
      bedFootPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bedFootPosition = 1;</code>
     */
    public Builder clearBedFootPosition() {
      
      bedFootPosition_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:ds.SmartBedControlService.SetBedFootPositionRequest)
  }

  // @@protoc_insertion_point(class_scope:ds.SmartBedControlService.SetBedFootPositionRequest)
  private static final ds.SmartBedControlService.SetBedFootPositionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.SmartBedControlService.SetBedFootPositionRequest();
  }

  public static ds.SmartBedControlService.SetBedFootPositionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetBedFootPositionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetBedFootPositionRequest>() {
    @java.lang.Override
    public SetBedFootPositionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetBedFootPositionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetBedFootPositionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetBedFootPositionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.SmartBedControlService.SetBedFootPositionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

