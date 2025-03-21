// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/loadtesting/api/v1/test/status.proto

package yandex.cloud.api.loadtesting.api.v1.test;

public final class StatusOuterClass {
  private StatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code yandex.cloud.loadtesting.api.v1.test.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Status is unspecified.
     * </pre>
     *
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <pre>
     * Test has been created, but not started by any agent.
     * </pre>
     *
     * <code>CREATED = 1;</code>
     */
    CREATED(1),
    /**
     * <pre>
     * Execution stage: initialization.
     * </pre>
     *
     * <code>INITIATED = 2;</code>
     */
    INITIATED(2),
    /**
     * <pre>
     * Execution stage: data preparation and warm-up.
     * </pre>
     *
     * <code>PREPARING = 3;</code>
     */
    PREPARING(3),
    /**
     * <pre>
     * Execution stage: load generation.
     * </pre>
     *
     * <code>RUNNING = 4;</code>
     */
    RUNNING(4),
    /**
     * <pre>
     * Execution stage: termination.
     * </pre>
     *
     * <code>FINISHING = 5;</code>
     */
    FINISHING(5),
    /**
     * <pre>
     * Test is done.
     * </pre>
     *
     * <code>DONE = 6;</code>
     */
    DONE(6),
    /**
     * <pre>
     * Execution stage: results post-processing.
     * </pre>
     *
     * <code>POST_PROCESSING = 7;</code>
     */
    POST_PROCESSING(7),
    /**
     * <pre>
     * Test has failed due to some error.
     * </pre>
     *
     * <code>FAILED = 8;</code>
     */
    FAILED(8),
    /**
     * <pre>
     * Test is being stopped.
     * </pre>
     *
     * <code>STOPPING = 9;</code>
     */
    STOPPING(9),
    /**
     * <pre>
     * Test has been stopped by user.
     * </pre>
     *
     * <code>STOPPED = 10;</code>
     */
    STOPPED(10),
    /**
     * <pre>
     * Test has been stopped automatically by satisfying autostop condition.
     * </pre>
     *
     * <code>AUTOSTOPPED = 11;</code>
     */
    AUTOSTOPPED(11),
    /**
     * <pre>
     * Execution stage: waiting for a trigger to start.
     * </pre>
     *
     * <code>WAITING = 12;</code>
     */
    WAITING(12),
    /**
     * <pre>
     * Test is being deleted.
     * </pre>
     *
     * <code>DELETING = 13;</code>
     */
    DELETING(13),
    /**
     * <pre>
     * Test status has not been reported in a while during execution stage.
     * Means that either an agent is too busy to send it, got offline, or failed without
     * reporting a final status.
     * </pre>
     *
     * <code>LOST = 14;</code>
     */
    LOST(14),
    /**
     * <pre>
     * Test has been cancelled.
     * </pre>
     *
     * <code>CANCELLED = 15;</code>
     */
    CANCELLED(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Status is unspecified.
     * </pre>
     *
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Test has been created, but not started by any agent.
     * </pre>
     *
     * <code>CREATED = 1;</code>
     */
    public static final int CREATED_VALUE = 1;
    /**
     * <pre>
     * Execution stage: initialization.
     * </pre>
     *
     * <code>INITIATED = 2;</code>
     */
    public static final int INITIATED_VALUE = 2;
    /**
     * <pre>
     * Execution stage: data preparation and warm-up.
     * </pre>
     *
     * <code>PREPARING = 3;</code>
     */
    public static final int PREPARING_VALUE = 3;
    /**
     * <pre>
     * Execution stage: load generation.
     * </pre>
     *
     * <code>RUNNING = 4;</code>
     */
    public static final int RUNNING_VALUE = 4;
    /**
     * <pre>
     * Execution stage: termination.
     * </pre>
     *
     * <code>FINISHING = 5;</code>
     */
    public static final int FINISHING_VALUE = 5;
    /**
     * <pre>
     * Test is done.
     * </pre>
     *
     * <code>DONE = 6;</code>
     */
    public static final int DONE_VALUE = 6;
    /**
     * <pre>
     * Execution stage: results post-processing.
     * </pre>
     *
     * <code>POST_PROCESSING = 7;</code>
     */
    public static final int POST_PROCESSING_VALUE = 7;
    /**
     * <pre>
     * Test has failed due to some error.
     * </pre>
     *
     * <code>FAILED = 8;</code>
     */
    public static final int FAILED_VALUE = 8;
    /**
     * <pre>
     * Test is being stopped.
     * </pre>
     *
     * <code>STOPPING = 9;</code>
     */
    public static final int STOPPING_VALUE = 9;
    /**
     * <pre>
     * Test has been stopped by user.
     * </pre>
     *
     * <code>STOPPED = 10;</code>
     */
    public static final int STOPPED_VALUE = 10;
    /**
     * <pre>
     * Test has been stopped automatically by satisfying autostop condition.
     * </pre>
     *
     * <code>AUTOSTOPPED = 11;</code>
     */
    public static final int AUTOSTOPPED_VALUE = 11;
    /**
     * <pre>
     * Execution stage: waiting for a trigger to start.
     * </pre>
     *
     * <code>WAITING = 12;</code>
     */
    public static final int WAITING_VALUE = 12;
    /**
     * <pre>
     * Test is being deleted.
     * </pre>
     *
     * <code>DELETING = 13;</code>
     */
    public static final int DELETING_VALUE = 13;
    /**
     * <pre>
     * Test status has not been reported in a while during execution stage.
     * Means that either an agent is too busy to send it, got offline, or failed without
     * reporting a final status.
     * </pre>
     *
     * <code>LOST = 14;</code>
     */
    public static final int LOST_VALUE = 14;
    /**
     * <pre>
     * Test has been cancelled.
     * </pre>
     *
     * <code>CANCELLED = 15;</code>
     */
    public static final int CANCELLED_VALUE = 15;


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
        case 1: return CREATED;
        case 2: return INITIATED;
        case 3: return PREPARING;
        case 4: return RUNNING;
        case 5: return FINISHING;
        case 6: return DONE;
        case 7: return POST_PROCESSING;
        case 8: return FAILED;
        case 9: return STOPPING;
        case 10: return STOPPED;
        case 11: return AUTOSTOPPED;
        case 12: return WAITING;
        case 13: return DELETING;
        case 14: return LOST;
        case 15: return CANCELLED;
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
      return yandex.cloud.api.loadtesting.api.v1.test.StatusOuterClass.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:yandex.cloud.loadtesting.api.v1.test.Status)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1yandex/cloud/loadtesting/api/v1/test/s" +
      "tatus.proto\022$yandex.cloud.loadtesting.ap" +
      "i.v1.test*\362\001\n\006Status\022\026\n\022STATUS_UNSPECIFI" +
      "ED\020\000\022\013\n\007CREATED\020\001\022\r\n\tINITIATED\020\002\022\r\n\tPREP" +
      "ARING\020\003\022\013\n\007RUNNING\020\004\022\r\n\tFINISHING\020\005\022\010\n\004D" +
      "ONE\020\006\022\023\n\017POST_PROCESSING\020\007\022\n\n\006FAILED\020\010\022\014" +
      "\n\010STOPPING\020\t\022\013\n\007STOPPED\020\n\022\017\n\013AUTOSTOPPED" +
      "\020\013\022\013\n\007WAITING\020\014\022\014\n\010DELETING\020\r\022\010\n\004LOST\020\016\022" +
      "\r\n\tCANCELLED\020\017By\n(yandex.cloud.api.loadt" +
      "esting.api.v1.testZMgithub.com/yandex-cl" +
      "oud/go-genproto/yandex/cloud/loadtesting" +
      "/api/v1/test;testb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
