package yandex.cloud.api.mdb.sqlserver.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing resource presets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/sqlserver/v1/resource_preset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourcePresetServiceGrpc {

  private ResourcePresetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.sqlserver.v1.ResourcePresetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest, yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> getGetMethod;
    if ((getGetMethod = ResourcePresetServiceGrpc.getGetMethod) == null) {
      synchronized (ResourcePresetServiceGrpc.class) {
        if ((getGetMethod = ResourcePresetServiceGrpc.getGetMethod) == null) {
          ResourcePresetServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest, yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcePresetServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> getListMethod;
    if ((getListMethod = ResourcePresetServiceGrpc.getListMethod) == null) {
      synchronized (ResourcePresetServiceGrpc.class) {
        if ((getListMethod = ResourcePresetServiceGrpc.getListMethod) == null) {
          ResourcePresetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcePresetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourcePresetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceStub>() {
        @java.lang.Override
        public ResourcePresetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcePresetServiceStub(channel, callOptions);
        }
      };
    return ResourcePresetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourcePresetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceBlockingStub>() {
        @java.lang.Override
        public ResourcePresetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcePresetServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourcePresetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourcePresetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcePresetServiceFutureStub>() {
        @java.lang.Override
        public ResourcePresetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcePresetServiceFutureStub(channel, callOptions);
        }
      };
    return ResourcePresetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing resource presets.
   * </pre>
   */
  public static abstract class ResourcePresetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourcePresetServiceStub> {
    private ResourcePresetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourcePresetServiceBlockingStub> {
    private ResourcePresetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset get(yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse list(yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourcePresetServiceFutureStub> {
    private ResourcePresetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset> get(
        yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse> list(
        yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest request) {
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
    private final ResourcePresetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourcePresetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.sqlserver.v1.PSRS.GetResourcePresetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSR.ResourcePreset>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSRS.ListResourcePresetsResponse>) responseObserver);
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

  private static abstract class ResourcePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourcePresetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.sqlserver.v1.PSRS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourcePresetService");
    }
  }

  private static final class ResourcePresetServiceFileDescriptorSupplier
      extends ResourcePresetServiceBaseDescriptorSupplier {
    ResourcePresetServiceFileDescriptorSupplier() {}
  }

  private static final class ResourcePresetServiceMethodDescriptorSupplier
      extends ResourcePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourcePresetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourcePresetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourcePresetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
