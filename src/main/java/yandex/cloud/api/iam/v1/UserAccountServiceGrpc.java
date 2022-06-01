package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing user accounts. Currently applicable only for [Yandex accounts](/docs/iam/concepts/#passport).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/user_account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserAccountServiceGrpc {

  private UserAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.UserAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest,
      yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest.class,
      responseType = yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest,
      yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest, yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> getGetMethod;
    if ((getGetMethod = UserAccountServiceGrpc.getGetMethod) == null) {
      synchronized (UserAccountServiceGrpc.class) {
        if ((getGetMethod = UserAccountServiceGrpc.getGetMethod) == null) {
          UserAccountServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest, yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccountServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceStub>() {
        @java.lang.Override
        public UserAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccountServiceStub(channel, callOptions);
        }
      };
    return UserAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceBlockingStub>() {
        @java.lang.Override
        public UserAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return UserAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccountServiceFutureStub>() {
        @java.lang.Override
        public UserAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccountServiceFutureStub(channel, callOptions);
        }
      };
    return UserAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static abstract class UserAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest,
                yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceStub extends io.grpc.stub.AbstractAsyncStub<UserAccountServiceStub> {
    private UserAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAccountServiceBlockingStub> {
    private UserAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount get(yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserAccountServiceFutureStub> {
    private UserAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> get(
        yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest) request,
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

  private static abstract class UserAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAccountService");
    }
  }

  private static final class UserAccountServiceFileDescriptorSupplier
      extends UserAccountServiceBaseDescriptorSupplier {
    UserAccountServiceFileDescriptorSupplier() {}
  }

  private static final class UserAccountServiceMethodDescriptorSupplier
      extends UserAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAccountServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
