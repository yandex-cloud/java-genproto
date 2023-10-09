package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Snapshot resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/snapshot_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SnapshotServiceGrpc {

  private SnapshotServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.SnapshotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest,
      yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest,
      yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest, yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> getGetMethod;
    if ((getGetMethod = SnapshotServiceGrpc.getGetMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getGetMethod = SnapshotServiceGrpc.getGetMethod) == null) {
          SnapshotServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest, yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest,
      yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest,
      yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest, yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> getListMethod;
    if ((getListMethod = SnapshotServiceGrpc.getListMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getListMethod = SnapshotServiceGrpc.getListMethod) == null) {
          SnapshotServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest, yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SnapshotServiceGrpc.getCreateMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getCreateMethod = SnapshotServiceGrpc.getCreateMethod) == null) {
          SnapshotServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SnapshotServiceGrpc.getUpdateMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getUpdateMethod = SnapshotServiceGrpc.getUpdateMethod) == null) {
          SnapshotServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SnapshotServiceGrpc.getDeleteMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getDeleteMethod = SnapshotServiceGrpc.getDeleteMethod) == null) {
          SnapshotServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest,
      yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest,
      yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest, yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SnapshotServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getListOperationsMethod = SnapshotServiceGrpc.getListOperationsMethod) == null) {
          SnapshotServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest, yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = SnapshotServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getListAccessBindingsMethod = SnapshotServiceGrpc.getListAccessBindingsMethod) == null) {
          SnapshotServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = SnapshotServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = SnapshotServiceGrpc.getSetAccessBindingsMethod) == null) {
          SnapshotServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("SetAccessBindings"))
              .build();
        }
      }
    }
    return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = SnapshotServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (SnapshotServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = SnapshotServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          SnapshotServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnapshotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceStub>() {
        @java.lang.Override
        public SnapshotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotServiceStub(channel, callOptions);
        }
      };
    return SnapshotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnapshotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceBlockingStub>() {
        @java.lang.Override
        public SnapshotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotServiceBlockingStub(channel, callOptions);
        }
      };
    return SnapshotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SnapshotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotServiceFutureStub>() {
        @java.lang.Override
        public SnapshotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotServiceFutureStub(channel, callOptions);
        }
      };
    return SnapshotServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static abstract class SnapshotServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Snapshot resource.
     * To get the list of available Snapshot resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the snapshot.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the snapshot.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the snapshot.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest,
                yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest,
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest,
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceStub extends io.grpc.stub.AbstractAsyncStub<SnapshotServiceStub> {
    private SnapshotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Snapshot resource.
     * To get the list of available Snapshot resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the snapshot.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the snapshot.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the snapshot.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SnapshotServiceBlockingStub> {
    private SnapshotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Snapshot resource.
     * To get the list of available Snapshot resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot get(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the snapshot.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the snapshot.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the snapshot.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SnapshotServiceFutureStub> {
    private SnapshotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Snapshot resource.
     * To get the list of available Snapshot resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot> get(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> list(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the snapshot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the snapshot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the snapshot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 6;
  private static final int METHODID_SET_ACCESS_BINDINGS = 7;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SnapshotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SnapshotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
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

  private static abstract class SnapshotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SnapshotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SnapshotService");
    }
  }

  private static final class SnapshotServiceFileDescriptorSupplier
      extends SnapshotServiceBaseDescriptorSupplier {
    SnapshotServiceFileDescriptorSupplier() {}
  }

  private static final class SnapshotServiceMethodDescriptorSupplier
      extends SnapshotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SnapshotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SnapshotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SnapshotServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
