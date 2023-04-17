package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/monitoring_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MonitoringServiceGrpc {

  private MonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.MonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest,
      yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> getAddMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMetric",
      requestType = yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest,
      yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> getAddMetricMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest, yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> getAddMetricMethod;
    if ((getAddMetricMethod = MonitoringServiceGrpc.getAddMetricMethod) == null) {
      synchronized (MonitoringServiceGrpc.class) {
        if ((getAddMetricMethod = MonitoringServiceGrpc.getAddMetricMethod) == null) {
          MonitoringServiceGrpc.getAddMetricMethod = getAddMetricMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest, yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringServiceMethodDescriptorSupplier("AddMetric"))
              .build();
        }
      }
    }
    return getAddMetricMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitoringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceStub>() {
        @java.lang.Override
        public MonitoringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceStub(channel, callOptions);
        }
      };
    return MonitoringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceBlockingStub>() {
        @java.lang.Override
        public MonitoringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceBlockingStub(channel, callOptions);
        }
      };
    return MonitoringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringServiceFutureStub>() {
        @java.lang.Override
        public MonitoringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringServiceFutureStub(channel, callOptions);
        }
      };
    return MonitoringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Saves monitoring events for specified job
     * </pre>
     */
    public void addMetric(yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMetricMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest,
                yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse>(
                  this, METHODID_ADD_METRIC)))
          .build();
    }
  }

  /**
   */
  public static final class MonitoringServiceStub extends io.grpc.stub.AbstractAsyncStub<MonitoringServiceStub> {
    private MonitoringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves monitoring events for specified job
     * </pre>
     */
    public void addMetric(yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMetricMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MonitoringServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MonitoringServiceBlockingStub> {
    private MonitoringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves monitoring events for specified job
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse addMetric(yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMetricMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MonitoringServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MonitoringServiceFutureStub> {
    private MonitoringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Saves monitoring events for specified job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse> addMetric(
        yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMetricMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_METRIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitoringServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_METRIC:
          serviceImpl.addMetric((yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.AddMetricResponse>) responseObserver);
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

  private static abstract class MonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.MonitoringServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MonitoringService");
    }
  }

  private static final class MonitoringServiceFileDescriptorSupplier
      extends MonitoringServiceBaseDescriptorSupplier {
    MonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class MonitoringServiceMethodDescriptorSupplier
      extends MonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitoringServiceFileDescriptorSupplier())
              .addMethod(getAddMetricMethod())
              .build();
        }
      }
    }
    return result;
  }
}
