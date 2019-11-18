package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A set of methods for managing Key resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iam/v1/key_service.proto")
public final class KeyServiceGrpc {

  private KeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.KeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest,
      yandex.cloud.api.iam.v1.KeyOuterClass.Key> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.KeyOuterClass.Key.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest,
      yandex.cloud.api.iam.v1.KeyOuterClass.Key> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest, yandex.cloud.api.iam.v1.KeyOuterClass.Key> getGetMethod;
    if ((getGetMethod = KeyServiceGrpc.getGetMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getGetMethod = KeyServiceGrpc.getGetMethod) == null) {
          KeyServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest, yandex.cloud.api.iam.v1.KeyOuterClass.Key>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.KeyService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyOuterClass.Key.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest.class,
      responseType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> getListMethod;
    if ((getListMethod = KeyServiceGrpc.getListMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getListMethod = KeyServiceGrpc.getListMethod) == null) {
          KeyServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.KeyService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> getCreateMethod;
    if ((getCreateMethod = KeyServiceGrpc.getCreateMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getCreateMethod = KeyServiceGrpc.getCreateMethod) == null) {
          KeyServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.KeyService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = KeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getDeleteMethod = KeyServiceGrpc.getDeleteMethod) == null) {
          KeyServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.KeyService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest.class,
      responseType = yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest,
      yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = KeyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getListOperationsMethod = KeyServiceGrpc.getListOperationsMethod) == null) {
          KeyServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest, yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.KeyService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyServiceStub newStub(io.grpc.Channel channel) {
    return new KeyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Key resources.
   * </pre>
   */
  public static abstract class KeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Key resource.
     * To get the list of available Key resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyOuterClass.Key> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Key resources for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a key pair for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified key pair.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest,
                yandex.cloud.api.iam.v1.KeyOuterClass.Key>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest,
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest,
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest,
                yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Key resources.
   * </pre>
   */
  public static final class KeyServiceStub extends io.grpc.stub.AbstractStub<KeyServiceStub> {
    private KeyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Key resource.
     * To get the list of available Key resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyOuterClass.Key> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Key resources for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a key pair for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified key pair.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Key resources.
   * </pre>
   */
  public static final class KeyServiceBlockingStub extends io.grpc.stub.AbstractStub<KeyServiceBlockingStub> {
    private KeyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Key resource.
     * To get the list of available Key resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.KeyOuterClass.Key get(yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Key resources for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse list(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a key pair for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse create(yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified key pair.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified key.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse listOperations(yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Key resources.
   * </pre>
   */
  public static final class KeyServiceFutureStub extends io.grpc.stub.AbstractStub<KeyServiceFutureStub> {
    private KeyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Key resource.
     * To get the list of available Key resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.KeyOuterClass.Key> get(
        yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Key resources for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse> list(
        yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a key pair for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse> create(
        yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified key pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse> listOperations(
        yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST_OPERATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.KeyServiceOuterClass.GetKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyOuterClass.Key>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeysResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.CreateKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.KeyServiceOuterClass.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.KeyServiceOuterClass.ListKeyOperationsResponse>) responseObserver);
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

  private static abstract class KeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.KeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyService");
    }
  }

  private static final class KeyServiceFileDescriptorSupplier
      extends KeyServiceBaseDescriptorSupplier {
    KeyServiceFileDescriptorSupplier() {}
  }

  private static final class KeyServiceMethodDescriptorSupplier
      extends KeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
