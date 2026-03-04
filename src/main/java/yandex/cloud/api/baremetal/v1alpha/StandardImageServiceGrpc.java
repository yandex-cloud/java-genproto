package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about standard image .
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/standard_image_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StandardImageServiceGrpc {

  private StandardImageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.StandardImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest,
      yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest,
      yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest, yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> getGetMethod;
    if ((getGetMethod = StandardImageServiceGrpc.getGetMethod) == null) {
      synchronized (StandardImageServiceGrpc.class) {
        if ((getGetMethod = StandardImageServiceGrpc.getGetMethod) == null) {
          StandardImageServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest, yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage.getDefaultInstance()))
              .setSchemaDescriptor(new StandardImageServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest,
      yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest,
      yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest, yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> getListMethod;
    if ((getListMethod = StandardImageServiceGrpc.getListMethod) == null) {
      synchronized (StandardImageServiceGrpc.class) {
        if ((getListMethod = StandardImageServiceGrpc.getListMethod) == null) {
          StandardImageServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest, yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StandardImageServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StandardImageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceStub>() {
        @java.lang.Override
        public StandardImageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StandardImageServiceStub(channel, callOptions);
        }
      };
    return StandardImageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StandardImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceBlockingStub>() {
        @java.lang.Override
        public StandardImageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StandardImageServiceBlockingStub(channel, callOptions);
        }
      };
    return StandardImageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StandardImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StandardImageServiceFutureStub>() {
        @java.lang.Override
        public StandardImageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StandardImageServiceFutureStub(channel, callOptions);
        }
      };
    return StandardImageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about standard image .
   * </pre>
   */
  public static abstract class StandardImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific standard Image resource.
     * To get the list of standard  resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder. Pass the "baremetal-standard-images" folder to get general images.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest,
                yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest,
                yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about standard image .
   * </pre>
   */
  public static final class StandardImageServiceStub extends io.grpc.stub.AbstractAsyncStub<StandardImageServiceStub> {
    private StandardImageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StandardImageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StandardImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific standard Image resource.
     * To get the list of standard  resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder. Pass the "baremetal-standard-images" folder to get general images.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about standard image .
   * </pre>
   */
  public static final class StandardImageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StandardImageServiceBlockingStub> {
    private StandardImageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StandardImageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StandardImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific standard Image resource.
     * To get the list of standard  resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage get(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder. Pass the "baremetal-standard-images" folder to get general images.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse list(yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about standard image .
   * </pre>
   */
  public static final class StandardImageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StandardImageServiceFutureStub> {
    private StandardImageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StandardImageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StandardImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific standard Image resource.
     * To get the list of standard  resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage> get(
        yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder. Pass the "baremetal-standard-images" folder to get general images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse> list(
        yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StandardImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StandardImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.GetStandardImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageOuterClass.StandardImage>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.ListStandardImagesResponse>) responseObserver);
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

  private static abstract class StandardImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StandardImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.StandardImageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StandardImageService");
    }
  }

  private static final class StandardImageServiceFileDescriptorSupplier
      extends StandardImageServiceBaseDescriptorSupplier {
    StandardImageServiceFileDescriptorSupplier() {}
  }

  private static final class StandardImageServiceMethodDescriptorSupplier
      extends StandardImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StandardImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StandardImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StandardImageServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
