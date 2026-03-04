package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for access analysis.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/access_analyzer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessAnalyzerServiceGrpc {

  private AccessAnalyzerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.AccessAnalyzerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest,
      yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> getListSubjectAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubjectAccessBindings",
      requestType = yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest.class,
      responseType = yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest,
      yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> getListSubjectAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest, yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> getListSubjectAccessBindingsMethod;
    if ((getListSubjectAccessBindingsMethod = AccessAnalyzerServiceGrpc.getListSubjectAccessBindingsMethod) == null) {
      synchronized (AccessAnalyzerServiceGrpc.class) {
        if ((getListSubjectAccessBindingsMethod = AccessAnalyzerServiceGrpc.getListSubjectAccessBindingsMethod) == null) {
          AccessAnalyzerServiceGrpc.getListSubjectAccessBindingsMethod = getListSubjectAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest, yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubjectAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAnalyzerServiceMethodDescriptorSupplier("ListSubjectAccessBindings"))
              .build();
        }
      }
    }
    return getListSubjectAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessAnalyzerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceStub>() {
        @java.lang.Override
        public AccessAnalyzerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAnalyzerServiceStub(channel, callOptions);
        }
      };
    return AccessAnalyzerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessAnalyzerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceBlockingStub>() {
        @java.lang.Override
        public AccessAnalyzerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAnalyzerServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessAnalyzerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessAnalyzerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAnalyzerServiceFutureStub>() {
        @java.lang.Override
        public AccessAnalyzerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAnalyzerServiceFutureStub(channel, callOptions);
        }
      };
    return AccessAnalyzerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for access analysis.
   * </pre>
   */
  public static abstract class AccessAnalyzerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of access bindings for the specified subject in chosen organization.
     * </pre>
     */
    public void listSubjectAccessBindings(yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubjectAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSubjectAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest,
                yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse>(
                  this, METHODID_LIST_SUBJECT_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for access analysis.
   * </pre>
   */
  public static final class AccessAnalyzerServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessAnalyzerServiceStub> {
    private AccessAnalyzerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAnalyzerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAnalyzerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of access bindings for the specified subject in chosen organization.
     * </pre>
     */
    public void listSubjectAccessBindings(yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubjectAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for access analysis.
   * </pre>
   */
  public static final class AccessAnalyzerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessAnalyzerServiceBlockingStub> {
    private AccessAnalyzerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAnalyzerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAnalyzerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of access bindings for the specified subject in chosen organization.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse listSubjectAccessBindings(yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubjectAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for access analysis.
   * </pre>
   */
  public static final class AccessAnalyzerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessAnalyzerServiceFutureStub> {
    private AccessAnalyzerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAnalyzerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAnalyzerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of access bindings for the specified subject in chosen organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse> listSubjectAccessBindings(
        yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubjectAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SUBJECT_ACCESS_BINDINGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessAnalyzerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessAnalyzerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SUBJECT_ACCESS_BINDINGS:
          serviceImpl.listSubjectAccessBindings((yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.ListSubjectAccessBindingsResponse>) responseObserver);
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

  private static abstract class AccessAnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessAnalyzerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.AccessAnalyzerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessAnalyzerService");
    }
  }

  private static final class AccessAnalyzerServiceFileDescriptorSupplier
      extends AccessAnalyzerServiceBaseDescriptorSupplier {
    AccessAnalyzerServiceFileDescriptorSupplier() {}
  }

  private static final class AccessAnalyzerServiceMethodDescriptorSupplier
      extends AccessAnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessAnalyzerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessAnalyzerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessAnalyzerServiceFileDescriptorSupplier())
              .addMethod(getListSubjectAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
