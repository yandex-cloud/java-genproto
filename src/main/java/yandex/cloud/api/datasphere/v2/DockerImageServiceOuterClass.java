// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/datasphere/v2/docker_image_service.proto

package yandex.cloud.api.datasphere.v2;

public final class DockerImageServiceOuterClass {
  private DockerImageServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivateDockerImageRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.datasphere.v2.ActivateDockerImageRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The projectId.
     */
    java.lang.String getProjectId();
    /**
     * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The bytes for projectId.
     */
    com.google.protobuf.ByteString
        getProjectIdBytes();

    /**
     * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The dockerId.
     */
    java.lang.String getDockerId();
    /**
     * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The bytes for dockerId.
     */
    com.google.protobuf.ByteString
        getDockerIdBytes();
  }
  /**
   * Protobuf type {@code yandex.cloud.datasphere.v2.ActivateDockerImageRequest}
   */
  public static final class ActivateDockerImageRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.datasphere.v2.ActivateDockerImageRequest)
      ActivateDockerImageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivateDockerImageRequest.newBuilder() to construct.
    private ActivateDockerImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivateDockerImageRequest() {
      projectId_ = "";
      dockerId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivateDockerImageRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivateDockerImageRequest(
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

              projectId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              dockerId_ = s;
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
      return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.class, yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.Builder.class);
    }

    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object projectId_;
    /**
     * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The projectId.
     */
    @java.lang.Override
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      }
    }
    /**
     * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The bytes for projectId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOCKER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object dockerId_;
    /**
     * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The dockerId.
     */
    @java.lang.Override
    public java.lang.String getDockerId() {
      java.lang.Object ref = dockerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dockerId_ = s;
        return s;
      }
    }
    /**
     * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
     * @return The bytes for dockerId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDockerIdBytes() {
      java.lang.Object ref = dockerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dockerId_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dockerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dockerId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dockerId_);
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
      if (!(obj instanceof yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest)) {
        return super.equals(obj);
      }
      yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest other = (yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest) obj;

      if (!getProjectId()
          .equals(other.getProjectId())) return false;
      if (!getDockerId()
          .equals(other.getDockerId())) return false;
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
      hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProjectId().hashCode();
      hash = (37 * hash) + DOCKER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDockerId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest prototype) {
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
     * Protobuf type {@code yandex.cloud.datasphere.v2.ActivateDockerImageRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.datasphere.v2.ActivateDockerImageRequest)
        yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.class, yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.Builder.class);
      }

      // Construct using yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.newBuilder()
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
        projectId_ = "";

        dockerId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest getDefaultInstanceForType() {
        return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest build() {
        yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest buildPartial() {
        yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest result = new yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest(this);
        result.projectId_ = projectId_;
        result.dockerId_ = dockerId_;
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
        if (other instanceof yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest) {
          return mergeFrom((yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest other) {
        if (other == yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.getDefaultInstance()) return this;
        if (!other.getProjectId().isEmpty()) {
          projectId_ = other.projectId_;
          onChanged();
        }
        if (!other.getDockerId().isEmpty()) {
          dockerId_ = other.dockerId_;
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
        yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object projectId_ = "";
      /**
       * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return The projectId.
       */
      public java.lang.String getProjectId() {
        java.lang.Object ref = projectId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          projectId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return The bytes for projectId.
       */
      public com.google.protobuf.ByteString
          getProjectIdBytes() {
        java.lang.Object ref = projectId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          projectId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @param value The projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        projectId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return This builder for chaining.
       */
      public Builder clearProjectId() {
        
        projectId_ = getDefaultInstance().getProjectId();
        onChanged();
        return this;
      }
      /**
       * <code>string project_id = 1 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @param value The bytes for projectId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        projectId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object dockerId_ = "";
      /**
       * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return The dockerId.
       */
      public java.lang.String getDockerId() {
        java.lang.Object ref = dockerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dockerId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return The bytes for dockerId.
       */
      public com.google.protobuf.ByteString
          getDockerIdBytes() {
        java.lang.Object ref = dockerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dockerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @param value The dockerId to set.
       * @return This builder for chaining.
       */
      public Builder setDockerId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        dockerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDockerId() {
        
        dockerId_ = getDefaultInstance().getDockerId();
        onChanged();
        return this;
      }
      /**
       * <code>string docker_id = 2 [(.yandex.cloud.required) = true, (.yandex.cloud.length) = "&lt;=50"];</code>
       * @param value The bytes for dockerId to set.
       * @return This builder for chaining.
       */
      public Builder setDockerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        dockerId_ = value;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.datasphere.v2.ActivateDockerImageRequest)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.datasphere.v2.ActivateDockerImageRequest)
    private static final yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest();
    }

    public static yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivateDockerImageRequest>
        PARSER = new com.google.protobuf.AbstractParser<ActivateDockerImageRequest>() {
      @java.lang.Override
      public ActivateDockerImageRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivateDockerImageRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivateDockerImageRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivateDockerImageRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5yandex/cloud/datasphere/v2/docker_imag" +
      "e_service.proto\022\032yandex.cloud.datasphere" +
      ".v2\032\034google/api/annotations.proto\032 yande" +
      "x/cloud/api/operation.proto\032&yandex/clou" +
      "d/operation/operation.proto\032\035yandex/clou" +
      "d/validation.proto\"_\n\032ActivateDockerImag" +
      "eRequest\022 \n\nproject_id\030\001 \001(\tB\014\350\3071\001\212\3101\004<=" +
      "50\022\037\n\tdocker_id\030\002 \001(\tB\014\350\3071\001\212\3101\004<=502\302\001\n\022" +
      "DockerImageService\022\253\001\n\010Activate\0226.yandex" +
      ".cloud.datasphere.v2.ActivateDockerImage" +
      "Request\032!.yandex.cloud.operation.Operati" +
      "on\"D\202\323\344\223\002#\"\036/datasphere/v2/docker/activa" +
      "te:\001*\262\322*\027\022\025google.protobuf.EmptyBk\n\036yand" +
      "ex.cloud.api.datasphere.v2ZIgithub.com/y" +
      "andex-cloud/go-genproto/yandex/cloud/dat" +
      "asphere/v2;datasphereb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          yandex.cloud.api.OperationOuterClass.getDescriptor(),
          yandex.cloud.api.operation.OperationOuterClass.getDescriptor(),
          yandex.cloud.api.Validation.getDescriptor(),
        });
    internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_datasphere_v2_ActivateDockerImageRequest_descriptor,
        new java.lang.String[] { "ProjectId", "DockerId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(yandex.cloud.api.OperationOuterClass.operation);
    registry.add(yandex.cloud.api.Validation.length);
    registry.add(yandex.cloud.api.Validation.required);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    yandex.cloud.api.OperationOuterClass.getDescriptor();
    yandex.cloud.api.operation.OperationOuterClass.getDescriptor();
    yandex.cloud.api.Validation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}