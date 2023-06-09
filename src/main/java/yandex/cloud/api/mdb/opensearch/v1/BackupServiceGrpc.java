package yandex.cloud.api.mdb.opensearch.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing backups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/opensearch/v1/backup_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BackupServiceGrpc {

  private BackupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.opensearch.v1.BackupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest,
      yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> getGetMethod;
    if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getGetMethod = BackupServiceGrpc.getGetMethod) == null) {
          BackupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest, yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest,
      yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> getListMethod;
    if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
      synchronized (BackupServiceGrpc.class) {
        if ((getListMethod = BackupServiceGrpc.getListMethod) == null) {
          BackupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest, yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
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
   * A set of methods for managing backups.
   * </pre>
   */
  public static abstract class BackupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified backup of an OpenSearch cluster.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest,
                yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest,
                yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
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
     * Returns the specified backup of an OpenSearch cluster.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
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
     * Returns the specified backup of an OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup get(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse list(yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing backups.
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
     * Returns the specified backup of an OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup> get(
        yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse> list(
        yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

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
          serviceImpl.get((yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.GetBackupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupOuterClass.Backup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.ListBackupsResponse>) responseObserver);
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
      return yandex.cloud.api.mdb.opensearch.v1.BackupServiceOuterClass.getDescriptor();
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
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
