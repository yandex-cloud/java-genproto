package yandex.cloud.api.operation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing operations for asynchronous API requests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/operation/operation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperationServiceGrpc {

  private OperationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.operation.OperationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getGetMethod;
    if ((getGetMethod = OperationServiceGrpc.getGetMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getGetMethod = OperationServiceGrpc.getGetMethod) == null) {
          OperationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;
    if ((getCancelMethod = OperationServiceGrpc.getCancelMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getCancelMethod = OperationServiceGrpc.getCancelMethod) == null) {
          OperationServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub>() {
        @java.lang.Override
        public OperationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceStub(channel, callOptions);
        }
      };
    return OperationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub>() {
        @java.lang.Override
        public OperationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceBlockingStub(channel, callOptions);
        }
      };
    return OperationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub>() {
        @java.lang.Override
        public OperationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceFutureStub(channel, callOptions);
        }
      };
    return OperationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing operations for asynchronous API requests.
   * </pre>
   */
  public static abstract class OperationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Operation resource.
     * </pre>
     */
    public void get(yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * Note that currently Yandex Object Storage API does not support cancelling operations.
     * </pre>
     */
    public void cancel(yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_GET)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing operations for asynchronous API requests.
   * </pre>
   */
  public static final class OperationServiceStub extends io.grpc.stub.AbstractAsyncStub<OperationServiceStub> {
    private OperationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Operation resource.
     * </pre>
     */
    public void get(yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * Note that currently Yandex Object Storage API does not support cancelling operations.
     * </pre>
     */
    public void cancel(yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing operations for asynchronous API requests.
   * </pre>
   */
  public static final class OperationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OperationServiceBlockingStub> {
    private OperationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Operation resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation get(yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * Note that currently Yandex Object Storage API does not support cancelling operations.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancel(yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing operations for asynchronous API requests.
   * </pre>
   */
  public static final class OperationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OperationServiceFutureStub> {
    private OperationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Operation resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> get(
        yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * Note that currently Yandex Object Storage API does not support cancelling operations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancel(
        yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CANCEL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.operation.OperationServiceOuterClass.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.operation.OperationServiceOuterClass.CancelOperationRequest) request,
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

  private static abstract class OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.operation.OperationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperationService");
    }
  }

  private static final class OperationServiceFileDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier {
    OperationServiceFileDescriptorSupplier() {}
  }

  private static final class OperationServiceMethodDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OperationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getCancelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
