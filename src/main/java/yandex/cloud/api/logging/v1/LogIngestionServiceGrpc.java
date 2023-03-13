package yandex.cloud.api.logging.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for writing to log groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/logging/v1/log_ingestion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogIngestionServiceGrpc {

  private LogIngestionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.logging.v1.LogIngestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest,
      yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest,
      yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest, yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> getWriteMethod;
    if ((getWriteMethod = LogIngestionServiceGrpc.getWriteMethod) == null) {
      synchronized (LogIngestionServiceGrpc.class) {
        if ((getWriteMethod = LogIngestionServiceGrpc.getWriteMethod) == null) {
          LogIngestionServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest, yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogIngestionServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogIngestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceStub>() {
        @java.lang.Override
        public LogIngestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogIngestionServiceStub(channel, callOptions);
        }
      };
    return LogIngestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogIngestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceBlockingStub>() {
        @java.lang.Override
        public LogIngestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogIngestionServiceBlockingStub(channel, callOptions);
        }
      };
    return LogIngestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogIngestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogIngestionServiceFutureStub>() {
        @java.lang.Override
        public LogIngestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogIngestionServiceFutureStub(channel, callOptions);
        }
      };
    return LogIngestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for writing to log groups.
   * </pre>
   */
  public static abstract class LogIngestionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Write log entries to specified destination.
     * </pre>
     */
    public void write(yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest,
                yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for writing to log groups.
   * </pre>
   */
  public static final class LogIngestionServiceStub extends io.grpc.stub.AbstractAsyncStub<LogIngestionServiceStub> {
    private LogIngestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogIngestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogIngestionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Write log entries to specified destination.
     * </pre>
     */
    public void write(yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for writing to log groups.
   * </pre>
   */
  public static final class LogIngestionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogIngestionServiceBlockingStub> {
    private LogIngestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogIngestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogIngestionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Write log entries to specified destination.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse write(yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for writing to log groups.
   * </pre>
   */
  public static final class LogIngestionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogIngestionServiceFutureStub> {
    private LogIngestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogIngestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogIngestionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Write log entries to specified destination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse> write(
        yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogIngestionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogIngestionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.WriteResponse>) responseObserver);
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

  private static abstract class LogIngestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogIngestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.logging.v1.LogIngestionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogIngestionService");
    }
  }

  private static final class LogIngestionServiceFileDescriptorSupplier
      extends LogIngestionServiceBaseDescriptorSupplier {
    LogIngestionServiceFileDescriptorSupplier() {}
  }

  private static final class LogIngestionServiceMethodDescriptorSupplier
      extends LogIngestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogIngestionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogIngestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogIngestionServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
