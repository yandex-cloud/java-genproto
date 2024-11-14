package yandex.cloud.api.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for async search the Yandex search database.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/searchapi/v2/search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebSearchAsyncServiceGrpc {

  private WebSearchAsyncServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.searchapi.v2.WebSearchAsyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yandex.cloud.api.search.v2.SearchService.WebSearchRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSearchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.SearchService.WebSearchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSearchMethod;
    if ((getSearchMethod = WebSearchAsyncServiceGrpc.getSearchMethod) == null) {
      synchronized (WebSearchAsyncServiceGrpc.class) {
        if ((getSearchMethod = WebSearchAsyncServiceGrpc.getSearchMethod) == null) {
          WebSearchAsyncServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.SearchService.WebSearchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.SearchService.WebSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WebSearchAsyncServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebSearchAsyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceStub>() {
        @java.lang.Override
        public WebSearchAsyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchAsyncServiceStub(channel, callOptions);
        }
      };
    return WebSearchAsyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebSearchAsyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceBlockingStub>() {
        @java.lang.Override
        public WebSearchAsyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchAsyncServiceBlockingStub(channel, callOptions);
        }
      };
    return WebSearchAsyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebSearchAsyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSearchAsyncServiceFutureStub>() {
        @java.lang.Override
        public WebSearchAsyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSearchAsyncServiceFutureStub(channel, callOptions);
        }
      };
    return WebSearchAsyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for async search the Yandex search database.
   * </pre>
   */
  public static abstract class WebSearchAsyncServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.SearchService.WebSearchRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for async search the Yandex search database.
   * </pre>
   */
  public static final class WebSearchAsyncServiceStub extends io.grpc.stub.AbstractAsyncStub<WebSearchAsyncServiceStub> {
    private WebSearchAsyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchAsyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchAsyncServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for async search the Yandex search database.
   * </pre>
   */
  public static final class WebSearchAsyncServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WebSearchAsyncServiceBlockingStub> {
    private WebSearchAsyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchAsyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchAsyncServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation search(yandex.cloud.api.search.v2.SearchService.WebSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for async search the Yandex search database.
   * </pre>
   */
  public static final class WebSearchAsyncServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WebSearchAsyncServiceFutureStub> {
    private WebSearchAsyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSearchAsyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSearchAsyncServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> search(
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
    private final WebSearchAsyncServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebSearchAsyncServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((yandex.cloud.api.search.v2.SearchService.WebSearchRequest) request,
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

  private static abstract class WebSearchAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebSearchAsyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.search.v2.SearchService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebSearchAsyncService");
    }
  }

  private static final class WebSearchAsyncServiceFileDescriptorSupplier
      extends WebSearchAsyncServiceBaseDescriptorSupplier {
    WebSearchAsyncServiceFileDescriptorSupplier() {}
  }

  private static final class WebSearchAsyncServiceMethodDescriptorSupplier
      extends WebSearchAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebSearchAsyncServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WebSearchAsyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebSearchAsyncServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
