package yandex.cloud.api.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for searching the Yandex search database.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/searchapi/v2/search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebSearchServiceGrpc {

  private WebSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.searchapi.v2.WebSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
      yandex.cloud.api.search.v2.SearchService.WebSearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yandex.cloud.api.search.v2.SearchService.WebSearchRequest.class,
      responseType = yandex.cloud.api.search.v2.SearchService.WebSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
      yandex.cloud.api.search.v2.SearchService.WebSearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest, yandex.cloud.api.search.v2.SearchService.WebSearchResponse> getSearchMethod;
    if ((getSearchMethod = WebSearchServiceGrpc.getSearchMethod) == null) {
      synchronized (WebSearchServiceGrpc.class) {
        if ((getSearchMethod = WebSearchServiceGrpc.getSearchMethod) == null) {
          WebSearchServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.SearchService.WebSearchRequest, yandex.cloud.api.search.v2.SearchService.WebSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.SearchService.WebSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.SearchService.WebSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebSearchServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceStub>() {
        @java.lang.Override
        public WebSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchServiceStub(channel, callOptions);
        }
      };
    return WebSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceBlockingStub>() {
        @java.lang.Override
        public WebSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return WebSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchServiceFutureStub>() {
        @java.lang.Override
        public WebSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchServiceFutureStub(channel, callOptions);
        }
      };
    return WebSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database.
   * </pre>
   */
  public static abstract class WebSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.SearchService.WebSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
                yandex.cloud.api.search.v2.SearchService.WebSearchResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database.
   * </pre>
   */
  public static final class WebSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<WebSearchServiceStub> {
    private WebSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.SearchService.WebSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database.
   * </pre>
   */
  public static final class WebSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WebSearchServiceBlockingStub> {
    private WebSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.search.v2.SearchService.WebSearchResponse search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for searching the Yandex search database.
   * </pre>
   */
  public static final class WebSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WebSearchServiceFutureStub> {
    private WebSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.SearchService.WebSearchResponse> search(
        yandex.cloud.api.search.v2.SearchService.WebSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((yandex.cloud.api.search.v2.SearchService.WebSearchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.SearchService.WebSearchResponse>) responseObserver);
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

  private static abstract class WebSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.search.v2.SearchService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebSearchService");
    }
  }

  private static final class WebSearchServiceFileDescriptorSupplier
      extends WebSearchServiceBaseDescriptorSupplier {
    WebSearchServiceFileDescriptorSupplier() {}
  }

  private static final class WebSearchServiceMethodDescriptorSupplier
      extends WebSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebSearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WebSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebSearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
