package yandex.cloud.api.loadtesting.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing test configurations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/api/v1/config_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConfigServiceGrpc {

  private ConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.api.v1.ConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ConfigServiceGrpc.getCreateMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getCreateMethod = ConfigServiceGrpc.getCreateMethod) == null) {
          ConfigServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest,
      yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest,
      yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest, yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> getGetMethod;
    if ((getGetMethod = ConfigServiceGrpc.getGetMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getGetMethod = ConfigServiceGrpc.getGetMethod) == null) {
          ConfigServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest, yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest,
      yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest,
      yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest, yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> getListMethod;
    if ((getListMethod = ConfigServiceGrpc.getListMethod) == null) {
      synchronized (ConfigServiceGrpc.class) {
        if ((getListMethod = ConfigServiceGrpc.getListMethod) == null) {
          ConfigServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest, yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceStub>() {
        @java.lang.Override
        public ConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigServiceStub(channel, callOptions);
        }
      };
    return ConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceBlockingStub>() {
        @java.lang.Override
        public ConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return ConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigServiceFutureStub>() {
        @java.lang.Override
        public ConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigServiceFutureStub(channel, callOptions);
        }
      };
    return ConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing test configurations.
   * </pre>
   */
  public static abstract class ConfigServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a test config in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified config.
     * To get the list of all available configs, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of configs in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest,
                yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest,
                yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing test configurations.
   * </pre>
   */
  public static final class ConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<ConfigServiceStub> {
    private ConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a test config in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified config.
     * To get the list of all available configs, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of configs in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing test configurations.
   * </pre>
   */
  public static final class ConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConfigServiceBlockingStub> {
    private ConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a test config in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified config.
     * To get the list of all available configs, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config get(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of configs in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse list(yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing test configurations.
   * </pre>
   */
  public static final class ConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConfigServiceFutureStub> {
    private ConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a test config in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified config.
     * To get the list of all available configs, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config> get(
        yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of configs in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse> list(
        yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.CreateConfigRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.GetConfigRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.config.ConfigOuterClass.Config>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.ListConfigsResponse>) responseObserver);
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

  private static abstract class ConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.api.v1.ConfigServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigService");
    }
  }

  private static final class ConfigServiceFileDescriptorSupplier
      extends ConfigServiceBaseDescriptorSupplier {
    ConfigServiceFileDescriptorSupplier() {}
  }

  private static final class ConfigServiceMethodDescriptorSupplier
      extends ConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
