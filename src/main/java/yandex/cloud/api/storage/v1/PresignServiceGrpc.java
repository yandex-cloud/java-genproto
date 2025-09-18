package yandex.cloud.api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PresignService provides URL presigning functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/storage/v1/presign_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PresignServiceGrpc {

  private PresignServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.storage.v1.PresignService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest,
      yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest.class,
      responseType = yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest,
      yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest, yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> getCreateMethod;
    if ((getCreateMethod = PresignServiceGrpc.getCreateMethod) == null) {
      synchronized (PresignServiceGrpc.class) {
        if ((getCreateMethod = PresignServiceGrpc.getCreateMethod) == null) {
          PresignServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest, yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PresignServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PresignServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresignServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresignServiceStub>() {
        @java.lang.Override
        public PresignServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresignServiceStub(channel, callOptions);
        }
      };
    return PresignServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PresignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresignServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresignServiceBlockingStub>() {
        @java.lang.Override
        public PresignServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresignServiceBlockingStub(channel, callOptions);
        }
      };
    return PresignServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PresignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresignServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresignServiceFutureStub>() {
        @java.lang.Override
        public PresignServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresignServiceFutureStub(channel, callOptions);
        }
      };
    return PresignServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PresignService provides URL presigning functionality
   * </pre>
   */
  public static abstract class PresignServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create generates presigned URLs for the specified objects
     * </pre>
     */
    public void create(yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest,
                yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   * <pre>
   * PresignService provides URL presigning functionality
   * </pre>
   */
  public static final class PresignServiceStub extends io.grpc.stub.AbstractAsyncStub<PresignServiceStub> {
    private PresignServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresignServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create generates presigned URLs for the specified objects
     * </pre>
     */
    public void create(yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PresignService provides URL presigning functionality
   * </pre>
   */
  public static final class PresignServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PresignServiceBlockingStub> {
    private PresignServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresignServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create generates presigned URLs for the specified objects
     * </pre>
     */
    public yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse create(yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PresignService provides URL presigning functionality
   * </pre>
   */
  public static final class PresignServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PresignServiceFutureStub> {
    private PresignServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresignServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create generates presigned URLs for the specified objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse> create(
        yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PresignServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PresignServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.PresignServiceOuterClass.PresignURLsResponse>) responseObserver);
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

  private static abstract class PresignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PresignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.storage.v1.PresignServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PresignService");
    }
  }

  private static final class PresignServiceFileDescriptorSupplier
      extends PresignServiceBaseDescriptorSupplier {
    PresignServiceFileDescriptorSupplier() {}
  }

  private static final class PresignServiceMethodDescriptorSupplier
      extends PresignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PresignServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PresignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PresignServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
