package yandex.cloud.api.cloudrouter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing RoutingInstance resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudrouter/v1/routing_instance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoutingInstanceServiceGrpc {

  private RoutingInstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudrouter.v1.RoutingInstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod;
    if ((getGetMethod = RoutingInstanceServiceGrpc.getGetMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetMethod = RoutingInstanceServiceGrpc.getGetMethod) == null) {
          RoutingInstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByVpcNetworkId",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod;
    if ((getGetByVpcNetworkIdMethod = RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetByVpcNetworkIdMethod = RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod) == null) {
          RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod = getGetByVpcNetworkIdMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByVpcNetworkId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("GetByVpcNetworkId"))
              .build();
        }
      }
    }
    return getGetByVpcNetworkIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByCicPrivateConnectionId",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod;
    if ((getGetByCicPrivateConnectionIdMethod = RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetByCicPrivateConnectionIdMethod = RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod) == null) {
          RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod = getGetByCicPrivateConnectionIdMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByCicPrivateConnectionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("GetByCicPrivateConnectionId"))
              .build();
        }
      }
    }
    return getGetByCicPrivateConnectionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod;
    if ((getListMethod = RoutingInstanceServiceGrpc.getListMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getListMethod = RoutingInstanceServiceGrpc.getListMethod) == null) {
          RoutingInstanceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoutingInstanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceStub>() {
        @java.lang.Override
        public RoutingInstanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoutingInstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceBlockingStub>() {
        @java.lang.Override
        public RoutingInstanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceBlockingStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoutingInstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceFutureStub>() {
        @java.lang.Override
        public RoutingInstanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceFutureStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static abstract class RoutingInstanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByVpcNetworkIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByCicPrivateConnectionIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByVpcNetworkIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET_BY_VPC_NETWORK_ID)))
          .addMethod(
            getGetByCicPrivateConnectionIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceStub extends io.grpc.stub.AbstractAsyncStub<RoutingInstanceServiceStub> {
    private RoutingInstanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByVpcNetworkIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByCicPrivateConnectionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoutingInstanceServiceBlockingStub> {
    private RoutingInstanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByVpcNetworkIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByCicPrivateConnectionIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoutingInstanceServiceFutureStub> {
    private RoutingInstanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> get(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getByVpcNetworkId(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByVpcNetworkIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getByCicPrivateConnectionId(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByCicPrivateConnectionIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> list(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_VPC_NETWORK_ID = 1;
  private static final int METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoutingInstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoutingInstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_GET_BY_VPC_NETWORK_ID:
          serviceImpl.getByVpcNetworkId((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID:
          serviceImpl.getByCicPrivateConnectionId((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>) responseObserver);
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

  private static abstract class RoutingInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoutingInstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoutingInstanceService");
    }
  }

  private static final class RoutingInstanceServiceFileDescriptorSupplier
      extends RoutingInstanceServiceBaseDescriptorSupplier {
    RoutingInstanceServiceFileDescriptorSupplier() {}
  }

  private static final class RoutingInstanceServiceMethodDescriptorSupplier
      extends RoutingInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoutingInstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoutingInstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoutingInstanceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByVpcNetworkIdMethod())
              .addMethod(getGetByCicPrivateConnectionIdMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
