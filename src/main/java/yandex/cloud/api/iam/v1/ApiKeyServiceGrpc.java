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
 * A set of methods for managing API keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iam/v1/api_key_service.proto")
public final class ApiKeyServiceGrpc {

  private ApiKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.ApiKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod;
    if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
          ApiKeyServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.ApiKeyService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod;
    if ((getGetMethod = ApiKeyServiceGrpc.getGetMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getGetMethod = ApiKeyServiceGrpc.getGetMethod) == null) {
          ApiKeyServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.ApiKeyService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod;
    if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
          ApiKeyServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.ApiKeyService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
          ApiKeyServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.ApiKeyService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiKeyServiceStub newStub(io.grpc.Channel channel) {
    return new ApiKeyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiKeyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiKeyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static abstract class ApiKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
                yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceStub extends io.grpc.stub.AbstractStub<ApiKeyServiceStub> {
    private ApiKeyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiKeyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceBlockingStub extends io.grpc.stub.AbstractStub<ApiKeyServiceBlockingStub> {
    private ApiKeyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiKeyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public com.google.protobuf.Empty delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceFutureStub extends io.grpc.stub.AbstractStub<ApiKeyServiceFutureStub> {
    private ApiKeyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiKeyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> list(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> get(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> create(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiKeyService");
    }
  }

  private static final class ApiKeyServiceFileDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier {
    ApiKeyServiceFileDescriptorSupplier() {}
  }

  private static final class ApiKeyServiceMethodDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiKeyServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
