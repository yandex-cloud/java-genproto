package yandex.cloud.api.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for searching the Yandex search database using YandexGPT generative AI.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/searchapi/v2/gen_search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GenSearchServiceGrpc {

  private GenSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.searchapi.v2.GenSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest,
      yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest.class,
      responseType = yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest,
      yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest, yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> getSearchMethod;
    if ((getSearchMethod = GenSearchServiceGrpc.getSearchMethod) == null) {
      synchronized (GenSearchServiceGrpc.class) {
        if ((getSearchMethod = GenSearchServiceGrpc.getSearchMethod) == null) {
          GenSearchServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest, yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GenSearchServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceStub>() {
        @java.lang.Override
        public GenSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenSearchServiceStub(channel, callOptions);
        }
      };
    return GenSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceBlockingStub>() {
        @java.lang.Override
        public GenSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return GenSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenSearchServiceFutureStub>() {
        @java.lang.Override
        public GenSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenSearchServiceFutureStub(channel, callOptions);
        }
      };
    return GenSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database using YandexGPT generative AI.
   * </pre>
   */
  public static abstract class GenSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest,
                yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database using YandexGPT generative AI.
   * </pre>
   */
  public static final class GenSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<GenSearchServiceStub> {
    private GenSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database using YandexGPT generative AI.
   * </pre>
   */
  public static final class GenSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GenSearchServiceBlockingStub> {
    private GenSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse> search(
        yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database using YandexGPT generative AI.
   * </pre>
   */
  public static final class GenSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GenSearchServiceFutureStub> {
    private GenSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenSearchServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GenSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GenSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.GenSearchServiceOuterClass.GenSearchResponse>) responseObserver);
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

  private static abstract class GenSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.search.v2.GenSearchServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenSearchService");
    }
  }

  private static final class GenSearchServiceFileDescriptorSupplier
      extends GenSearchServiceBaseDescriptorSupplier {
    GenSearchServiceFileDescriptorSupplier() {}
  }

  private static final class GenSearchServiceMethodDescriptorSupplier
      extends GenSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GenSearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GenSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenSearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
