package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/access_policy_template_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessPolicyTemplateServiceGrpc {

  private AccessPolicyTemplateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.AccessPolicyTemplateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest,
      yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest.class,
      responseType = yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest,
      yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest, yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> getListMethod;
    if ((getListMethod = AccessPolicyTemplateServiceGrpc.getListMethod) == null) {
      synchronized (AccessPolicyTemplateServiceGrpc.class) {
        if ((getListMethod = AccessPolicyTemplateServiceGrpc.getListMethod) == null) {
          AccessPolicyTemplateServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest, yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPolicyTemplateServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessPolicyTemplateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceStub>() {
        @java.lang.Override
        public AccessPolicyTemplateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPolicyTemplateServiceStub(channel, callOptions);
        }
      };
    return AccessPolicyTemplateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessPolicyTemplateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceBlockingStub>() {
        @java.lang.Override
        public AccessPolicyTemplateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPolicyTemplateServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessPolicyTemplateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessPolicyTemplateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPolicyTemplateServiceFutureStub>() {
        @java.lang.Override
        public AccessPolicyTemplateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPolicyTemplateServiceFutureStub(channel, callOptions);
        }
      };
    return AccessPolicyTemplateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccessPolicyTemplateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns list of available access policy templates.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest,
                yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class AccessPolicyTemplateServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessPolicyTemplateServiceStub> {
    private AccessPolicyTemplateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPolicyTemplateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPolicyTemplateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available access policy templates.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccessPolicyTemplateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessPolicyTemplateServiceBlockingStub> {
    private AccessPolicyTemplateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPolicyTemplateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPolicyTemplateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available access policy templates.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse list(yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccessPolicyTemplateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessPolicyTemplateServiceFutureStub> {
    private AccessPolicyTemplateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPolicyTemplateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPolicyTemplateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available access policy templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse> list(
        yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessPolicyTemplateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessPolicyTemplateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.ListAccessPolicyTemplatesResponse>) responseObserver);
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

  private static abstract class AccessPolicyTemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessPolicyTemplateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.AccessPolicyTemplateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessPolicyTemplateService");
    }
  }

  private static final class AccessPolicyTemplateServiceFileDescriptorSupplier
      extends AccessPolicyTemplateServiceBaseDescriptorSupplier {
    AccessPolicyTemplateServiceFileDescriptorSupplier() {}
  }

  private static final class AccessPolicyTemplateServiceMethodDescriptorSupplier
      extends AccessPolicyTemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessPolicyTemplateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessPolicyTemplateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessPolicyTemplateServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
