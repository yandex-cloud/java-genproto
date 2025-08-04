package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Private cloud connection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/private_cloud_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivateCloudConnectionServiceGrpc {

  private PrivateCloudConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.PrivateCloudConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest, yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> getGetMethod;
    if ((getGetMethod = PrivateCloudConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        if ((getGetMethod = PrivateCloudConnectionServiceGrpc.getGetMethod) == null) {
          PrivateCloudConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest, yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateCloudConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest, yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> getListMethod;
    if ((getListMethod = PrivateCloudConnectionServiceGrpc.getListMethod) == null) {
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        if ((getListMethod = PrivateCloudConnectionServiceGrpc.getListMethod) == null) {
          PrivateCloudConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest, yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateCloudConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PrivateCloudConnectionServiceGrpc.getCreateMethod) == null) {
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        if ((getCreateMethod = PrivateCloudConnectionServiceGrpc.getCreateMethod) == null) {
          PrivateCloudConnectionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateCloudConnectionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PrivateCloudConnectionServiceGrpc.getUpdateMethod) == null) {
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        if ((getUpdateMethod = PrivateCloudConnectionServiceGrpc.getUpdateMethod) == null) {
          PrivateCloudConnectionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateCloudConnectionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PrivateCloudConnectionServiceGrpc.getDeleteMethod) == null) {
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        if ((getDeleteMethod = PrivateCloudConnectionServiceGrpc.getDeleteMethod) == null) {
          PrivateCloudConnectionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateCloudConnectionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateCloudConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceStub>() {
        @java.lang.Override
        public PrivateCloudConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateCloudConnectionServiceStub(channel, callOptions);
        }
      };
    return PrivateCloudConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateCloudConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceBlockingStub>() {
        @java.lang.Override
        public PrivateCloudConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateCloudConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return PrivateCloudConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateCloudConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateCloudConnectionServiceFutureStub>() {
        @java.lang.Override
        public PrivateCloudConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateCloudConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return PrivateCloudConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Private cloud connection resources.
   * </pre>
   */
  public static abstract class PrivateCloudConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific Private cloud connection resource.
     * To get the list of available Private cloud connection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Private cloud connection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a private cloud connection in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the routing_instance_id in a private cloud connection.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a private cloud connection and all allocated network resouces
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest,
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest,
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Private cloud connection resources.
   * </pre>
   */
  public static final class PrivateCloudConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<PrivateCloudConnectionServiceStub> {
    private PrivateCloudConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateCloudConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateCloudConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Private cloud connection resource.
     * To get the list of available Private cloud connection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Private cloud connection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a private cloud connection in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the routing_instance_id in a private cloud connection.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a private cloud connection and all allocated network resouces
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Private cloud connection resources.
   * </pre>
   */
  public static final class PrivateCloudConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateCloudConnectionServiceBlockingStub> {
    private PrivateCloudConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateCloudConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateCloudConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Private cloud connection resource.
     * To get the list of available Private cloud connection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection get(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Private cloud connection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse list(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a private cloud connection in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the routing_instance_id in a private cloud connection.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a private cloud connection and all allocated network resouces
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Private cloud connection resources.
   * </pre>
   */
  public static final class PrivateCloudConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateCloudConnectionServiceFutureStub> {
    private PrivateCloudConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateCloudConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateCloudConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Private cloud connection resource.
     * To get the list of available Private cloud connection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection> get(
        yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Private cloud connection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse> list(
        yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a private cloud connection in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the routing_instance_id in a private cloud connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a private cloud connection and all allocated network resouces
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrivateCloudConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateCloudConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.GetPrivateCloudConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionOuterClass.PrivateCloudConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.ListPrivateCloudConnectionResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.CreatePrivateCloudConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.UpdatePrivateCloudConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.DeletePrivateCloudConnectionRequest) request,
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

  private static abstract class PrivateCloudConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateCloudConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.PrivateCloudConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateCloudConnectionService");
    }
  }

  private static final class PrivateCloudConnectionServiceFileDescriptorSupplier
      extends PrivateCloudConnectionServiceBaseDescriptorSupplier {
    PrivateCloudConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class PrivateCloudConnectionServiceMethodDescriptorSupplier
      extends PrivateCloudConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateCloudConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateCloudConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateCloudConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
