package yandex.cloud.api.kms.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set of methods for managing asymmetric KMS keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/kms/v1/asymmetricencryption/asymmetric_encryption_key_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsymmetricEncryptionKeyServiceGrpc {

  private AsymmetricEncryptionKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.kms.v1.asymmetricencryption.AsymmetricEncryptionKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = AsymmetricEncryptionKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getCreateMethod = AsymmetricEncryptionKeyServiceGrpc.getCreateMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> getGetMethod;
    if ((getGetMethod = AsymmetricEncryptionKeyServiceGrpc.getGetMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getGetMethod = AsymmetricEncryptionKeyServiceGrpc.getGetMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> getListMethod;
    if ((getListMethod = AsymmetricEncryptionKeyServiceGrpc.getListMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getListMethod = AsymmetricEncryptionKeyServiceGrpc.getListMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = AsymmetricEncryptionKeyServiceGrpc.getUpdateMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getUpdateMethod = AsymmetricEncryptionKeyServiceGrpc.getUpdateMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = AsymmetricEncryptionKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getDeleteMethod = AsymmetricEncryptionKeyServiceGrpc.getDeleteMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = AsymmetricEncryptionKeyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getListOperationsMethod = AsymmetricEncryptionKeyServiceGrpc.getListOperationsMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getListAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getListAccessBindingsMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getSetAccessBindingsMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("SetAccessBindings"))
              .build();
        }
      }
    }
    return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = AsymmetricEncryptionKeyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          AsymmetricEncryptionKeyServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsymmetricEncryptionKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceStub>() {
        @java.lang.Override
        public AsymmetricEncryptionKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionKeyServiceStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsymmetricEncryptionKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceBlockingStub>() {
        @java.lang.Override
        public AsymmetricEncryptionKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsymmetricEncryptionKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionKeyServiceFutureStub>() {
        @java.lang.Override
        public AsymmetricEncryptionKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionKeyServiceFutureStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set of methods for managing asymmetric KMS keys.
   * </pre>
   */
  public static abstract class AsymmetricEncryptionKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * control plane
     * Creates an asymmetric KMS key in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified asymmetric KMS key.
     *  To get the list of available asymmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of asymmetric KMS keys in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified asymmetric KMS key.
     * </pre>
     */
    public void update(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified asymmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [AsymmetricEncryptionKeyService.Get] and [AsymmetricEncryptionKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public void delete(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified asymmetric KMS key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest,
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest,
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest,
                yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods for managing asymmetric KMS keys.
   * </pre>
   */
  public static final class AsymmetricEncryptionKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<AsymmetricEncryptionKeyServiceStub> {
    private AsymmetricEncryptionKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * control plane
     * Creates an asymmetric KMS key in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified asymmetric KMS key.
     *  To get the list of available asymmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of asymmetric KMS keys in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified asymmetric KMS key.
     * </pre>
     */
    public void update(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified asymmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [AsymmetricEncryptionKeyService.Get] and [AsymmetricEncryptionKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public void delete(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified asymmetric KMS key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods for managing asymmetric KMS keys.
   * </pre>
   */
  public static final class AsymmetricEncryptionKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AsymmetricEncryptionKeyServiceBlockingStub> {
    private AsymmetricEncryptionKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * control plane
     * Creates an asymmetric KMS key in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified asymmetric KMS key.
     *  To get the list of available asymmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey get(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of asymmetric KMS keys in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse list(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified asymmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified asymmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [AsymmetricEncryptionKeyService.Get] and [AsymmetricEncryptionKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified asymmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse listOperations(yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods for managing asymmetric KMS keys.
   * </pre>
   */
  public static final class AsymmetricEncryptionKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AsymmetricEncryptionKeyServiceFutureStub> {
    private AsymmetricEncryptionKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * control plane
     * Creates an asymmetric KMS key in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified asymmetric KMS key.
     *  To get the list of available asymmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey> get(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of asymmetric KMS keys in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse> list(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified asymmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified asymmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [AsymmetricEncryptionKeyService.Get] and [AsymmetricEncryptionKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified asymmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse> listOperations(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 6;
  private static final int METHODID_SET_ACCESS_BINDINGS = 7;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsymmetricEncryptionKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsymmetricEncryptionKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.CreateAsymmetricEncryptionKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.GetAsymmetricEncryptionKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyOuterClass.AsymmetricEncryptionKey>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeysResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.UpdateAsymmetricEncryptionKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.DeleteAsymmetricEncryptionKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.ListAsymmetricEncryptionKeyOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AsymmetricEncryptionKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsymmetricEncryptionKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.kms.v1.AsymmetricEncryptionKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsymmetricEncryptionKeyService");
    }
  }

  private static final class AsymmetricEncryptionKeyServiceFileDescriptorSupplier
      extends AsymmetricEncryptionKeyServiceBaseDescriptorSupplier {
    AsymmetricEncryptionKeyServiceFileDescriptorSupplier() {}
  }

  private static final class AsymmetricEncryptionKeyServiceMethodDescriptorSupplier
      extends AsymmetricEncryptionKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsymmetricEncryptionKeyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AsymmetricEncryptionKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsymmetricEncryptionKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
