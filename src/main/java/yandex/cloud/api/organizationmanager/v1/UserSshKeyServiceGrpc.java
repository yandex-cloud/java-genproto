package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/user_ssh_key_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserSshKeyServiceGrpc {

  private UserSshKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.UserSshKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest,
      yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest,
      yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest, yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> getGetMethod;
    if ((getGetMethod = UserSshKeyServiceGrpc.getGetMethod) == null) {
      synchronized (UserSshKeyServiceGrpc.class) {
        if ((getGetMethod = UserSshKeyServiceGrpc.getGetMethod) == null) {
          UserSshKeyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest, yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey.getDefaultInstance()))
              .setSchemaDescriptor(new UserSshKeyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest,
      yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest,
      yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest, yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> getListMethod;
    if ((getListMethod = UserSshKeyServiceGrpc.getListMethod) == null) {
      synchronized (UserSshKeyServiceGrpc.class) {
        if ((getListMethod = UserSshKeyServiceGrpc.getListMethod) == null) {
          UserSshKeyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest, yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSshKeyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = UserSshKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (UserSshKeyServiceGrpc.class) {
        if ((getCreateMethod = UserSshKeyServiceGrpc.getCreateMethod) == null) {
          UserSshKeyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserSshKeyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = UserSshKeyServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserSshKeyServiceGrpc.class) {
        if ((getUpdateMethod = UserSshKeyServiceGrpc.getUpdateMethod) == null) {
          UserSshKeyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserSshKeyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = UserSshKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserSshKeyServiceGrpc.class) {
        if ((getDeleteMethod = UserSshKeyServiceGrpc.getDeleteMethod) == null) {
          UserSshKeyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserSshKeyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserSshKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceStub>() {
        @java.lang.Override
        public UserSshKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSshKeyServiceStub(channel, callOptions);
        }
      };
    return UserSshKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserSshKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceBlockingStub>() {
        @java.lang.Override
        public UserSshKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSshKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return UserSshKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserSshKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSshKeyServiceFutureStub>() {
        @java.lang.Override
        public UserSshKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSshKeyServiceFutureStub(channel, callOptions);
        }
      };
    return UserSshKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserSshKeyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest,
                yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest,
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class UserSshKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<UserSshKeyServiceStub> {
    private UserSshKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSshKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSshKeyServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserSshKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserSshKeyServiceBlockingStub> {
    private UserSshKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSshKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSshKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey get(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse list(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserSshKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserSshKeyServiceFutureStub> {
    private UserSshKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSshKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSshKeyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey> get(
        yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse> list(
        yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
    private final UserSshKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserSshKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.GetUserSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyOuterClass.UserSshKey>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.ListUserSshKeysResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.CreateUserSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.UpdateUserSshKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.DeleteUserSshKeyRequest) request,
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

  private static abstract class UserSshKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserSshKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.UserSshKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserSshKeyService");
    }
  }

  private static final class UserSshKeyServiceFileDescriptorSupplier
      extends UserSshKeyServiceBaseDescriptorSupplier {
    UserSshKeyServiceFileDescriptorSupplier() {}
  }

  private static final class UserSshKeyServiceMethodDescriptorSupplier
      extends UserSshKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserSshKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserSshKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserSshKeyServiceFileDescriptorSupplier())
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
