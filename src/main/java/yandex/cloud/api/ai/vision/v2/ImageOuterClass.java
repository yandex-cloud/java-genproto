// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/ai/vision/v2/image.proto

package yandex.cloud.api.ai.vision.v2;

public final class ImageOuterClass {
  private ImageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.ai.vision.v2.Image)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *        bytes with data
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <pre>
     *    type of data
     * </pre>
     *
     * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
     */
    int getImageTypeValue();
    /**
     * <pre>
     *    type of data
     * </pre>
     *
     * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
     */
    yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType getImageType();

    public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageSourceCase getImageSourceCase();
  }
  /**
   * Protobuf type {@code yandex.cloud.ai.vision.v2.Image}
   */
  public  static final class Image extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.ai.vision.v2.Image)
      ImageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Image.newBuilder() to construct.
    private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Image() {
      imageType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Image(
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
            case 10: {
              imageSourceCase_ = 1;
              imageSource_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              imageType_ = rawValue;
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
      return yandex.cloud.api.ai.vision.v2.ImageOuterClass.internal_static_yandex_cloud_ai_vision_v2_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.ai.vision.v2.ImageOuterClass.internal_static_yandex_cloud_ai_vision_v2_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.class, yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.Builder.class);
    }

    /**
     * <pre>
     *    type of image
     * </pre>
     *
     * Protobuf enum {@code yandex.cloud.ai.vision.v2.Image.ImageType}
     */
    public enum ImageType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>IMAGE_TYPE_UNSPECIFIED = 0;</code>
       */
      IMAGE_TYPE_UNSPECIFIED(0),
      /**
       * <code>JPEG = 1;</code>
       */
      JPEG(1),
      /**
       * <code>PNG = 2;</code>
       */
      PNG(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>IMAGE_TYPE_UNSPECIFIED = 0;</code>
       */
      public static final int IMAGE_TYPE_UNSPECIFIED_VALUE = 0;
      /**
       * <code>JPEG = 1;</code>
       */
      public static final int JPEG_VALUE = 1;
      /**
       * <code>PNG = 2;</code>
       */
      public static final int PNG_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ImageType valueOf(int value) {
        return forNumber(value);
      }

      public static ImageType forNumber(int value) {
        switch (value) {
          case 0: return IMAGE_TYPE_UNSPECIFIED;
          case 1: return JPEG;
          case 2: return PNG;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ImageType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ImageType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ImageType>() {
              public ImageType findValueByNumber(int number) {
                return ImageType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.getDescriptor().getEnumTypes().get(0);
      }

      private static final ImageType[] VALUES = values();

      public static ImageType valueOf(
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

      private ImageType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:yandex.cloud.ai.vision.v2.Image.ImageType)
    }

    private int imageSourceCase_ = 0;
    private java.lang.Object imageSource_;
    public enum ImageSourceCase
        implements com.google.protobuf.Internal.EnumLite {
      CONTENT(1),
      IMAGESOURCE_NOT_SET(0);
      private final int value;
      private ImageSourceCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ImageSourceCase valueOf(int value) {
        return forNumber(value);
      }

      public static ImageSourceCase forNumber(int value) {
        switch (value) {
          case 1: return CONTENT;
          case 0: return IMAGESOURCE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ImageSourceCase
    getImageSourceCase() {
      return ImageSourceCase.forNumber(
          imageSourceCase_);
    }

    public static final int CONTENT_FIELD_NUMBER = 1;
    /**
     * <pre>
     *        bytes with data
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      if (imageSourceCase_ == 1) {
        return (com.google.protobuf.ByteString) imageSource_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }

    public static final int IMAGE_TYPE_FIELD_NUMBER = 2;
    private int imageType_;
    /**
     * <pre>
     *    type of data
     * </pre>
     *
     * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
     */
    public int getImageTypeValue() {
      return imageType_;
    }
    /**
     * <pre>
     *    type of data
     * </pre>
     *
     * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
     */
    public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType getImageType() {
      @SuppressWarnings("deprecation")
      yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType result = yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.valueOf(imageType_);
      return result == null ? yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.UNRECOGNIZED : result;
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
      if (imageSourceCase_ == 1) {
        output.writeBytes(
            1, (com.google.protobuf.ByteString) imageSource_);
      }
      if (imageType_ != yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.IMAGE_TYPE_UNSPECIFIED.getNumber()) {
        output.writeEnum(2, imageType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (imageSourceCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(
              1, (com.google.protobuf.ByteString) imageSource_);
      }
      if (imageType_ != yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.IMAGE_TYPE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, imageType_);
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
      if (!(obj instanceof yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image)) {
        return super.equals(obj);
      }
      yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image other = (yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image) obj;

      boolean result = true;
      result = result && imageType_ == other.imageType_;
      result = result && getImageSourceCase().equals(
          other.getImageSourceCase());
      if (!result) return false;
      switch (imageSourceCase_) {
        case 1:
          result = result && getContent()
              .equals(other.getContent());
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + imageType_;
      switch (imageSourceCase_) {
        case 1:
          hash = (37 * hash) + CONTENT_FIELD_NUMBER;
          hash = (53 * hash) + getContent().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image prototype) {
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
     * Protobuf type {@code yandex.cloud.ai.vision.v2.Image}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.ai.vision.v2.Image)
        yandex.cloud.api.ai.vision.v2.ImageOuterClass.ImageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.ai.vision.v2.ImageOuterClass.internal_static_yandex_cloud_ai_vision_v2_Image_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.ai.vision.v2.ImageOuterClass.internal_static_yandex_cloud_ai_vision_v2_Image_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.class, yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.Builder.class);
      }

      // Construct using yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.newBuilder()
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
        imageType_ = 0;

        imageSourceCase_ = 0;
        imageSource_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.ai.vision.v2.ImageOuterClass.internal_static_yandex_cloud_ai_vision_v2_Image_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image getDefaultInstanceForType() {
        return yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image build() {
        yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image buildPartial() {
        yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image result = new yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image(this);
        if (imageSourceCase_ == 1) {
          result.imageSource_ = imageSource_;
        }
        result.imageType_ = imageType_;
        result.imageSourceCase_ = imageSourceCase_;
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
        if (other instanceof yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image) {
          return mergeFrom((yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image other) {
        if (other == yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.getDefaultInstance()) return this;
        if (other.imageType_ != 0) {
          setImageTypeValue(other.getImageTypeValue());
        }
        switch (other.getImageSourceCase()) {
          case CONTENT: {
            setContent(other.getContent());
            break;
          }
          case IMAGESOURCE_NOT_SET: {
            break;
          }
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
        yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int imageSourceCase_ = 0;
      private java.lang.Object imageSource_;
      public ImageSourceCase
          getImageSourceCase() {
        return ImageSourceCase.forNumber(
            imageSourceCase_);
      }

      public Builder clearImageSource() {
        imageSourceCase_ = 0;
        imageSource_ = null;
        onChanged();
        return this;
      }


      /**
       * <pre>
       *        bytes with data
       * </pre>
       *
       * <code>bytes content = 1;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        if (imageSourceCase_ == 1) {
          return (com.google.protobuf.ByteString) imageSource_;
        }
        return com.google.protobuf.ByteString.EMPTY;
      }
      /**
       * <pre>
       *        bytes with data
       * </pre>
       *
       * <code>bytes content = 1;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  imageSourceCase_ = 1;
        imageSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *        bytes with data
       * </pre>
       *
       * <code>bytes content = 1;</code>
       */
      public Builder clearContent() {
        if (imageSourceCase_ == 1) {
          imageSourceCase_ = 0;
          imageSource_ = null;
          onChanged();
        }
        return this;
      }

      private int imageType_ = 0;
      /**
       * <pre>
       *    type of data
       * </pre>
       *
       * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
       */
      public int getImageTypeValue() {
        return imageType_;
      }
      /**
       * <pre>
       *    type of data
       * </pre>
       *
       * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
       */
      public Builder setImageTypeValue(int value) {
        imageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *    type of data
       * </pre>
       *
       * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
       */
      public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType getImageType() {
        @SuppressWarnings("deprecation")
        yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType result = yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.valueOf(imageType_);
        return result == null ? yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *    type of data
       * </pre>
       *
       * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
       */
      public Builder setImageType(yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image.ImageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        imageType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *    type of data
       * </pre>
       *
       * <code>.yandex.cloud.ai.vision.v2.Image.ImageType image_type = 2;</code>
       */
      public Builder clearImageType() {
        
        imageType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.ai.vision.v2.Image)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.ai.vision.v2.Image)
    private static final yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image();
    }

    public static yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Image>
        PARSER = new com.google.protobuf.AbstractParser<Image>() {
      @java.lang.Override
      public Image parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Image(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Image> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Image> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.ai.vision.v2.ImageOuterClass.Image getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_ai_vision_v2_Image_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_ai_vision_v2_Image_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%yandex/cloud/ai/vision/v2/image.proto\022" +
      "\031yandex.cloud.ai.vision.v2\"\245\001\n\005Image\022\021\n\007" +
      "content\030\001 \001(\014H\000\022>\n\nimage_type\030\002 \001(\0162*.ya" +
      "ndex.cloud.ai.vision.v2.Image.ImageType\"" +
      ":\n\tImageType\022\032\n\026IMAGE_TYPE_UNSPECIFIED\020\000" +
      "\022\010\n\004JPEG\020\001\022\007\n\003PNG\020\002B\r\n\013ImageSourceBe\n\035ya" +
      "ndex.cloud.api.ai.vision.v2ZDgithub.com/" +
      "yandex-cloud/go-genproto/yandex/cloud/ai" +
      "/vision/v2;visionb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_yandex_cloud_ai_vision_v2_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_ai_vision_v2_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_ai_vision_v2_Image_descriptor,
        new java.lang.String[] { "Content", "ImageType", "ImageSource", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}