package yandex.cloud.api.marketplace.pim.v1.saas;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/pim/v1/saas/product_instance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductInstanceServiceGrpc {

  private ProductInstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.pim.v1.saas.ProductInstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest,
      yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest.class,
      responseType = yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest,
      yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest, yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> getGetMethod;
    if ((getGetMethod = ProductInstanceServiceGrpc.getGetMethod) == null) {
      synchronized (ProductInstanceServiceGrpc.class) {
        if ((getGetMethod = ProductInstanceServiceGrpc.getGetMethod) == null) {
          ProductInstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest, yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance.getDefaultInstance()))
              .setSchemaDescriptor(new ProductInstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getClaimMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getClaimMethod;
    if ((getClaimMethod = ProductInstanceServiceGrpc.getClaimMethod) == null) {
      synchronized (ProductInstanceServiceGrpc.class) {
        if ((getClaimMethod = ProductInstanceServiceGrpc.getClaimMethod) == null) {
          ProductInstanceServiceGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProductInstanceServiceMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductInstanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceStub>() {
        @java.lang.Override
        public ProductInstanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductInstanceServiceStub(channel, callOptions);
        }
      };
    return ProductInstanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductInstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceBlockingStub>() {
        @java.lang.Override
        public ProductInstanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductInstanceServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductInstanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductInstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductInstanceServiceFutureStub>() {
        @java.lang.Override
        public ProductInstanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductInstanceServiceFutureStub(channel, callOptions);
        }
      };
    return ProductInstanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductInstanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void claim(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest,
                yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance>(
                  this, METHODID_GET)))
          .addMethod(
            getClaimMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CLAIM)))
          .build();
    }
  }

  /**
   */
  public static final class ProductInstanceServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductInstanceServiceStub> {
    private ProductInstanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInstanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductInstanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductInstanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductInstanceServiceBlockingStub> {
    private ProductInstanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInstanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductInstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance get(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation claim(yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductInstanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductInstanceServiceFutureStub> {
    private ProductInstanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInstanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductInstanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance> get(
        yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> claim(
        yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CLAIM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductInstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductInstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.GetProductInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceOuterClass.ProductInstance>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.ClaimProductInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class ProductInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductInstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.pim.v1.saas.ProductInstanceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductInstanceService");
    }
  }

  private static final class ProductInstanceServiceFileDescriptorSupplier
      extends ProductInstanceServiceBaseDescriptorSupplier {
    ProductInstanceServiceFileDescriptorSupplier() {}
  }

  private static final class ProductInstanceServiceMethodDescriptorSupplier
      extends ProductInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductInstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductInstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductInstanceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getClaimMethod())
              .build();
        }
      }
    }
    return result;
  }
}
