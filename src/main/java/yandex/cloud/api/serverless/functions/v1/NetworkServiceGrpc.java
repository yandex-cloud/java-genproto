package yandex.cloud.api.serverless.functions.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing VPC networks connected to serverless resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/functions/v1/network_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetworkServiceGrpc {

  private NetworkServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.functions.v1.NetworkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> getGetUsedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsed",
      requestType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> getGetUsedMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> getGetUsedMethod;
    if ((getGetUsedMethod = NetworkServiceGrpc.getGetUsedMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetUsedMethod = NetworkServiceGrpc.getGetUsedMethod) == null) {
          NetworkServiceGrpc.getGetUsedMethod = getGetUsedMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("GetUsed"))
              .build();
        }
      }
    }
    return getGetUsedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> getListUsedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsed",
      requestType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> getListUsedMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> getListUsedMethod;
    if ((getListUsedMethod = NetworkServiceGrpc.getListUsedMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListUsedMethod = NetworkServiceGrpc.getListUsedMethod) == null) {
          NetworkServiceGrpc.getListUsedMethod = getListUsedMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListUsed"))
              .build();
        }
      }
    }
    return getListUsedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> getListConnectedResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConnectedResources",
      requestType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> getListConnectedResourcesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> getListConnectedResourcesMethod;
    if ((getListConnectedResourcesMethod = NetworkServiceGrpc.getListConnectedResourcesMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListConnectedResourcesMethod = NetworkServiceGrpc.getListConnectedResourcesMethod) == null) {
          NetworkServiceGrpc.getListConnectedResourcesMethod = getListConnectedResourcesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConnectedResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListConnectedResources"))
              .build();
        }
      }
    }
    return getListConnectedResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> getTriggerUsedCleanupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerUsedCleanup",
      requestType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest,
      yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> getTriggerUsedCleanupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> getTriggerUsedCleanupMethod;
    if ((getTriggerUsedCleanupMethod = NetworkServiceGrpc.getTriggerUsedCleanupMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getTriggerUsedCleanupMethod = NetworkServiceGrpc.getTriggerUsedCleanupMethod) == null) {
          NetworkServiceGrpc.getTriggerUsedCleanupMethod = getTriggerUsedCleanupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest, yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerUsedCleanup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("TriggerUsedCleanup"))
              .build();
        }
      }
    }
    return getTriggerUsedCleanupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceStub>() {
        @java.lang.Override
        public NetworkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceStub(channel, callOptions);
        }
      };
    return NetworkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceBlockingStub>() {
        @java.lang.Override
        public NetworkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceBlockingStub(channel, callOptions);
        }
      };
    return NetworkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceFutureStub>() {
        @java.lang.Override
        public NetworkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceFutureStub(channel, callOptions);
        }
      };
    return NetworkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing VPC networks connected to serverless resources.
   * </pre>
   */
  public static abstract class NetworkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified network used in serverless resources.
     * </pre>
     */
    public void getUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of networks in the specified scope that are used in serverless resources.
     * </pre>
     */
    public void listUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of serverless resources connected to any network from the specified scope.
     * </pre>
     */
    public void listConnectedResources(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConnectedResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Forces obsolete used network to start cleanup process as soon as possible.
     * Invocation does not wait for start or end of the cleanup process.
     * Second invocation with the same network does nothing until network is completely cleaned-up.
     * </pre>
     */
    public void triggerUsedCleanup(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerUsedCleanupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUsedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest,
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork>(
                  this, METHODID_GET_USED)))
          .addMethod(
            getListUsedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest,
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse>(
                  this, METHODID_LIST_USED)))
          .addMethod(
            getListConnectedResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest,
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse>(
                  this, METHODID_LIST_CONNECTED_RESOURCES)))
          .addMethod(
            getTriggerUsedCleanupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest,
                yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse>(
                  this, METHODID_TRIGGER_USED_CLEANUP)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing VPC networks connected to serverless resources.
   * </pre>
   */
  public static final class NetworkServiceStub extends io.grpc.stub.AbstractAsyncStub<NetworkServiceStub> {
    private NetworkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified network used in serverless resources.
     * </pre>
     */
    public void getUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of networks in the specified scope that are used in serverless resources.
     * </pre>
     */
    public void listUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of serverless resources connected to any network from the specified scope.
     * </pre>
     */
    public void listConnectedResources(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConnectedResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Forces obsolete used network to start cleanup process as soon as possible.
     * Invocation does not wait for start or end of the cleanup process.
     * Second invocation with the same network does nothing until network is completely cleaned-up.
     * </pre>
     */
    public void triggerUsedCleanup(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerUsedCleanupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing VPC networks connected to serverless resources.
   * </pre>
   */
  public static final class NetworkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkServiceBlockingStub> {
    private NetworkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified network used in serverless resources.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork getUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of networks in the specified scope that are used in serverless resources.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse listUsed(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of serverless resources connected to any network from the specified scope.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse listConnectedResources(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConnectedResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Forces obsolete used network to start cleanup process as soon as possible.
     * Invocation does not wait for start or end of the cleanup process.
     * Second invocation with the same network does nothing until network is completely cleaned-up.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse triggerUsedCleanup(yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerUsedCleanupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing VPC networks connected to serverless resources.
   * </pre>
   */
  public static final class NetworkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkServiceFutureStub> {
    private NetworkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified network used in serverless resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork> getUsed(
        yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of networks in the specified scope that are used in serverless resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse> listUsed(
        yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of serverless resources connected to any network from the specified scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse> listConnectedResources(
        yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConnectedResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Forces obsolete used network to start cleanup process as soon as possible.
     * Invocation does not wait for start or end of the cleanup process.
     * Second invocation with the same network does nothing until network is completely cleaned-up.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse> triggerUsedCleanup(
        yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerUsedCleanupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USED = 0;
  private static final int METHODID_LIST_USED = 1;
  private static final int METHODID_LIST_CONNECTED_RESOURCES = 2;
  private static final int METHODID_TRIGGER_USED_CLEANUP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USED:
          serviceImpl.getUsed((yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.GetUsedNetworkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.UsedNetwork>) responseObserver);
          break;
        case METHODID_LIST_USED:
          serviceImpl.listUsed((yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListUsedNetworksResponse>) responseObserver);
          break;
        case METHODID_LIST_CONNECTED_RESOURCES:
          serviceImpl.listConnectedResources((yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.ListConnectedResourcesResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_USED_CLEANUP:
          serviceImpl.triggerUsedCleanup((yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.TriggerUsedNetworkCleanupResponse>) responseObserver);
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

  private static abstract class NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.functions.v1.NetworkServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkService");
    }
  }

  private static final class NetworkServiceFileDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier {
    NetworkServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkServiceMethodDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkServiceFileDescriptorSupplier())
              .addMethod(getGetUsedMethod())
              .addMethod(getListUsedMethod())
              .addMethod(getListConnectedResourcesMethod())
              .addMethod(getTriggerUsedCleanupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
