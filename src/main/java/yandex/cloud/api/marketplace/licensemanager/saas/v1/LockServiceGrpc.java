package yandex.cloud.api.marketplace.licensemanager.saas.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing subscription locks.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/licensemanager/saas/v1/lock_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LockServiceGrpc {

  private LockServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.licensemanager.saas.v1.LockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ensure",
      requestType = yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod;
    if ((getEnsureMethod = LockServiceGrpc.getEnsureMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getEnsureMethod = LockServiceGrpc.getEnsureMethod) == null) {
          LockServiceGrpc.getEnsureMethod = getEnsureMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ensure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Ensure"))
              .build();
        }
      }
    }
    return getEnsureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod;
    if ((getGetMethod = LockServiceGrpc.getGetMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getGetMethod = LockServiceGrpc.getGetMethod) == null) {
          LockServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByResourceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByResourceID",
      requestType = yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByResourceIDMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByResourceIDMethod;
    if ((getGetByResourceIDMethod = LockServiceGrpc.getGetByResourceIDMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getGetByResourceIDMethod = LockServiceGrpc.getGetByResourceIDMethod) == null) {
          LockServiceGrpc.getGetByResourceIDMethod = getGetByResourceIDMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByResourceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("GetByResourceID"))
              .build();
        }
      }
    }
    return getGetByResourceIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceStub>() {
        @java.lang.Override
        public LockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceStub(channel, callOptions);
        }
      };
    return LockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub>() {
        @java.lang.Override
        public LockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceBlockingStub(channel, callOptions);
        }
      };
    return LockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub>() {
        @java.lang.Override
        public LockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceFutureStub(channel, callOptions);
        }
      };
    return LockServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing subscription locks.
   * </pre>
   */
  public static abstract class LockServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Checks if the she specified subscription is already locked to the specified resource.
     * If it is not locked, locks the subscription to the resource.
     * </pre>
     */
    public void ensure(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnsureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified subscription lock.
     * </pre>
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the subscription lock for given resource and subscription.
     * </pre>
     */
    public void getByResourceID(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByResourceIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnsureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENSURE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByResourceIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>(
                  this, METHODID_GET_BY_RESOURCE_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription locks.
   * </pre>
   */
  public static final class LockServiceStub extends io.grpc.stub.AbstractAsyncStub<LockServiceStub> {
    private LockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks if the she specified subscription is already locked to the specified resource.
     * If it is not locked, locks the subscription to the resource.
     * </pre>
     */
    public void ensure(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnsureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified subscription lock.
     * </pre>
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the subscription lock for given resource and subscription.
     * </pre>
     */
    public void getByResourceID(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByResourceIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription locks.
   * </pre>
   */
  public static final class LockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LockServiceBlockingStub> {
    private LockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks if the she specified subscription is already locked to the specified resource.
     * If it is not locked, locks the subscription to the resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation ensure(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnsureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified subscription lock.
     * </pre>
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock get(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the subscription lock for given resource and subscription.
     * </pre>
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock getByResourceID(yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByResourceIDMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription locks.
   * </pre>
   */
  public static final class LockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LockServiceFutureStub> {
    private LockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks if the she specified subscription is already locked to the specified resource.
     * If it is not locked, locks the subscription to the resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> ensure(
        yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnsureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified subscription lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> get(
        yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the subscription lock for given resource and subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getByResourceID(
        yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByResourceIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENSURE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_BY_RESOURCE_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENSURE:
          serviceImpl.ensure((yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.EnsureLockRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>) responseObserver);
          break;
        case METHODID_GET_BY_RESOURCE_ID:
          serviceImpl.getByResourceID((yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.GetLockByResourceIDRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>) responseObserver);
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

  private static abstract class LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.licensemanager.saas.v1.LockServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LockService");
    }
  }

  private static final class LockServiceFileDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier {
    LockServiceFileDescriptorSupplier() {}
  }

  private static final class LockServiceMethodDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockServiceFileDescriptorSupplier())
              .addMethod(getEnsureMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetByResourceIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
