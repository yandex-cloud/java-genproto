package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/test_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest,
      yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest,
      yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest, yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> getGetMethod;
    if ((getGetMethod = TestServiceGrpc.getGetMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetMethod = TestServiceGrpc.getGetMethod) == null) {
          TestServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest, yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TestServiceGrpc.getUpdateMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getUpdateMethod = TestServiceGrpc.getUpdateMethod) == null) {
          TestServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceStub>() {
        @java.lang.Override
        public TestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceStub(channel, callOptions);
        }
      };
    return TestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub>() {
        @java.lang.Override
        public TestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceBlockingStub(channel, callOptions);
        }
      };
    return TestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub>() {
        @java.lang.Override
        public TestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceFutureStub(channel, callOptions);
        }
      };
    return TestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns test by test id.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified test.
     * </pre>
     */
    public void update(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest,
                yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractAsyncStub<TestServiceStub> {
    private TestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns test by test id.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified test.
     * </pre>
     */
    public void update(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns test by test id.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test get(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified test.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestServiceFutureStub> {
    private TestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns test by test id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test> get(
        yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified test.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_UPDATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.GetTestRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.TestOuterClass.Test>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.UpdateTestRequest) request,
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

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.TestServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
