package yandex.cloud.api.cloudapps.workload.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Cloud Application Service to be used by Workload software inside Cloud Application installations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudapps/workload/v1/cloud_application_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudApplicationServiceGrpc {

  private CloudApplicationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudapps.workload.v1.CloudApplicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.google.protobuf.Empty.class,
      responseType = yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> getGetMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> getGetMethod;
    if ((getGetMethod = CloudApplicationServiceGrpc.getGetMethod) == null) {
      synchronized (CloudApplicationServiceGrpc.class) {
        if ((getGetMethod = CloudApplicationServiceGrpc.getGetMethod) == null) {
          CloudApplicationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication.getDefaultInstance()))
              .setSchemaDescriptor(new CloudApplicationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest,
      yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> getResolveByWorkloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveByWorkload",
      requestType = yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest.class,
      responseType = yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest,
      yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> getResolveByWorkloadMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest, yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> getResolveByWorkloadMethod;
    if ((getResolveByWorkloadMethod = CloudApplicationServiceGrpc.getResolveByWorkloadMethod) == null) {
      synchronized (CloudApplicationServiceGrpc.class) {
        if ((getResolveByWorkloadMethod = CloudApplicationServiceGrpc.getResolveByWorkloadMethod) == null) {
          CloudApplicationServiceGrpc.getResolveByWorkloadMethod = getResolveByWorkloadMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest, yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveByWorkload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudApplicationServiceMethodDescriptorSupplier("ResolveByWorkload"))
              .build();
        }
      }
    }
    return getResolveByWorkloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudApplicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceStub>() {
        @java.lang.Override
        public CloudApplicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudApplicationServiceStub(channel, callOptions);
        }
      };
    return CloudApplicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudApplicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceBlockingStub>() {
        @java.lang.Override
        public CloudApplicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudApplicationServiceBlockingStub(channel, callOptions);
        }
      };
    return CloudApplicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CloudApplicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudApplicationServiceFutureStub>() {
        @java.lang.Override
        public CloudApplicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudApplicationServiceFutureStub(channel, callOptions);
        }
      };
    return CloudApplicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Cloud Application Service to be used by Workload software inside Cloud Application installations
   * </pre>
   */
  public static abstract class CloudApplicationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get Current Application
     * </pre>
     */
    public void get(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resolve Cloud Application by workload
     * </pre>
     */
    public void resolveByWorkload(yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveByWorkloadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication>(
                  this, METHODID_GET)))
          .addMethod(
            getResolveByWorkloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest,
                yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse>(
                  this, METHODID_RESOLVE_BY_WORKLOAD)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud Application Service to be used by Workload software inside Cloud Application installations
   * </pre>
   */
  public static final class CloudApplicationServiceStub extends io.grpc.stub.AbstractAsyncStub<CloudApplicationServiceStub> {
    private CloudApplicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudApplicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudApplicationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get Current Application
     * </pre>
     */
    public void get(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resolve Cloud Application by workload
     * </pre>
     */
    public void resolveByWorkload(yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveByWorkloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud Application Service to be used by Workload software inside Cloud Application installations
   * </pre>
   */
  public static final class CloudApplicationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CloudApplicationServiceBlockingStub> {
    private CloudApplicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudApplicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudApplicationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get Current Application
     * </pre>
     */
    public yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication get(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resolve Cloud Application by workload
     * </pre>
     */
    public yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse resolveByWorkload(yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveByWorkloadMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Application Service to be used by Workload software inside Cloud Application installations
   * </pre>
   */
  public static final class CloudApplicationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CloudApplicationServiceFutureStub> {
    private CloudApplicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudApplicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudApplicationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get Current Application
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication> get(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resolve Cloud Application by workload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse> resolveByWorkload(
        yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveByWorkloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_RESOLVE_BY_WORKLOAD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudApplicationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudApplicationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationOuterClass.CloudApplication>) responseObserver);
          break;
        case METHODID_RESOLVE_BY_WORKLOAD:
          serviceImpl.resolveByWorkload((yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.ResolveByWorkloadResponse>) responseObserver);
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

  private static abstract class CloudApplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudApplicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cloudapps.workload.v1.CloudApplicationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudApplicationService");
    }
  }

  private static final class CloudApplicationServiceFileDescriptorSupplier
      extends CloudApplicationServiceBaseDescriptorSupplier {
    CloudApplicationServiceFileDescriptorSupplier() {}
  }

  private static final class CloudApplicationServiceMethodDescriptorSupplier
      extends CloudApplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudApplicationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CloudApplicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CloudApplicationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getResolveByWorkloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
