package yandex.cloud.api.ai.vision.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/ai/vision/v2/image_classifier_service.proto")
public final class ImageClassifierServiceGrpc {

  private ImageClassifierServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.vision.v2.ImageClassifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest,
      yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> getAnnotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Annotate",
      requestType = yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest.class,
      responseType = yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest,
      yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> getAnnotateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest, yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> getAnnotateMethod;
    if ((getAnnotateMethod = ImageClassifierServiceGrpc.getAnnotateMethod) == null) {
      synchronized (ImageClassifierServiceGrpc.class) {
        if ((getAnnotateMethod = ImageClassifierServiceGrpc.getAnnotateMethod) == null) {
          ImageClassifierServiceGrpc.getAnnotateMethod = getAnnotateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest, yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ai.vision.v2.ImageClassifierService", "Annotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageClassifierServiceMethodDescriptorSupplier("Annotate"))
                  .build();
          }
        }
     }
     return getAnnotateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageClassifierServiceStub newStub(io.grpc.Channel channel) {
    return new ImageClassifierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageClassifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageClassifierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageClassifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageClassifierServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImageClassifierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void annotate(yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAnnotateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAnnotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest,
                yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse>(
                  this, METHODID_ANNOTATE)))
          .build();
    }
  }

  /**
   */
  public static final class ImageClassifierServiceStub extends io.grpc.stub.AbstractStub<ImageClassifierServiceStub> {
    private ImageClassifierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageClassifierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageClassifierServiceStub(channel, callOptions);
    }

    /**
     */
    public void annotate(yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnnotateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImageClassifierServiceBlockingStub extends io.grpc.stub.AbstractStub<ImageClassifierServiceBlockingStub> {
    private ImageClassifierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageClassifierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageClassifierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse annotate(yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnnotateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImageClassifierServiceFutureStub extends io.grpc.stub.AbstractStub<ImageClassifierServiceFutureStub> {
    private ImageClassifierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageClassifierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageClassifierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse> annotate(
        yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnnotateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANNOTATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageClassifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageClassifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANNOTATE:
          serviceImpl.annotate((yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.vision.v2.ImageClassifier.AnnotationResponse>) responseObserver);
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

  private static abstract class ImageClassifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageClassifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.vision.v2.ImageClassifierServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageClassifierService");
    }
  }

  private static final class ImageClassifierServiceFileDescriptorSupplier
      extends ImageClassifierServiceBaseDescriptorSupplier {
    ImageClassifierServiceFileDescriptorSupplier() {}
  }

  private static final class ImageClassifierServiceMethodDescriptorSupplier
      extends ImageClassifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageClassifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageClassifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageClassifierServiceFileDescriptorSupplier())
              .addMethod(getAnnotateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
