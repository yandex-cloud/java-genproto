package yandex.cloud.api.k8s.marketplace.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Helm release.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/k8s/marketplace/v1/helm_release_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelmReleaseServiceGrpc {

  private HelmReleaseServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.k8s.marketplace.v1.HelmReleaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest,
      yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest.class,
      responseType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest,
      yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest, yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> getListMethod;
    if ((getListMethod = HelmReleaseServiceGrpc.getListMethod) == null) {
      synchronized (HelmReleaseServiceGrpc.class) {
        if ((getListMethod = HelmReleaseServiceGrpc.getListMethod) == null) {
          HelmReleaseServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest, yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelmReleaseServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest,
      yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest.class,
      responseType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest,
      yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest, yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> getGetMethod;
    if ((getGetMethod = HelmReleaseServiceGrpc.getGetMethod) == null) {
      synchronized (HelmReleaseServiceGrpc.class) {
        if ((getGetMethod = HelmReleaseServiceGrpc.getGetMethod) == null) {
          HelmReleaseServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest, yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease.getDefaultInstance()))
              .setSchemaDescriptor(new HelmReleaseServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getInstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Install",
      requestType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getInstallMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getInstallMethod;
    if ((getInstallMethod = HelmReleaseServiceGrpc.getInstallMethod) == null) {
      synchronized (HelmReleaseServiceGrpc.class) {
        if ((getInstallMethod = HelmReleaseServiceGrpc.getInstallMethod) == null) {
          HelmReleaseServiceGrpc.getInstallMethod = getInstallMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Install"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HelmReleaseServiceMethodDescriptorSupplier("Install"))
              .build();
        }
      }
    }
    return getInstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = HelmReleaseServiceGrpc.getUpdateMethod) == null) {
      synchronized (HelmReleaseServiceGrpc.class) {
        if ((getUpdateMethod = HelmReleaseServiceGrpc.getUpdateMethod) == null) {
          HelmReleaseServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HelmReleaseServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUninstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Uninstall",
      requestType = yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUninstallMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUninstallMethod;
    if ((getUninstallMethod = HelmReleaseServiceGrpc.getUninstallMethod) == null) {
      synchronized (HelmReleaseServiceGrpc.class) {
        if ((getUninstallMethod = HelmReleaseServiceGrpc.getUninstallMethod) == null) {
          HelmReleaseServiceGrpc.getUninstallMethod = getUninstallMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Uninstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HelmReleaseServiceMethodDescriptorSupplier("Uninstall"))
              .build();
        }
      }
    }
    return getUninstallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelmReleaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceStub>() {
        @java.lang.Override
        public HelmReleaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelmReleaseServiceStub(channel, callOptions);
        }
      };
    return HelmReleaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelmReleaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceBlockingStub>() {
        @java.lang.Override
        public HelmReleaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelmReleaseServiceBlockingStub(channel, callOptions);
        }
      };
    return HelmReleaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelmReleaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelmReleaseServiceFutureStub>() {
        @java.lang.Override
        public HelmReleaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelmReleaseServiceFutureStub(channel, callOptions);
        }
      };
    return HelmReleaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Helm release.
   * </pre>
   */
  public static abstract class HelmReleaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of Helm releases in the specified Kubernetes Cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Helm release.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Installs helm release into specified Kubernetes Cluster.
     * </pre>
     */
    public void install(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates helm release.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uninstalls helm release.
     * </pre>
     */
    public void uninstall(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUninstallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest,
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest,
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease>(
                  this, METHODID_GET)))
          .addMethod(
            getInstallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_INSTALL)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUninstallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UNINSTALL)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Helm release.
   * </pre>
   */
  public static final class HelmReleaseServiceStub extends io.grpc.stub.AbstractAsyncStub<HelmReleaseServiceStub> {
    private HelmReleaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelmReleaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelmReleaseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Helm releases in the specified Kubernetes Cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Helm release.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Installs helm release into specified Kubernetes Cluster.
     * </pre>
     */
    public void install(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates helm release.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uninstalls helm release.
     * </pre>
     */
    public void uninstall(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUninstallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Helm release.
   * </pre>
   */
  public static final class HelmReleaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelmReleaseServiceBlockingStub> {
    private HelmReleaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelmReleaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelmReleaseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Helm releases in the specified Kubernetes Cluster.
     * </pre>
     */
    public yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse list(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified Helm release.
     * </pre>
     */
    public yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease get(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Installs helm release into specified Kubernetes Cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation install(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates helm release.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uninstalls helm release.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation uninstall(yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUninstallMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Helm release.
   * </pre>
   */
  public static final class HelmReleaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelmReleaseServiceFutureStub> {
    private HelmReleaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelmReleaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelmReleaseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Helm releases in the specified Kubernetes Cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse> list(
        yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified Helm release.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease> get(
        yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Installs helm release into specified Kubernetes Cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> install(
        yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates helm release.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uninstalls helm release.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> uninstall(
        yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUninstallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_INSTALL = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_UNINSTALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelmReleaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelmReleaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.ListHelmReleasesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.GetHelmReleaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.marketplace.v1.HelmReleaseOuterClass.HelmRelease>) responseObserver);
          break;
        case METHODID_INSTALL:
          serviceImpl.install((yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.InstallHelmReleaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UpdateHelmReleaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UNINSTALL:
          serviceImpl.uninstall((yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.UninstallHelmReleaseRequest) request,
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

  private static abstract class HelmReleaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelmReleaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.k8s.marketplace.v1.HelmReleaseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelmReleaseService");
    }
  }

  private static final class HelmReleaseServiceFileDescriptorSupplier
      extends HelmReleaseServiceBaseDescriptorSupplier {
    HelmReleaseServiceFileDescriptorSupplier() {}
  }

  private static final class HelmReleaseServiceMethodDescriptorSupplier
      extends HelmReleaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelmReleaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelmReleaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelmReleaseServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getInstallMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getUninstallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
