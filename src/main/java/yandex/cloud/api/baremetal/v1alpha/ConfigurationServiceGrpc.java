package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about Configuration resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/configuration_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConfigurationServiceGrpc {

  private ConfigurationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.ConfigurationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest,
      yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest,
      yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest, yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> getGetMethod;
    if ((getGetMethod = ConfigurationServiceGrpc.getGetMethod) == null) {
      synchronized (ConfigurationServiceGrpc.class) {
        if ((getGetMethod = ConfigurationServiceGrpc.getGetMethod) == null) {
          ConfigurationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest, yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigurationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest,
      yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest,
      yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest, yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> getListMethod;
    if ((getListMethod = ConfigurationServiceGrpc.getListMethod) == null) {
      synchronized (ConfigurationServiceGrpc.class) {
        if ((getListMethod = ConfigurationServiceGrpc.getListMethod) == null) {
          ConfigurationServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest, yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigurationServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigurationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceStub>() {
        @java.lang.Override
        public ConfigurationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceStub(channel, callOptions);
        }
      };
    return ConfigurationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigurationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceBlockingStub>() {
        @java.lang.Override
        public ConfigurationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceBlockingStub(channel, callOptions);
        }
      };
    return ConfigurationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigurationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceFutureStub>() {
        @java.lang.Override
        public ConfigurationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceFutureStub(channel, callOptions);
        }
      };
    return ConfigurationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about Configuration resources.
   * </pre>
   */
  public static abstract class ConfigurationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific Configuration resource.
     * To get the list of available Configuration resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Configuration resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest,
                yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest,
                yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about Configuration resources.
   * </pre>
   */
  public static final class ConfigurationServiceStub extends io.grpc.stub.AbstractAsyncStub<ConfigurationServiceStub> {
    private ConfigurationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Configuration resource.
     * To get the list of available Configuration resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Configuration resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about Configuration resources.
   * </pre>
   */
  public static final class ConfigurationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConfigurationServiceBlockingStub> {
    private ConfigurationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Configuration resource.
     * To get the list of available Configuration resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration get(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Configuration resources.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse list(yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about Configuration resources.
   * </pre>
   */
  public static final class ConfigurationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConfigurationServiceFutureStub> {
    private ConfigurationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Configuration resource.
     * To get the list of available Configuration resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration> get(
        yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Configuration resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse> list(
        yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigurationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigurationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.GetConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationOuterClass.Configuration>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.ListConfigurationsResponse>) responseObserver);
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

  private static abstract class ConfigurationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigurationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.ConfigurationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigurationService");
    }
  }

  private static final class ConfigurationServiceFileDescriptorSupplier
      extends ConfigurationServiceBaseDescriptorSupplier {
    ConfigurationServiceFileDescriptorSupplier() {}
  }

  private static final class ConfigurationServiceMethodDescriptorSupplier
      extends ConfigurationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigurationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigurationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigurationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
