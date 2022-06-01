package yandex.cloud.api.mdb.sqlserver.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SQL Server users.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/sqlserver/v1/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.sqlserver.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSU.User> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSU.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSU.User> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest, yandex.cloud.api.mdb.sqlserver.v1.PSU.User> getGetMethod;
    if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
          UserServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest, yandex.cloud.api.mdb.sqlserver.v1.PSU.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSU.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest, yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> getListMethod;
    if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
          UserServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest, yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGrantPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantPermission",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getGrantPermissionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getGrantPermissionMethod;
    if ((getGrantPermissionMethod = UserServiceGrpc.getGrantPermissionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGrantPermissionMethod = UserServiceGrpc.getGrantPermissionMethod) == null) {
          UserServiceGrpc.getGrantPermissionMethod = getGrantPermissionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GrantPermission"))
              .build();
        }
      }
    }
    return getGrantPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokePermission",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokePermissionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokePermissionMethod;
    if ((getRevokePermissionMethod = UserServiceGrpc.getRevokePermissionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRevokePermissionMethod = UserServiceGrpc.getRevokePermissionMethod) == null) {
          UserServiceGrpc.getRevokePermissionMethod = getRevokePermissionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RevokePermission"))
              .build();
        }
      }
    }
    return getRevokePermissionMethod;
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
   * A set of methods for managing SQL Server users.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SQL Server user.
     * To get the list of available SQL Server users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSU.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of SQL Server users in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an SQL Server user in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server user.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server user.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Grants a permission to the specified SQL Server user.
     * </pre>
     */
    public void grantPermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission from the specified SQL Server user.
     * </pre>
     */
    public void revokePermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokePermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSU.User>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGrantPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_GRANT_PERMISSION)))
          .addMethod(
            getRevokePermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REVOKE_PERMISSION)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server users.
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
     * Returns the specified SQL Server user.
     * To get the list of available SQL Server users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSU.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of SQL Server users in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an SQL Server user in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server user.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server user.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Grants a permission to the specified SQL Server user.
     * </pre>
     */
    public void grantPermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revokes a permission from the specified SQL Server user.
     * </pre>
     */
    public void revokePermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokePermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server users.
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
     * Returns the specified SQL Server user.
     * To get the list of available SQL Server users, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSU.User get(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of SQL Server users in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse list(yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an SQL Server user in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Grants a permission to the specified SQL Server user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation grantPermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revokes a permission from the specified SQL Server user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation revokePermission(yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokePermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server users.
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
     * Returns the specified SQL Server user.
     * To get the list of available SQL Server users, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSU.User> get(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of SQL Server users in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse> list(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an SQL Server user in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Grants a permission to the specified SQL Server user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> grantPermission(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revokes a permission from the specified SQL Server user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> revokePermission(
        yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokePermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GRANT_PERMISSION = 5;
  private static final int METHODID_REVOKE_PERMISSION = 6;

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
          serviceImpl.get((yandex.cloud.api.mdb.sqlserver.v1.PSUS.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSU.User>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSUS.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.sqlserver.v1.PSUS.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.sqlserver.v1.PSUS.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.sqlserver.v1.PSUS.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GRANT_PERMISSION:
          serviceImpl.grantPermission((yandex.cloud.api.mdb.sqlserver.v1.PSUS.GrantUserPermissionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REVOKE_PERMISSION:
          serviceImpl.revokePermission((yandex.cloud.api.mdb.sqlserver.v1.PSUS.RevokeUserPermissionRequest) request,
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
      return yandex.cloud.api.mdb.sqlserver.v1.PSUS.getDescriptor();
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
              .addMethod(getGrantPermissionMethod())
              .addMethod(getRevokePermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
