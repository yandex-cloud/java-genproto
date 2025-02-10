package yandex.cloud.api.mdb.postgresql.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PostgreSQL Cluster backup retention policies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/postgresql/v1/backup_retention_policy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BackupRetentionPolicyServiceGrpc {

  private BackupRetentionPolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.postgresql.v1.BackupRetentionPolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest.class,
      responseType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> getListMethod;
    if ((getListMethod = BackupRetentionPolicyServiceGrpc.getListMethod) == null) {
      synchronized (BackupRetentionPolicyServiceGrpc.class) {
        if ((getListMethod = BackupRetentionPolicyServiceGrpc.getListMethod) == null) {
          BackupRetentionPolicyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupRetentionPolicyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest.class,
      responseType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> getCreateMethod;
    if ((getCreateMethod = BackupRetentionPolicyServiceGrpc.getCreateMethod) == null) {
      synchronized (BackupRetentionPolicyServiceGrpc.class) {
        if ((getCreateMethod = BackupRetentionPolicyServiceGrpc.getCreateMethod) == null) {
          BackupRetentionPolicyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupRetentionPolicyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest.class,
      responseType = yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest,
      yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> getDeleteMethod;
    if ((getDeleteMethod = BackupRetentionPolicyServiceGrpc.getDeleteMethod) == null) {
      synchronized (BackupRetentionPolicyServiceGrpc.class) {
        if ((getDeleteMethod = BackupRetentionPolicyServiceGrpc.getDeleteMethod) == null) {
          BackupRetentionPolicyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest, yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BackupRetentionPolicyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BackupRetentionPolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceStub>() {
        @java.lang.Override
        public BackupRetentionPolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupRetentionPolicyServiceStub(channel, callOptions);
        }
      };
    return BackupRetentionPolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BackupRetentionPolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceBlockingStub>() {
        @java.lang.Override
        public BackupRetentionPolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupRetentionPolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return BackupRetentionPolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BackupRetentionPolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BackupRetentionPolicyServiceFutureStub>() {
        @java.lang.Override
        public BackupRetentionPolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BackupRetentionPolicyServiceFutureStub(channel, callOptions);
        }
      };
    return BackupRetentionPolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PostgreSQL Cluster backup retention policies.
   * </pre>
   */
  public static abstract class BackupRetentionPolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List all retention policies.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a new retention policy.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete retention policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest,
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest,
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest,
                yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PostgreSQL Cluster backup retention policies.
   * </pre>
   */
  public static final class BackupRetentionPolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<BackupRetentionPolicyServiceStub> {
    private BackupRetentionPolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupRetentionPolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupRetentionPolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all retention policies.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a new retention policy.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete retention policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PostgreSQL Cluster backup retention policies.
   * </pre>
   */
  public static final class BackupRetentionPolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BackupRetentionPolicyServiceBlockingStub> {
    private BackupRetentionPolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupRetentionPolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupRetentionPolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all retention policies.
     * </pre>
     */
    public yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse list(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a new retention policy.
     * </pre>
     */
    public yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse create(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete retention policy.
     * </pre>
     */
    public yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse delete(yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PostgreSQL Cluster backup retention policies.
   * </pre>
   */
  public static final class BackupRetentionPolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BackupRetentionPolicyServiceFutureStub> {
    private BackupRetentionPolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackupRetentionPolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BackupRetentionPolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all retention policies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse> list(
        yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a new retention policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse> create(
        yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete retention policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse> delete(
        yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BackupRetentionPolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BackupRetentionPolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.ListBackupRetentionPoliciesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.CreateBackupRetentionPolicyResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.DeleteBackupRetentionPolicyResponse>) responseObserver);
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

  private static abstract class BackupRetentionPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BackupRetentionPolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.postgresql.v1.BackupRetentionPolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BackupRetentionPolicyService");
    }
  }

  private static final class BackupRetentionPolicyServiceFileDescriptorSupplier
      extends BackupRetentionPolicyServiceBaseDescriptorSupplier {
    BackupRetentionPolicyServiceFileDescriptorSupplier() {}
  }

  private static final class BackupRetentionPolicyServiceMethodDescriptorSupplier
      extends BackupRetentionPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BackupRetentionPolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BackupRetentionPolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BackupRetentionPolicyServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
