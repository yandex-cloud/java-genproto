// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/lockbox/v1/payload_service.proto

package yandex.cloud.api.lockbox.v1;

public final class PayloadServiceOuterClass {
  private PayloadServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPayloadRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.lockbox.v1.GetPayloadRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the secret.
     * </pre>
     *
     * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     */
    java.lang.String getSecretId();
    /**
     * <pre>
     * ID of the secret.
     * </pre>
     *
     * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     */
    com.google.protobuf.ByteString
        getSecretIdBytes();

    /**
     * <pre>
     * Optional ID of the version.
     * </pre>
     *
     * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
     */
    java.lang.String getVersionId();
    /**
     * <pre>
     * Optional ID of the version.
     * </pre>
     *
     * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
     */
    com.google.protobuf.ByteString
        getVersionIdBytes();
  }
  /**
   * Protobuf type {@code yandex.cloud.lockbox.v1.GetPayloadRequest}
   */
  public  static final class GetPayloadRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.lockbox.v1.GetPayloadRequest)
      GetPayloadRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPayloadRequest.newBuilder() to construct.
    private GetPayloadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPayloadRequest() {
      secretId_ = "";
      versionId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPayloadRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              secretId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              versionId_ = s;
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
      return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.class, yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.Builder.class);
    }

    public static final int SECRET_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object secretId_;
    /**
     * <pre>
     * ID of the secret.
     * </pre>
     *
     * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     */
    public java.lang.String getSecretId() {
      java.lang.Object ref = secretId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the secret.
     * </pre>
     *
     * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     */
    public com.google.protobuf.ByteString
        getSecretIdBytes() {
      java.lang.Object ref = secretId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secretId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object versionId_;
    /**
     * <pre>
     * Optional ID of the version.
     * </pre>
     *
     * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
     */
    public java.lang.String getVersionId() {
      java.lang.Object ref = versionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Optional ID of the version.
     * </pre>
     *
     * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
     */
    public com.google.protobuf.ByteString
        getVersionIdBytes() {
      java.lang.Object ref = versionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionId_ = b;
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
      if (!getSecretIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, secretId_);
      }
      if (!getVersionIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, versionId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSecretIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, secretId_);
      }
      if (!getVersionIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, versionId_);
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
      if (!(obj instanceof yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest)) {
        return super.equals(obj);
      }
      yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest other = (yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest) obj;

      boolean result = true;
      result = result && getSecretId()
          .equals(other.getSecretId());
      result = result && getVersionId()
          .equals(other.getVersionId());
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
      hash = (37 * hash) + SECRET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSecretId().hashCode();
      hash = (37 * hash) + VERSION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVersionId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest prototype) {
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
     * Protobuf type {@code yandex.cloud.lockbox.v1.GetPayloadRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.lockbox.v1.GetPayloadRequest)
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.class, yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.Builder.class);
      }

      // Construct using yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.newBuilder()
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
        secretId_ = "";

        versionId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest getDefaultInstanceForType() {
        return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest build() {
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest buildPartial() {
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest result = new yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest(this);
        result.secretId_ = secretId_;
        result.versionId_ = versionId_;
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
        if (other instanceof yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest) {
          return mergeFrom((yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest other) {
        if (other == yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.getDefaultInstance()) return this;
        if (!other.getSecretId().isEmpty()) {
          secretId_ = other.secretId_;
          onChanged();
        }
        if (!other.getVersionId().isEmpty()) {
          versionId_ = other.versionId_;
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
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object secretId_ = "";
      /**
       * <pre>
       * ID of the secret.
       * </pre>
       *
       * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public java.lang.String getSecretId() {
        java.lang.Object ref = secretId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          secretId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the secret.
       * </pre>
       *
       * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public com.google.protobuf.ByteString
          getSecretIdBytes() {
        java.lang.Object ref = secretId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          secretId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the secret.
       * </pre>
       *
       * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder setSecretId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        secretId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the secret.
       * </pre>
       *
       * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder clearSecretId() {
        
        secretId_ = getDefaultInstance().getSecretId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the secret.
       * </pre>
       *
       * <code>string secret_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder setSecretIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        secretId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object versionId_ = "";
      /**
       * <pre>
       * Optional ID of the version.
       * </pre>
       *
       * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public java.lang.String getVersionId() {
        java.lang.Object ref = versionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          versionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Optional ID of the version.
       * </pre>
       *
       * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public com.google.protobuf.ByteString
          getVersionIdBytes() {
        java.lang.Object ref = versionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Optional ID of the version.
       * </pre>
       *
       * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder setVersionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        versionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Optional ID of the version.
       * </pre>
       *
       * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder clearVersionId() {
        
        versionId_ = getDefaultInstance().getVersionId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Optional ID of the version.
       * </pre>
       *
       * <code>string version_id = 2 [(.yandex.cloud.length) = "&lt;=50"];</code>
       */
      public Builder setVersionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        versionId_ = value;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.lockbox.v1.GetPayloadRequest)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.lockbox.v1.GetPayloadRequest)
    private static final yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest();
    }

    public static yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPayloadRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetPayloadRequest>() {
      @java.lang.Override
      public GetPayloadRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPayloadRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPayloadRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPayloadRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-yandex/cloud/lockbox/v1/payload_servic" +
      "e.proto\022\027yandex.cloud.lockbox.v1\032\034google" +
      "/api/annotations.proto\032%yandex/cloud/loc" +
      "kbox/v1/payload.proto\032\035yandex/cloud/vali" +
      "dation.proto\"R\n\021GetPayloadRequest\022\037\n\tsec" +
      "ret_id\030\001 \001(\tB\014\350\3071\001\212\3101\004<=50\022\034\n\nversion_id" +
      "\030\002 \001(\tB\010\212\3101\004<=502\227\001\n\016PayloadService\022\204\001\n\003" +
      "Get\022*.yandex.cloud.lockbox.v1.GetPayload" +
      "Request\032 .yandex.cloud.lockbox.v1.Payloa" +
      "d\"/\202\323\344\223\002)\022\'/lockbox/v1/secrets/{secret_i" +
      "d}/payloadBb\n\033yandex.cloud.api.lockbox.v" +
      "1ZCgithub.com/yandex-cloud/go-genproto/y" +
      "andex/cloud/lockbox/v1;lockboxb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          yandex.cloud.api.lockbox.v1.PayloadOuterClass.getDescriptor(),
          yandex.cloud.api.Validation.getDescriptor(),
        }, assigner);
    internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_lockbox_v1_GetPayloadRequest_descriptor,
        new java.lang.String[] { "SecretId", "VersionId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(yandex.cloud.api.Validation.length);
    registry.add(yandex.cloud.api.Validation.required);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    yandex.cloud.api.lockbox.v1.PayloadOuterClass.getDescriptor();
    yandex.cloud.api.Validation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}