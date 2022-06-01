package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing RouteTable resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/route_table_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RouteTableServiceGrpc {

  private RouteTableServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.RouteTableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest,
      yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest.class,
      responseType = yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest,
      yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest, yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> getGetMethod;
    if ((getGetMethod = RouteTableServiceGrpc.getGetMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getGetMethod = RouteTableServiceGrpc.getGetMethod) == null) {
          RouteTableServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest, yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest,
      yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest.class,
      responseType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest,
      yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest, yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> getListMethod;
    if ((getListMethod = RouteTableServiceGrpc.getListMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getListMethod = RouteTableServiceGrpc.getListMethod) == null) {
          RouteTableServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest, yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RouteTableServiceGrpc.getCreateMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getCreateMethod = RouteTableServiceGrpc.getCreateMethod) == null) {
          RouteTableServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RouteTableServiceGrpc.getUpdateMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getUpdateMethod = RouteTableServiceGrpc.getUpdateMethod) == null) {
          RouteTableServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RouteTableServiceGrpc.getDeleteMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getDeleteMethod = RouteTableServiceGrpc.getDeleteMethod) == null) {
          RouteTableServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest,
      yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest,
      yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest, yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = RouteTableServiceGrpc.getListOperationsMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getListOperationsMethod = RouteTableServiceGrpc.getListOperationsMethod) == null) {
          RouteTableServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest, yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = RouteTableServiceGrpc.getMoveMethod) == null) {
      synchronized (RouteTableServiceGrpc.class) {
        if ((getMoveMethod = RouteTableServiceGrpc.getMoveMethod) == null) {
          RouteTableServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RouteTableServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteTableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceStub>() {
        @java.lang.Override
        public RouteTableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteTableServiceStub(channel, callOptions);
        }
      };
    return RouteTableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteTableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceBlockingStub>() {
        @java.lang.Override
        public RouteTableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteTableServiceBlockingStub(channel, callOptions);
        }
      };
    return RouteTableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteTableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteTableServiceFutureStub>() {
        @java.lang.Override
        public RouteTableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteTableServiceFutureStub(channel, callOptions);
        }
      };
    return RouteTableServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing RouteTable resources.
   * </pre>
   */
  public static abstract class RouteTableServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified RouteTable resource.
     * To get the list of available RouteTable resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RouteTable resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a route table in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified route table.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified route table.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified route table.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move route table to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest,
                yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest,
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest,
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing RouteTable resources.
   * </pre>
   */
  public static final class RouteTableServiceStub extends io.grpc.stub.AbstractAsyncStub<RouteTableServiceStub> {
    private RouteTableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteTableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteTableServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RouteTable resource.
     * To get the list of available RouteTable resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RouteTable resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a route table in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified route table.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified route table.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified route table.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move route table to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RouteTable resources.
   * </pre>
   */
  public static final class RouteTableServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteTableServiceBlockingStub> {
    private RouteTableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteTableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteTableServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RouteTable resource.
     * To get the list of available RouteTable resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable get(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of RouteTable resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse list(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a route table in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified route table.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified route table.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified route table.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse listOperations(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move route table to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RouteTable resources.
   * </pre>
   */
  public static final class RouteTableServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RouteTableServiceFutureStub> {
    private RouteTableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteTableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteTableServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RouteTable resource.
     * To get the list of available RouteTable resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable> get(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of RouteTable resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse> list(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a route table in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified route table.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified route table.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified route table.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move route table to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_MOVE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteTableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteTableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.GetRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableOuterClass.RouteTable>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTablesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.CreateRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.UpdateRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.DeleteRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.ListRouteTableOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.MoveRouteTableRequest) request,
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

  private static abstract class RouteTableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteTableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.RouteTableServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteTableService");
    }
  }

  private static final class RouteTableServiceFileDescriptorSupplier
      extends RouteTableServiceBaseDescriptorSupplier {
    RouteTableServiceFileDescriptorSupplier() {}
  }

  private static final class RouteTableServiceMethodDescriptorSupplier
      extends RouteTableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteTableServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouteTableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteTableServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
