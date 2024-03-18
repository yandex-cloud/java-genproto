package yandex.cloud.api.ai.foundation_models.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for obtaining embeddings from input data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/embedding/embedding_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmbeddingsServiceGrpc {

  private EmbeddingsServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.EmbeddingsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest,
      yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> getTextEmbeddingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextEmbedding",
      requestType = yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest.class,
      responseType = yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest,
      yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> getTextEmbeddingMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest, yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> getTextEmbeddingMethod;
    if ((getTextEmbeddingMethod = EmbeddingsServiceGrpc.getTextEmbeddingMethod) == null) {
      synchronized (EmbeddingsServiceGrpc.class) {
        if ((getTextEmbeddingMethod = EmbeddingsServiceGrpc.getTextEmbeddingMethod) == null) {
          EmbeddingsServiceGrpc.getTextEmbeddingMethod = getTextEmbeddingMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest, yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextEmbedding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmbeddingsServiceMethodDescriptorSupplier("TextEmbedding"))
              .build();
        }
      }
    }
    return getTextEmbeddingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmbeddingsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceStub>() {
        @java.lang.Override
        public EmbeddingsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmbeddingsServiceStub(channel, callOptions);
        }
      };
    return EmbeddingsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmbeddingsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceBlockingStub>() {
        @java.lang.Override
        public EmbeddingsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmbeddingsServiceBlockingStub(channel, callOptions);
        }
      };
    return EmbeddingsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmbeddingsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmbeddingsServiceFutureStub>() {
        @java.lang.Override
        public EmbeddingsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmbeddingsServiceFutureStub(channel, callOptions);
        }
      };
    return EmbeddingsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for obtaining embeddings from input data.
   * </pre>
   */
  public static abstract class EmbeddingsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method for obtaining embeddings from text data.
     * </pre>
     */
    public void textEmbedding(yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextEmbeddingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTextEmbeddingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest,
                yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse>(
                  this, METHODID_TEXT_EMBEDDING)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for obtaining embeddings from input data.
   * </pre>
   */
  public static final class EmbeddingsServiceStub extends io.grpc.stub.AbstractAsyncStub<EmbeddingsServiceStub> {
    private EmbeddingsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmbeddingsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmbeddingsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for obtaining embeddings from text data.
     * </pre>
     */
    public void textEmbedding(yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextEmbeddingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for obtaining embeddings from input data.
   * </pre>
   */
  public static final class EmbeddingsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmbeddingsServiceBlockingStub> {
    private EmbeddingsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmbeddingsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmbeddingsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for obtaining embeddings from text data.
     * </pre>
     */
    public yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse textEmbedding(yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextEmbeddingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for obtaining embeddings from input data.
   * </pre>
   */
  public static final class EmbeddingsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmbeddingsServiceFutureStub> {
    private EmbeddingsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmbeddingsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmbeddingsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for obtaining embeddings from text data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse> textEmbedding(
        yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextEmbeddingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEXT_EMBEDDING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmbeddingsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmbeddingsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEXT_EMBEDDING:
          serviceImpl.textEmbedding((yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.TextEmbeddingResponse>) responseObserver);
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

  private static abstract class EmbeddingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmbeddingsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.EmbeddingService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmbeddingsService");
    }
  }

  private static final class EmbeddingsServiceFileDescriptorSupplier
      extends EmbeddingsServiceBaseDescriptorSupplier {
    EmbeddingsServiceFileDescriptorSupplier() {}
  }

  private static final class EmbeddingsServiceMethodDescriptorSupplier
      extends EmbeddingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmbeddingsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmbeddingsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmbeddingsServiceFileDescriptorSupplier())
              .addMethod(getTextEmbeddingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
