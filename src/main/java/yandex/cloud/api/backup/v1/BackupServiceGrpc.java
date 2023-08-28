package yandex.cloud.api.backup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing [backups](/docs/backup/concepts/backup).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/backup/v1/backup_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BackupServiceGrpc {

  private BackupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.backup.v1.BackupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest.class,
      responseType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;
    if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
          BackupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> getListArchivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArchives",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest.class,
      responseType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> getListArchivesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> getListArchivesMethod;
    if ((getListArchivesMethod = BackupServiceGrpc.getListArchivesMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListArchivesMethod = BackupServiceGrpc.getListArchivesMethod) == null) {
          BackupServiceGrpc.getListArchivesMethod = getListArchivesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArchives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("ListArchives"))
              .build();
        }
      }
    }
    return getListArchivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> getListFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFiles",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest.class,
      responseType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest,
      yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> getListFilesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> getListFilesMethod;
    if ((getListFilesMethod = BackupServiceGrpc.getListFilesMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListFilesMethod = BackupServiceGrpc.getListFilesMethod) == null) {
          BackupServiceGrpc.getListFilesMethod = getListFilesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest, yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("ListFiles"))
              .build();
        }
      }
    }
    return getListFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.backup.v1.BackupOuterClass.Backup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest.class,
      responseType = yandex.cloud.api.backup.v1.BackupOuterClass.Backup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.backup.v1.BackupOuterClass.Backup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.backup.v1.BackupOuterClass.Backup> getGetMethod;
    if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
          BackupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.backup.v1.BackupOuterClass.Backup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupOuterClass.Backup.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartRecoveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRecovery",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartRecoveryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartRecoveryMethod;
    if ((getStartRecoveryMethod = BackupServiceGrpc.getStartRecoveryMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getStartRecoveryMethod = BackupServiceGrpc.getStartRecoveryMethod) == null) {
          BackupServiceGrpc.getStartRecoveryMethod = getStartRecoveryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRecovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("StartRecovery"))
              .build();
        }
      }
    }
    return getStartRecoveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFilesRecoveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFilesRecovery",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFilesRecoveryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFilesRecoveryMethod;
    if ((getStartFilesRecoveryMethod = BackupServiceGrpc.getStartFilesRecoveryMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getStartFilesRecoveryMethod = BackupServiceGrpc.getStartFilesRecoveryMethod) == null) {
          BackupServiceGrpc.getStartFilesRecoveryMethod = getStartFilesRecoveryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFilesRecovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("StartFilesRecovery"))
              .build();
        }
      }
    }
    return getStartFilesRecoveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = BackupServiceGrpc.getDeleteMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getDeleteMethod = BackupServiceGrpc.getDeleteMethod) == null) {
          BackupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<BackupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupServiceStub>() {
        @java.lang.Override
        public BackupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupServiceStub(channel, callOptions);
        }
      };
    return BackupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BackupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupServiceBlockingStub>() {
        @java.lang.Override
        public BackupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupServiceBlockingStub(channel, callOptions);
        }
      };
    return BackupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BackupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupServiceFutureStub>() {
        @java.lang.Override
        public BackupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupServiceFutureStub(channel, callOptions);
        }
      };
    return BackupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing [backups](/docs/backup/concepts/backup).
   * </pre>
   */
  public static abstract class BackupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List backups using filters.
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * List archives that holds backups for specified folder or
     * specified [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void listArchives(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArchivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFiles of the backup.
     * </pre>
     */
    public void listFiles(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get backup by its id.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupOuterClass.Backup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start recovery process of specified backup to specific Compute Cloud instance.
     * For details, see [Restoring a VM from a backup](/docs/backup/operations/backup-vm/recover).
     * </pre>
     */
    public void startRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRecoveryMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartFilesRecovery runs recovery process of selected files to specific Compute Cloud instance.
     * </pre>
     */
    public void startFilesRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFilesRecoveryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specific backup.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest,
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListArchivesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest,
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse>(
                  this, METHODID_LIST_ARCHIVES)))
          .addMethod(
            getListFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest,
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse>(
                  this, METHODID_LIST_FILES)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest,
                yandex.cloud.api.backup.v1.BackupOuterClass.Backup>(
                  this, METHODID_GET)))
          .addMethod(
            getStartRecoveryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_RECOVERY)))
          .addMethod(
            getStartFilesRecoveryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_FILES_RECOVERY)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing [backups](/docs/backup/concepts/backup).
   * </pre>
   */
  public static final class BackupServiceStub extends io.grpc.stub.AbstractAsyncStub<BackupServiceStub> {
    private BackupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List backups using filters.
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List archives that holds backups for specified folder or
     * specified [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void listArchives(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListArchivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFiles of the backup.
     * </pre>
     */
    public void listFiles(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get backup by its id.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupOuterClass.Backup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start recovery process of specified backup to specific Compute Cloud instance.
     * For details, see [Restoring a VM from a backup](/docs/backup/operations/backup-vm/recover).
     * </pre>
     */
    public void startRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRecoveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartFilesRecovery runs recovery process of selected files to specific Compute Cloud instance.
     * </pre>
     */
    public void startFilesRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFilesRecoveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specific backup.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing [backups](/docs/backup/concepts/backup).
   * </pre>
   */
  public static final class BackupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BackupServiceBlockingStub> {
    private BackupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List backups using filters.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse list(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List archives that holds backups for specified folder or
     * specified [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse listArchives(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListArchivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFiles of the backup.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse listFiles(yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get backup by its id.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.BackupOuterClass.Backup get(yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start recovery process of specified backup to specific Compute Cloud instance.
     * For details, see [Restoring a VM from a backup](/docs/backup/operations/backup-vm/recover).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation startRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRecoveryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartFilesRecovery runs recovery process of selected files to specific Compute Cloud instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation startFilesRecovery(yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFilesRecoveryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specific backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing [backups](/docs/backup/concepts/backup).
   * </pre>
   */
  public static final class BackupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BackupServiceFutureStub> {
    private BackupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List backups using filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse> list(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List archives that holds backups for specified folder or
     * specified [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse> listArchives(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListArchivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFiles of the backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse> listFiles(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get backup by its id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.BackupOuterClass.Backup> get(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start recovery process of specified backup to specific Compute Cloud instance.
     * For details, see [Restoring a VM from a backup](/docs/backup/operations/backup-vm/recover).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startRecovery(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRecoveryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartFilesRecovery runs recovery process of selected files to specific Compute Cloud instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startFilesRecovery(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFilesRecoveryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specific backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_LIST_ARCHIVES = 1;
  private static final int METHODID_LIST_FILES = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_START_RECOVERY = 4;
  private static final int METHODID_START_FILES_RECOVERY = 5;
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
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListBackupsResponse>) responseObserver);
          break;
        case METHODID_LIST_ARCHIVES:
          serviceImpl.listArchives((yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListArchivesResponse>) responseObserver);
          break;
        case METHODID_LIST_FILES:
          serviceImpl.listFiles((yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupServiceOuterClass.ListFilesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.backup.v1.BackupServiceOuterClass.GetBackupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.BackupOuterClass.Backup>) responseObserver);
          break;
        case METHODID_START_RECOVERY:
          serviceImpl.startRecovery((yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartRecoveryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START_FILES_RECOVERY:
          serviceImpl.startFilesRecovery((yandex.cloud.api.backup.v1.BackupServiceOuterClass.StartFilesRecoveryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.backup.v1.BackupServiceOuterClass.DeleteBackupRequest) request,
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
      return yandex.cloud.api.backup.v1.BackupServiceOuterClass.getDescriptor();
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
              .addMethod(getListMethod())
              .addMethod(getListArchivesMethod())
              .addMethod(getListFilesMethod())
              .addMethod(getGetMethod())
              .addMethod(getStartRecoveryMethod())
              .addMethod(getStartFilesRecoveryMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
