package yandex.cloud.api.k8s.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Kubernetes versions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/k8s/v1/version_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VersionServiceGrpc {

  private VersionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.k8s.v1.VersionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest.class,
      responseType = yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest, yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> getListMethod;
    if ((getListMethod = VersionServiceGrpc.getListMethod) == null) {
      synchronized (VersionServiceGrpc.class) {
        if ((getListMethod = VersionServiceGrpc.getListMethod) == null) {
          VersionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest, yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VersionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceStub>() {
        @java.lang.Override
        public VersionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceStub(channel, callOptions);
        }
      };
    return VersionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceBlockingStub>() {
        @java.lang.Override
        public VersionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceBlockingStub(channel, callOptions);
        }
      };
    return VersionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceFutureStub>() {
        @java.lang.Override
        public VersionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceFutureStub(channel, callOptions);
        }
      };
    return VersionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes versions.
   * </pre>
   */
  public static abstract class VersionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of versions in the specified release channel.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest,
                yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes versions.
   * </pre>
   */
  public static final class VersionServiceStub extends io.grpc.stub.AbstractAsyncStub<VersionServiceStub> {
    private VersionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of versions in the specified release channel.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes versions.
   * </pre>
   */
  public static final class VersionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VersionServiceBlockingStub> {
    private VersionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of versions in the specified release channel.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse list(yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes versions.
   * </pre>
   */
  public static final class VersionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VersionServiceFutureStub> {
    private VersionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of versions in the specified release channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse> list(
        yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VersionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.VersionServiceOuterClass.ListVersionsResponse>) responseObserver);
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

  private static abstract class VersionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.k8s.v1.VersionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VersionService");
    }
  }

  private static final class VersionServiceFileDescriptorSupplier
      extends VersionServiceBaseDescriptorSupplier {
    VersionServiceFileDescriptorSupplier() {}
  }

  private static final class VersionServiceMethodDescriptorSupplier
      extends VersionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VersionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VersionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
