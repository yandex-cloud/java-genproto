package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing YandexPassportUserAccount resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/yandex_passport_user_account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class YandexPassportUserAccountServiceGrpc {

  private YandexPassportUserAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.YandexPassportUserAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest,
      yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetByLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByLogin",
      requestType = yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest.class,
      responseType = yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest,
      yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetByLoginMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest, yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetByLoginMethod;
    if ((getGetByLoginMethod = YandexPassportUserAccountServiceGrpc.getGetByLoginMethod) == null) {
      synchronized (YandexPassportUserAccountServiceGrpc.class) {
        if ((getGetByLoginMethod = YandexPassportUserAccountServiceGrpc.getGetByLoginMethod) == null) {
          YandexPassportUserAccountServiceGrpc.getGetByLoginMethod = getGetByLoginMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest, yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount.getDefaultInstance()))
              .setSchemaDescriptor(new YandexPassportUserAccountServiceMethodDescriptorSupplier("GetByLogin"))
              .build();
        }
      }
    }
    return getGetByLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YandexPassportUserAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceStub>() {
        @java.lang.Override
        public YandexPassportUserAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YandexPassportUserAccountServiceStub(channel, callOptions);
        }
      };
    return YandexPassportUserAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YandexPassportUserAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceBlockingStub>() {
        @java.lang.Override
        public YandexPassportUserAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YandexPassportUserAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return YandexPassportUserAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YandexPassportUserAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YandexPassportUserAccountServiceFutureStub>() {
        @java.lang.Override
        public YandexPassportUserAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YandexPassportUserAccountServiceFutureStub(channel, callOptions);
        }
      };
    return YandexPassportUserAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing YandexPassportUserAccount resources.
   * </pre>
   */
  public static abstract class YandexPassportUserAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified YandexPassportUserAccount resource.
     * </pre>
     */
    public void getByLogin(yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest,
                yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>(
                  this, METHODID_GET_BY_LOGIN)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing YandexPassportUserAccount resources.
   * </pre>
   */
  public static final class YandexPassportUserAccountServiceStub extends io.grpc.stub.AbstractAsyncStub<YandexPassportUserAccountServiceStub> {
    private YandexPassportUserAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YandexPassportUserAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YandexPassportUserAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified YandexPassportUserAccount resource.
     * </pre>
     */
    public void getByLogin(yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing YandexPassportUserAccount resources.
   * </pre>
   */
  public static final class YandexPassportUserAccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<YandexPassportUserAccountServiceBlockingStub> {
    private YandexPassportUserAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YandexPassportUserAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YandexPassportUserAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified YandexPassportUserAccount resource.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount getByLogin(yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing YandexPassportUserAccount resources.
   * </pre>
   */
  public static final class YandexPassportUserAccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<YandexPassportUserAccountServiceFutureStub> {
    private YandexPassportUserAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YandexPassportUserAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YandexPassportUserAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified YandexPassportUserAccount resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getByLogin(
        yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final YandexPassportUserAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(YandexPassportUserAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_LOGIN:
          serviceImpl.getByLogin((yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.GetUserAccountByLoginRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>) responseObserver);
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

  private static abstract class YandexPassportUserAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YandexPassportUserAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.YandexPassportUserAccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YandexPassportUserAccountService");
    }
  }

  private static final class YandexPassportUserAccountServiceFileDescriptorSupplier
      extends YandexPassportUserAccountServiceBaseDescriptorSupplier {
    YandexPassportUserAccountServiceFileDescriptorSupplier() {}
  }

  private static final class YandexPassportUserAccountServiceMethodDescriptorSupplier
      extends YandexPassportUserAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    YandexPassportUserAccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (YandexPassportUserAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YandexPassportUserAccountServiceFileDescriptorSupplier())
              .addMethod(getGetByLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
