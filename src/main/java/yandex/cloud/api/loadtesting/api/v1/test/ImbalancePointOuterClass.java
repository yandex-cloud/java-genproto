// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/loadtesting/api/v1/test/imbalance_point.proto

package yandex.cloud.api.loadtesting.api.v1.test;

public final class ImbalancePointOuterClass {
  private ImbalancePointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImbalancePointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.loadtesting.api.v1.test.ImbalancePoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     * @return Whether the at field is set.
     */
    boolean hasAt();
    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     * @return The at.
     */
    com.google.protobuf.Timestamp getAt();
    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getAtOrBuilder();

    /**
     * <pre>
     * Imbalance moment RPS.
     * </pre>
     *
     * <code>int64 rps = 2;</code>
     * @return The rps.
     */
    long getRps();

    /**
     * <pre>
     * Imbalance reason comment.
     * </pre>
     *
     * <code>string comment = 3;</code>
     * @return The comment.
     */
    java.lang.String getComment();
    /**
     * <pre>
     * Imbalance reason comment.
     * </pre>
     *
     * <code>string comment = 3;</code>
     * @return The bytes for comment.
     */
    com.google.protobuf.ByteString
        getCommentBytes();
  }
  /**
   * <pre>
   * Test imbalance point.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.loadtesting.api.v1.test.ImbalancePoint}
   */
  public static final class ImbalancePoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.loadtesting.api.v1.test.ImbalancePoint)
      ImbalancePointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ImbalancePoint.newBuilder() to construct.
    private ImbalancePoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImbalancePoint() {
      comment_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ImbalancePoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ImbalancePoint(
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
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (at_ != null) {
                subBuilder = at_.toBuilder();
              }
              at_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(at_);
                at_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              rps_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              comment_ = s;
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
      return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.class, yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.Builder.class);
    }

    public static final int AT_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp at_;
    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     * @return Whether the at field is set.
     */
    @java.lang.Override
    public boolean hasAt() {
      return at_ != null;
    }
    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     * @return The at.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getAt() {
      return at_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : at_;
    }
    /**
     * <pre>
     * Imbalance moment timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp at = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getAtOrBuilder() {
      return getAt();
    }

    public static final int RPS_FIELD_NUMBER = 2;
    private long rps_;
    /**
     * <pre>
     * Imbalance moment RPS.
     * </pre>
     *
     * <code>int64 rps = 2;</code>
     * @return The rps.
     */
    @java.lang.Override
    public long getRps() {
      return rps_;
    }

    public static final int COMMENT_FIELD_NUMBER = 3;
    private volatile java.lang.Object comment_;
    /**
     * <pre>
     * Imbalance reason comment.
     * </pre>
     *
     * <code>string comment = 3;</code>
     * @return The comment.
     */
    @java.lang.Override
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Imbalance reason comment.
     * </pre>
     *
     * <code>string comment = 3;</code>
     * @return The bytes for comment.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
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
      if (at_ != null) {
        output.writeMessage(1, getAt());
      }
      if (rps_ != 0L) {
        output.writeInt64(2, rps_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, comment_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (at_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getAt());
      }
      if (rps_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, rps_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, comment_);
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
      if (!(obj instanceof yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint)) {
        return super.equals(obj);
      }
      yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint other = (yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint) obj;

      if (hasAt() != other.hasAt()) return false;
      if (hasAt()) {
        if (!getAt()
            .equals(other.getAt())) return false;
      }
      if (getRps()
          != other.getRps()) return false;
      if (!getComment()
          .equals(other.getComment())) return false;
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
      if (hasAt()) {
        hash = (37 * hash) + AT_FIELD_NUMBER;
        hash = (53 * hash) + getAt().hashCode();
      }
      hash = (37 * hash) + RPS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRps());
      hash = (37 * hash) + COMMENT_FIELD_NUMBER;
      hash = (53 * hash) + getComment().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint prototype) {
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
     * Test imbalance point.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.loadtesting.api.v1.test.ImbalancePoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.loadtesting.api.v1.test.ImbalancePoint)
        yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.class, yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.Builder.class);
      }

      // Construct using yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.newBuilder()
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
        if (atBuilder_ == null) {
          at_ = null;
        } else {
          at_ = null;
          atBuilder_ = null;
        }
        rps_ = 0L;

        comment_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint getDefaultInstanceForType() {
        return yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint build() {
        yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint buildPartial() {
        yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint result = new yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint(this);
        if (atBuilder_ == null) {
          result.at_ = at_;
        } else {
          result.at_ = atBuilder_.build();
        }
        result.rps_ = rps_;
        result.comment_ = comment_;
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
        if (other instanceof yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint) {
          return mergeFrom((yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint other) {
        if (other == yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint.getDefaultInstance()) return this;
        if (other.hasAt()) {
          mergeAt(other.getAt());
        }
        if (other.getRps() != 0L) {
          setRps(other.getRps());
        }
        if (!other.getComment().isEmpty()) {
          comment_ = other.comment_;
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
        yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Timestamp at_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> atBuilder_;
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       * @return Whether the at field is set.
       */
      public boolean hasAt() {
        return atBuilder_ != null || at_ != null;
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       * @return The at.
       */
      public com.google.protobuf.Timestamp getAt() {
        if (atBuilder_ == null) {
          return at_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : at_;
        } else {
          return atBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public Builder setAt(com.google.protobuf.Timestamp value) {
        if (atBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          at_ = value;
          onChanged();
        } else {
          atBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public Builder setAt(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (atBuilder_ == null) {
          at_ = builderForValue.build();
          onChanged();
        } else {
          atBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public Builder mergeAt(com.google.protobuf.Timestamp value) {
        if (atBuilder_ == null) {
          if (at_ != null) {
            at_ =
              com.google.protobuf.Timestamp.newBuilder(at_).mergeFrom(value).buildPartial();
          } else {
            at_ = value;
          }
          onChanged();
        } else {
          atBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public Builder clearAt() {
        if (atBuilder_ == null) {
          at_ = null;
          onChanged();
        } else {
          at_ = null;
          atBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getAtBuilder() {
        
        onChanged();
        return getAtFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getAtOrBuilder() {
        if (atBuilder_ != null) {
          return atBuilder_.getMessageOrBuilder();
        } else {
          return at_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : at_;
        }
      }
      /**
       * <pre>
       * Imbalance moment timestamp.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp at = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getAtFieldBuilder() {
        if (atBuilder_ == null) {
          atBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getAt(),
                  getParentForChildren(),
                  isClean());
          at_ = null;
        }
        return atBuilder_;
      }

      private long rps_ ;
      /**
       * <pre>
       * Imbalance moment RPS.
       * </pre>
       *
       * <code>int64 rps = 2;</code>
       * @return The rps.
       */
      @java.lang.Override
      public long getRps() {
        return rps_;
      }
      /**
       * <pre>
       * Imbalance moment RPS.
       * </pre>
       *
       * <code>int64 rps = 2;</code>
       * @param value The rps to set.
       * @return This builder for chaining.
       */
      public Builder setRps(long value) {
        
        rps_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Imbalance moment RPS.
       * </pre>
       *
       * <code>int64 rps = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRps() {
        
        rps_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object comment_ = "";
      /**
       * <pre>
       * Imbalance reason comment.
       * </pre>
       *
       * <code>string comment = 3;</code>
       * @return The comment.
       */
      public java.lang.String getComment() {
        java.lang.Object ref = comment_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          comment_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Imbalance reason comment.
       * </pre>
       *
       * <code>string comment = 3;</code>
       * @return The bytes for comment.
       */
      public com.google.protobuf.ByteString
          getCommentBytes() {
        java.lang.Object ref = comment_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          comment_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Imbalance reason comment.
       * </pre>
       *
       * <code>string comment = 3;</code>
       * @param value The comment to set.
       * @return This builder for chaining.
       */
      public Builder setComment(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        comment_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Imbalance reason comment.
       * </pre>
       *
       * <code>string comment = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearComment() {
        
        comment_ = getDefaultInstance().getComment();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Imbalance reason comment.
       * </pre>
       *
       * <code>string comment = 3;</code>
       * @param value The bytes for comment to set.
       * @return This builder for chaining.
       */
      public Builder setCommentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        comment_ = value;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.loadtesting.api.v1.test.ImbalancePoint)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.loadtesting.api.v1.test.ImbalancePoint)
    private static final yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint();
    }

    public static yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImbalancePoint>
        PARSER = new com.google.protobuf.AbstractParser<ImbalancePoint>() {
      @java.lang.Override
      public ImbalancePoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImbalancePoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImbalancePoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImbalancePoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.loadtesting.api.v1.test.ImbalancePointOuterClass.ImbalancePoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:yandex/cloud/loadtesting/api/v1/test/i" +
      "mbalance_point.proto\022$yandex.cloud.loadt" +
      "esting.api.v1.test\032\037google/protobuf/time" +
      "stamp.proto\"V\n\016ImbalancePoint\022&\n\002at\030\001 \001(" +
      "\0132\032.google.protobuf.Timestamp\022\013\n\003rps\030\002 \001" +
      "(\003\022\017\n\007comment\030\003 \001(\tBy\n(yandex.cloud.api." +
      "loadtesting.api.v1.testZMgithub.com/yand" +
      "ex-cloud/go-genproto/yandex/cloud/loadte" +
      "sting/api/v1/test;testb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_loadtesting_api_v1_test_ImbalancePoint_descriptor,
        new java.lang.String[] { "At", "Rps", "Comment", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
