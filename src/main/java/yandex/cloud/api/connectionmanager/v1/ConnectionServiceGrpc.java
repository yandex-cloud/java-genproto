package yandex.cloud.api.connectionmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Connection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/connectionmanager/v1/connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectionServiceGrpc {

  private ConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.connectionmanager.v1.ConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest.class,
      responseType = yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest, yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getGetMethod;
    if ((getGetMethod = ConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetMethod = ConnectionServiceGrpc.getGetMethod) == null) {
          ConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest, yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getResolveClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveCluster",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest.class,
      responseType = yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getResolveClusterMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest, yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> getResolveClusterMethod;
    if ((getResolveClusterMethod = ConnectionServiceGrpc.getResolveClusterMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getResolveClusterMethod = ConnectionServiceGrpc.getResolveClusterMethod) == null) {
          ConnectionServiceGrpc.getResolveClusterMethod = getResolveClusterMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest, yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ResolveCluster"))
              .build();
        }
      }
    }
    return getResolveClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest.class,
      responseType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest, yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> getListMethod;
    if ((getListMethod = ConnectionServiceGrpc.getListMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListMethod = ConnectionServiceGrpc.getListMethod) == null) {
          ConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest, yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ConnectionServiceGrpc.getCreateMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getCreateMethod = ConnectionServiceGrpc.getCreateMethod) == null) {
          ConnectionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ConnectionServiceGrpc.getUpdateMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getUpdateMethod = ConnectionServiceGrpc.getUpdateMethod) == null) {
          ConnectionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ConnectionServiceGrpc.getDeleteMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDeleteMethod = ConnectionServiceGrpc.getDeleteMethod) == null) {
          ConnectionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest.class,
      responseType = yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest, yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ConnectionServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListOperationsMethod = ConnectionServiceGrpc.getListOperationsMethod) == null) {
          ConnectionServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest, yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub>() {
        @java.lang.Override
        public ConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceStub(channel, callOptions);
        }
      };
    return ConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub>() {
        @java.lang.Override
        public ConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub>() {
        @java.lang.Override
        public ConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Connection resources.
   * </pre>
   */
  public static abstract class ConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns connection.
     * </pre>
     */
    public void get(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the connection with the resolved cluster; that is,
     * * for connections to the on-premise clusters is identical to the Get RPC;
     * * for connections to the managed clusters, resolves the cluster topology
     *   and returns it in the `on_premise` field of the connection parameters.
     * Requires `connection-manager.connections.resolveCluster` permission.
     * </pre>
     */
    public void resolveCluster(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveClusterMethod(), responseObserver);
    }

    /**
     * <pre>
     * List connections in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates connection.
     * </pre>
     */
    public void create(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates specified connection.
     * </pre>
     */
    public void update(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specified connection.
     * </pre>
     */
    public void delete(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified connection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest,
                yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>(
                  this, METHODID_GET)))
          .addMethod(
            getResolveClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest,
                yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>(
                  this, METHODID_RESOLVE_CLUSTER)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest,
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest,
                yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Connection resources.
   * </pre>
   */
  public static final class ConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<ConnectionServiceStub> {
    private ConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns connection.
     * </pre>
     */
    public void get(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the connection with the resolved cluster; that is,
     * * for connections to the on-premise clusters is identical to the Get RPC;
     * * for connections to the managed clusters, resolves the cluster topology
     *   and returns it in the `on_premise` field of the connection parameters.
     * Requires `connection-manager.connections.resolveCluster` permission.
     * </pre>
     */
    public void resolveCluster(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List connections in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates connection.
     * </pre>
     */
    public void create(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates specified connection.
     * </pre>
     */
    public void update(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specified connection.
     * </pre>
     */
    public void delete(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified connection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Connection resources.
   * </pre>
   */
  public static final class ConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConnectionServiceBlockingStub> {
    private ConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns connection.
     * </pre>
     */
    public yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection get(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the connection with the resolved cluster; that is,
     * * for connections to the on-premise clusters is identical to the Get RPC;
     * * for connections to the managed clusters, resolves the cluster topology
     *   and returns it in the `on_premise` field of the connection parameters.
     * Requires `connection-manager.connections.resolveCluster` permission.
     * </pre>
     */
    public yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection resolveCluster(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveClusterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List connections in specified folder.
     * </pre>
     */
    public yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse list(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates connection.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates specified connection.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specified connection.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified connection.
     * </pre>
     */
    public yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse listOperations(yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Connection resources.
   * </pre>
   */
  public static final class ConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConnectionServiceFutureStub> {
    private ConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> get(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the connection with the resolved cluster; that is,
     * * for connections to the on-premise clusters is identical to the Get RPC;
     * * for connections to the managed clusters, resolves the cluster topology
     *   and returns it in the `on_premise` field of the connection parameters.
     * Requires `connection-manager.connections.resolveCluster` permission.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection> resolveCluster(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveClusterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List connections in specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse> list(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates specified connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specified connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse> listOperations(
        yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_RESOLVE_CLUSTER = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.GetConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>) responseObserver);
          break;
        case METHODID_RESOLVE_CLUSTER:
          serviceImpl.resolveCluster((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ResolveClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionOuterClass.Connection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListConnectionResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.CreateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.UpdateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.DeleteConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.ListOperationsResponse>) responseObserver);
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

  private static abstract class ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.connectionmanager.v1.ConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectionService");
    }
  }

  private static final class ConnectionServiceFileDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier {
    ConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectionServiceMethodDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getResolveClusterMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
