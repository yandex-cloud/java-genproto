package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about RentalPeriod resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/rental_period_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RentalPeriodServiceGrpc {

  private RentalPeriodServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.RentalPeriodService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest,
      yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest,
      yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest, yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> getListMethod;
    if ((getListMethod = RentalPeriodServiceGrpc.getListMethod) == null) {
      synchronized (RentalPeriodServiceGrpc.class) {
        if ((getListMethod = RentalPeriodServiceGrpc.getListMethod) == null) {
          RentalPeriodServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest, yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RentalPeriodServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RentalPeriodServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceStub>() {
        @java.lang.Override
        public RentalPeriodServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RentalPeriodServiceStub(channel, callOptions);
        }
      };
    return RentalPeriodServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RentalPeriodServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceBlockingStub>() {
        @java.lang.Override
        public RentalPeriodServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RentalPeriodServiceBlockingStub(channel, callOptions);
        }
      };
    return RentalPeriodServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RentalPeriodServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RentalPeriodServiceFutureStub>() {
        @java.lang.Override
        public RentalPeriodServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RentalPeriodServiceFutureStub(channel, callOptions);
        }
      };
    return RentalPeriodServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about RentalPeriod resources.
   * </pre>
   */
  public static abstract class RentalPeriodServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of RentalPeriod resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest,
                yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about RentalPeriod resources.
   * </pre>
   */
  public static final class RentalPeriodServiceStub extends io.grpc.stub.AbstractAsyncStub<RentalPeriodServiceStub> {
    private RentalPeriodServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RentalPeriodServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RentalPeriodServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of RentalPeriod resources.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about RentalPeriod resources.
   * </pre>
   */
  public static final class RentalPeriodServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RentalPeriodServiceBlockingStub> {
    private RentalPeriodServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RentalPeriodServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RentalPeriodServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of RentalPeriod resources.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse list(yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about RentalPeriod resources.
   * </pre>
   */
  public static final class RentalPeriodServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RentalPeriodServiceFutureStub> {
    private RentalPeriodServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RentalPeriodServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RentalPeriodServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of RentalPeriod resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse> list(
        yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest request) {
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
    private final RentalPeriodServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RentalPeriodServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.ListRentalPeriodsResponse>) responseObserver);
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

  private static abstract class RentalPeriodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RentalPeriodServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.RentalPeriodServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RentalPeriodService");
    }
  }

  private static final class RentalPeriodServiceFileDescriptorSupplier
      extends RentalPeriodServiceBaseDescriptorSupplier {
    RentalPeriodServiceFileDescriptorSupplier() {}
  }

  private static final class RentalPeriodServiceMethodDescriptorSupplier
      extends RentalPeriodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RentalPeriodServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RentalPeriodServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RentalPeriodServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
