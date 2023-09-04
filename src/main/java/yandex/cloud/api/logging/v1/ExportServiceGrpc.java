package yandex.cloud.api.logging.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/logging/v1/export_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExportServiceGrpc {

  private ExportServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.logging.v1.ExportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Run",
      requestType = yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRunMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRunMethod;
    if ((getRunMethod = ExportServiceGrpc.getRunMethod) == null) {
      synchronized (ExportServiceGrpc.class) {
        if ((getRunMethod = ExportServiceGrpc.getRunMethod) == null) {
          ExportServiceGrpc.getRunMethod = getRunMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Run"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExportServiceMethodDescriptorSupplier("Run"))
              .build();
        }
      }
    }
    return getRunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExportServiceStub>() {
        @java.lang.Override
        public ExportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExportServiceStub(channel, callOptions);
        }
      };
    return ExportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExportServiceBlockingStub>() {
        @java.lang.Override
        public ExportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExportServiceBlockingStub(channel, callOptions);
        }
      };
    return ExportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExportServiceFutureStub>() {
        @java.lang.Override
        public ExportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExportServiceFutureStub(channel, callOptions);
        }
      };
    return ExportServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void run(yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RUN)))
          .build();
    }
  }

  /**
   */
  public static final class ExportServiceStub extends io.grpc.stub.AbstractAsyncStub<ExportServiceStub> {
    private ExportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExportServiceStub(channel, callOptions);
    }

    /**
     */
    public void run(yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExportServiceBlockingStub> {
    private ExportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation run(yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExportServiceFutureStub> {
    private ExportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> run(
        yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RUN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN:
          serviceImpl.run((yandex.cloud.api.logging.v1.ExportServiceOuterClass.RunExportRequest) request,
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

  private static abstract class ExportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.logging.v1.ExportServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExportService");
    }
  }

  private static final class ExportServiceFileDescriptorSupplier
      extends ExportServiceBaseDescriptorSupplier {
    ExportServiceFileDescriptorSupplier() {}
  }

  private static final class ExportServiceMethodDescriptorSupplier
      extends ExportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExportServiceFileDescriptorSupplier())
              .addMethod(getRunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
