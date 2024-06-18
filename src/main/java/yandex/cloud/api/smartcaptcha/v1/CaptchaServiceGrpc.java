package yandex.cloud.api.smartcaptcha.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Captcha resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/smartcaptcha/v1/captcha_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CaptchaServiceGrpc {

  private CaptchaServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.smartcaptcha.v1.CaptchaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest.class,
      responseType = yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> getGetMethod;
    if ((getGetMethod = CaptchaServiceGrpc.getGetMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getGetMethod = CaptchaServiceGrpc.getGetMethod) == null) {
          CaptchaServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> getGetSecretKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecretKey",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest.class,
      responseType = yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> getGetSecretKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> getGetSecretKeyMethod;
    if ((getGetSecretKeyMethod = CaptchaServiceGrpc.getGetSecretKeyMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getGetSecretKeyMethod = CaptchaServiceGrpc.getGetSecretKeyMethod) == null) {
          CaptchaServiceGrpc.getGetSecretKeyMethod = getGetSecretKeyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecretKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("GetSecretKey"))
              .build();
        }
      }
    }
    return getGetSecretKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest.class,
      responseType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest,
      yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> getListMethod;
    if ((getListMethod = CaptchaServiceGrpc.getListMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getListMethod = CaptchaServiceGrpc.getListMethod) == null) {
          CaptchaServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest, yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = CaptchaServiceGrpc.getCreateMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getCreateMethod = CaptchaServiceGrpc.getCreateMethod) == null) {
          CaptchaServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CaptchaServiceGrpc.getUpdateMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getUpdateMethod = CaptchaServiceGrpc.getUpdateMethod) == null) {
          CaptchaServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = CaptchaServiceGrpc.getDeleteMethod) == null) {
      synchronized (CaptchaServiceGrpc.class) {
        if ((getDeleteMethod = CaptchaServiceGrpc.getDeleteMethod) == null) {
          CaptchaServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CaptchaServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CaptchaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceStub>() {
        @java.lang.Override
        public CaptchaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaptchaServiceStub(channel, callOptions);
        }
      };
    return CaptchaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CaptchaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceBlockingStub>() {
        @java.lang.Override
        public CaptchaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaptchaServiceBlockingStub(channel, callOptions);
        }
      };
    return CaptchaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CaptchaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaptchaServiceFutureStub>() {
        @java.lang.Override
        public CaptchaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaptchaServiceFutureStub(channel, callOptions);
        }
      };
    return CaptchaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Captcha resources.
   * </pre>
   */
  public static abstract class CaptchaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Captcha resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the secret data of specified Captcha resource.
     * </pre>
     */
    public void getSecretKey(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Captcha resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a captcha in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified captcha.
     * </pre>
     */
    public void update(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified captcha.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
                yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha>(
                  this, METHODID_GET)))
          .addMethod(
            getGetSecretKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest,
                yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey>(
                  this, METHODID_GET_SECRET_KEY)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest,
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Captcha resources.
   * </pre>
   */
  public static final class CaptchaServiceStub extends io.grpc.stub.AbstractAsyncStub<CaptchaServiceStub> {
    private CaptchaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaptchaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaptchaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Captcha resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the secret data of specified Captcha resource.
     * </pre>
     */
    public void getSecretKey(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Captcha resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a captcha in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified captcha.
     * </pre>
     */
    public void update(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified captcha.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Captcha resources.
   * </pre>
   */
  public static final class CaptchaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CaptchaServiceBlockingStub> {
    private CaptchaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaptchaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaptchaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Captcha resource.
     * </pre>
     */
    public yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha get(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the secret data of specified Captcha resource.
     * </pre>
     */
    public yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey getSecretKey(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Captcha resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse list(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a captcha in the specified folder using the data specified in the request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified captcha.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified captcha.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Captcha resources.
   * </pre>
   */
  public static final class CaptchaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CaptchaServiceFutureStub> {
    private CaptchaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaptchaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaptchaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Captcha resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha> get(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the secret data of specified Captcha resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey> getSecretKey(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Captcha resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse> list(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a captcha in the specified folder using the data specified in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified captcha.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified captcha.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_SECRET_KEY = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CaptchaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CaptchaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.Captcha>) responseObserver);
          break;
        case METHODID_GET_SECRET_KEY:
          serviceImpl.getSecretKey((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.GetCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaOuterClass.CaptchaSecretKey>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.ListCaptchasResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.CreateCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.UpdateCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.DeleteCaptchaRequest) request,
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

  private static abstract class CaptchaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CaptchaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.smartcaptcha.v1.CaptchaServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CaptchaService");
    }
  }

  private static final class CaptchaServiceFileDescriptorSupplier
      extends CaptchaServiceBaseDescriptorSupplier {
    CaptchaServiceFileDescriptorSupplier() {}
  }

  private static final class CaptchaServiceMethodDescriptorSupplier
      extends CaptchaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CaptchaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CaptchaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CaptchaServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetSecretKeyMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
