package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A set of methods for managing Snapshot resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/snapshot_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "Get"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "List"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "Create"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "Update"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "Delete"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.SnapshotService", "ListOperations"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnapshotServiceStub newStub(io.grpc.Channel channel) {
    return new SnapshotServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnapshotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SnapshotServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SnapshotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SnapshotServiceFutureStub(channel);
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
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest,
                yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest,
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest,
                yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceStub extends io.grpc.stub.AbstractStub<SnapshotServiceStub> {
    private SnapshotServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceBlockingStub extends io.grpc.stub.AbstractStub<SnapshotServiceBlockingStub> {
    private SnapshotServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapshotServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Snapshot resource.
     * To get the list of available Snapshot resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotOuterClass.Snapshot get(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.GetSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse list(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified snapshot.
     * Values of omitted parameters are not changed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.UpdateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified snapshot.
     * Deleting a snapshot removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.DeleteSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse listOperations(yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Snapshot resources.
   * </pre>
   */
  public static final class SnapshotServiceFutureStub extends io.grpc.stub.AbstractStub<SnapshotServiceFutureStub> {
    private SnapshotServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Snapshot resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsResponse> list(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a snapshot of the specified disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.CreateSnapshotRequest request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.SnapshotServiceOuterClass.ListSnapshotOperationsRequest request) {
      return futureUnaryCall(
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
              .build();
        }
      }
    }
    return result;
  }
}
