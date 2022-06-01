package yandex.cloud.api.marketplace.v1.metering;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing image product's usage.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/v1/metering/image_product_usage_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImageProductUsageServiceGrpc {

  private ImageProductUsageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.v1.metering.ImageProductUsageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest,
      yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest.class,
      responseType = yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest,
      yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest, yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> getWriteMethod;
    if ((getWriteMethod = ImageProductUsageServiceGrpc.getWriteMethod) == null) {
      synchronized (ImageProductUsageServiceGrpc.class) {
        if ((getWriteMethod = ImageProductUsageServiceGrpc.getWriteMethod) == null) {
          ImageProductUsageServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest, yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImageProductUsageServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageProductUsageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceStub>() {
        @java.lang.Override
        public ImageProductUsageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageProductUsageServiceStub(channel, callOptions);
        }
      };
    return ImageProductUsageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageProductUsageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceBlockingStub>() {
        @java.lang.Override
        public ImageProductUsageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageProductUsageServiceBlockingStub(channel, callOptions);
        }
      };
    return ImageProductUsageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageProductUsageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageProductUsageServiceFutureStub>() {
        @java.lang.Override
        public ImageProductUsageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageProductUsageServiceFutureStub(channel, callOptions);
        }
      };
    return ImageProductUsageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing image product's usage.
   * </pre>
   */
  public static abstract class ImageProductUsageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Writes image product's usage. Authentication is by user's service account.
     * </pre>
     */
    public void write(yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest,
                yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing image product's usage.
   * </pre>
   */
  public static final class ImageProductUsageServiceStub extends io.grpc.stub.AbstractAsyncStub<ImageProductUsageServiceStub> {
    private ImageProductUsageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageProductUsageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageProductUsageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes image product's usage. Authentication is by user's service account.
     * </pre>
     */
    public void write(yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing image product's usage.
   * </pre>
   */
  public static final class ImageProductUsageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageProductUsageServiceBlockingStub> {
    private ImageProductUsageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageProductUsageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageProductUsageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes image product's usage. Authentication is by user's service account.
     * </pre>
     */
    public yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse write(yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing image product's usage.
   * </pre>
   */
  public static final class ImageProductUsageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImageProductUsageServiceFutureStub> {
    private ImageProductUsageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageProductUsageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageProductUsageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes image product's usage. Authentication is by user's service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse> write(
        yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest request) {
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
    private final ImageProductUsageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageProductUsageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.WriteImageProductUsageResponse>) responseObserver);
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

  private static abstract class ImageProductUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageProductUsageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.v1.metering.ImageProductUsageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageProductUsageService");
    }
  }

  private static final class ImageProductUsageServiceFileDescriptorSupplier
      extends ImageProductUsageServiceBaseDescriptorSupplier {
    ImageProductUsageServiceFileDescriptorSupplier() {}
  }

  private static final class ImageProductUsageServiceMethodDescriptorSupplier
      extends ImageProductUsageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageProductUsageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageProductUsageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageProductUsageServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
