package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PrivateConnection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/private_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivateConnectionServiceGrpc {

  private PrivateConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.PrivateConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest.class,
      responseType = yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest, yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod;
    if ((getGetMethod = PrivateConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getGetMethod = PrivateConnectionServiceGrpc.getGetMethod) == null) {
          PrivateConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest, yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest.class,
      responseType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod;
    if ((getListMethod = PrivateConnectionServiceGrpc.getListMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getListMethod = PrivateConnectionServiceGrpc.getListMethod) == null) {
          PrivateConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PrivateConnectionServiceGrpc.getCreateMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getCreateMethod = PrivateConnectionServiceGrpc.getCreateMethod) == null) {
          PrivateConnectionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PrivateConnectionServiceGrpc.getUpdateMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getUpdateMethod = PrivateConnectionServiceGrpc.getUpdateMethod) == null) {
          PrivateConnectionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PrivateConnectionServiceGrpc.getDeleteMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getDeleteMethod = PrivateConnectionServiceGrpc.getDeleteMethod) == null) {
          PrivateConnectionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertStaticRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertStaticRoute",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertStaticRouteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertStaticRouteMethod;
    if ((getUpsertStaticRouteMethod = PrivateConnectionServiceGrpc.getUpsertStaticRouteMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getUpsertStaticRouteMethod = PrivateConnectionServiceGrpc.getUpsertStaticRouteMethod) == null) {
          PrivateConnectionServiceGrpc.getUpsertStaticRouteMethod = getUpsertStaticRouteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertStaticRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("UpsertStaticRoute"))
              .build();
        }
      }
    }
    return getUpsertStaticRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveStaticRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveStaticRoute",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveStaticRouteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveStaticRouteMethod;
    if ((getRemoveStaticRouteMethod = PrivateConnectionServiceGrpc.getRemoveStaticRouteMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getRemoveStaticRouteMethod = PrivateConnectionServiceGrpc.getRemoveStaticRouteMethod) == null) {
          PrivateConnectionServiceGrpc.getRemoveStaticRouteMethod = getRemoveStaticRouteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveStaticRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("RemoveStaticRoute"))
              .build();
        }
      }
    }
    return getRemoveStaticRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest.class,
      responseType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PrivateConnectionServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getListOperationsMethod = PrivateConnectionServiceGrpc.getListOperationsMethod) == null) {
          PrivateConnectionServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceStub>() {
        @java.lang.Override
        public PrivateConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceBlockingStub>() {
        @java.lang.Override
        public PrivateConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceFutureStub>() {
        @java.lang.Override
        public PrivateConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static abstract class PrivateConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a PrivateConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a PrivateConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upserts specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void upsertStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertStaticRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removeStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveStaticRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified PrivateConnection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
                yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpsertStaticRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPSERT_STATIC_ROUTE)))
          .addMethod(
            getRemoveStaticRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_STATIC_ROUTE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest,
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<PrivateConnectionServiceStub> {
    private PrivateConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a PrivateConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a PrivateConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upserts specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void upsertStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertStaticRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removeStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveStaticRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified PrivateConnection.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateConnectionServiceBlockingStub> {
    private PrivateConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a PrivateConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a PrivateConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upserts specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation upsertStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertStaticRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeStaticRoute(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveStaticRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified PrivateConnection.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse listOperations(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateConnectionServiceFutureStub> {
    private PrivateConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> get(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> list(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a PrivateConnection resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a PrivateConnection resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upserts specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> upsertStaticRoute(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertStaticRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes specified static routes to a PrivateConnection resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeStaticRoute(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveStaticRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified PrivateConnection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse> listOperations(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_UPSERT_STATIC_ROUTE = 5;
  private static final int METHODID_REMOVE_STATIC_ROUTE = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrivateConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.CreatePrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpdatePrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.DeletePrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPSERT_STATIC_ROUTE:
          serviceImpl.upsertStaticRoute((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.UpsertStaticRouteRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_STATIC_ROUTE:
          serviceImpl.removeStaticRoute((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.RemoveStaticRouteRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionOperationsResponse>) responseObserver);
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

  private static abstract class PrivateConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateConnectionService");
    }
  }

  private static final class PrivateConnectionServiceFileDescriptorSupplier
      extends PrivateConnectionServiceBaseDescriptorSupplier {
    PrivateConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class PrivateConnectionServiceMethodDescriptorSupplier
      extends PrivateConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpsertStaticRouteMethod())
              .addMethod(getRemoveStaticRouteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
