package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about HardwarePool resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/hardware_pool_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HardwarePoolServiceGrpc {

  private HardwarePoolServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.HardwarePoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest,
      yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest,
      yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest, yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> getGetMethod;
    if ((getGetMethod = HardwarePoolServiceGrpc.getGetMethod) == null) {
      synchronized (HardwarePoolServiceGrpc.class) {
        if ((getGetMethod = HardwarePoolServiceGrpc.getGetMethod) == null) {
          HardwarePoolServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest, yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool.getDefaultInstance()))
              .setSchemaDescriptor(new HardwarePoolServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest,
      yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest,
      yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest, yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> getListMethod;
    if ((getListMethod = HardwarePoolServiceGrpc.getListMethod) == null) {
      synchronized (HardwarePoolServiceGrpc.class) {
        if ((getListMethod = HardwarePoolServiceGrpc.getListMethod) == null) {
          HardwarePoolServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest, yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HardwarePoolServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HardwarePoolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceStub>() {
        @java.lang.Override
        public HardwarePoolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HardwarePoolServiceStub(channel, callOptions);
        }
      };
    return HardwarePoolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HardwarePoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceBlockingStub>() {
        @java.lang.Override
        public HardwarePoolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HardwarePoolServiceBlockingStub(channel, callOptions);
        }
      };
    return HardwarePoolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HardwarePoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HardwarePoolServiceFutureStub>() {
        @java.lang.Override
        public HardwarePoolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HardwarePoolServiceFutureStub(channel, callOptions);
        }
      };
    return HardwarePoolServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about HardwarePool resources.
   * </pre>
   */
  public static abstract class HardwarePoolServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific HardwarePool resource.
     * To get the list of available HardwarePool resource, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of HardwarePool resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest,
                yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest,
                yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about HardwarePool resources.
   * </pre>
   */
  public static final class HardwarePoolServiceStub extends io.grpc.stub.AbstractAsyncStub<HardwarePoolServiceStub> {
    private HardwarePoolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HardwarePoolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HardwarePoolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific HardwarePool resource.
     * To get the list of available HardwarePool resource, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of HardwarePool resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about HardwarePool resources.
   * </pre>
   */
  public static final class HardwarePoolServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HardwarePoolServiceBlockingStub> {
    private HardwarePoolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HardwarePoolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HardwarePoolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific HardwarePool resource.
     * To get the list of available HardwarePool resource, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool get(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of HardwarePool resources.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse list(yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about HardwarePool resources.
   * </pre>
   */
  public static final class HardwarePoolServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HardwarePoolServiceFutureStub> {
    private HardwarePoolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HardwarePoolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HardwarePoolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific HardwarePool resource.
     * To get the list of available HardwarePool resource, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool> get(
        yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of HardwarePool resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse> list(
        yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest request) {
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
    private final HardwarePoolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HardwarePoolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.GetHardwarePoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolOuterClass.HardwarePool>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.ListHardwarePoolsResponse>) responseObserver);
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

  private static abstract class HardwarePoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HardwarePoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.HardwarePoolServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HardwarePoolService");
    }
  }

  private static final class HardwarePoolServiceFileDescriptorSupplier
      extends HardwarePoolServiceBaseDescriptorSupplier {
    HardwarePoolServiceFileDescriptorSupplier() {}
  }

  private static final class HardwarePoolServiceMethodDescriptorSupplier
      extends HardwarePoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HardwarePoolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HardwarePoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HardwarePoolServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
