package yandex.cloud.api.iam.v1.awscompatibility;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing temporary and ephemeral access keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/awscompatibility/temporary_access_key_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemporaryAccessKeyServiceGrpc {

  private TemporaryAccessKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.awscompatibility.TemporaryAccessKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> getCreateEphemeralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEphemeral",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> getCreateEphemeralMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> getCreateEphemeralMethod;
    if ((getCreateEphemeralMethod = TemporaryAccessKeyServiceGrpc.getCreateEphemeralMethod) == null) {
      synchronized (TemporaryAccessKeyServiceGrpc.class) {
        if ((getCreateEphemeralMethod = TemporaryAccessKeyServiceGrpc.getCreateEphemeralMethod) == null) {
          TemporaryAccessKeyServiceGrpc.getCreateEphemeralMethod = getCreateEphemeralMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEphemeral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemporaryAccessKeyServiceMethodDescriptorSupplier("CreateEphemeral"))
              .build();
        }
      }
    }
    return getCreateEphemeralMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemporaryAccessKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceStub>() {
        @java.lang.Override
        public TemporaryAccessKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemporaryAccessKeyServiceStub(channel, callOptions);
        }
      };
    return TemporaryAccessKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemporaryAccessKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceBlockingStub>() {
        @java.lang.Override
        public TemporaryAccessKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemporaryAccessKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return TemporaryAccessKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemporaryAccessKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemporaryAccessKeyServiceFutureStub>() {
        @java.lang.Override
        public TemporaryAccessKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemporaryAccessKeyServiceFutureStub(channel, callOptions);
        }
      };
    return TemporaryAccessKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing temporary and ephemeral access keys.
   * </pre>
   */
  public static abstract class TemporaryAccessKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an ephemeral access key for the specified subject.
     * </pre>
     */
    public void createEphemeral(yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEphemeralMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEphemeralMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest,
                yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse>(
                  this, METHODID_CREATE_EPHEMERAL)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing temporary and ephemeral access keys.
   * </pre>
   */
  public static final class TemporaryAccessKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<TemporaryAccessKeyServiceStub> {
    private TemporaryAccessKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporaryAccessKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemporaryAccessKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an ephemeral access key for the specified subject.
     * </pre>
     */
    public void createEphemeral(yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEphemeralMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing temporary and ephemeral access keys.
   * </pre>
   */
  public static final class TemporaryAccessKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TemporaryAccessKeyServiceBlockingStub> {
    private TemporaryAccessKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporaryAccessKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemporaryAccessKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an ephemeral access key for the specified subject.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse createEphemeral(yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEphemeralMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing temporary and ephemeral access keys.
   * </pre>
   */
  public static final class TemporaryAccessKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TemporaryAccessKeyServiceFutureStub> {
    private TemporaryAccessKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemporaryAccessKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemporaryAccessKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an ephemeral access key for the specified subject.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse> createEphemeral(
        yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEphemeralMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EPHEMERAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemporaryAccessKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemporaryAccessKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EPHEMERAL:
          serviceImpl.createEphemeral((yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.CreateEphemeralAccessKeyResponse>) responseObserver);
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

  private static abstract class TemporaryAccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemporaryAccessKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.awscompatibility.TemporaryAccessKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemporaryAccessKeyService");
    }
  }

  private static final class TemporaryAccessKeyServiceFileDescriptorSupplier
      extends TemporaryAccessKeyServiceBaseDescriptorSupplier {
    TemporaryAccessKeyServiceFileDescriptorSupplier() {}
  }

  private static final class TemporaryAccessKeyServiceMethodDescriptorSupplier
      extends TemporaryAccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemporaryAccessKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemporaryAccessKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemporaryAccessKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateEphemeralMethod())
              .build();
        }
      }
    }
    return result;
  }
}
