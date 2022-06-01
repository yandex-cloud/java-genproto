package yandex.cloud.api.logging.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for reading from log groups. To make a request use `reader.logging.yandexcloud.net`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/logging/v1/log_reading_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogReadingServiceGrpc {

  private LogReadingServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.logging.v1.LogReadingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest,
      yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest,
      yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest, yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> getReadMethod;
    if ((getReadMethod = LogReadingServiceGrpc.getReadMethod) == null) {
      synchronized (LogReadingServiceGrpc.class) {
        if ((getReadMethod = LogReadingServiceGrpc.getReadMethod) == null) {
          LogReadingServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest, yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogReadingServiceMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogReadingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceStub>() {
        @java.lang.Override
        public LogReadingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogReadingServiceStub(channel, callOptions);
        }
      };
    return LogReadingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogReadingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceBlockingStub>() {
        @java.lang.Override
        public LogReadingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogReadingServiceBlockingStub(channel, callOptions);
        }
      };
    return LogReadingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogReadingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogReadingServiceFutureStub>() {
        @java.lang.Override
        public LogReadingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogReadingServiceFutureStub(channel, callOptions);
        }
      };
    return LogReadingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for reading from log groups. To make a request use `reader.logging.yandexcloud.net`.
   * </pre>
   */
  public static abstract class LogReadingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Read log entries from the specified log group.
     * </pre>
     */
    public void read(yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest,
                yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse>(
                  this, METHODID_READ)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for reading from log groups. To make a request use `reader.logging.yandexcloud.net`.
   * </pre>
   */
  public static final class LogReadingServiceStub extends io.grpc.stub.AbstractAsyncStub<LogReadingServiceStub> {
    private LogReadingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogReadingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogReadingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read log entries from the specified log group.
     * </pre>
     */
    public void read(yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for reading from log groups. To make a request use `reader.logging.yandexcloud.net`.
   * </pre>
   */
  public static final class LogReadingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogReadingServiceBlockingStub> {
    private LogReadingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogReadingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogReadingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read log entries from the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse read(yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for reading from log groups. To make a request use `reader.logging.yandexcloud.net`.
   * </pre>
   */
  public static final class LogReadingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogReadingServiceFutureStub> {
    private LogReadingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogReadingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogReadingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read log entries from the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse> read(
        yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogReadingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogReadingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.ReadResponse>) responseObserver);
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

  private static abstract class LogReadingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogReadingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.logging.v1.LogReadingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogReadingService");
    }
  }

  private static final class LogReadingServiceFileDescriptorSupplier
      extends LogReadingServiceBaseDescriptorSupplier {
    LogReadingServiceFileDescriptorSupplier() {}
  }

  private static final class LogReadingServiceMethodDescriptorSupplier
      extends LogReadingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogReadingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogReadingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogReadingServiceFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
