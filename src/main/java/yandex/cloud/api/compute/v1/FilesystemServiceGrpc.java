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
 * A set of methods for managing filesystems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/filesystem_service.proto")
public final class FilesystemServiceGrpc {

  private FilesystemServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.FilesystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest,
      yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest.class,
      responseType = yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest,
      yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest, yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> getGetMethod;
    if ((getGetMethod = FilesystemServiceGrpc.getGetMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getGetMethod = FilesystemServiceGrpc.getGetMethod) == null) {
          FilesystemServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest, yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest,
      yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest.class,
      responseType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest,
      yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest, yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> getListMethod;
    if ((getListMethod = FilesystemServiceGrpc.getListMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getListMethod = FilesystemServiceGrpc.getListMethod) == null) {
          FilesystemServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest, yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = FilesystemServiceGrpc.getCreateMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getCreateMethod = FilesystemServiceGrpc.getCreateMethod) == null) {
          FilesystemServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = FilesystemServiceGrpc.getUpdateMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getUpdateMethod = FilesystemServiceGrpc.getUpdateMethod) == null) {
          FilesystemServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = FilesystemServiceGrpc.getDeleteMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getDeleteMethod = FilesystemServiceGrpc.getDeleteMethod) == null) {
          FilesystemServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest,
      yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest,
      yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest, yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = FilesystemServiceGrpc.getListOperationsMethod) == null) {
      synchronized (FilesystemServiceGrpc.class) {
        if ((getListOperationsMethod = FilesystemServiceGrpc.getListOperationsMethod) == null) {
          FilesystemServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest, yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.FilesystemService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FilesystemServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FilesystemServiceStub newStub(io.grpc.Channel channel) {
    return new FilesystemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FilesystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FilesystemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FilesystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FilesystemServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing filesystems.
   * </pre>
   */
  public static abstract class FilesystemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified filesystem.
     * To get the list of available filesystems, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists filesystems in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a filesystem in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified filesystem.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified filesystem.
     * Deleting a filesystem removes its data permanently and is irreversible.
     * It is not possible to delete a filesystem that is attached to an instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified filesystem.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest,
                yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest,
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest,
                yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing filesystems.
   * </pre>
   */
  public static final class FilesystemServiceStub extends io.grpc.stub.AbstractStub<FilesystemServiceStub> {
    private FilesystemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FilesystemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilesystemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FilesystemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified filesystem.
     * To get the list of available filesystems, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists filesystems in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a filesystem in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified filesystem.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified filesystem.
     * Deleting a filesystem removes its data permanently and is irreversible.
     * It is not possible to delete a filesystem that is attached to an instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified filesystem.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing filesystems.
   * </pre>
   */
  public static final class FilesystemServiceBlockingStub extends io.grpc.stub.AbstractStub<FilesystemServiceBlockingStub> {
    private FilesystemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FilesystemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilesystemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FilesystemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified filesystem.
     * To get the list of available filesystems, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem get(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists filesystems in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse list(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a filesystem in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified filesystem.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified filesystem.
     * Deleting a filesystem removes its data permanently and is irreversible.
     * It is not possible to delete a filesystem that is attached to an instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified filesystem.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse listOperations(yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing filesystems.
   * </pre>
   */
  public static final class FilesystemServiceFutureStub extends io.grpc.stub.AbstractStub<FilesystemServiceFutureStub> {
    private FilesystemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FilesystemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilesystemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FilesystemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified filesystem.
     * To get the list of available filesystems, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem> get(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists filesystems in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse> list(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a filesystem in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified filesystem.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified filesystem.
     * Deleting a filesystem removes its data permanently and is irreversible.
     * It is not possible to delete a filesystem that is attached to an instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified filesystem.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest request) {
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
    private final FilesystemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FilesystemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.GetFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemOuterClass.Filesystem>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.CreateFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.UpdateFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.DeleteFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.ListFilesystemOperationsResponse>) responseObserver);
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

  private static abstract class FilesystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FilesystemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.FilesystemServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FilesystemService");
    }
  }

  private static final class FilesystemServiceFileDescriptorSupplier
      extends FilesystemServiceBaseDescriptorSupplier {
    FilesystemServiceFileDescriptorSupplier() {}
  }

  private static final class FilesystemServiceMethodDescriptorSupplier
      extends FilesystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FilesystemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FilesystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FilesystemServiceFileDescriptorSupplier())
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
