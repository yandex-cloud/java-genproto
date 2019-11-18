package yandex.cloud.api.iam.v1;

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
 * <pre>
 * A set of methods for managing user accounts. Currently applicable only for [Yandex.Passport accounts](/docs/iam/concepts/#passport).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iam/v1/user_account_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.UserAccountService", "Get"))
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
    return new UserAccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserAccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserAccountServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex.Passport accounts](/docs/iam/concepts/#passport).
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
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest,
                yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex.Passport accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceStub extends io.grpc.stub.AbstractStub<UserAccountServiceStub> {
    private UserAccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex.Passport accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceBlockingStub extends io.grpc.stub.AbstractStub<UserAccountServiceBlockingStub> {
    private UserAccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount get(yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing user accounts. Currently applicable only for [Yandex.Passport accounts](/docs/iam/concepts/#passport).
   * </pre>
   */
  public static final class UserAccountServiceFutureStub extends io.grpc.stub.AbstractStub<UserAccountServiceFutureStub> {
    private UserAccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified UserAccount resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.UserAccountOuterClass.UserAccount> get(
        yandex.cloud.api.iam.v1.UserAccountServiceOuterClass.GetUserAccountRequest request) {
      return futureUnaryCall(
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
