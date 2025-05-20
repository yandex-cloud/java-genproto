package yandex.cloud.api.marketplace.metering.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing product's usage with product instances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/metering/v1/product_usage_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductUsageServiceGrpc {

  private ProductUsageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.metering.v1.ProductUsageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest,
      yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest.class,
      responseType = yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest,
      yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest, yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> getWriteMethod;
    if ((getWriteMethod = ProductUsageServiceGrpc.getWriteMethod) == null) {
      synchronized (ProductUsageServiceGrpc.class) {
        if ((getWriteMethod = ProductUsageServiceGrpc.getWriteMethod) == null) {
          ProductUsageServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest, yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductUsageServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductUsageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceStub>() {
        @java.lang.Override
        public ProductUsageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductUsageServiceStub(channel, callOptions);
        }
      };
    return ProductUsageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductUsageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceBlockingStub>() {
        @java.lang.Override
        public ProductUsageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductUsageServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductUsageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductUsageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductUsageServiceFutureStub>() {
        @java.lang.Override
        public ProductUsageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductUsageServiceFutureStub(channel, callOptions);
        }
      };
    return ProductUsageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing product's usage with product instances.
   * </pre>
   */
  public static abstract class ProductUsageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Writes product's usage (authenticated by publisher's service account)
     * </pre>
     */
    public void write(yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest,
                yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing product's usage with product instances.
   * </pre>
   */
  public static final class ProductUsageServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductUsageServiceStub> {
    private ProductUsageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductUsageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductUsageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes product's usage (authenticated by publisher's service account)
     * </pre>
     */
    public void write(yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing product's usage with product instances.
   * </pre>
   */
  public static final class ProductUsageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductUsageServiceBlockingStub> {
    private ProductUsageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductUsageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductUsageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes product's usage (authenticated by publisher's service account)
     * </pre>
     */
    public yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse write(yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing product's usage with product instances.
   * </pre>
   */
  public static final class ProductUsageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductUsageServiceFutureStub> {
    private ProductUsageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductUsageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductUsageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes product's usage (authenticated by publisher's service account)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse> write(
        yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductUsageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductUsageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.WriteUsageResponse>) responseObserver);
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

  private static abstract class ProductUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductUsageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.metering.v1.ProductUsageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductUsageService");
    }
  }

  private static final class ProductUsageServiceFileDescriptorSupplier
      extends ProductUsageServiceBaseDescriptorSupplier {
    ProductUsageServiceFileDescriptorSupplier() {}
  }

  private static final class ProductUsageServiceMethodDescriptorSupplier
      extends ProductUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductUsageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductUsageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductUsageServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
