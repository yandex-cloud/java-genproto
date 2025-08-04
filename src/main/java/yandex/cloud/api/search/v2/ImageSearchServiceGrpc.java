package yandex.cloud.api.search.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for searching of images using the Yandex Images.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/searchapi/v2/img_search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImageSearchServiceGrpc {

  private ImageSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.searchapi.v2.ImageSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest,
      yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest.class,
      responseType = yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest,
      yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest, yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> getSearchMethod;
    if ((getSearchMethod = ImageSearchServiceGrpc.getSearchMethod) == null) {
      synchronized (ImageSearchServiceGrpc.class) {
        if ((getSearchMethod = ImageSearchServiceGrpc.getSearchMethod) == null) {
          ImageSearchServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest, yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImageSearchServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest,
      yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> getSearchByImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByImage",
      requestType = yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest.class,
      responseType = yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest,
      yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> getSearchByImageMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest, yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> getSearchByImageMethod;
    if ((getSearchByImageMethod = ImageSearchServiceGrpc.getSearchByImageMethod) == null) {
      synchronized (ImageSearchServiceGrpc.class) {
        if ((getSearchByImageMethod = ImageSearchServiceGrpc.getSearchByImageMethod) == null) {
          ImageSearchServiceGrpc.getSearchByImageMethod = getSearchByImageMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest, yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchByImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImageSearchServiceMethodDescriptorSupplier("SearchByImage"))
              .build();
        }
      }
    }
    return getSearchByImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceStub>() {
        @java.lang.Override
        public ImageSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageSearchServiceStub(channel, callOptions);
        }
      };
    return ImageSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceBlockingStub>() {
        @java.lang.Override
        public ImageSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return ImageSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageSearchServiceFutureStub>() {
        @java.lang.Override
        public ImageSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageSearchServiceFutureStub(channel, callOptions);
        }
      };
    return ImageSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for searching of images using the Yandex Images.
   * </pre>
   */
  public static abstract class ImageSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchByImage(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByImageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest,
                yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchByImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest,
                yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse>(
                  this, METHODID_SEARCH_BY_IMAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for searching of images using the Yandex Images.
   * </pre>
   */
  public static final class ImageSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<ImageSearchServiceStub> {
    private ImageSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByImage(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchByImageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for searching of images using the Yandex Images.
   * </pre>
   */
  public static final class ImageSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageSearchServiceBlockingStub> {
    private ImageSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse search(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse searchByImage(yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchByImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for searching of images using the Yandex Images.
   * </pre>
   */
  public static final class ImageSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImageSearchServiceFutureStub> {
    private ImageSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageSearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse> search(
        yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse> searchByImage(
        yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchByImageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SEARCH_BY_IMAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((yandex.cloud.api.search.v2.ImgSearchService.ImageSearchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_IMAGE:
          serviceImpl.searchByImage((yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.search.v2.ImgSearchService.ImageSearchByImageResponse>) responseObserver);
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

  private static abstract class ImageSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.search.v2.ImgSearchService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageSearchService");
    }
  }

  private static final class ImageSearchServiceFileDescriptorSupplier
      extends ImageSearchServiceBaseDescriptorSupplier {
    ImageSearchServiceFileDescriptorSupplier() {}
  }

  private static final class ImageSearchServiceMethodDescriptorSupplier
      extends ImageSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageSearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageSearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSearchByImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
