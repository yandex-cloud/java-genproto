package yandex.cloud.api.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for viewing statistics on search queries to Yandex.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/searchapi/v2/wordstat_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WordstatServiceGrpc {

  private WordstatServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.searchapi.v2.WordstatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> getGetTopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTop",
      requestType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest.class,
      responseType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> getGetTopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> getGetTopMethod;
    if ((getGetTopMethod = WordstatServiceGrpc.getGetTopMethod) == null) {
      synchronized (WordstatServiceGrpc.class) {
        if ((getGetTopMethod = WordstatServiceGrpc.getGetTopMethod) == null) {
          WordstatServiceGrpc.getGetTopMethod = getGetTopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordstatServiceMethodDescriptorSupplier("GetTop"))
              .build();
        }
      }
    }
    return getGetTopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> getGetDynamicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDynamics",
      requestType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest.class,
      responseType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> getGetDynamicsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> getGetDynamicsMethod;
    if ((getGetDynamicsMethod = WordstatServiceGrpc.getGetDynamicsMethod) == null) {
      synchronized (WordstatServiceGrpc.class) {
        if ((getGetDynamicsMethod = WordstatServiceGrpc.getGetDynamicsMethod) == null) {
          WordstatServiceGrpc.getGetDynamicsMethod = getGetDynamicsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDynamics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordstatServiceMethodDescriptorSupplier("GetDynamics"))
              .build();
        }
      }
    }
    return getGetDynamicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> getGetRegionsDistributionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegionsDistribution",
      requestType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest.class,
      responseType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> getGetRegionsDistributionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> getGetRegionsDistributionMethod;
    if ((getGetRegionsDistributionMethod = WordstatServiceGrpc.getGetRegionsDistributionMethod) == null) {
      synchronized (WordstatServiceGrpc.class) {
        if ((getGetRegionsDistributionMethod = WordstatServiceGrpc.getGetRegionsDistributionMethod) == null) {
          WordstatServiceGrpc.getGetRegionsDistributionMethod = getGetRegionsDistributionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegionsDistribution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordstatServiceMethodDescriptorSupplier("GetRegionsDistribution"))
              .build();
        }
      }
    }
    return getGetRegionsDistributionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> getGetRegionsTreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegionsTree",
      requestType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest.class,
      responseType = yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest,
      yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> getGetRegionsTreeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> getGetRegionsTreeMethod;
    if ((getGetRegionsTreeMethod = WordstatServiceGrpc.getGetRegionsTreeMethod) == null) {
      synchronized (WordstatServiceGrpc.class) {
        if ((getGetRegionsTreeMethod = WordstatServiceGrpc.getGetRegionsTreeMethod) == null) {
          WordstatServiceGrpc.getGetRegionsTreeMethod = getGetRegionsTreeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest, yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegionsTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordstatServiceMethodDescriptorSupplier("GetRegionsTree"))
              .build();
        }
      }
    }
    return getGetRegionsTreeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WordstatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordstatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordstatServiceStub>() {
        @java.lang.Override
        public WordstatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordstatServiceStub(channel, callOptions);
        }
      };
    return WordstatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WordstatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordstatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordstatServiceBlockingStub>() {
        @java.lang.Override
        public WordstatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordstatServiceBlockingStub(channel, callOptions);
        }
      };
    return WordstatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WordstatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordstatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordstatServiceFutureStub>() {
        @java.lang.Override
        public WordstatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordstatServiceFutureStub(channel, callOptions);
        }
      };
    return WordstatServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for viewing statistics on search queries to Yandex.
   * </pre>
   */
  public static abstract class WordstatServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The method returns the last 30 days data about popular queries containing the specified keyword and queries that are similar to the specified one.
     * </pre>
     */
    public void getTop(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopMethod(), responseObserver);
    }

    /**
     * <pre>
     * The method returns the frequency of queries over time for a given keyword.
     * </pre>
     */
    public void getDynamics(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDynamicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * The method returns the distribution of the number of queries containing the given keyword globally by region for the last 30 days.
     * </pre>
     */
    public void getRegionsDistribution(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionsDistributionMethod(), responseObserver);
    }

    /**
     * <pre>
     * The method method returns a tree of Wordstat-supported regions.
     * </pre>
     */
    public void getRegionsTree(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionsTreeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest,
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse>(
                  this, METHODID_GET_TOP)))
          .addMethod(
            getGetDynamicsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest,
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse>(
                  this, METHODID_GET_DYNAMICS)))
          .addMethod(
            getGetRegionsDistributionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest,
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse>(
                  this, METHODID_GET_REGIONS_DISTRIBUTION)))
          .addMethod(
            getGetRegionsTreeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest,
                yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse>(
                  this, METHODID_GET_REGIONS_TREE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for viewing statistics on search queries to Yandex.
   * </pre>
   */
  public static final class WordstatServiceStub extends io.grpc.stub.AbstractAsyncStub<WordstatServiceStub> {
    private WordstatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordstatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordstatServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * The method returns the last 30 days data about popular queries containing the specified keyword and queries that are similar to the specified one.
     * </pre>
     */
    public void getTop(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The method returns the frequency of queries over time for a given keyword.
     * </pre>
     */
    public void getDynamics(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDynamicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The method returns the distribution of the number of queries containing the given keyword globally by region for the last 30 days.
     * </pre>
     */
    public void getRegionsDistribution(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionsDistributionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The method method returns a tree of Wordstat-supported regions.
     * </pre>
     */
    public void getRegionsTree(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionsTreeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for viewing statistics on search queries to Yandex.
   * </pre>
   */
  public static final class WordstatServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WordstatServiceBlockingStub> {
    private WordstatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordstatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordstatServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The method returns the last 30 days data about popular queries containing the specified keyword and queries that are similar to the specified one.
     * </pre>
     */
    public yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse getTop(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The method returns the frequency of queries over time for a given keyword.
     * </pre>
     */
    public yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse getDynamics(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDynamicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The method returns the distribution of the number of queries containing the given keyword globally by region for the last 30 days.
     * </pre>
     */
    public yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse getRegionsDistribution(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionsDistributionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The method method returns a tree of Wordstat-supported regions.
     * </pre>
     */
    public yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse getRegionsTree(yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionsTreeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for viewing statistics on search queries to Yandex.
   * </pre>
   */
  public static final class WordstatServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WordstatServiceFutureStub> {
    private WordstatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordstatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordstatServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The method returns the last 30 days data about popular queries containing the specified keyword and queries that are similar to the specified one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse> getTop(
        yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The method returns the frequency of queries over time for a given keyword.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse> getDynamics(
        yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDynamicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The method returns the distribution of the number of queries containing the given keyword globally by region for the last 30 days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse> getRegionsDistribution(
        yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionsDistributionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The method method returns a tree of Wordstat-supported regions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse> getRegionsTree(
        yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionsTreeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP = 0;
  private static final int METHODID_GET_DYNAMICS = 1;
  private static final int METHODID_GET_REGIONS_DISTRIBUTION = 2;
  private static final int METHODID_GET_REGIONS_TREE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WordstatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WordstatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP:
          serviceImpl.getTop((yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetTopResponse>) responseObserver);
          break;
        case METHODID_GET_DYNAMICS:
          serviceImpl.getDynamics((yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetDynamicsResponse>) responseObserver);
          break;
        case METHODID_GET_REGIONS_DISTRIBUTION:
          serviceImpl.getRegionsDistribution((yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsDistributionResponse>) responseObserver);
          break;
        case METHODID_GET_REGIONS_TREE:
          serviceImpl.getRegionsTree((yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.WordstatServiceOuterClass.GetRegionsTreeResponse>) responseObserver);
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

  private static abstract class WordstatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WordstatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.search.v2.WordstatServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WordstatService");
    }
  }

  private static final class WordstatServiceFileDescriptorSupplier
      extends WordstatServiceBaseDescriptorSupplier {
    WordstatServiceFileDescriptorSupplier() {}
  }

  private static final class WordstatServiceMethodDescriptorSupplier
      extends WordstatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WordstatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WordstatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WordstatServiceFileDescriptorSupplier())
              .addMethod(getGetTopMethod())
              .addMethod(getGetDynamicsMethod())
              .addMethod(getGetRegionsDistributionMethod())
              .addMethod(getGetRegionsTreeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
