package yandex.cloud.api.billing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Sku resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/billing/v1/sku_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SkuServiceGrpc {

  private SkuServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.v1.SkuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest,
      yandex.cloud.api.billing.v1.SkuOuterClass.Sku> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest.class,
      responseType = yandex.cloud.api.billing.v1.SkuOuterClass.Sku.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest,
      yandex.cloud.api.billing.v1.SkuOuterClass.Sku> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest, yandex.cloud.api.billing.v1.SkuOuterClass.Sku> getGetMethod;
    if ((getGetMethod = SkuServiceGrpc.getGetMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getGetMethod = SkuServiceGrpc.getGetMethod) == null) {
          SkuServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest, yandex.cloud.api.billing.v1.SkuOuterClass.Sku>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.SkuOuterClass.Sku.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest,
      yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest.class,
      responseType = yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest,
      yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest, yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> getListMethod;
    if ((getListMethod = SkuServiceGrpc.getListMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getListMethod = SkuServiceGrpc.getListMethod) == null) {
          SkuServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest, yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceStub>() {
        @java.lang.Override
        public SkuServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceStub(channel, callOptions);
        }
      };
    return SkuServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SkuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceBlockingStub>() {
        @java.lang.Override
        public SkuServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceBlockingStub(channel, callOptions);
        }
      };
    return SkuServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SkuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkuServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkuServiceFutureStub>() {
        @java.lang.Override
        public SkuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkuServiceFutureStub(channel, callOptions);
        }
      };
    return SkuServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Sku resources.
   * </pre>
   */
  public static abstract class SkuServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SKU.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuOuterClass.Sku> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SKUs.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest,
                yandex.cloud.api.billing.v1.SkuOuterClass.Sku>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest,
                yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Sku resources.
   * </pre>
   */
  public static final class SkuServiceStub extends io.grpc.stub.AbstractAsyncStub<SkuServiceStub> {
    private SkuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SKU.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuOuterClass.Sku> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SKUs.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Sku resources.
   * </pre>
   */
  public static final class SkuServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SkuServiceBlockingStub> {
    private SkuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SKU.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.SkuOuterClass.Sku get(yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SKUs.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse list(yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Sku resources.
   * </pre>
   */
  public static final class SkuServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SkuServiceFutureStub> {
    private SkuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkuServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SKU.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.SkuOuterClass.Sku> get(
        yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SKUs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse> list(
        yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest request) {
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
    private final SkuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SkuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.billing.v1.SkuServiceOuterClass.GetSkuRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuOuterClass.Sku>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.SkuServiceOuterClass.ListSkusResponse>) responseObserver);
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

  private static abstract class SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.v1.SkuServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SkuService");
    }
  }

  private static final class SkuServiceFileDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier {
    SkuServiceFileDescriptorSupplier() {}
  }

  private static final class SkuServiceMethodDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SkuServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SkuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SkuServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
