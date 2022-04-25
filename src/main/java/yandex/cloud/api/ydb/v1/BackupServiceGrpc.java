package yandex.cloud.api.ydb.v1;

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
 * A set of methods for managing backups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/ydb/v1/backup_service.proto")
public final class BackupServiceGrpc {

  private BackupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ydb.v1.BackupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest.class,
      responseType = yandex.cloud.api.ydb.v1.BackupOuterClass.Backup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> getGetMethod;
    if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
          BackupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.ydb.v1.BackupOuterClass.Backup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupOuterClass.Backup.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest,
      yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> getListPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPaths",
      requestType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest.class,
      responseType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest,
      yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> getListPathsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest, yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> getListPathsMethod;
    if ((getListPathsMethod = BackupServiceGrpc.getListPathsMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListPathsMethod = BackupServiceGrpc.getListPathsMethod) == null) {
          BackupServiceGrpc.getListPathsMethod = getListPathsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest, yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "ListPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("ListPaths"))
                  .build();
          }
        }
     }
     return getListPathsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest.class,
      responseType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;
    if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
          BackupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
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
    if ((getListAccessBindingsMethod = BackupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = BackupServiceGrpc.getListAccessBindingsMethod) == null) {
          BackupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = BackupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = BackupServiceGrpc.getSetAccessBindingsMethod) == null) {
          BackupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = BackupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = BackupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          BackupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = BackupServiceGrpc.getDeleteMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getDeleteMethod = BackupServiceGrpc.getDeleteMethod) == null) {
          BackupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.BackupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BackupServiceStub newStub(io.grpc.Channel channel) {
    return new BackupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BackupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BackupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BackupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BackupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing backups.
   * </pre>
   */
  public static abstract class BackupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified backup.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void listPaths(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPathsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of backups.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified backup.
     * </pre>
     */
    public void delete(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest,
                yandex.cloud.api.ydb.v1.BackupOuterClass.Backup>(
                  this, METHODID_GET)))
          .addMethod(
            getListPathsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest,
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse>(
                  this, METHODID_LIST_PATHS)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest,
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
   * </pre>
   */
  public static final class BackupServiceStub extends io.grpc.stub.AbstractStub<BackupServiceStub> {
    private BackupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified backup.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPaths(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPathsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of backups.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified backup.
     * </pre>
     */
    public void delete(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
   * </pre>
   */
  public static final class BackupServiceBlockingStub extends io.grpc.stub.AbstractStub<BackupServiceBlockingStub> {
    private BackupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified backup.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.BackupOuterClass.Backup get(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse listPaths(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPathsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of backups.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse list(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
   * </pre>
   */
  public static final class BackupServiceFutureStub extends io.grpc.stub.AbstractStub<BackupServiceFutureStub> {
    private BackupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.BackupOuterClass.Backup> get(
        yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse> listPaths(
        yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPathsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of backups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse> list(
        yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST_PATHS = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 3;
  private static final int METHODID_SET_ACCESS_BINDINGS = 4;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 5;
  private static final int METHODID_DELETE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BackupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BackupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ydb.v1.BackupServiceOuterClass.GetBackupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupOuterClass.Backup>) responseObserver);
          break;
        case METHODID_LIST_PATHS:
          serviceImpl.listPaths((yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListPathsResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.BackupServiceOuterClass.ListBackupsResponse>) responseObserver);
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
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ydb.v1.BackupServiceOuterClass.DeleteBackupRequest) request,
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

  private static abstract class BackupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BackupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ydb.v1.BackupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BackupService");
    }
  }

  private static final class BackupServiceFileDescriptorSupplier
      extends BackupServiceBaseDescriptorSupplier {
    BackupServiceFileDescriptorSupplier() {}
  }

  private static final class BackupServiceMethodDescriptorSupplier
      extends BackupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BackupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BackupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BackupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListPathsMethod())
              .addMethod(getListMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
