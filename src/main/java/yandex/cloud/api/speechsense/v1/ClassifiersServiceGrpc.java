package yandex.cloud.api.speechsense.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/speechsense/v1/classifiers_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClassifiersServiceGrpc {

  private ClassifiersServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.speechsense.v1.ClassifiersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest,
      yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest,
      yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest, yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> getListMethod;
    if ((getListMethod = ClassifiersServiceGrpc.getListMethod) == null) {
      synchronized (ClassifiersServiceGrpc.class) {
        if ((getListMethod = ClassifiersServiceGrpc.getListMethod) == null) {
          ClassifiersServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest, yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifiersServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClassifiersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceStub>() {
        @java.lang.Override
        public ClassifiersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifiersServiceStub(channel, callOptions);
        }
      };
    return ClassifiersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClassifiersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceBlockingStub>() {
        @java.lang.Override
        public ClassifiersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifiersServiceBlockingStub(channel, callOptions);
        }
      };
    return ClassifiersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClassifiersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifiersServiceFutureStub>() {
        @java.lang.Override
        public ClassifiersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifiersServiceFutureStub(channel, callOptions);
        }
      };
    return ClassifiersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClassifiersServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Rpc for listing classifiers in a project
     * </pre>
     */
    public void list(yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest,
                yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ClassifiersServiceStub extends io.grpc.stub.AbstractAsyncStub<ClassifiersServiceStub> {
    private ClassifiersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifiersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifiersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing classifiers in a project
     * </pre>
     */
    public void list(yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClassifiersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClassifiersServiceBlockingStub> {
    private ClassifiersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifiersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifiersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing classifiers in a project
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse list(yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClassifiersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClassifiersServiceFutureStub> {
    private ClassifiersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifiersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifiersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing classifiers in a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse> list(
        yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest request) {
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
    private final ClassifiersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClassifiersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.ListClassifiersResponse>) responseObserver);
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

  private static abstract class ClassifiersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClassifiersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.speechsense.v1.ClassifiersServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClassifiersService");
    }
  }

  private static final class ClassifiersServiceFileDescriptorSupplier
      extends ClassifiersServiceBaseDescriptorSupplier {
    ClassifiersServiceFileDescriptorSupplier() {}
  }

  private static final class ClassifiersServiceMethodDescriptorSupplier
      extends ClassifiersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClassifiersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClassifiersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClassifiersServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
