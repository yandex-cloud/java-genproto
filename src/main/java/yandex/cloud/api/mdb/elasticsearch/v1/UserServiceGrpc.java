package yandex.cloud.api.mdb.elasticsearch.v1;

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
 * A set of methods for managing Elasticsearch users.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/elasticsearch/v1/user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.elasticsearch.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> getGetMethod;
    if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
          UserServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.UserService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> getListMethod;
    if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
          UserServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.UserService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.UserService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.UserService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.UserService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch users.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Elasticsearch user.
     * To get the list of available Elasticsearch users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Elasticsearch users in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a user in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch users.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Elasticsearch user.
     * To get the list of available Elasticsearch users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Elasticsearch users in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a user in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch users.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Elasticsearch user.
     * To get the list of available Elasticsearch users, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User get(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Elasticsearch users in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse list(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a user in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch users.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Elasticsearch user.
     * To get the list of available Elasticsearch users, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User> get(
        yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Elasticsearch users in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse> list(
        yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a user in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.DeleteUserRequest) request,
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.elasticsearch.v1.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
