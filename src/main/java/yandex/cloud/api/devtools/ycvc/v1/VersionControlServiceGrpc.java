package yandex.cloud.api.devtools.ycvc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Version Control Service for managing tool version blacklists.
 * This service manages obsolete (deprecated/blocked) versions only.
 * API Behavior:
 * - Supported versions: Return successful InitResponse.
 * - Deprecated versions: Return successful InitResponse with deprecation_warning.
 * - Blocked versions: Return FAILED_PRECONDITION error with descriptive message.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/devtools/ycvc/v1/control_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VersionControlServiceGrpc {

  private VersionControlServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.devtools.ycvc.v1.VersionControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.devtools.ycvc.v1.InitRequest,
      yandex.cloud.api.devtools.ycvc.v1.InitResponse> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = yandex.cloud.api.devtools.ycvc.v1.InitRequest.class,
      responseType = yandex.cloud.api.devtools.ycvc.v1.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.devtools.ycvc.v1.InitRequest,
      yandex.cloud.api.devtools.ycvc.v1.InitResponse> getInitMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.devtools.ycvc.v1.InitRequest, yandex.cloud.api.devtools.ycvc.v1.InitResponse> getInitMethod;
    if ((getInitMethod = VersionControlServiceGrpc.getInitMethod) == null) {
      synchronized (VersionControlServiceGrpc.class) {
        if ((getInitMethod = VersionControlServiceGrpc.getInitMethod) == null) {
          VersionControlServiceGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.devtools.ycvc.v1.InitRequest, yandex.cloud.api.devtools.ycvc.v1.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.devtools.ycvc.v1.InitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.devtools.ycvc.v1.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VersionControlServiceMethodDescriptorSupplier("Init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceStub>() {
        @java.lang.Override
        public VersionControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionControlServiceStub(channel, callOptions);
        }
      };
    return VersionControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceBlockingStub>() {
        @java.lang.Override
        public VersionControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionControlServiceBlockingStub(channel, callOptions);
        }
      };
    return VersionControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionControlServiceFutureStub>() {
        @java.lang.Override
        public VersionControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionControlServiceFutureStub(channel, callOptions);
        }
      };
    return VersionControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Version Control Service for managing tool version blacklists.
   * This service manages obsolete (deprecated/blocked) versions only.
   * API Behavior:
   * - Supported versions: Return successful InitResponse.
   * - Deprecated versions: Return successful InitResponse with deprecation_warning.
   * - Blocked versions: Return FAILED_PRECONDITION error with descriptive message.
   * </pre>
   */
  public static abstract class VersionControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Initializes client and checks if the provided version is obsolete.
     * Returns FAILED_PRECONDITION error for blocked versions.
     * </pre>
     */
    public void init(yandex.cloud.api.devtools.ycvc.v1.InitRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.devtools.ycvc.v1.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.devtools.ycvc.v1.InitRequest,
                yandex.cloud.api.devtools.ycvc.v1.InitResponse>(
                  this, METHODID_INIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Version Control Service for managing tool version blacklists.
   * This service manages obsolete (deprecated/blocked) versions only.
   * API Behavior:
   * - Supported versions: Return successful InitResponse.
   * - Deprecated versions: Return successful InitResponse with deprecation_warning.
   * - Blocked versions: Return FAILED_PRECONDITION error with descriptive message.
   * </pre>
   */
  public static final class VersionControlServiceStub extends io.grpc.stub.AbstractAsyncStub<VersionControlServiceStub> {
    private VersionControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initializes client and checks if the provided version is obsolete.
     * Returns FAILED_PRECONDITION error for blocked versions.
     * </pre>
     */
    public void init(yandex.cloud.api.devtools.ycvc.v1.InitRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.devtools.ycvc.v1.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Version Control Service for managing tool version blacklists.
   * This service manages obsolete (deprecated/blocked) versions only.
   * API Behavior:
   * - Supported versions: Return successful InitResponse.
   * - Deprecated versions: Return successful InitResponse with deprecation_warning.
   * - Blocked versions: Return FAILED_PRECONDITION error with descriptive message.
   * </pre>
   */
  public static final class VersionControlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VersionControlServiceBlockingStub> {
    private VersionControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initializes client and checks if the provided version is obsolete.
     * Returns FAILED_PRECONDITION error for blocked versions.
     * </pre>
     */
    public yandex.cloud.api.devtools.ycvc.v1.InitResponse init(yandex.cloud.api.devtools.ycvc.v1.InitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Version Control Service for managing tool version blacklists.
   * This service manages obsolete (deprecated/blocked) versions only.
   * API Behavior:
   * - Supported versions: Return successful InitResponse.
   * - Deprecated versions: Return successful InitResponse with deprecation_warning.
   * - Blocked versions: Return FAILED_PRECONDITION error with descriptive message.
   * </pre>
   */
  public static final class VersionControlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VersionControlServiceFutureStub> {
    private VersionControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initializes client and checks if the provided version is obsolete.
     * Returns FAILED_PRECONDITION error for blocked versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.devtools.ycvc.v1.InitResponse> init(
        yandex.cloud.api.devtools.ycvc.v1.InitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VersionControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT:
          serviceImpl.init((yandex.cloud.api.devtools.ycvc.v1.InitRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.devtools.ycvc.v1.InitResponse>) responseObserver);
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

  private static abstract class VersionControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.devtools.ycvc.v1.VersionControlServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VersionControlService");
    }
  }

  private static final class VersionControlServiceFileDescriptorSupplier
      extends VersionControlServiceBaseDescriptorSupplier {
    VersionControlServiceFileDescriptorSupplier() {}
  }

  private static final class VersionControlServiceMethodDescriptorSupplier
      extends VersionControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VersionControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VersionControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionControlServiceFileDescriptorSupplier())
              .addMethod(getInitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
