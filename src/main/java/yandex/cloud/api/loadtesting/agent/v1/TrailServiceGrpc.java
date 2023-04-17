package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/trail_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrailServiceGrpc {

  private TrailServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.TrailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest,
      yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest,
      yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest, yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> getCreateMethod;
    if ((getCreateMethod = TrailServiceGrpc.getCreateMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getCreateMethod = TrailServiceGrpc.getCreateMethod) == null) {
          TrailServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest, yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceStub>() {
        @java.lang.Override
        public TrailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceStub(channel, callOptions);
        }
      };
    return TrailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceBlockingStub>() {
        @java.lang.Override
        public TrailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceBlockingStub(channel, callOptions);
        }
      };
    return TrailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceFutureStub>() {
        @java.lang.Override
        public TrailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceFutureStub(channel, callOptions);
        }
      };
    return TrailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrailServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates trail for specified job.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest,
                yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   */
  public static final class TrailServiceStub extends io.grpc.stub.AbstractAsyncStub<TrailServiceStub> {
    private TrailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates trail for specified job.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrailServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrailServiceBlockingStub> {
    private TrailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates trail for specified job.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse create(yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrailServiceFutureStub> {
    private TrailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates trail for specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse> create(
        yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.CreateTrailResponse>) responseObserver);
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

  private static abstract class TrailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.TrailServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrailService");
    }
  }

  private static final class TrailServiceFileDescriptorSupplier
      extends TrailServiceBaseDescriptorSupplier {
    TrailServiceFileDescriptorSupplier() {}
  }

  private static final class TrailServiceMethodDescriptorSupplier
      extends TrailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrailServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
