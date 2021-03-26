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
 * A set of methods for managing databases.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/ydb/v1/database_service.proto")
public final class DatabaseServiceGrpc {

  private DatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ydb.v1.DatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest.class,
      responseType = yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> getGetMethod;
    if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
          DatabaseServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest.class,
      responseType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;
    if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
          DatabaseServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
          DatabaseServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DatabaseServiceGrpc.getUpdateMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getUpdateMethod = DatabaseServiceGrpc.getUpdateMethod) == null) {
          DatabaseServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = DatabaseServiceGrpc.getStartMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getStartMethod = DatabaseServiceGrpc.getStartMethod) == null) {
          DatabaseServiceGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = DatabaseServiceGrpc.getStopMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getStopMethod = DatabaseServiceGrpc.getStopMethod) == null) {
          DatabaseServiceGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
          DatabaseServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;
    if ((getRestoreMethod = DatabaseServiceGrpc.getRestoreMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getRestoreMethod = DatabaseServiceGrpc.getRestoreMethod) == null) {
          DatabaseServiceGrpc.getRestoreMethod = getRestoreMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Restore"))
                  .build();
          }
        }
     }
     return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Backup",
      requestType = yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;
    if ((getBackupMethod = DatabaseServiceGrpc.getBackupMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getBackupMethod = DatabaseServiceGrpc.getBackupMethod) == null) {
          DatabaseServiceGrpc.getBackupMethod = getBackupMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.ydb.v1.DatabaseService", "Backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Backup"))
                  .build();
          }
        }
     }
     return getBackupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseServiceStub newStub(io.grpc.Channel channel) {
    return new DatabaseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatabaseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatabaseServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing databases.
   * </pre>
   */
  public static abstract class DatabaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified database.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of databases.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new database.
     * </pre>
     */
    public void create(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified database.
     * </pre>
     */
    public void update(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified database.
     * </pre>
     */
    public void start(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified database.
     * </pre>
     */
    public void stop(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified database.
     * </pre>
     */
    public void delete(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restores the specified backup
     * </pre>
     */
    public void restore(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     */
    public void backup(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
                yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getRestoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BACKUP)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing databases.
   * </pre>
   */
  public static final class DatabaseServiceStub extends io.grpc.stub.AbstractStub<DatabaseServiceStub> {
    private DatabaseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified database.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of databases.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new database.
     * </pre>
     */
    public void create(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified database.
     * </pre>
     */
    public void update(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified database.
     * </pre>
     */
    public void start(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified database.
     * </pre>
     */
    public void stop(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified database.
     * </pre>
     */
    public void delete(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restores the specified backup
     * </pre>
     */
    public void restore(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void backup(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing databases.
   * </pre>
   */
  public static final class DatabaseServiceBlockingStub extends io.grpc.stub.AbstractStub<DatabaseServiceBlockingStub> {
    private DatabaseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified database.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database get(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of databases.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse list(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the specified database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restores the specified backup
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restore(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation backup(yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing databases.
   * </pre>
   */
  public static final class DatabaseServiceFutureStub extends io.grpc.stub.AbstractStub<DatabaseServiceFutureStub> {
    private DatabaseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database> get(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of databases.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse> list(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the specified database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restores the specified backup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restore(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> backup(
        yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_START = 4;
  private static final int METHODID_STOP = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_RESTORE = 7;
  private static final int METHODID_BACKUP = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseOuterClass.Database>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.ListDatabasesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.CreateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.UpdateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StartDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.StopDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.RestoreBackupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.BackupDatabaseRequest) request,
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

  private static abstract class DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ydb.v1.DatabaseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatabaseService");
    }
  }

  private static final class DatabaseServiceFileDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier {
    DatabaseServiceFileDescriptorSupplier() {}
  }

  private static final class DatabaseServiceMethodDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatabaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatabaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getBackupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
