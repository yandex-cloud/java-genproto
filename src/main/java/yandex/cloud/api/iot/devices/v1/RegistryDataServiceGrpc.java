package yandex.cloud.api.iot.devices.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to work with IoT Core messages on behalf of registry
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iot/devices/v1/registry_data_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegistryDataServiceGrpc {

  private RegistryDataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.devices.v1.RegistryDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
      yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
      yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest, yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod;
    if ((getPublishMethod = RegistryDataServiceGrpc.getPublishMethod) == null) {
      synchronized (RegistryDataServiceGrpc.class) {
        if ((getPublishMethod = RegistryDataServiceGrpc.getPublishMethod) == null) {
          RegistryDataServiceGrpc.getPublishMethod = getPublishMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest, yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryDataServiceMethodDescriptorSupplier("Publish"))
              .build();
        }
      }
    }
    return getPublishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistryDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceStub>() {
        @java.lang.Override
        public RegistryDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryDataServiceStub(channel, callOptions);
        }
      };
    return RegistryDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceBlockingStub>() {
        @java.lang.Override
        public RegistryDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryDataServiceBlockingStub(channel, callOptions);
        }
      };
    return RegistryDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryDataServiceFutureStub>() {
        @java.lang.Override
        public RegistryDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryDataServiceFutureStub(channel, callOptions);
        }
      };
    return RegistryDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static abstract class RegistryDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
                yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>(
                  this, METHODID_PUBLISH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceStub extends io.grpc.stub.AbstractAsyncStub<RegistryDataServiceStub> {
    private RegistryDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegistryDataServiceBlockingStub> {
    private RegistryDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RegistryDataServiceFutureStub> {
    private RegistryDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> publish(
        yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request) {
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
    private final RegistryDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistryDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH:
          serviceImpl.publish((yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>) responseObserver);
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

  private static abstract class RegistryDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegistryDataService");
    }
  }

  private static final class RegistryDataServiceFileDescriptorSupplier
      extends RegistryDataServiceBaseDescriptorSupplier {
    RegistryDataServiceFileDescriptorSupplier() {}
  }

  private static final class RegistryDataServiceMethodDescriptorSupplier
      extends RegistryDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistryDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistryDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistryDataServiceFileDescriptorSupplier())
              .addMethod(getPublishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
