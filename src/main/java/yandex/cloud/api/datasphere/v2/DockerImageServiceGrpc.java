package yandex.cloud.api.datasphere.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Docker Images.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v2/docker_image_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DockerImageServiceGrpc {

  private DockerImageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v2.DockerImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = DockerImageServiceGrpc.getActivateMethod) == null) {
      synchronized (DockerImageServiceGrpc.class) {
        if ((getActivateMethod = DockerImageServiceGrpc.getActivateMethod) == null) {
          DockerImageServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DockerImageServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DockerImageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceStub>() {
        @java.lang.Override
        public DockerImageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DockerImageServiceStub(channel, callOptions);
        }
      };
    return DockerImageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DockerImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceBlockingStub>() {
        @java.lang.Override
        public DockerImageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DockerImageServiceBlockingStub(channel, callOptions);
        }
      };
    return DockerImageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DockerImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DockerImageServiceFutureStub>() {
        @java.lang.Override
        public DockerImageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DockerImageServiceFutureStub(channel, callOptions);
        }
      };
    return DockerImageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Docker Images.
   * </pre>
   */
  public static abstract class DockerImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Activates shared docker image in project
     * </pre>
     */
    public void activate(yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Docker Images.
   * </pre>
   */
  public static final class DockerImageServiceStub extends io.grpc.stub.AbstractAsyncStub<DockerImageServiceStub> {
    private DockerImageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DockerImageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DockerImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared docker image in project
     * </pre>
     */
    public void activate(yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Docker Images.
   * </pre>
   */
  public static final class DockerImageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DockerImageServiceBlockingStub> {
    private DockerImageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DockerImageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DockerImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared docker image in project
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Docker Images.
   * </pre>
   */
  public static final class DockerImageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DockerImageServiceFutureStub> {
    private DockerImageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DockerImageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DockerImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared docker image in project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DockerImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DockerImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.ActivateDockerImageRequest) request,
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

  private static abstract class DockerImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DockerImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v2.DockerImageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DockerImageService");
    }
  }

  private static final class DockerImageServiceFileDescriptorSupplier
      extends DockerImageServiceBaseDescriptorSupplier {
    DockerImageServiceFileDescriptorSupplier() {}
  }

  private static final class DockerImageServiceMethodDescriptorSupplier
      extends DockerImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DockerImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DockerImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DockerImageServiceFileDescriptorSupplier())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
