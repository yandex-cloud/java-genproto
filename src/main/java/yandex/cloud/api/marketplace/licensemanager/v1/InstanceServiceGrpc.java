package yandex.cloud.api.marketplace.licensemanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing subscription instances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/licensemanager/v1/instance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstanceServiceGrpc {

  private InstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.licensemanager.v1.InstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest, yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> getGetMethod;
    if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
          InstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest, yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest, yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod;
    if ((getListMethod = InstanceServiceGrpc.getListMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getListMethod = InstanceServiceGrpc.getListMethod) == null) {
          InstanceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest, yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceStub>() {
        @java.lang.Override
        public InstanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceStub(channel, callOptions);
        }
      };
    return InstanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceBlockingStub>() {
        @java.lang.Override
        public InstanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceBlockingStub(channel, callOptions);
        }
      };
    return InstanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceFutureStub>() {
        @java.lang.Override
        public InstanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceFutureStub(channel, callOptions);
        }
      };
    return InstanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing subscription instances.
   * </pre>
   */
  public static abstract class InstanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified subscription instance.
     * To get the list of all available subscription instances, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of subscription instances in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription instances.
   * </pre>
   */
  public static final class InstanceServiceStub extends io.grpc.stub.AbstractAsyncStub<InstanceServiceStub> {
    private InstanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subscription instance.
     * To get the list of all available subscription instances, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of subscription instances in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription instances.
   * </pre>
   */
  public static final class InstanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InstanceServiceBlockingStub> {
    private InstanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subscription instance.
     * To get the list of all available subscription instances, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance get(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of subscription instances in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse list(yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing subscription instances.
   * </pre>
   */
  public static final class InstanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InstanceServiceFutureStub> {
    private InstanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subscription instance.
     * To get the list of all available subscription instances, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance> get(
        yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of subscription instances in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse> list(
        yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest request) {
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
    private final InstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceOuterClass.Instance>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.ListInstancesResponse>) responseObserver);
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

  private static abstract class InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.licensemanager.v1.InstanceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceService");
    }
  }

  private static final class InstanceServiceFileDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier {
    InstanceServiceFileDescriptorSupplier() {}
  }

  private static final class InstanceServiceMethodDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
