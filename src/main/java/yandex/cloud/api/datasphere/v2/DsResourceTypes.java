// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/datasphere/v2/resource_types.proto

package yandex.cloud.api.datasphere.v2;

public final class DsResourceTypes {
  private DsResourceTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code yandex.cloud.datasphere.v2.ResourceType}
   */
  public enum ResourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    RESOURCE_TYPE_UNSPECIFIED(0),
    /**
     * <code>RESOURCE_TYPE_SECRET = 2;</code>
     */
    RESOURCE_TYPE_SECRET(2),
    /**
     * <code>RESOURCE_TYPE_DOCKER_IMAGE = 3;</code>
     */
    RESOURCE_TYPE_DOCKER_IMAGE(3),
    /**
     * <code>RESOURCE_TYPE_DATASET = 4;</code>
     */
    RESOURCE_TYPE_DATASET(4),
    /**
     * <code>RESOURCE_TYPE_S3 = 5;</code>
     */
    RESOURCE_TYPE_S3(5),
    /**
     * <code>RESOURCE_TYPE_NODE = 6;</code>
     */
    RESOURCE_TYPE_NODE(6),
    /**
     * <code>RESOURCE_TYPE_ALIAS = 8;</code>
     */
    RESOURCE_TYPE_ALIAS(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <code>RESOURCE_TYPE_SECRET = 2;</code>
     */
    public static final int RESOURCE_TYPE_SECRET_VALUE = 2;
    /**
     * <code>RESOURCE_TYPE_DOCKER_IMAGE = 3;</code>
     */
    public static final int RESOURCE_TYPE_DOCKER_IMAGE_VALUE = 3;
    /**
     * <code>RESOURCE_TYPE_DATASET = 4;</code>
     */
    public static final int RESOURCE_TYPE_DATASET_VALUE = 4;
    /**
     * <code>RESOURCE_TYPE_S3 = 5;</code>
     */
    public static final int RESOURCE_TYPE_S3_VALUE = 5;
    /**
     * <code>RESOURCE_TYPE_NODE = 6;</code>
     */
    public static final int RESOURCE_TYPE_NODE_VALUE = 6;
    /**
     * <code>RESOURCE_TYPE_ALIAS = 8;</code>
     */
    public static final int RESOURCE_TYPE_ALIAS_VALUE = 8;


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
    public static ResourceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResourceType forNumber(int value) {
      switch (value) {
        case 0: return RESOURCE_TYPE_UNSPECIFIED;
        case 2: return RESOURCE_TYPE_SECRET;
        case 3: return RESOURCE_TYPE_DOCKER_IMAGE;
        case 4: return RESOURCE_TYPE_DATASET;
        case 5: return RESOURCE_TYPE_S3;
        case 6: return RESOURCE_TYPE_NODE;
        case 8: return RESOURCE_TYPE_ALIAS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
            public ResourceType findValueByNumber(int number) {
              return ResourceType.forNumber(number);
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
      return yandex.cloud.api.datasphere.v2.DsResourceTypes.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResourceType[] VALUES = values();

    public static ResourceType valueOf(
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

    private ResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:yandex.cloud.datasphere.v2.ResourceType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/yandex/cloud/datasphere/v2/resource_ty" +
      "pes.proto\022\032yandex.cloud.datasphere.v2*\325\001" +
      "\n\014ResourceType\022\035\n\031RESOURCE_TYPE_UNSPECIF" +
      "IED\020\000\022\030\n\024RESOURCE_TYPE_SECRET\020\002\022\036\n\032RESOU" +
      "RCE_TYPE_DOCKER_IMAGE\020\003\022\031\n\025RESOURCE_TYPE" +
      "_DATASET\020\004\022\024\n\020RESOURCE_TYPE_S3\020\005\022\026\n\022RESO" +
      "URCE_TYPE_NODE\020\006\022\027\n\023RESOURCE_TYPE_ALIAS\020" +
      "\010\"\004\010\001\020\001\"\004\010\007\020\007B|\n\036yandex.cloud.api.datasp" +
      "here.v2B\017DsResourceTypesZIgithub.com/yan" +
      "dex-cloud/go-genproto/yandex/cloud/datas" +
      "phere/v2;datasphereb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
