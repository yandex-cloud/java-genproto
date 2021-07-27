package yandex.cloud.api.datasphere.v1;

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
 * A set of methods for managing app tokens.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/datasphere/v1/app_token_service.proto")
public final class AppTokenServiceGrpc {

  private AppTokenServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v1.AppTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest,
      com.google.protobuf.Empty> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validate",
      requestType = yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest,
      com.google.protobuf.Empty> getValidateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest, com.google.protobuf.Empty> getValidateMethod;
    if ((getValidateMethod = AppTokenServiceGrpc.getValidateMethod) == null) {
      synchronized (AppTokenServiceGrpc.class) {
        if ((getValidateMethod = AppTokenServiceGrpc.getValidateMethod) == null) {
          AppTokenServiceGrpc.getValidateMethod = getValidateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.AppTokenService", "Validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AppTokenServiceMethodDescriptorSupplier("Validate"))
                  .build();
          }
        }
     }
     return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppTokenServiceStub newStub(io.grpc.Channel channel) {
    return new AppTokenServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppTokenServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppTokenServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing app tokens.
   * </pre>
   */
  public static abstract class AppTokenServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Validates app token.
     * </pre>
     */
    public void validate(yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_VALIDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing app tokens.
   * </pre>
   */
  public static final class AppTokenServiceStub extends io.grpc.stub.AbstractStub<AppTokenServiceStub> {
    private AppTokenServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppTokenServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppTokenServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppTokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates app token.
     * </pre>
     */
    public void validate(yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing app tokens.
   * </pre>
   */
  public static final class AppTokenServiceBlockingStub extends io.grpc.stub.AbstractStub<AppTokenServiceBlockingStub> {
    private AppTokenServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppTokenServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppTokenServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates app token.
     * </pre>
     */
    public com.google.protobuf.Empty validate(yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing app tokens.
   * </pre>
   */
  public static final class AppTokenServiceFutureStub extends io.grpc.stub.AbstractStub<AppTokenServiceFutureStub> {
    private AppTokenServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppTokenServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppTokenServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppTokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates app token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> validate(
        yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppTokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppTokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE:
          serviceImpl.validate((yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.AppTokenValidateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class AppTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v1.AppTokenServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppTokenService");
    }
  }

  private static final class AppTokenServiceFileDescriptorSupplier
      extends AppTokenServiceBaseDescriptorSupplier {
    AppTokenServiceFileDescriptorSupplier() {}
  }

  private static final class AppTokenServiceMethodDescriptorSupplier
      extends AppTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppTokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppTokenServiceFileDescriptorSupplier())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
