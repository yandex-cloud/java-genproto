// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/baremetal/v1alpha/disk.proto

package yandex.cloud.api.baremetal.v1alpha;

public final class DiskOuterClass {
  private DiskOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Disk drive type.
   * </pre>
   *
   * Protobuf enum {@code yandex.cloud.baremetal.v1alpha.DiskDriveType}
   */
  public enum DiskDriveType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified disk drive type.
     * </pre>
     *
     * <code>DISK_DRIVE_TYPE_UNSPECIFIED = 0;</code>
     */
    DISK_DRIVE_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Hard disk drive.
     * </pre>
     *
     * <code>HDD = 1;</code>
     */
    HDD(1),
    /**
     * <pre>
     * Solid state drive.
     * </pre>
     *
     * <code>SSD = 2;</code>
     */
    SSD(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified disk drive type.
     * </pre>
     *
     * <code>DISK_DRIVE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int DISK_DRIVE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Hard disk drive.
     * </pre>
     *
     * <code>HDD = 1;</code>
     */
    public static final int HDD_VALUE = 1;
    /**
     * <pre>
     * Solid state drive.
     * </pre>
     *
     * <code>SSD = 2;</code>
     */
    public static final int SSD_VALUE = 2;


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
    public static DiskDriveType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DiskDriveType forNumber(int value) {
      switch (value) {
        case 0: return DISK_DRIVE_TYPE_UNSPECIFIED;
        case 1: return HDD;
        case 2: return SSD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DiskDriveType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DiskDriveType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DiskDriveType>() {
            public DiskDriveType findValueByNumber(int number) {
              return DiskDriveType.forNumber(number);
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
      return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DiskDriveType[] VALUES = values();

    public static DiskDriveType valueOf(
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

    private DiskDriveType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:yandex.cloud.baremetal.v1alpha.DiskDriveType)
  }

  public interface DiskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.baremetal.v1alpha.Disk)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the disk.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <pre>
     * ID of the disk.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * Type of the disk drive.
     * </pre>
     *
     * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <pre>
     * Type of the disk drive.
     * </pre>
     *
     * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
     * @return The type.
     */
    yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType getType();

    /**
     * <pre>
     * Size of the disk in gibibytes (2^30 bytes).
     * </pre>
     *
     * <code>int64 size_gib = 3;</code>
     * @return The sizeGib.
     */
    long getSizeGib();
  }
  /**
   * <pre>
   * Disk.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.baremetal.v1alpha.Disk}
   */
  public static final class Disk extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.baremetal.v1alpha.Disk)
      DiskOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Disk.newBuilder() to construct.
    private Disk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Disk() {
      id_ = "";
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Disk();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Disk(
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
            case 16: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 24: {

              sizeGib_ = input.readInt64();
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
      return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.internal_static_yandex_cloud_baremetal_v1alpha_Disk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.class, yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * ID of the disk.
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
     * ID of the disk.
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

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <pre>
     * Type of the disk drive.
     * </pre>
     *
     * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the disk drive.
     * </pre>
     *
     * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType getType() {
      @SuppressWarnings("deprecation")
      yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType result = yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.valueOf(type_);
      return result == null ? yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.UNRECOGNIZED : result;
    }

    public static final int SIZE_GIB_FIELD_NUMBER = 3;
    private long sizeGib_;
    /**
     * <pre>
     * Size of the disk in gibibytes (2^30 bytes).
     * </pre>
     *
     * <code>int64 size_gib = 3;</code>
     * @return The sizeGib.
     */
    @java.lang.Override
    public long getSizeGib() {
      return sizeGib_;
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
      if (type_ != yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.DISK_DRIVE_TYPE_UNSPECIFIED.getNumber()) {
        output.writeEnum(2, type_);
      }
      if (sizeGib_ != 0L) {
        output.writeInt64(3, sizeGib_);
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
      if (type_ != yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.DISK_DRIVE_TYPE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (sizeGib_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, sizeGib_);
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
      if (!(obj instanceof yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk)) {
        return super.equals(obj);
      }
      yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk other = (yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (type_ != other.type_) return false;
      if (getSizeGib()
          != other.getSizeGib()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + SIZE_GIB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSizeGib());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk prototype) {
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
     * Disk.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.baremetal.v1alpha.Disk}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.baremetal.v1alpha.Disk)
        yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.internal_static_yandex_cloud_baremetal_v1alpha_Disk_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.class, yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.Builder.class);
      }

      // Construct using yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.newBuilder()
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

        type_ = 0;

        sizeGib_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk getDefaultInstanceForType() {
        return yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk build() {
        yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk buildPartial() {
        yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk result = new yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk(this);
        result.id_ = id_;
        result.type_ = type_;
        result.sizeGib_ = sizeGib_;
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
        if (other instanceof yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk) {
          return mergeFrom((yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk other) {
        if (other == yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getSizeGib() != 0L) {
          setSizeGib(other.getSizeGib());
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
        yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk) e.getUnfinishedMessage();
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
       * ID of the disk.
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
       * ID of the disk.
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
       * ID of the disk.
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
       * ID of the disk.
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
       * ID of the disk.
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

      private int type_ = 0;
      /**
       * <pre>
       * Type of the disk drive.
       * </pre>
       *
       * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       * Type of the disk drive.
       * </pre>
       *
       * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the disk drive.
       * </pre>
       *
       * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType getType() {
        @SuppressWarnings("deprecation")
        yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType result = yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.valueOf(type_);
        return result == null ? yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Type of the disk drive.
       * </pre>
       *
       * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.DiskDriveType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the disk drive.
       * </pre>
       *
       * <code>.yandex.cloud.baremetal.v1alpha.DiskDriveType type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private long sizeGib_ ;
      /**
       * <pre>
       * Size of the disk in gibibytes (2^30 bytes).
       * </pre>
       *
       * <code>int64 size_gib = 3;</code>
       * @return The sizeGib.
       */
      @java.lang.Override
      public long getSizeGib() {
        return sizeGib_;
      }
      /**
       * <pre>
       * Size of the disk in gibibytes (2^30 bytes).
       * </pre>
       *
       * <code>int64 size_gib = 3;</code>
       * @param value The sizeGib to set.
       * @return This builder for chaining.
       */
      public Builder setSizeGib(long value) {
        
        sizeGib_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Size of the disk in gibibytes (2^30 bytes).
       * </pre>
       *
       * <code>int64 size_gib = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSizeGib() {
        
        sizeGib_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.baremetal.v1alpha.Disk)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.baremetal.v1alpha.Disk)
    private static final yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk();
    }

    public static yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Disk>
        PARSER = new com.google.protobuf.AbstractParser<Disk>() {
      @java.lang.Override
      public Disk parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Disk(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Disk> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Disk> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.baremetal.v1alpha.DiskOuterClass.Disk getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_baremetal_v1alpha_Disk_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)yandex/cloud/baremetal/v1alpha/disk.pr" +
      "oto\022\036yandex.cloud.baremetal.v1alpha\"a\n\004D" +
      "isk\022\n\n\002id\030\001 \001(\t\022;\n\004type\030\002 \001(\0162-.yandex.c" +
      "loud.baremetal.v1alpha.DiskDriveType\022\020\n\010" +
      "size_gib\030\003 \001(\003*B\n\rDiskDriveType\022\037\n\033DISK_" +
      "DRIVE_TYPE_UNSPECIFIED\020\000\022\007\n\003HDD\020\001\022\007\n\003SSD" +
      "\020\002Br\n\"yandex.cloud.api.baremetal.v1alpha" +
      "ZLgithub.com/yandex-cloud/go-genproto/ya" +
      "ndex/cloud/baremetal/v1alpha;baremetalb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_baremetal_v1alpha_Disk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_baremetal_v1alpha_Disk_descriptor,
        new java.lang.String[] { "Id", "Type", "SizeGib", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
