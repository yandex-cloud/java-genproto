// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/cic/v1/partner.proto

package yandex.cloud.api.cic.v1;

public final class PartnerOuterClass {
  private PartnerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PartnerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.cic.v1.Partner)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the partner.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <pre>
     * ID of the partner.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * ID of the region that the partner belongs to.
     * </pre>
     *
     * <code>string region_id = 6;</code>
     * @return The regionId.
     */
    java.lang.String getRegionId();
    /**
     * <pre>
     * ID of the region that the partner belongs to.
     * </pre>
     *
     * <code>string region_id = 6;</code>
     * @return The bytes for regionId.
     */
    com.google.protobuf.ByteString
        getRegionIdBytes();

    /**
     * <pre>
     * Status of the partner.
     * </pre>
     *
     * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
     * @return The enum numeric value on the wire for status.
     */
    int getStatusValue();
    /**
     * <pre>
     * Status of the partner.
     * </pre>
     *
     * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
     * @return The status.
     */
    yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status getStatus();
  }
  /**
   * <pre>
   * A Partner resource.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.cic.v1.Partner}
   */
  public static final class Partner extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.cic.v1.Partner)
      PartnerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Partner.newBuilder() to construct.
    private Partner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Partner() {
      id_ = "";
      regionId_ = "";
      status_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Partner();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Partner(
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
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              regionId_ = s;
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              status_ = rawValue;
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
      return yandex.cloud.api.cic.v1.PartnerOuterClass.internal_static_yandex_cloud_cic_v1_Partner_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.cic.v1.PartnerOuterClass.internal_static_yandex_cloud_cic_v1_Partner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.class, yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Builder.class);
    }

    /**
     * Protobuf enum {@code yandex.cloud.cic.v1.Partner.Status}
     */
    public enum Status
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATUS_UNSPECIFIED = 0;</code>
       */
      STATUS_UNSPECIFIED(0),
      /**
       * <code>UP = 1;</code>
       */
      UP(1),
      /**
       * <code>DOWN = 2;</code>
       */
      DOWN(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATUS_UNSPECIFIED = 0;</code>
       */
      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      /**
       * <code>UP = 1;</code>
       */
      public static final int UP_VALUE = 1;
      /**
       * <code>DOWN = 2;</code>
       */
      public static final int DOWN_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Status valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Status forNumber(int value) {
        switch (value) {
          case 0: return STATUS_UNSPECIFIED;
          case 1: return UP;
          case 2: return DOWN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Status> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Status>() {
              public Status findValueByNumber(int number) {
                return Status.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.getDescriptor().getEnumTypes().get(0);
      }

      private static final Status[] VALUES = values();

      public static Status valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Status(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:yandex.cloud.cic.v1.Partner.Status)
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * ID of the partner.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the partner.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REGION_ID_FIELD_NUMBER = 6;
    private volatile java.lang.Object regionId_;
    /**
     * <pre>
     * ID of the region that the partner belongs to.
     * </pre>
     *
     * <code>string region_id = 6;</code>
     * @return The regionId.
     */
    @java.lang.Override
    public java.lang.String getRegionId() {
      java.lang.Object ref = regionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the region that the partner belongs to.
     * </pre>
     *
     * <code>string region_id = 6;</code>
     * @return The bytes for regionId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = regionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 11;
    private int status_;
    /**
     * <pre>
     * Status of the partner.
     * </pre>
     *
     * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Status of the partner.
     * </pre>
     *
     * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
     * @return The status.
     */
    @java.lang.Override public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status getStatus() {
      @SuppressWarnings("deprecation")
      yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status result = yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.valueOf(status_);
      return result == null ? yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.UNRECOGNIZED : result;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, regionId_);
      }
      if (status_ != yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.STATUS_UNSPECIFIED.getNumber()) {
        output.writeEnum(11, status_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, regionId_);
      }
      if (status_ != yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.STATUS_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, status_);
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
      if (!(obj instanceof yandex.cloud.api.cic.v1.PartnerOuterClass.Partner)) {
        return super.equals(obj);
      }
      yandex.cloud.api.cic.v1.PartnerOuterClass.Partner other = (yandex.cloud.api.cic.v1.PartnerOuterClass.Partner) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (!getRegionId()
          .equals(other.getRegionId())) return false;
      if (status_ != other.status_) return false;
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
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRegionId().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.cic.v1.PartnerOuterClass.Partner prototype) {
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
     * <pre>
     * A Partner resource.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.cic.v1.Partner}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.cic.v1.Partner)
        yandex.cloud.api.cic.v1.PartnerOuterClass.PartnerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.cic.v1.PartnerOuterClass.internal_static_yandex_cloud_cic_v1_Partner_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.cic.v1.PartnerOuterClass.internal_static_yandex_cloud_cic_v1_Partner_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.class, yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Builder.class);
      }

      // Construct using yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.newBuilder()
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
        id_ = "";

        regionId_ = "";

        status_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.cic.v1.PartnerOuterClass.internal_static_yandex_cloud_cic_v1_Partner_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner getDefaultInstanceForType() {
        return yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner build() {
        yandex.cloud.api.cic.v1.PartnerOuterClass.Partner result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner buildPartial() {
        yandex.cloud.api.cic.v1.PartnerOuterClass.Partner result = new yandex.cloud.api.cic.v1.PartnerOuterClass.Partner(this);
        result.id_ = id_;
        result.regionId_ = regionId_;
        result.status_ = status_;
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
        if (other instanceof yandex.cloud.api.cic.v1.PartnerOuterClass.Partner) {
          return mergeFrom((yandex.cloud.api.cic.v1.PartnerOuterClass.Partner)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.cic.v1.PartnerOuterClass.Partner other) {
        if (other == yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getRegionId().isEmpty()) {
          regionId_ = other.regionId_;
          onChanged();
        }
        if (other.status_ != 0) {
          setStatusValue(other.getStatusValue());
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
        yandex.cloud.api.cic.v1.PartnerOuterClass.Partner parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.cic.v1.PartnerOuterClass.Partner) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <pre>
       * ID of the partner.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The id.
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the partner.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The bytes for id.
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the partner.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the partner.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the partner.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object regionId_ = "";
      /**
       * <pre>
       * ID of the region that the partner belongs to.
       * </pre>
       *
       * <code>string region_id = 6;</code>
       * @return The regionId.
       */
      public java.lang.String getRegionId() {
        java.lang.Object ref = regionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          regionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the region that the partner belongs to.
       * </pre>
       *
       * <code>string region_id = 6;</code>
       * @return The bytes for regionId.
       */
      public com.google.protobuf.ByteString
          getRegionIdBytes() {
        java.lang.Object ref = regionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          regionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the region that the partner belongs to.
       * </pre>
       *
       * <code>string region_id = 6;</code>
       * @param value The regionId to set.
       * @return This builder for chaining.
       */
      public Builder setRegionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        regionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the region that the partner belongs to.
       * </pre>
       *
       * <code>string region_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRegionId() {
        
        regionId_ = getDefaultInstance().getRegionId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the region that the partner belongs to.
       * </pre>
       *
       * <code>string region_id = 6;</code>
       * @param value The bytes for regionId to set.
       * @return This builder for chaining.
       */
      public Builder setRegionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        regionId_ = value;
        onChanged();
        return this;
      }

      private int status_ = 0;
      /**
       * <pre>
       * Status of the partner.
       * </pre>
       *
       * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
       * @return The enum numeric value on the wire for status.
       */
      @java.lang.Override public int getStatusValue() {
        return status_;
      }
      /**
       * <pre>
       * Status of the partner.
       * </pre>
       *
       * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
       * @param value The enum numeric value on the wire for status to set.
       * @return This builder for chaining.
       */
      public Builder setStatusValue(int value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Status of the partner.
       * </pre>
       *
       * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
       * @return The status.
       */
      @java.lang.Override
      public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status getStatus() {
        @SuppressWarnings("deprecation")
        yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status result = yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.valueOf(status_);
        return result == null ? yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Status of the partner.
       * </pre>
       *
       * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Status of the partner.
       * </pre>
       *
       * <code>.yandex.cloud.cic.v1.Partner.Status status = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        
        status_ = 0;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.cic.v1.Partner)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.cic.v1.Partner)
    private static final yandex.cloud.api.cic.v1.PartnerOuterClass.Partner DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.cic.v1.PartnerOuterClass.Partner();
    }

    public static yandex.cloud.api.cic.v1.PartnerOuterClass.Partner getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Partner>
        PARSER = new com.google.protobuf.AbstractParser<Partner>() {
      @java.lang.Override
      public Partner parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Partner(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Partner> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Partner> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_cic_v1_Partner_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_cic_v1_Partner_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!yandex/cloud/cic/v1/partner.proto\022\023yan" +
      "dex.cloud.cic.v1\"\235\001\n\007Partner\022\n\n\002id\030\001 \001(\t" +
      "\022\021\n\tregion_id\030\006 \001(\t\0223\n\006status\030\013 \001(\0162#.ya" +
      "ndex.cloud.cic.v1.Partner.Status\"2\n\006Stat" +
      "us\022\026\n\022STATUS_UNSPECIFIED\020\000\022\006\n\002UP\020\001\022\010\n\004DO" +
      "WN\020\002J\004\010\002\020\006J\004\010\007\020\013BV\n\027yandex.cloud.api.cic" +
      ".v1Z;github.com/yandex-cloud/go-genproto" +
      "/yandex/cloud/cic/v1;cicb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_yandex_cloud_cic_v1_Partner_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_cic_v1_Partner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_cic_v1_Partner_descriptor,
        new java.lang.String[] { "Id", "RegionId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
