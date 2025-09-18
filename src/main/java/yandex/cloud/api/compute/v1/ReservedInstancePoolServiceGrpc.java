package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing reserved instance pool resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/reserved_instance_pool_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservedInstancePoolServiceGrpc {

  private ReservedInstancePoolServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.ReservedInstancePoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest.class,
      responseType = yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> getGetMethod;
    if ((getGetMethod = ReservedInstancePoolServiceGrpc.getGetMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getGetMethod = ReservedInstancePoolServiceGrpc.getGetMethod) == null) {
          ReservedInstancePoolServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest.class,
      responseType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> getListMethod;
    if ((getListMethod = ReservedInstancePoolServiceGrpc.getListMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getListMethod = ReservedInstancePoolServiceGrpc.getListMethod) == null) {
          ReservedInstancePoolServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ReservedInstancePoolServiceGrpc.getCreateMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getCreateMethod = ReservedInstancePoolServiceGrpc.getCreateMethod) == null) {
          ReservedInstancePoolServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ReservedInstancePoolServiceGrpc.getUpdateMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getUpdateMethod = ReservedInstancePoolServiceGrpc.getUpdateMethod) == null) {
          ReservedInstancePoolServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ReservedInstancePoolServiceGrpc.getDeleteMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getDeleteMethod = ReservedInstancePoolServiceGrpc.getDeleteMethod) == null) {
          ReservedInstancePoolServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ReservedInstancePoolServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getListOperationsMethod = ReservedInstancePoolServiceGrpc.getListOperationsMethod) == null) {
          ReservedInstancePoolServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest,
      yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = ReservedInstancePoolServiceGrpc.getListInstancesMethod) == null) {
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        if ((getListInstancesMethod = ReservedInstancePoolServiceGrpc.getListInstancesMethod) == null) {
          ReservedInstancePoolServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest, yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservedInstancePoolServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservedInstancePoolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceStub>() {
        @java.lang.Override
        public ReservedInstancePoolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservedInstancePoolServiceStub(channel, callOptions);
        }
      };
    return ReservedInstancePoolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservedInstancePoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceBlockingStub>() {
        @java.lang.Override
        public ReservedInstancePoolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservedInstancePoolServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservedInstancePoolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservedInstancePoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservedInstancePoolServiceFutureStub>() {
        @java.lang.Override
        public ReservedInstancePoolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservedInstancePoolServiceFutureStub(channel, callOptions);
        }
      };
    return ReservedInstancePoolServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing reserved instance pool resources.
   * </pre>
   */
  public static abstract class ReservedInstancePoolServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified reserved instance pool resource.
     * To get the list of available reserved instance pool resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of reserved instance pool resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an reserved instance pool in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified reserved instance pool.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified reserved instance pool.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified reserved instance pool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of instances, using the specified reserved instance pool.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest,
                yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest,
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest,
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest,
                yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing reserved instance pool resources.
   * </pre>
   */
  public static final class ReservedInstancePoolServiceStub extends io.grpc.stub.AbstractAsyncStub<ReservedInstancePoolServiceStub> {
    private ReservedInstancePoolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservedInstancePoolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservedInstancePoolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified reserved instance pool resource.
     * To get the list of available reserved instance pool resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of reserved instance pool resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an reserved instance pool in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified reserved instance pool.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified reserved instance pool.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified reserved instance pool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of instances, using the specified reserved instance pool.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing reserved instance pool resources.
   * </pre>
   */
  public static final class ReservedInstancePoolServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReservedInstancePoolServiceBlockingStub> {
    private ReservedInstancePoolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservedInstancePoolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservedInstancePoolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified reserved instance pool resource.
     * To get the list of available reserved instance pool resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool get(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of reserved instance pool resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse list(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an reserved instance pool in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified reserved instance pool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified reserved instance pool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified reserved instance pool.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse listOperations(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of instances, using the specified reserved instance pool.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse listInstances(yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing reserved instance pool resources.
   * </pre>
   */
  public static final class ReservedInstancePoolServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReservedInstancePoolServiceFutureStub> {
    private ReservedInstancePoolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservedInstancePoolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservedInstancePoolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified reserved instance pool resource.
     * To get the list of available reserved instance pool resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool> get(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of reserved instance pool resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse> list(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an reserved instance pool in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified reserved instance pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified reserved instance pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified reserved instance pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of instances, using the specified reserved instance pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_INSTANCES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservedInstancePoolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservedInstancePoolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.GetReservedInstancePoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolOuterClass.ReservedInstancePool>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.CreateReservedInstancePoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.UpdateReservedInstancePoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.DeleteReservedInstancePoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.ListReservedInstancePoolInstancesResponse>) responseObserver);
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

  private static abstract class ReservedInstancePoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservedInstancePoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.ReservedInstancePoolServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservedInstancePoolService");
    }
  }

  private static final class ReservedInstancePoolServiceFileDescriptorSupplier
      extends ReservedInstancePoolServiceBaseDescriptorSupplier {
    ReservedInstancePoolServiceFileDescriptorSupplier() {}
  }

  private static final class ReservedInstancePoolServiceMethodDescriptorSupplier
      extends ReservedInstancePoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservedInstancePoolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservedInstancePoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservedInstancePoolServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListInstancesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
