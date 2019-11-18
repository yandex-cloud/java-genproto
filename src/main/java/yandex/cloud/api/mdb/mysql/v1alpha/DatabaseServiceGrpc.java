package yandex.cloud.api.mdb.mysql.v1alpha;

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
 * A set of methods for managing MySQL databases.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/mysql/v1alpha/database_service.proto")
public final class DatabaseServiceGrpc {

  private DatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.mysql.v1alpha.DatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> getGetMethod;
    if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetMethod = DatabaseServiceGrpc.getGetMethod) == null) {
          DatabaseServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest, yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.mysql.v1alpha.DatabaseService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> getListMethod;
    if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getListMethod = DatabaseServiceGrpc.getListMethod) == null) {
          DatabaseServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest, yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.mysql.v1alpha.DatabaseService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getCreateMethod = DatabaseServiceGrpc.getCreateMethod) == null) {
          DatabaseServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.mysql.v1alpha.DatabaseService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getDeleteMethod = DatabaseServiceGrpc.getDeleteMethod) == null) {
          DatabaseServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.mysql.v1alpha.DatabaseService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest.getDefaultInstance()))
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
   * A set of methods for managing MySQL databases.
   * </pre>
   */
  public static abstract class DatabaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified MySQL database.
     * To get the list of available MySQL databases, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL databases in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new MySQL database in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MySQL database.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL databases.
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
     * Returns the specified MySQL database.
     * To get the list of available MySQL databases, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL databases in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new MySQL database in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MySQL database.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL databases.
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
     * Returns the specified MySQL database.
     * To get the list of available MySQL databases, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database get(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL databases in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse list(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new MySQL database in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified MySQL database.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL databases.
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
     * Returns the specified MySQL database.
     * To get the list of available MySQL databases, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database> get(
        yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL databases in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse> list(
        yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new MySQL database in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified MySQL database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;

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
          serviceImpl.get((yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseOuterClass.Database>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.ListDatabasesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.CreateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.DeleteDatabaseRequest) request,
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
      return yandex.cloud.api.mdb.mysql.v1alpha.DatabaseServiceOuterClass.getDescriptor();
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
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
