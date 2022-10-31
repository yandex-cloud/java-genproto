package yandex.cloud.api.iot.broker.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to work with IoT Core messages on behalf of broker
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iot/broker/v1/broker_data_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BrokerDataServiceGrpc {

  private BrokerDataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.broker.v1.BrokerDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest,
      yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest,
      yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> getPublishMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest, yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> getPublishMethod;
    if ((getPublishMethod = BrokerDataServiceGrpc.getPublishMethod) == null) {
      synchronized (BrokerDataServiceGrpc.class) {
        if ((getPublishMethod = BrokerDataServiceGrpc.getPublishMethod) == null) {
          BrokerDataServiceGrpc.getPublishMethod = getPublishMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest, yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerDataServiceMethodDescriptorSupplier("Publish"))
              .build();
        }
      }
    }
    return getPublishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceStub>() {
        @java.lang.Override
        public BrokerDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerDataServiceStub(channel, callOptions);
        }
      };
    return BrokerDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceBlockingStub>() {
        @java.lang.Override
        public BrokerDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerDataServiceBlockingStub(channel, callOptions);
        }
      };
    return BrokerDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerDataServiceFutureStub>() {
        @java.lang.Override
        public BrokerDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerDataServiceFutureStub(channel, callOptions);
        }
      };
    return BrokerDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of broker
   * </pre>
   */
  public static abstract class BrokerDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Publishes message on behalf of specified broker
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest,
                yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse>(
                  this, METHODID_PUBLISH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of broker
   * </pre>
   */
  public static final class BrokerDataServiceStub extends io.grpc.stub.AbstractAsyncStub<BrokerDataServiceStub> {
    private BrokerDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified broker
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of broker
   * </pre>
   */
  public static final class BrokerDataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BrokerDataServiceBlockingStub> {
    private BrokerDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified broker
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse publish(yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of broker
   * </pre>
   */
  public static final class BrokerDataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BrokerDataServiceFutureStub> {
    private BrokerDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified broker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse> publish(
        yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH:
          serviceImpl.publish((yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.PublishBrokerDataResponse>) responseObserver);
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

  private static abstract class BrokerDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrokerDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.broker.v1.BrokerDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BrokerDataService");
    }
  }

  private static final class BrokerDataServiceFileDescriptorSupplier
      extends BrokerDataServiceBaseDescriptorSupplier {
    BrokerDataServiceFileDescriptorSupplier() {}
  }

  private static final class BrokerDataServiceMethodDescriptorSupplier
      extends BrokerDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrokerDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrokerDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerDataServiceFileDescriptorSupplier())
              .addMethod(getPublishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
