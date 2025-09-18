package yandex.cloud.api.speechsense.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/speechsense/v1/assistants_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssistantsServiceGrpc {

  private AssistantsServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.speechsense.v1.AssistantsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest,
      yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest,
      yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest, yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> getListMethod;
    if ((getListMethod = AssistantsServiceGrpc.getListMethod) == null) {
      synchronized (AssistantsServiceGrpc.class) {
        if ((getListMethod = AssistantsServiceGrpc.getListMethod) == null) {
          AssistantsServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest, yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantsServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest,
      yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest,
      yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> getListModelsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest, yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> getListModelsMethod;
    if ((getListModelsMethod = AssistantsServiceGrpc.getListModelsMethod) == null) {
      synchronized (AssistantsServiceGrpc.class) {
        if ((getListModelsMethod = AssistantsServiceGrpc.getListModelsMethod) == null) {
          AssistantsServiceGrpc.getListModelsMethod = getListModelsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest, yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantsServiceMethodDescriptorSupplier("ListModels"))
              .build();
        }
      }
    }
    return getListModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssistantsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceStub>() {
        @java.lang.Override
        public AssistantsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantsServiceStub(channel, callOptions);
        }
      };
    return AssistantsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssistantsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceBlockingStub>() {
        @java.lang.Override
        public AssistantsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantsServiceBlockingStub(channel, callOptions);
        }
      };
    return AssistantsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssistantsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantsServiceFutureStub>() {
        @java.lang.Override
        public AssistantsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantsServiceFutureStub(channel, callOptions);
        }
      };
    return AssistantsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AssistantsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Rpc for listing assistants in a project
     * </pre>
     */
    public void list(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rpc for listing available assistant models
     * </pre>
     */
    public void listModels(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest,
                yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest,
                yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse>(
                  this, METHODID_LIST_MODELS)))
          .build();
    }
  }

  /**
   */
  public static final class AssistantsServiceStub extends io.grpc.stub.AbstractAsyncStub<AssistantsServiceStub> {
    private AssistantsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing assistants in a project
     * </pre>
     */
    public void list(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rpc for listing available assistant models
     * </pre>
     */
    public void listModels(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssistantsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssistantsServiceBlockingStub> {
    private AssistantsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing assistants in a project
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse list(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rpc for listing available assistant models
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse listModels(yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssistantsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssistantsServiceFutureStub> {
    private AssistantsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Rpc for listing assistants in a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse> list(
        yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rpc for listing available assistant models
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse> listModels(
        yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_LIST_MODELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssistantsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssistantsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListAssistantsResponse>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.AssistantsServiceProto.ListModelsResponse>) responseObserver);
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

  private static abstract class AssistantsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssistantsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.speechsense.v1.AssistantsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssistantsService");
    }
  }

  private static final class AssistantsServiceFileDescriptorSupplier
      extends AssistantsServiceBaseDescriptorSupplier {
    AssistantsServiceFileDescriptorSupplier() {}
  }

  private static final class AssistantsServiceMethodDescriptorSupplier
      extends AssistantsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssistantsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssistantsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssistantsServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getListModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
