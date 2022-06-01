package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Role resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/role_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.RoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest,
      yandex.cloud.api.iam.v1.RoleOuterClass.Role> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest.class,
      responseType = yandex.cloud.api.iam.v1.RoleOuterClass.Role.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest,
      yandex.cloud.api.iam.v1.RoleOuterClass.Role> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest, yandex.cloud.api.iam.v1.RoleOuterClass.Role> getGetMethod;
    if ((getGetMethod = RoleServiceGrpc.getGetMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getGetMethod = RoleServiceGrpc.getGetMethod) == null) {
          RoleServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest, yandex.cloud.api.iam.v1.RoleOuterClass.Role>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RoleOuterClass.Role.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest,
      yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest.class,
      responseType = yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest,
      yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest, yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> getListMethod;
    if ((getListMethod = RoleServiceGrpc.getListMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getListMethod = RoleServiceGrpc.getListMethod) == null) {
          RoleServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest, yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceStub>() {
        @java.lang.Override
        public RoleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceStub(channel, callOptions);
        }
      };
    return RoleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceBlockingStub>() {
        @java.lang.Override
        public RoleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceBlockingStub(channel, callOptions);
        }
      };
    return RoleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleServiceFutureStub>() {
        @java.lang.Override
        public RoleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleServiceFutureStub(channel, callOptions);
        }
      };
    return RoleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Role resources.
   * </pre>
   */
  public static abstract class RoleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Role resource.
     * To get the list of available Role resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleOuterClass.Role> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Role resources.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest,
                yandex.cloud.api.iam.v1.RoleOuterClass.Role>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest,
                yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Role resources.
   * </pre>
   */
  public static final class RoleServiceStub extends io.grpc.stub.AbstractAsyncStub<RoleServiceStub> {
    private RoleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Role resource.
     * To get the list of available Role resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleOuterClass.Role> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Role resources.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Role resources.
   * </pre>
   */
  public static final class RoleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Role resource.
     * To get the list of available Role resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.RoleOuterClass.Role get(yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Role resources.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse list(yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Role resources.
   * </pre>
   */
  public static final class RoleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Role resource.
     * To get the list of available Role resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.RoleOuterClass.Role> get(
        yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Role resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse> list(
        yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest request) {
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
    private final RoleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.RoleServiceOuterClass.GetRoleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleOuterClass.Role>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RoleServiceOuterClass.ListRolesResponse>) responseObserver);
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

  private static abstract class RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.RoleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleService");
    }
  }

  private static final class RoleServiceFileDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier {
    RoleServiceFileDescriptorSupplier() {}
  }

  private static final class RoleServiceMethodDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
