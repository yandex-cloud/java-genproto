package yandex.cloud.api.marketplace.stacklandlicenseapi.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for managing license servers
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/stacklandlicenseapi/v1/license_server_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LicenseServerServiceGrpc {

  private LicenseServerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.stacklandlicenseapi.v1.LicenseServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRegisterMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRegisterMethod;
    if ((getRegisterMethod = LicenseServerServiceGrpc.getRegisterMethod) == null) {
      synchronized (LicenseServerServiceGrpc.class) {
        if ((getRegisterMethod = LicenseServerServiceGrpc.getRegisterMethod) == null) {
          LicenseServerServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LicenseServerServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSyncUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncUsage",
      requestType = yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSyncUsageMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSyncUsageMethod;
    if ((getSyncUsageMethod = LicenseServerServiceGrpc.getSyncUsageMethod) == null) {
      synchronized (LicenseServerServiceGrpc.class) {
        if ((getSyncUsageMethod = LicenseServerServiceGrpc.getSyncUsageMethod) == null) {
          LicenseServerServiceGrpc.getSyncUsageMethod = getSyncUsageMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LicenseServerServiceMethodDescriptorSupplier("SyncUsage"))
              .build();
        }
      }
    }
    return getSyncUsageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LicenseServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceStub>() {
        @java.lang.Override
        public LicenseServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServerServiceStub(channel, callOptions);
        }
      };
    return LicenseServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LicenseServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceBlockingStub>() {
        @java.lang.Override
        public LicenseServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServerServiceBlockingStub(channel, callOptions);
        }
      };
    return LicenseServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LicenseServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServerServiceFutureStub>() {
        @java.lang.Override
        public LicenseServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServerServiceFutureStub(channel, callOptions);
        }
      };
    return LicenseServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for managing license servers
   * </pre>
   */
  public static abstract class LicenseServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register a new license server
     * </pre>
     */
    public void register(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Synchronize: get license limits and submit usage data
     * </pre>
     */
    public void syncUsage(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncUsageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getSyncUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SYNC_USAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for managing license servers
   * </pre>
   */
  public static final class LicenseServerServiceStub extends io.grpc.stub.AbstractAsyncStub<LicenseServerServiceStub> {
    private LicenseServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new license server
     * </pre>
     */
    public void register(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Synchronize: get license limits and submit usage data
     * </pre>
     */
    public void syncUsage(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncUsageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for managing license servers
   * </pre>
   */
  public static final class LicenseServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LicenseServerServiceBlockingStub> {
    private LicenseServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new license server
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation register(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Synchronize: get license limits and submit usage data
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation syncUsage(yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncUsageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for managing license servers
   * </pre>
   */
  public static final class LicenseServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LicenseServerServiceFutureStub> {
    private LicenseServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new license server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> register(
        yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Synchronize: get license limits and submit usage data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> syncUsage(
        yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncUsageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_SYNC_USAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LicenseServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LicenseServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerOuterClass.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SYNC_USAGE:
          serviceImpl.syncUsage((yandex.cloud.api.marketplace.stacklandlicenseapi.v1.Sync.SyncRequest) request,
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

  private static abstract class LicenseServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LicenseServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.stacklandlicenseapi.v1.LicenseServerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LicenseServerService");
    }
  }

  private static final class LicenseServerServiceFileDescriptorSupplier
      extends LicenseServerServiceBaseDescriptorSupplier {
    LicenseServerServiceFileDescriptorSupplier() {}
  }

  private static final class LicenseServerServiceMethodDescriptorSupplier
      extends LicenseServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LicenseServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LicenseServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LicenseServerServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getSyncUsageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
