package yandex.cloud.api.cdn.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cdn/v1/raw_logs_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RawLogsServiceGrpc {

  private RawLogsServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.RawLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = RawLogsServiceGrpc.getActivateMethod) == null) {
      synchronized (RawLogsServiceGrpc.class) {
        if ((getActivateMethod = RawLogsServiceGrpc.getActivateMethod) == null) {
          RawLogsServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RawLogsServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = RawLogsServiceGrpc.getDeactivateMethod) == null) {
      synchronized (RawLogsServiceGrpc.class) {
        if ((getDeactivateMethod = RawLogsServiceGrpc.getDeactivateMethod) == null) {
          RawLogsServiceGrpc.getDeactivateMethod = getDeactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RawLogsServiceMethodDescriptorSupplier("Deactivate"))
              .build();
        }
      }
    }
    return getDeactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest,
      yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest.class,
      responseType = yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest,
      yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest, yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> getGetMethod;
    if ((getGetMethod = RawLogsServiceGrpc.getGetMethod) == null) {
      synchronized (RawLogsServiceGrpc.class) {
        if ((getGetMethod = RawLogsServiceGrpc.getGetMethod) == null) {
          RawLogsServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest, yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawLogsServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RawLogsServiceGrpc.getUpdateMethod) == null) {
      synchronized (RawLogsServiceGrpc.class) {
        if ((getUpdateMethod = RawLogsServiceGrpc.getUpdateMethod) == null) {
          RawLogsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RawLogsServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RawLogsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceStub>() {
        @java.lang.Override
        public RawLogsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawLogsServiceStub(channel, callOptions);
        }
      };
    return RawLogsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RawLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceBlockingStub>() {
        @java.lang.Override
        public RawLogsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawLogsServiceBlockingStub(channel, callOptions);
        }
      };
    return RawLogsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RawLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawLogsServiceFutureStub>() {
        @java.lang.Override
        public RawLogsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawLogsServiceFutureStub(channel, callOptions);
        }
      };
    return RawLogsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RawLogsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void activate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     */
    public void deactivate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest,
                yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class RawLogsServiceStub extends io.grpc.stub.AbstractAsyncStub<RawLogsServiceStub> {
    private RawLogsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawLogsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawLogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void activate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RawLogsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RawLogsServiceBlockingStub> {
    private RawLogsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawLogsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse get(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RawLogsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RawLogsServiceFutureStub> {
    private RawLogsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawLogsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawLogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse> get(
        yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;
  private static final int METHODID_DEACTIVATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RawLogsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RawLogsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.ActivateRawLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.DeactivateRawLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.GetRawLogsResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.UpdateRawLogsRequest) request,
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

  private static abstract class RawLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RawLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.RawLogsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RawLogsService");
    }
  }

  private static final class RawLogsServiceFileDescriptorSupplier
      extends RawLogsServiceBaseDescriptorSupplier {
    RawLogsServiceFileDescriptorSupplier() {}
  }

  private static final class RawLogsServiceMethodDescriptorSupplier
      extends RawLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RawLogsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RawLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RawLogsServiceFileDescriptorSupplier())
              .addMethod(getActivateMethod())
              .addMethod(getDeactivateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
