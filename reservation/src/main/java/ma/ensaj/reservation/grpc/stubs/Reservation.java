// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.ensaj.reservation.grpc.stubs;

/**
 * Protobuf type {@code Reservation}
 */
public  final class Reservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    dateDebut_ = "";
    dateFin_ = "";
    prefrences_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reservation(
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

            id_ = input.readInt64();
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
          case 34: {
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
          case 42: {
            ma.ensaj.reservation.grpc.stubs.Chambre.Builder subBuilder = null;
            if (chambres_ != null) {
              subBuilder = chambres_.toBuilder();
            }
            chambres_ = input.readMessage(ma.ensaj.reservation.grpc.stubs.Chambre.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chambres_);
              chambres_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            prefrences_ = s;
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
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.ensaj.reservation.grpc.stubs.Reservation.class, ma.ensaj.reservation.grpc.stubs.Reservation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
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

  public static final int CLIENT_FIELD_NUMBER = 4;
  private ma.ensaj.reservation.grpc.stubs.Client client_;
  /**
   * <code>.Client client = 4;</code>
   * @return Whether the client field is set.
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.Client client = 4;</code>
   * @return The client.
   */
  public ma.ensaj.reservation.grpc.stubs.Client getClient() {
    return client_ == null ? ma.ensaj.reservation.grpc.stubs.Client.getDefaultInstance() : client_;
  }
  /**
   * <code>.Client client = 4;</code>
   */
  public ma.ensaj.reservation.grpc.stubs.ClientOrBuilder getClientOrBuilder() {
    return getClient();
  }

  public static final int CHAMBRES_FIELD_NUMBER = 5;
  private ma.ensaj.reservation.grpc.stubs.Chambre chambres_;
  /**
   * <code>.Chambre chambres = 5;</code>
   * @return Whether the chambres field is set.
   */
  public boolean hasChambres() {
    return chambres_ != null;
  }
  /**
   * <code>.Chambre chambres = 5;</code>
   * @return The chambres.
   */
  public ma.ensaj.reservation.grpc.stubs.Chambre getChambres() {
    return chambres_ == null ? ma.ensaj.reservation.grpc.stubs.Chambre.getDefaultInstance() : chambres_;
  }
  /**
   * <code>.Chambre chambres = 5;</code>
   */
  public ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder getChambresOrBuilder() {
    return getChambres();
  }

  public static final int PREFRENCES_FIELD_NUMBER = 6;
  private volatile java.lang.Object prefrences_;
  /**
   * <code>string prefrences = 6;</code>
   * @return The prefrences.
   */
  public java.lang.String getPrefrences() {
    java.lang.Object ref = prefrences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prefrences_ = s;
      return s;
    }
  }
  /**
   * <code>string prefrences = 6;</code>
   * @return The bytes for prefrences.
   */
  public com.google.protobuf.ByteString
      getPrefrencesBytes() {
    java.lang.Object ref = prefrences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prefrences_ = b;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateFin_);
    }
    if (client_ != null) {
      output.writeMessage(4, getClient());
    }
    if (chambres_ != null) {
      output.writeMessage(5, getChambres());
    }
    if (!getPrefrencesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, prefrences_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateFin_);
    }
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getClient());
    }
    if (chambres_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getChambres());
    }
    if (!getPrefrencesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, prefrences_);
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
    if (!(obj instanceof ma.ensaj.reservation.grpc.stubs.Reservation)) {
      return super.equals(obj);
    }
    ma.ensaj.reservation.grpc.stubs.Reservation other = (ma.ensaj.reservation.grpc.stubs.Reservation) obj;

    if (getId()
        != other.getId()) return false;
    if (!getDateDebut()
        .equals(other.getDateDebut())) return false;
    if (!getDateFin()
        .equals(other.getDateFin())) return false;
    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
    }
    if (hasChambres() != other.hasChambres()) return false;
    if (hasChambres()) {
      if (!getChambres()
          .equals(other.getChambres())) return false;
    }
    if (!getPrefrences()
        .equals(other.getPrefrences())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + DATEDEBUT_FIELD_NUMBER;
    hash = (53 * hash) + getDateDebut().hashCode();
    hash = (37 * hash) + DATEFIN_FIELD_NUMBER;
    hash = (53 * hash) + getDateFin().hashCode();
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    if (hasChambres()) {
      hash = (37 * hash) + CHAMBRES_FIELD_NUMBER;
      hash = (53 * hash) + getChambres().hashCode();
    }
    hash = (37 * hash) + PREFRENCES_FIELD_NUMBER;
    hash = (53 * hash) + getPrefrences().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.reservation.grpc.stubs.Reservation parseFrom(
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
  public static Builder newBuilder(ma.ensaj.reservation.grpc.stubs.Reservation prototype) {
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
   * Protobuf type {@code Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Reservation)
      ma.ensaj.reservation.grpc.stubs.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ensaj.reservation.grpc.stubs.Reservation.class, ma.ensaj.reservation.grpc.stubs.Reservation.Builder.class);
    }

    // Construct using ma.ensaj.reservation.grpc.stubs.Reservation.newBuilder()
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
      id_ = 0L;

      dateDebut_ = "";

      dateFin_ = "";

      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      if (chambresBuilder_ == null) {
        chambres_ = null;
      } else {
        chambres_ = null;
        chambresBuilder_ = null;
      }
      prefrences_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.Reservation getDefaultInstanceForType() {
      return ma.ensaj.reservation.grpc.stubs.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.Reservation build() {
      ma.ensaj.reservation.grpc.stubs.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.ensaj.reservation.grpc.stubs.Reservation buildPartial() {
      ma.ensaj.reservation.grpc.stubs.Reservation result = new ma.ensaj.reservation.grpc.stubs.Reservation(this);
      result.id_ = id_;
      result.dateDebut_ = dateDebut_;
      result.dateFin_ = dateFin_;
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
      if (chambresBuilder_ == null) {
        result.chambres_ = chambres_;
      } else {
        result.chambres_ = chambresBuilder_.build();
      }
      result.prefrences_ = prefrences_;
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
      if (other instanceof ma.ensaj.reservation.grpc.stubs.Reservation) {
        return mergeFrom((ma.ensaj.reservation.grpc.stubs.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.ensaj.reservation.grpc.stubs.Reservation other) {
      if (other == ma.ensaj.reservation.grpc.stubs.Reservation.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getDateDebut().isEmpty()) {
        dateDebut_ = other.dateDebut_;
        onChanged();
      }
      if (!other.getDateFin().isEmpty()) {
        dateFin_ = other.dateFin_;
        onChanged();
      }
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      if (other.hasChambres()) {
        mergeChambres(other.getChambres());
      }
      if (!other.getPrefrences().isEmpty()) {
        prefrences_ = other.prefrences_;
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
      ma.ensaj.reservation.grpc.stubs.Reservation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.ensaj.reservation.grpc.stubs.Reservation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
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

    private ma.ensaj.reservation.grpc.stubs.Client client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.reservation.grpc.stubs.Client, ma.ensaj.reservation.grpc.stubs.Client.Builder, ma.ensaj.reservation.grpc.stubs.ClientOrBuilder> clientBuilder_;
    /**
     * <code>.Client client = 4;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
     */
    public ma.ensaj.reservation.grpc.stubs.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.Client client = 4;</code>
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
     * <code>.Client client = 4;</code>
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

    private ma.ensaj.reservation.grpc.stubs.Chambre chambres_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.reservation.grpc.stubs.Chambre, ma.ensaj.reservation.grpc.stubs.Chambre.Builder, ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder> chambresBuilder_;
    /**
     * <code>.Chambre chambres = 5;</code>
     * @return Whether the chambres field is set.
     */
    public boolean hasChambres() {
      return chambresBuilder_ != null || chambres_ != null;
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     * @return The chambres.
     */
    public ma.ensaj.reservation.grpc.stubs.Chambre getChambres() {
      if (chambresBuilder_ == null) {
        return chambres_ == null ? ma.ensaj.reservation.grpc.stubs.Chambre.getDefaultInstance() : chambres_;
      } else {
        return chambresBuilder_.getMessage();
      }
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public Builder setChambres(ma.ensaj.reservation.grpc.stubs.Chambre value) {
      if (chambresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambres_ = value;
        onChanged();
      } else {
        chambresBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public Builder setChambres(
        ma.ensaj.reservation.grpc.stubs.Chambre.Builder builderForValue) {
      if (chambresBuilder_ == null) {
        chambres_ = builderForValue.build();
        onChanged();
      } else {
        chambresBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public Builder mergeChambres(ma.ensaj.reservation.grpc.stubs.Chambre value) {
      if (chambresBuilder_ == null) {
        if (chambres_ != null) {
          chambres_ =
            ma.ensaj.reservation.grpc.stubs.Chambre.newBuilder(chambres_).mergeFrom(value).buildPartial();
        } else {
          chambres_ = value;
        }
        onChanged();
      } else {
        chambresBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public Builder clearChambres() {
      if (chambresBuilder_ == null) {
        chambres_ = null;
        onChanged();
      } else {
        chambres_ = null;
        chambresBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public ma.ensaj.reservation.grpc.stubs.Chambre.Builder getChambresBuilder() {
      
      onChanged();
      return getChambresFieldBuilder().getBuilder();
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    public ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder getChambresOrBuilder() {
      if (chambresBuilder_ != null) {
        return chambresBuilder_.getMessageOrBuilder();
      } else {
        return chambres_ == null ?
            ma.ensaj.reservation.grpc.stubs.Chambre.getDefaultInstance() : chambres_;
      }
    }
    /**
     * <code>.Chambre chambres = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.reservation.grpc.stubs.Chambre, ma.ensaj.reservation.grpc.stubs.Chambre.Builder, ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder> 
        getChambresFieldBuilder() {
      if (chambresBuilder_ == null) {
        chambresBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.ensaj.reservation.grpc.stubs.Chambre, ma.ensaj.reservation.grpc.stubs.Chambre.Builder, ma.ensaj.reservation.grpc.stubs.ChambreOrBuilder>(
                getChambres(),
                getParentForChildren(),
                isClean());
        chambres_ = null;
      }
      return chambresBuilder_;
    }

    private java.lang.Object prefrences_ = "";
    /**
     * <code>string prefrences = 6;</code>
     * @return The prefrences.
     */
    public java.lang.String getPrefrences() {
      java.lang.Object ref = prefrences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefrences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prefrences = 6;</code>
     * @return The bytes for prefrences.
     */
    public com.google.protobuf.ByteString
        getPrefrencesBytes() {
      java.lang.Object ref = prefrences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefrences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prefrences = 6;</code>
     * @param value The prefrences to set.
     * @return This builder for chaining.
     */
    public Builder setPrefrences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prefrences_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prefrences = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefrences() {
      
      prefrences_ = getDefaultInstance().getPrefrences();
      onChanged();
      return this;
    }
    /**
     * <code>string prefrences = 6;</code>
     * @param value The bytes for prefrences to set.
     * @return This builder for chaining.
     */
    public Builder setPrefrencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prefrences_ = value;
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


    // @@protoc_insertion_point(builder_scope:Reservation)
  }

  // @@protoc_insertion_point(class_scope:Reservation)
  private static final ma.ensaj.reservation.grpc.stubs.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.ensaj.reservation.grpc.stubs.Reservation();
  }

  public static ma.ensaj.reservation.grpc.stubs.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reservation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.ensaj.reservation.grpc.stubs.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
