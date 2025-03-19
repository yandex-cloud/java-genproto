package yandex.cloud.api.mdb.spqr.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SPQR Database resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/spqr/v1/database_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatabaseServiceGrpc {

  private DatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.spqr.v1.DatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest.class,
      responseType = yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> getGetMethod;
    if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
          DatabaseServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest.class,
      responseType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;
    if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
          DatabaseServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListAtRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAtRevision",
      requestType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest.class,
      responseType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest,
      yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListAtRevisionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> getListAtRevisionMethod;
    if ((getListAtRevisionMethod = DatabaseServiceGrpc.getListAtRevisionMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getListAtRevisionMethod = DatabaseServiceGrpc.getListAtRevisionMethod) == null) {
          DatabaseServiceGrpc.getListAtRevisionMethod = getListAtRevisionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest, yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAtRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("ListAtRevision"))
              .build();
        }
      }
    }
    return getListAtRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
          DatabaseServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
          DatabaseServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub>() {
        @java.lang.Override
        public DatabaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceStub(channel, callOptions);
        }
      };
    return DatabaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub>() {
        @java.lang.Override
        public DatabaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceBlockingStub(channel, callOptions);
        }
      };
    return DatabaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub>() {
        @java.lang.Override
        public DatabaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceFutureStub(channel, callOptions);
        }
      };
    return DatabaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing SPQR Database resources.
   * </pre>
   */
  public static abstract class DatabaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SPQR Database resource.
     * To get the list of available SPQR Database resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster at the specified revision.
     * </pre>
     */
    public void listAtRevision(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAtRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new SPQR database in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SPQR database.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest,
                yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest,
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListAtRevisionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest,
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>(
                  this, METHODID_LIST_AT_REVISION)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SPQR Database resources.
   * </pre>
   */
  public static final class DatabaseServiceStub extends io.grpc.stub.AbstractAsyncStub<DatabaseServiceStub> {
    private DatabaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SPQR Database resource.
     * To get the list of available SPQR Database resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster at the specified revision.
     * </pre>
     */
    public void listAtRevision(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAtRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new SPQR database in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SPQR database.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SPQR Database resources.
   * </pre>
   */
  public static final class DatabaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DatabaseServiceBlockingStub> {
    private DatabaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SPQR Database resource.
     * To get the list of available SPQR Database resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database get(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse list(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster at the specified revision.
     * </pre>
     */
    public yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse listAtRevision(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAtRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new SPQR database in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified SPQR database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SPQR Database resources.
   * </pre>
   */
  public static final class DatabaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DatabaseServiceFutureStub> {
    private DatabaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SPQR Database resource.
     * To get the list of available SPQR Database resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database> get(
        yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> list(
        yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SPQR Database resources in the specified cluster at the specified revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse> listAtRevision(
        yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAtRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new SPQR database in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified SPQR database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_LIST_AT_REVISION = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_DELETE = 4;

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
          serviceImpl.get((yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseOuterClass.Database>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>) responseObserver);
          break;
        case METHODID_LIST_AT_REVISION:
          serviceImpl.listAtRevision((yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesAtRevisionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.ListDatabasesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.CreateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.DeleteDatabaseRequest) request,
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
      return yandex.cloud.api.mdb.spqr.v1.DatabaseServiceOuterClass.getDescriptor();
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
              .addMethod(getListAtRevisionMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
