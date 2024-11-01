package yandex.cloud.api.cloudregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudregistry/v1/artifact_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ArtifactServiceGrpc {

  private ArtifactServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudregistry.v1.ArtifactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest,
      yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest,
      yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest, yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> getGetMethod;
    if ((getGetMethod = ArtifactServiceGrpc.getGetMethod) == null) {
      synchronized (ArtifactServiceGrpc.class) {
        if ((getGetMethod = ArtifactServiceGrpc.getGetMethod) == null) {
          ArtifactServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest, yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact.getDefaultInstance()))
              .setSchemaDescriptor(new ArtifactServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ArtifactServiceGrpc.getDeleteMethod) == null) {
      synchronized (ArtifactServiceGrpc.class) {
        if ((getDeleteMethod = ArtifactServiceGrpc.getDeleteMethod) == null) {
          ArtifactServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ArtifactServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArtifactServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceStub>() {
        @java.lang.Override
        public ArtifactServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArtifactServiceStub(channel, callOptions);
        }
      };
    return ArtifactServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArtifactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceBlockingStub>() {
        @java.lang.Override
        public ArtifactServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArtifactServiceBlockingStub(channel, callOptions);
        }
      };
    return ArtifactServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArtifactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArtifactServiceFutureStub>() {
        @java.lang.Override
        public ArtifactServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArtifactServiceFutureStub(channel, callOptions);
        }
      };
    return ArtifactServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ArtifactServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Registry artifact resource.
     * To get the list of available Registry artifact resources, make RegistryService.ListArtifacts method call.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry artifact.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest,
                yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ArtifactServiceStub extends io.grpc.stub.AbstractAsyncStub<ArtifactServiceStub> {
    private ArtifactServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArtifactServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Registry artifact resource.
     * To get the list of available Registry artifact resources, make RegistryService.ListArtifacts method call.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry artifact.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArtifactServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ArtifactServiceBlockingStub> {
    private ArtifactServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArtifactServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Registry artifact resource.
     * To get the list of available Registry artifact resources, make RegistryService.ListArtifacts method call.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact get(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified registry artifact.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArtifactServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ArtifactServiceFutureStub> {
    private ArtifactServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArtifactServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Registry artifact resource.
     * To get the list of available Registry artifact resources, make RegistryService.ListArtifacts method call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact> get(
        yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified registry artifact.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_DELETE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArtifactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArtifactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.GetArtifactRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.ArtifactOuterClass.Artifact>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.DeleteArtifactRequest) request,
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

  private static abstract class ArtifactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArtifactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cloudregistry.v1.ArtifactServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArtifactService");
    }
  }

  private static final class ArtifactServiceFileDescriptorSupplier
      extends ArtifactServiceBaseDescriptorSupplier {
    ArtifactServiceFileDescriptorSupplier() {}
  }

  private static final class ArtifactServiceMethodDescriptorSupplier
      extends ArtifactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArtifactServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArtifactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArtifactServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
