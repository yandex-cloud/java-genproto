// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/datasphere/v1/app_token_service.proto

package yandex.cloud.api.datasphere.v1;

public final class AppTokenServiceOuterClass {
  private AppTokenServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AppTokenValidateRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.datasphere.v1.AppTokenValidateRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * App token to validate.
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    java.lang.String getToken();
    /**
     * <pre>
     * App token to validate.
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code yandex.cloud.datasphere.v1.AppTokenValidateRequest}
   */
  public  static final class AppTokenValidateRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.datasphere.v1.AppTokenValidateRequest)
      AppTokenValidateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AppTokenValidateRequest.newBuilder() to construct.
    private AppTokenValidateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AppTokenValidateRequest() {
      token_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AppTokenValidateRequest(
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

              token_ = s;
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
      return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.class, yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.Builder.class);
    }

    public static final int TOKEN_FIELD_NUMBER = 1;
    private volatile java.lang.Object token_;
    /**
     * <pre>
     * App token to validate.
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * App token to validate.
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
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
      if (!getTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
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
      if (!(obj instanceof yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest)) {
        return super.equals(obj);
      }
      yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest other = (yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest) obj;

      boolean result = true;
      result = result && getToken()
          .equals(other.getToken());
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
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest prototype) {
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
     * Protobuf type {@code yandex.cloud.datasphere.v1.AppTokenValidateRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.datasphere.v1.AppTokenValidateRequest)
        yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.class, yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.Builder.class);
      }

      // Construct using yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.newBuilder()
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
        token_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest getDefaultInstanceForType() {
        return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest build() {
        yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest buildPartial() {
        yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest result = new yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest(this);
        result.token_ = token_;
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
        if (other instanceof yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest) {
          return mergeFrom((yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest other) {
        if (other == yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.getDefaultInstance()) return this;
        if (!other.getToken().isEmpty()) {
          token_ = other.token_;
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
        yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object token_ = "";
      /**
       * <pre>
       * App token to validate.
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * App token to validate.
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * App token to validate.
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * App token to validate.
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder clearToken() {
        
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * App token to validate.
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        token_ = value;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.datasphere.v1.AppTokenValidateRequest)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.datasphere.v1.AppTokenValidateRequest)
    private static final yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest();
    }

    public static yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AppTokenValidateRequest>
        PARSER = new com.google.protobuf.AbstractParser<AppTokenValidateRequest>() {
      @java.lang.Override
      public AppTokenValidateRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppTokenValidateRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AppTokenValidateRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppTokenValidateRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2yandex/cloud/datasphere/v1/app_token_s" +
      "ervice.proto\022\032yandex.cloud.datasphere.v1" +
      "\032\034google/api/annotations.proto\032\033google/p" +
      "rotobuf/empty.proto\"(\n\027AppTokenValidateR" +
      "equest\022\r\n\005token\030\001 \001(\t2\236\001\n\017AppTokenServic" +
      "e\022\212\001\n\010Validate\0223.yandex.cloud.datasphere" +
      ".v1.AppTokenValidateRequest\032\026.google.pro" +
      "tobuf.Empty\"1\202\323\344\223\002+\")/datasphere/v1/appT" +
      "okens/{token}:validateBk\n\036yandex.cloud.a" +
      "pi.datasphere.v1ZIgithub.com/yandex-clou" +
      "d/go-genproto/yandex/cloud/datasphere/v1" +
      ";datasphereb\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_datasphere_v1_AppTokenValidateRequest_descriptor,
        new java.lang.String[] { "Token", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}