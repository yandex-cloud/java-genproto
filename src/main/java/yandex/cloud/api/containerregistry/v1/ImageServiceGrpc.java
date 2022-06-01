package yandex.cloud.api.containerregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Image resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/containerregistry/v1/image_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImageServiceGrpc {

  private ImageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.ImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest,
      yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest,
      yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest, yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod;
    if ((getListMethod = ImageServiceGrpc.getListMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getListMethod = ImageServiceGrpc.getListMethod) == null) {
          ImageServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest, yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest,
      yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest,
      yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest, yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> getGetMethod;
    if ((getGetMethod = ImageServiceGrpc.getGetMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetMethod = ImageServiceGrpc.getGetMethod) == null) {
          ImageServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest, yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ImageServiceGrpc.getDeleteMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getDeleteMethod = ImageServiceGrpc.getDeleteMethod) == null) {
          ImageServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceStub>() {
        @java.lang.Override
        public ImageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceStub(channel, callOptions);
        }
      };
    return ImageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceBlockingStub>() {
        @java.lang.Override
        public ImageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceBlockingStub(channel, callOptions);
        }
      };
    return ImageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceFutureStub>() {
        @java.lang.Override
        public ImageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceFutureStub(channel, callOptions);
        }
      };
    return ImageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static abstract class ImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified registry or repository.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Docker image.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest,
                yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest,
                yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceStub extends io.grpc.stub.AbstractAsyncStub<ImageServiceStub> {
    private ImageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified registry or repository.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Docker image.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageServiceBlockingStub> {
    private ImageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified registry or repository.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse list(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image get(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Docker image.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImageServiceFutureStub> {
    private ImageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified registry or repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse> list(
        yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image> get(
        yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Docker image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.ListImagesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ImageOuterClass.Image>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.DeleteImageRequest) request,
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

  private static abstract class ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.ImageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageService");
    }
  }

  private static final class ImageServiceFileDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier {
    ImageServiceFileDescriptorSupplier() {}
  }

  private static final class ImageServiceMethodDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
