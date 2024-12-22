// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.ensaj.reservation.grpc.stubs;

/**
 * Protobuf type {@code GetClientResponse}
 */
public  final class GetClientResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetClientResponse)
    GetClientResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetClientResponse.newBuilder() to construct.
  private GetClientResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetClientResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetClientResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetClientResponse(
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
            ma.ensaj.reservation.grpc.stubs.Client.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(ma.ensaj.reservation.grpc.stubs.Client.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
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
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_GetClientResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_GetClientResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.ensaj.reservation.grpc.stubs.GetClientResponse.class, ma.ensaj.reservation.grpc.stubs.GetClientResponse.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private ma.ensaj.reservation.grpc.stubs.Client client_;
  /**
   * <code>.Client client = 1;</code>
   * @return Whether the client field is set.
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.Client client = 1;</code>
   * @return The client.
   */
  public ma.ensaj.reservation.grpc.stubs.Client getClient() {
    return client_ == null ? ma.ensaj.reservation.grpc.stubs.Client.getDefaultInstance() : client_;
  }
  /**
   * <code>.Client client = 1;</code>
   */
  public ma.ensaj.reservation.grpc.stubs.ClientOrBuilder getClientOrBuilder() {
    return getClient();
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
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
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
    if (!(obj instanceof ma.ensaj.reservation.grpc.stubs.GetClientResponse)) {
      return super.equals(obj);
    }
    ma.ensaj.reservation.grpc.stubs.GetClientResponse other = (ma.ensaj.reservation.grpc.stubs.GetClientResponse) obj;

    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
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
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse parseFrom(
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
  public static Builder newBuilder(ma.ensaj.reservation.grpc.stubs.GetClientResponse prototype) {
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
   * Protobuf type {@code GetClientResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetClientResponse)
      ma.ensaj.reservation.grpc.stubs.GetClientResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_GetClientResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_GetClientResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ensaj.reservation.grpc.stubs.GetClientResponse.class, ma.ensaj.reservation.grpc.stubs.GetClientResponse.Builder.class);
    }

    // Construct using ma.ensaj.reservation.grpc.stubs.GetClientResponse.newBuilder()
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
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_GetClientResponse_descriptor;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.GetClientResponse getDefaultInstanceForType() {
      return ma.ensaj.reservation.grpc.stubs.GetClientResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.GetClientResponse build() {
      ma.ensaj.reservation.grpc.stubs.GetClientResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.GetClientResponse buildPartial() {
      ma.ensaj.reservation.grpc.stubs.GetClientResponse result = new ma.ensaj.reservation.grpc.stubs.GetClientResponse(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
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
      if (other instanceof ma.ensaj.reservation.grpc.stubs.GetClientResponse) {
        return mergeFrom((ma.ensaj.reservation.grpc.stubs.GetClientResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.ensaj.reservation.grpc.stubs.GetClientResponse other) {
      if (other == ma.ensaj.reservation.grpc.stubs.GetClientResponse.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
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
      ma.ensaj.reservation.grpc.stubs.GetClientResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.ensaj.reservation.grpc.stubs.GetClientResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ma.ensaj.reservation.grpc.stubs.Client client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.reservation.grpc.stubs.Client, ma.ensaj.reservation.grpc.stubs.Client.Builder, ma.ensaj.reservation.grpc.stubs.ClientOrBuilder> clientBuilder_;
    /**
     * <code>.Client client = 1;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.Client client = 1;</code>
     * @return The client.
     */
    public ma.ensaj.reservation.grpc.stubs.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? ma.ensaj.reservation.grpc.stubs.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(ma.ensaj.reservation.grpc.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(
        ma.ensaj.reservation.grpc.stubs.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder mergeClient(ma.ensaj.reservation.grpc.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            ma.ensaj.reservation.grpc.stubs.Client.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public ma.ensaj.reservation.grpc.stubs.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public ma.ensaj.reservation.grpc.stubs.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            ma.ensaj.reservation.grpc.stubs.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.reservation.grpc.stubs.Client, ma.ensaj.reservation.grpc.stubs.Client.Builder, ma.ensaj.reservation.grpc.stubs.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.ensaj.reservation.grpc.stubs.Client, ma.ensaj.reservation.grpc.stubs.Client.Builder, ma.ensaj.reservation.grpc.stubs.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetClientResponse)
  }

  // @@protoc_insertion_point(class_scope:GetClientResponse)
  private static final ma.ensaj.reservation.grpc.stubs.GetClientResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.ensaj.reservation.grpc.stubs.GetClientResponse();
  }

  public static ma.ensaj.reservation.grpc.stubs.GetClientResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetClientResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetClientResponse>() {
    @java.lang.Override
    public GetClientResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetClientResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetClientResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClientResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.ensaj.reservation.grpc.stubs.GetClientResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

