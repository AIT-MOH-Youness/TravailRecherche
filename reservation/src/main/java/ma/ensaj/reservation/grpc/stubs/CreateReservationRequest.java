// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.ensaj.reservation.grpc.stubs;

/**
 * Protobuf type {@code CreateReservationRequest}
 */
public  final class CreateReservationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateReservationRequest)
    CreateReservationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateReservationRequest.newBuilder() to construct.
  private CreateReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateReservationRequest() {
    dateDebut_ = "";
    dateFin_ = "";
    prefernces_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateReservationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateReservationRequest(
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
          case 8: {

            clientId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dateDebut_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dateFin_ = s;
            break;
          }
          case 32: {

            chambreId_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            prefernces_ = s;
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
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_CreateReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_CreateReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.class, ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  private long clientId_;
  /**
   * <code>int64 clientId = 1;</code>
   * @return The clientId.
   */
  public long getClientId() {
    return clientId_;
  }

  public static final int DATEDEBUT_FIELD_NUMBER = 2;
  private volatile java.lang.Object dateDebut_;
  /**
   * <code>string dateDebut = 2;</code>
   * @return The dateDebut.
   */
  public java.lang.String getDateDebut() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateDebut_ = s;
      return s;
    }
  }
  /**
   * <code>string dateDebut = 2;</code>
   * @return The bytes for dateDebut.
   */
  public com.google.protobuf.ByteString
      getDateDebutBytes() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateDebut_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEFIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object dateFin_;
  /**
   * <code>string dateFin = 3;</code>
   * @return The dateFin.
   */
  public java.lang.String getDateFin() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateFin_ = s;
      return s;
    }
  }
  /**
   * <code>string dateFin = 3;</code>
   * @return The bytes for dateFin.
   */
  public com.google.protobuf.ByteString
      getDateFinBytes() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateFin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHAMBREID_FIELD_NUMBER = 4;
  private long chambreId_;
  /**
   * <code>int64 chambreId = 4;</code>
   * @return The chambreId.
   */
  public long getChambreId() {
    return chambreId_;
  }

  public static final int PREFERNCES_FIELD_NUMBER = 5;
  private volatile java.lang.Object prefernces_;
  /**
   * <code>string prefernces = 5;</code>
   * @return The prefernces.
   */
  public java.lang.String getPrefernces() {
    java.lang.Object ref = prefernces_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prefernces_ = s;
      return s;
    }
  }
  /**
   * <code>string prefernces = 5;</code>
   * @return The bytes for prefernces.
   */
  public com.google.protobuf.ByteString
      getPreferncesBytes() {
    java.lang.Object ref = prefernces_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prefernces_ = b;
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
    if (clientId_ != 0L) {
      output.writeInt64(1, clientId_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateFin_);
    }
    if (chambreId_ != 0L) {
      output.writeInt64(4, chambreId_);
    }
    if (!getPreferncesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, prefernces_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, clientId_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateFin_);
    }
    if (chambreId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, chambreId_);
    }
    if (!getPreferncesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, prefernces_);
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
    if (!(obj instanceof ma.ensaj.reservation.grpc.stubs.CreateReservationRequest)) {
      return super.equals(obj);
    }
    ma.ensaj.reservation.grpc.stubs.CreateReservationRequest other = (ma.ensaj.reservation.grpc.stubs.CreateReservationRequest) obj;

    if (getClientId()
        != other.getClientId()) return false;
    if (!getDateDebut()
        .equals(other.getDateDebut())) return false;
    if (!getDateFin()
        .equals(other.getDateFin())) return false;
    if (getChambreId()
        != other.getChambreId()) return false;
    if (!getPrefernces()
        .equals(other.getPrefernces())) return false;
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
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientId());
    hash = (37 * hash) + DATEDEBUT_FIELD_NUMBER;
    hash = (53 * hash) + getDateDebut().hashCode();
    hash = (37 * hash) + DATEFIN_FIELD_NUMBER;
    hash = (53 * hash) + getDateFin().hashCode();
    hash = (37 * hash) + CHAMBREID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getChambreId());
    hash = (37 * hash) + PREFERNCES_FIELD_NUMBER;
    hash = (53 * hash) + getPrefernces().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parseFrom(
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
  public static Builder newBuilder(ma.ensaj.reservation.grpc.stubs.CreateReservationRequest prototype) {
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
   * Protobuf type {@code CreateReservationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateReservationRequest)
      ma.ensaj.reservation.grpc.stubs.CreateReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_CreateReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_CreateReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.class, ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.Builder.class);
    }

    // Construct using ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.newBuilder()
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
      clientId_ = 0L;

      dateDebut_ = "";

      dateFin_ = "";

      chambreId_ = 0L;

      prefernces_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_CreateReservationRequest_descriptor;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.CreateReservationRequest getDefaultInstanceForType() {
      return ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.CreateReservationRequest build() {
      ma.ensaj.reservation.grpc.stubs.CreateReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.CreateReservationRequest buildPartial() {
      ma.ensaj.reservation.grpc.stubs.CreateReservationRequest result = new ma.ensaj.reservation.grpc.stubs.CreateReservationRequest(this);
      result.clientId_ = clientId_;
      result.dateDebut_ = dateDebut_;
      result.dateFin_ = dateFin_;
      result.chambreId_ = chambreId_;
      result.prefernces_ = prefernces_;
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
      if (other instanceof ma.ensaj.reservation.grpc.stubs.CreateReservationRequest) {
        return mergeFrom((ma.ensaj.reservation.grpc.stubs.CreateReservationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.ensaj.reservation.grpc.stubs.CreateReservationRequest other) {
      if (other == ma.ensaj.reservation.grpc.stubs.CreateReservationRequest.getDefaultInstance()) return this;
      if (other.getClientId() != 0L) {
        setClientId(other.getClientId());
      }
      if (!other.getDateDebut().isEmpty()) {
        dateDebut_ = other.dateDebut_;
        onChanged();
      }
      if (!other.getDateFin().isEmpty()) {
        dateFin_ = other.dateFin_;
        onChanged();
      }
      if (other.getChambreId() != 0L) {
        setChambreId(other.getChambreId());
      }
      if (!other.getPrefernces().isEmpty()) {
        prefernces_ = other.prefernces_;
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
      ma.ensaj.reservation.grpc.stubs.CreateReservationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.ensaj.reservation.grpc.stubs.CreateReservationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long clientId_ ;
    /**
     * <code>int64 clientId = 1;</code>
     * @return The clientId.
     */
    public long getClientId() {
      return clientId_;
    }
    /**
     * <code>int64 clientId = 1;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(long value) {
      
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 clientId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      
      clientId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dateDebut_ = "";
    /**
     * <code>string dateDebut = 2;</code>
     * @return The dateDebut.
     */
    public java.lang.String getDateDebut() {
      java.lang.Object ref = dateDebut_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateDebut_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @return The bytes for dateDebut.
     */
    public com.google.protobuf.ByteString
        getDateDebutBytes() {
      java.lang.Object ref = dateDebut_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateDebut_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @param value The dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebut(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateDebut_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateDebut() {
      
      dateDebut_ = getDefaultInstance().getDateDebut();
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @param value The bytes for dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebutBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateDebut_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dateFin_ = "";
    /**
     * <code>string dateFin = 3;</code>
     * @return The dateFin.
     */
    public java.lang.String getDateFin() {
      java.lang.Object ref = dateFin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateFin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateFin = 3;</code>
     * @return The bytes for dateFin.
     */
    public com.google.protobuf.ByteString
        getDateFinBytes() {
      java.lang.Object ref = dateFin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateFin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateFin = 3;</code>
     * @param value The dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateFin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateFin() {
      
      dateFin_ = getDefaultInstance().getDateFin();
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 3;</code>
     * @param value The bytes for dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateFin_ = value;
      onChanged();
      return this;
    }

    private long chambreId_ ;
    /**
     * <code>int64 chambreId = 4;</code>
     * @return The chambreId.
     */
    public long getChambreId() {
      return chambreId_;
    }
    /**
     * <code>int64 chambreId = 4;</code>
     * @param value The chambreId to set.
     * @return This builder for chaining.
     */
    public Builder setChambreId(long value) {
      
      chambreId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 chambreId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearChambreId() {
      
      chambreId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object prefernces_ = "";
    /**
     * <code>string prefernces = 5;</code>
     * @return The prefernces.
     */
    public java.lang.String getPrefernces() {
      java.lang.Object ref = prefernces_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefernces_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prefernces = 5;</code>
     * @return The bytes for prefernces.
     */
    public com.google.protobuf.ByteString
        getPreferncesBytes() {
      java.lang.Object ref = prefernces_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefernces_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prefernces = 5;</code>
     * @param value The prefernces to set.
     * @return This builder for chaining.
     */
    public Builder setPrefernces(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prefernces_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prefernces = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefernces() {
      
      prefernces_ = getDefaultInstance().getPrefernces();
      onChanged();
      return this;
    }
    /**
     * <code>string prefernces = 5;</code>
     * @param value The bytes for prefernces to set.
     * @return This builder for chaining.
     */
    public Builder setPreferncesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prefernces_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:CreateReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:CreateReservationRequest)
  private static final ma.ensaj.reservation.grpc.stubs.CreateReservationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.ensaj.reservation.grpc.stubs.CreateReservationRequest();
  }

  public static ma.ensaj.reservation.grpc.stubs.CreateReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReservationRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateReservationRequest>() {
    @java.lang.Override
    public CreateReservationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateReservationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.ensaj.reservation.grpc.stubs.CreateReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
