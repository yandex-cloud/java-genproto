package yandex.cloud.api.iam.v1.awscompatibility;

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
 * A set of methods for managing access keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iam/v1/awscompatibility/access_key_service.proto")
public final class AccessKeyServiceGrpc {

  private AccessKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.awscompatibility.AccessKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod;
    if ((getListMethod = AccessKeyServiceGrpc.getListMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getListMethod = AccessKeyServiceGrpc.getListMethod) == null) {
          AccessKeyServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.awscompatibility.AccessKeyService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod;
    if ((getGetMethod = AccessKeyServiceGrpc.getGetMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getGetMethod = AccessKeyServiceGrpc.getGetMethod) == null) {
          AccessKeyServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.awscompatibility.AccessKeyService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod;
    if ((getCreateMethod = AccessKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getCreateMethod = AccessKeyServiceGrpc.getCreateMethod) == null) {
          AccessKeyServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.awscompatibility.AccessKeyService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = AccessKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getDeleteMethod = AccessKeyServiceGrpc.getDeleteMethod) == null) {
          AccessKeyServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.awscompatibility.AccessKeyService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessKeyServiceStub newStub(io.grpc.Channel channel) {
    return new AccessKeyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessKeyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessKeyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static abstract class AccessKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceStub extends io.grpc.stub.AbstractStub<AccessKeyServiceStub> {
    private AccessKeyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessKeyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceBlockingStub extends io.grpc.stub.AbstractStub<AccessKeyServiceBlockingStub> {
    private AccessKeyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessKeyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public com.google.protobuf.Empty delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceFutureStub extends io.grpc.stub.AbstractStub<AccessKeyServiceFutureStub> {
    private AccessKeyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessKeyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> list(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> get(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> create(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request) {
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
    private final AccessKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest) request,
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

  private static abstract class AccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessKeyService");
    }
  }

  private static final class AccessKeyServiceFileDescriptorSupplier
      extends AccessKeyServiceBaseDescriptorSupplier {
    AccessKeyServiceFileDescriptorSupplier() {}
  }

  private static final class AccessKeyServiceMethodDescriptorSupplier
      extends AccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessKeyServiceFileDescriptorSupplier())
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
