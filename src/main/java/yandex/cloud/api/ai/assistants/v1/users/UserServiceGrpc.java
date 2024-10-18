package yandex.cloud.api.ai.assistants.v1.users;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UserService provides operations for managing users.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/users/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.users.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getGetMethod;
    if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
          UserServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> getListMethod;
    if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
          UserServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * UserService provides operations for managing users.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific user by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing user.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List users in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest,
                yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest,
                yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest,
                yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest,
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest,
                yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * UserService provides operations for managing users.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific user by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing user.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List users in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * UserService provides operations for managing users.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User create(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific user by its ID.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User get(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing user.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User update(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user by its ID.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse delete(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List users in a specific folder.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse list(yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * UserService provides operations for managing users.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> create(
        yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific user by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> get(
        yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User> update(
        yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse> delete(
        yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List users in a specific folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse> list(
        yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

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
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.ListUsersResponse>) responseObserver);
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
      return yandex.cloud.api.ai.assistants.v1.users.UserServiceOuterClass.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
