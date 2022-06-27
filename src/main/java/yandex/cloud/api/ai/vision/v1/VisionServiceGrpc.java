package yandex.cloud.api.ai.vision.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for the Vision service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/vision/v1/vision_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VisionServiceGrpc {

  private VisionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.vision.v1.VisionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest,
      yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> getBatchAnalyzeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchAnalyze",
      requestType = yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest.class,
      responseType = yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest,
      yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> getBatchAnalyzeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest, yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> getBatchAnalyzeMethod;
    if ((getBatchAnalyzeMethod = VisionServiceGrpc.getBatchAnalyzeMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getBatchAnalyzeMethod = VisionServiceGrpc.getBatchAnalyzeMethod) == null) {
          VisionServiceGrpc.getBatchAnalyzeMethod = getBatchAnalyzeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest, yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchAnalyze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("BatchAnalyze"))
              .build();
        }
      }
    }
    return getBatchAnalyzeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VisionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceStub>() {
        @java.lang.Override
        public VisionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceStub(channel, callOptions);
        }
      };
    return VisionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VisionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceBlockingStub>() {
        @java.lang.Override
        public VisionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceBlockingStub(channel, callOptions);
        }
      };
    return VisionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VisionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceFutureStub>() {
        @java.lang.Override
        public VisionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceFutureStub(channel, callOptions);
        }
      };
    return VisionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for the Vision service.
   * </pre>
   */
  public static abstract class VisionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Analyzes a batch of images and returns results with annotations.
     * </pre>
     */
    public void batchAnalyze(yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchAnalyzeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBatchAnalyzeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest,
                yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse>(
                  this, METHODID_BATCH_ANALYZE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision service.
   * </pre>
   */
  public static final class VisionServiceStub extends io.grpc.stub.AbstractAsyncStub<VisionServiceStub> {
    private VisionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes a batch of images and returns results with annotations.
     * </pre>
     */
    public void batchAnalyze(yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchAnalyzeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision service.
   * </pre>
   */
  public static final class VisionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VisionServiceBlockingStub> {
    private VisionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes a batch of images and returns results with annotations.
     * </pre>
     */
    public yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse batchAnalyze(yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchAnalyzeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision service.
   * </pre>
   */
  public static final class VisionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VisionServiceFutureStub> {
    private VisionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes a batch of images and returns results with annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse> batchAnalyze(
        yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchAnalyzeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_ANALYZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VisionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VisionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_ANALYZE:
          serviceImpl.batchAnalyze((yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.BatchAnalyzeResponse>) responseObserver);
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

  private static abstract class VisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VisionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.vision.v1.VisionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VisionService");
    }
  }

  private static final class VisionServiceFileDescriptorSupplier
      extends VisionServiceBaseDescriptorSupplier {
    VisionServiceFileDescriptorSupplier() {}
  }

  private static final class VisionServiceMethodDescriptorSupplier
      extends VisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VisionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VisionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VisionServiceFileDescriptorSupplier())
              .addMethod(getBatchAnalyzeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
