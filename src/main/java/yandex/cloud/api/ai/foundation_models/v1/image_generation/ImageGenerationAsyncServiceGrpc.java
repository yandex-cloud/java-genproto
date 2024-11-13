package yandex.cloud.api.ai.foundation_models.v1.image_generation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for creating images based on a text description. 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/image_generation/image_generation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImageGenerationAsyncServiceGrpc {

  private ImageGenerationAsyncServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.image_generation.ImageGenerationAsyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGenerateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getGenerateMethod;
    if ((getGenerateMethod = ImageGenerationAsyncServiceGrpc.getGenerateMethod) == null) {
      synchronized (ImageGenerationAsyncServiceGrpc.class) {
        if ((getGenerateMethod = ImageGenerationAsyncServiceGrpc.getGenerateMethod) == null) {
          ImageGenerationAsyncServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ImageGenerationAsyncServiceMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageGenerationAsyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceStub>() {
        @java.lang.Override
        public ImageGenerationAsyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageGenerationAsyncServiceStub(channel, callOptions);
        }
      };
    return ImageGenerationAsyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageGenerationAsyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceBlockingStub>() {
        @java.lang.Override
        public ImageGenerationAsyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageGenerationAsyncServiceBlockingStub(channel, callOptions);
        }
      };
    return ImageGenerationAsyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageGenerationAsyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageGenerationAsyncServiceFutureStub>() {
        @java.lang.Override
        public ImageGenerationAsyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageGenerationAsyncServiceFutureStub(channel, callOptions);
        }
      };
    return ImageGenerationAsyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for creating images based on a text description. 
   * </pre>
   */
  public static abstract class ImageGenerationAsyncServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A method for generating an image based on a textual description.
     * </pre>
     */
    public void generate(yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_GENERATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for creating images based on a text description. 
   * </pre>
   */
  public static final class ImageGenerationAsyncServiceStub extends io.grpc.stub.AbstractAsyncStub<ImageGenerationAsyncServiceStub> {
    private ImageGenerationAsyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageGenerationAsyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageGenerationAsyncServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating an image based on a textual description.
     * </pre>
     */
    public void generate(yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for creating images based on a text description. 
   * </pre>
   */
  public static final class ImageGenerationAsyncServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageGenerationAsyncServiceBlockingStub> {
    private ImageGenerationAsyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageGenerationAsyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageGenerationAsyncServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating an image based on a textual description.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation generate(yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for creating images based on a text description. 
   * </pre>
   */
  public static final class ImageGenerationAsyncServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImageGenerationAsyncServiceFutureStub> {
    private ImageGenerationAsyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageGenerationAsyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageGenerationAsyncServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating an image based on a textual description.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> generate(
        yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageGenerationAsyncServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageGenerationAsyncServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.ImageGenerationRequest) request,
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

  private static abstract class ImageGenerationAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageGenerationAsyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.image_generation.ImageGenerationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageGenerationAsyncService");
    }
  }

  private static final class ImageGenerationAsyncServiceFileDescriptorSupplier
      extends ImageGenerationAsyncServiceBaseDescriptorSupplier {
    ImageGenerationAsyncServiceFileDescriptorSupplier() {}
  }

  private static final class ImageGenerationAsyncServiceMethodDescriptorSupplier
      extends ImageGenerationAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageGenerationAsyncServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageGenerationAsyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageGenerationAsyncServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
