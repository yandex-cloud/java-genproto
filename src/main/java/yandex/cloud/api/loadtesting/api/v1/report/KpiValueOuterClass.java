// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/loadtesting/api/v1/report/kpi_value.proto

package yandex.cloud.api.loadtesting.api.v1.report;

public final class KpiValueOuterClass {
  private KpiValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KpiValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.loadtesting.api.v1.report.KpiValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of a test.
     * </pre>
     *
     * <code>string test_id = 1;</code>
     * @return The testId.
     */
    java.lang.String getTestId();
    /**
     * <pre>
     * ID of a test.
     * </pre>
     *
     * <code>string test_id = 1;</code>
     * @return The bytes for testId.
     */
    com.google.protobuf.ByteString
        getTestIdBytes();

    /**
     * <pre>
     * Value of KPI.
     * </pre>
     *
     * <code>double value = 2;</code>
     * @return The value.
     */
    double getValue();

    /**
     * <pre>
     * A flag indicating whether the value satisfies KPI threshold condition.
     * </pre>
     *
     * <code>bool is_ok = 3;</code>
     * @return The isOk.
     */
    boolean getIsOk();
  }
  /**
   * <pre>
   * An actual value of test's KPI.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.loadtesting.api.v1.report.KpiValue}
   */
  public static final class KpiValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.loadtesting.api.v1.report.KpiValue)
      KpiValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KpiValue.newBuilder() to construct.
    private KpiValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KpiValue() {
      testId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KpiValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KpiValue(
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

              testId_ = s;
              break;
            }
            case 17: {

              value_ = input.readDouble();
              break;
            }
            case 24: {

              isOk_ = input.readBool();
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
      return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.class, yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.Builder.class);
    }

    public static final int TEST_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object testId_;
    /**
     * <pre>
     * ID of a test.
     * </pre>
     *
     * <code>string test_id = 1;</code>
     * @return The testId.
     */
    @java.lang.Override
    public java.lang.String getTestId() {
      java.lang.Object ref = testId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of a test.
     * </pre>
     *
     * <code>string test_id = 1;</code>
     * @return The bytes for testId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTestIdBytes() {
      java.lang.Object ref = testId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private double value_;
    /**
     * <pre>
     * Value of KPI.
     * </pre>
     *
     * <code>double value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }

    public static final int IS_OK_FIELD_NUMBER = 3;
    private boolean isOk_;
    /**
     * <pre>
     * A flag indicating whether the value satisfies KPI threshold condition.
     * </pre>
     *
     * <code>bool is_ok = 3;</code>
     * @return The isOk.
     */
    @java.lang.Override
    public boolean getIsOk() {
      return isOk_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, testId_);
      }
      if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
        output.writeDouble(2, value_);
      }
      if (isOk_ != false) {
        output.writeBool(3, isOk_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, testId_);
      }
      if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, value_);
      }
      if (isOk_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isOk_);
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
      if (!(obj instanceof yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue)) {
        return super.equals(obj);
      }
      yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue other = (yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue) obj;

      if (!getTestId()
          .equals(other.getTestId())) return false;
      if (java.lang.Double.doubleToLongBits(getValue())
          != java.lang.Double.doubleToLongBits(
              other.getValue())) return false;
      if (getIsOk()
          != other.getIsOk()) return false;
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
      hash = (37 * hash) + TEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTestId().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + IS_OK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOk());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue prototype) {
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
     * An actual value of test's KPI.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.loadtesting.api.v1.report.KpiValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.loadtesting.api.v1.report.KpiValue)
        yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.class, yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.Builder.class);
      }

      // Construct using yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.newBuilder()
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
        testId_ = "";

        value_ = 0D;

        isOk_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue getDefaultInstanceForType() {
        return yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue build() {
        yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue buildPartial() {
        yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue result = new yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue(this);
        result.testId_ = testId_;
        result.value_ = value_;
        result.isOk_ = isOk_;
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
        if (other instanceof yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue) {
          return mergeFrom((yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue other) {
        if (other == yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue.getDefaultInstance()) return this;
        if (!other.getTestId().isEmpty()) {
          testId_ = other.testId_;
          onChanged();
        }
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.getIsOk() != false) {
          setIsOk(other.getIsOk());
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
        yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object testId_ = "";
      /**
       * <pre>
       * ID of a test.
       * </pre>
       *
       * <code>string test_id = 1;</code>
       * @return The testId.
       */
      public java.lang.String getTestId() {
        java.lang.Object ref = testId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          testId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of a test.
       * </pre>
       *
       * <code>string test_id = 1;</code>
       * @return The bytes for testId.
       */
      public com.google.protobuf.ByteString
          getTestIdBytes() {
        java.lang.Object ref = testId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          testId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of a test.
       * </pre>
       *
       * <code>string test_id = 1;</code>
       * @param value The testId to set.
       * @return This builder for chaining.
       */
      public Builder setTestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        testId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of a test.
       * </pre>
       *
       * <code>string test_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTestId() {
        
        testId_ = getDefaultInstance().getTestId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of a test.
       * </pre>
       *
       * <code>string test_id = 1;</code>
       * @param value The bytes for testId to set.
       * @return This builder for chaining.
       */
      public Builder setTestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        testId_ = value;
        onChanged();
        return this;
      }

      private double value_ ;
      /**
       * <pre>
       * Value of KPI.
       * </pre>
       *
       * <code>double value = 2;</code>
       * @return The value.
       */
      @java.lang.Override
      public double getValue() {
        return value_;
      }
      /**
       * <pre>
       * Value of KPI.
       * </pre>
       *
       * <code>double value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Value of KPI.
       * </pre>
       *
       * <code>double value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0D;
        onChanged();
        return this;
      }

      private boolean isOk_ ;
      /**
       * <pre>
       * A flag indicating whether the value satisfies KPI threshold condition.
       * </pre>
       *
       * <code>bool is_ok = 3;</code>
       * @return The isOk.
       */
      @java.lang.Override
      public boolean getIsOk() {
        return isOk_;
      }
      /**
       * <pre>
       * A flag indicating whether the value satisfies KPI threshold condition.
       * </pre>
       *
       * <code>bool is_ok = 3;</code>
       * @param value The isOk to set.
       * @return This builder for chaining.
       */
      public Builder setIsOk(boolean value) {
        
        isOk_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A flag indicating whether the value satisfies KPI threshold condition.
       * </pre>
       *
       * <code>bool is_ok = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOk() {
        
        isOk_ = false;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.loadtesting.api.v1.report.KpiValue)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.loadtesting.api.v1.report.KpiValue)
    private static final yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue();
    }

    public static yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KpiValue>
        PARSER = new com.google.protobuf.AbstractParser<KpiValue>() {
      @java.lang.Override
      public KpiValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KpiValue(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KpiValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KpiValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.loadtesting.api.v1.report.KpiValueOuterClass.KpiValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6yandex/cloud/loadtesting/api/v1/report" +
      "/kpi_value.proto\022&yandex.cloud.loadtesti" +
      "ng.api.v1.report\"9\n\010KpiValue\022\017\n\007test_id\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\001\022\r\n\005is_ok\030\003 \001(\010B\177\n*y" +
      "andex.cloud.api.loadtesting.api.v1.repor" +
      "tZQgithub.com/yandex-cloud/go-genproto/y" +
      "andex/cloud/loadtesting/api/v1/report;re" +
      "portb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_loadtesting_api_v1_report_KpiValue_descriptor,
        new java.lang.String[] { "TestId", "Value", "IsOk", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
