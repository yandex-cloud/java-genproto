package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing TrunkConnection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/trunk_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrunkConnectionServiceGrpc {

  private TrunkConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.TrunkConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest.class,
      responseType = yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest, yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod;
    if ((getGetMethod = TrunkConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getGetMethod = TrunkConnectionServiceGrpc.getGetMethod) == null) {
          TrunkConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest, yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest.class,
      responseType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod;
    if ((getListMethod = TrunkConnectionServiceGrpc.getListMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getListMethod = TrunkConnectionServiceGrpc.getListMethod) == null) {
          TrunkConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TrunkConnectionServiceGrpc.getCreateMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getCreateMethod = TrunkConnectionServiceGrpc.getCreateMethod) == null) {
          TrunkConnectionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TrunkConnectionServiceGrpc.getUpdateMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getUpdateMethod = TrunkConnectionServiceGrpc.getUpdateMethod) == null) {
          TrunkConnectionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TrunkConnectionServiceGrpc.getDeleteMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getDeleteMethod = TrunkConnectionServiceGrpc.getDeleteMethod) == null) {
          TrunkConnectionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest.class,
      responseType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = TrunkConnectionServiceGrpc.getListOperationsMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getListOperationsMethod = TrunkConnectionServiceGrpc.getListOperationsMethod) == null) {
          TrunkConnectionServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrunkConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceStub>() {
        @java.lang.Override
        public TrunkConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrunkConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceBlockingStub>() {
        @java.lang.Override
        public TrunkConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrunkConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceFutureStub>() {
        @java.lang.Override
        public TrunkConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static abstract class TrunkConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a TrunkConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a TrunkConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a TrunkConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified TrunkConnection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
                yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest,
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<TrunkConnectionServiceStub> {
    private TrunkConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a TrunkConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a TrunkConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a TrunkConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified TrunkConnection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrunkConnectionServiceBlockingStub> {
    private TrunkConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a TrunkConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a TrunkConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a TrunkConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified TrunkConnection.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse listOperations(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrunkConnectionServiceFutureStub> {
    private TrunkConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> get(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> list(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a TrunkConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a TrunkConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a TrunkConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified TrunkConnection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse> listOperations(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrunkConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrunkConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.CreateTrunkConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.UpdateTrunkConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.DeleteTrunkConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionOperationsResponse>) responseObserver);
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

  private static abstract class TrunkConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrunkConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrunkConnectionService");
    }
  }

  private static final class TrunkConnectionServiceFileDescriptorSupplier
      extends TrunkConnectionServiceBaseDescriptorSupplier {
    TrunkConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class TrunkConnectionServiceMethodDescriptorSupplier
      extends TrunkConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrunkConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrunkConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrunkConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
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
