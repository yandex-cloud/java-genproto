package yandex.cloud.api.smartwebsecurity.v1.waf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing RuleSetDescriptor resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/smartwebsecurity/v1/waf/rule_set_descriptor_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RuleSetDescriptorServiceGrpc {

  private RuleSetDescriptorServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.smartwebsecurity.v1.waf.RuleSetDescriptorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest, yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> getGetMethod;
    if ((getGetMethod = RuleSetDescriptorServiceGrpc.getGetMethod) == null) {
      synchronized (RuleSetDescriptorServiceGrpc.class) {
        if ((getGetMethod = RuleSetDescriptorServiceGrpc.getGetMethod) == null) {
          RuleSetDescriptorServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest, yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor.getDefaultInstance()))
              .setSchemaDescriptor(new RuleSetDescriptorServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RuleSetDescriptorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceStub>() {
        @java.lang.Override
        public RuleSetDescriptorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuleSetDescriptorServiceStub(channel, callOptions);
        }
      };
    return RuleSetDescriptorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RuleSetDescriptorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceBlockingStub>() {
        @java.lang.Override
        public RuleSetDescriptorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuleSetDescriptorServiceBlockingStub(channel, callOptions);
        }
      };
    return RuleSetDescriptorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RuleSetDescriptorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuleSetDescriptorServiceFutureStub>() {
        @java.lang.Override
        public RuleSetDescriptorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuleSetDescriptorServiceFutureStub(channel, callOptions);
        }
      };
    return RuleSetDescriptorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing RuleSetDescriptor resources.
   * </pre>
   */
  public static abstract class RuleSetDescriptorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified RuleSetDescriptor resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest,
                yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing RuleSetDescriptor resources.
   * </pre>
   */
  public static final class RuleSetDescriptorServiceStub extends io.grpc.stub.AbstractAsyncStub<RuleSetDescriptorServiceStub> {
    private RuleSetDescriptorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuleSetDescriptorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuleSetDescriptorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RuleSetDescriptor resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RuleSetDescriptor resources.
   * </pre>
   */
  public static final class RuleSetDescriptorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RuleSetDescriptorServiceBlockingStub> {
    private RuleSetDescriptorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuleSetDescriptorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuleSetDescriptorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RuleSetDescriptor resource.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor get(yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RuleSetDescriptor resources.
   * </pre>
   */
  public static final class RuleSetDescriptorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RuleSetDescriptorServiceFutureStub> {
    private RuleSetDescriptorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuleSetDescriptorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuleSetDescriptorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RuleSetDescriptor resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor> get(
        yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RuleSetDescriptorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RuleSetDescriptorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.GetRuleSetDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorOuterClass.RuleSetDescriptor>) responseObserver);
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

  private static abstract class RuleSetDescriptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RuleSetDescriptorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.smartwebsecurity.v1.waf.RuleSetDescriptorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RuleSetDescriptorService");
    }
  }

  private static final class RuleSetDescriptorServiceFileDescriptorSupplier
      extends RuleSetDescriptorServiceBaseDescriptorSupplier {
    RuleSetDescriptorServiceFileDescriptorSupplier() {}
  }

  private static final class RuleSetDescriptorServiceMethodDescriptorSupplier
      extends RuleSetDescriptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RuleSetDescriptorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RuleSetDescriptorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RuleSetDescriptorServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
