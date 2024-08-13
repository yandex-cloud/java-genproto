package yandex.cloud.api.ai.translate.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for the Translate service.
 * Make sure you send your [authentication](/docs/translate/api-ref/authentication) credentials in the `Authorization` header of each request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/translate/v2/translation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TranslationServiceGrpc {

  private TranslationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.translate.v2.TranslationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> getTranslateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Translate",
      requestType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest.class,
      responseType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> getTranslateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> getTranslateMethod;
    if ((getTranslateMethod = TranslationServiceGrpc.getTranslateMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getTranslateMethod = TranslationServiceGrpc.getTranslateMethod) == null) {
          TranslationServiceGrpc.getTranslateMethod = getTranslateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Translate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationServiceMethodDescriptorSupplier("Translate"))
              .build();
        }
      }
    }
    return getTranslateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> getDetectLanguageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectLanguage",
      requestType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest.class,
      responseType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> getDetectLanguageMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> getDetectLanguageMethod;
    if ((getDetectLanguageMethod = TranslationServiceGrpc.getDetectLanguageMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getDetectLanguageMethod = TranslationServiceGrpc.getDetectLanguageMethod) == null) {
          TranslationServiceGrpc.getDetectLanguageMethod = getDetectLanguageMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectLanguage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationServiceMethodDescriptorSupplier("DetectLanguage"))
              .build();
        }
      }
    }
    return getDetectLanguageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> getListLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLanguages",
      requestType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest.class,
      responseType = yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest,
      yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> getListLanguagesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> getListLanguagesMethod;
    if ((getListLanguagesMethod = TranslationServiceGrpc.getListLanguagesMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getListLanguagesMethod = TranslationServiceGrpc.getListLanguagesMethod) == null) {
          TranslationServiceGrpc.getListLanguagesMethod = getListLanguagesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest, yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationServiceMethodDescriptorSupplier("ListLanguages"))
              .build();
        }
      }
    }
    return getListLanguagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub>() {
        @java.lang.Override
        public TranslationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceStub(channel, callOptions);
        }
      };
    return TranslationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub>() {
        @java.lang.Override
        public TranslationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceBlockingStub(channel, callOptions);
        }
      };
    return TranslationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub>() {
        @java.lang.Override
        public TranslationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceFutureStub(channel, callOptions);
        }
      };
    return TranslationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for the Translate service.
   * Make sure you send your [authentication](/docs/translate/api-ref/authentication) credentials in the `Authorization` header of each request.
   * </pre>
   */
  public static abstract class TranslationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Translates the text to the specified language.
     * </pre>
     */
    public void translate(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranslateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detects the language of the text.
     * </pre>
     */
    public void detectLanguage(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetectLanguageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of supported languages.
     * </pre>
     */
    public void listLanguages(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLanguagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTranslateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest,
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse>(
                  this, METHODID_TRANSLATE)))
          .addMethod(
            getDetectLanguageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest,
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse>(
                  this, METHODID_DETECT_LANGUAGE)))
          .addMethod(
            getListLanguagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest,
                yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse>(
                  this, METHODID_LIST_LANGUAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for the Translate service.
   * Make sure you send your [authentication](/docs/translate/api-ref/authentication) credentials in the `Authorization` header of each request.
   * </pre>
   */
  public static final class TranslationServiceStub extends io.grpc.stub.AbstractAsyncStub<TranslationServiceStub> {
    private TranslationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translates the text to the specified language.
     * </pre>
     */
    public void translate(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detects the language of the text.
     * </pre>
     */
    public void detectLanguage(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetectLanguageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of supported languages.
     * </pre>
     */
    public void listLanguages(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLanguagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for the Translate service.
   * Make sure you send your [authentication](/docs/translate/api-ref/authentication) credentials in the `Authorization` header of each request.
   * </pre>
   */
  public static final class TranslationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TranslationServiceBlockingStub> {
    private TranslationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translates the text to the specified language.
     * </pre>
     */
    public yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse translate(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detects the language of the text.
     * </pre>
     */
    public yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse detectLanguage(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetectLanguageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of supported languages.
     * </pre>
     */
    public yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse listLanguages(yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLanguagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for the Translate service.
   * Make sure you send your [authentication](/docs/translate/api-ref/authentication) credentials in the `Authorization` header of each request.
   * </pre>
   */
  public static final class TranslationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TranslationServiceFutureStub> {
    private TranslationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translates the text to the specified language.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse> translate(
        yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Detects the language of the text.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse> detectLanguage(
        yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetectLanguageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of supported languages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse> listLanguages(
        yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLanguagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE = 0;
  private static final int METHODID_DETECT_LANGUAGE = 1;
  private static final int METHODID_LIST_LANGUAGES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TranslationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TranslationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSLATE:
          serviceImpl.translate((yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.TranslateResponse>) responseObserver);
          break;
        case METHODID_DETECT_LANGUAGE:
          serviceImpl.detectLanguage((yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.DetectLanguageResponse>) responseObserver);
          break;
        case METHODID_LIST_LANGUAGES:
          serviceImpl.listLanguages((yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.ListLanguagesResponse>) responseObserver);
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

  private static abstract class TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.translate.v2.TranslationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationService");
    }
  }

  private static final class TranslationServiceFileDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier {
    TranslationServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationServiceMethodDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TranslationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TranslationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslationServiceFileDescriptorSupplier())
              .addMethod(getTranslateMethod())
              .addMethod(getDetectLanguageMethod())
              .addMethod(getListLanguagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
