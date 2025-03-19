package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Thumbnail management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/thumbnail_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ThumbnailServiceGrpc {

  private ThumbnailServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.ThumbnailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest,
      yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest.class,
      responseType = yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest,
      yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest, yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> getGetMethod;
    if ((getGetMethod = ThumbnailServiceGrpc.getGetMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getGetMethod = ThumbnailServiceGrpc.getGetMethod) == null) {
          ThumbnailServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest, yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest.class,
      responseType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> getListMethod;
    if ((getListMethod = ThumbnailServiceGrpc.getListMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getListMethod = ThumbnailServiceGrpc.getListMethod) == null) {
          ThumbnailServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ThumbnailServiceGrpc.getCreateMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getCreateMethod = ThumbnailServiceGrpc.getCreateMethod) == null) {
          ThumbnailServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> getBatchGenerateDownloadURLsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGenerateDownloadURLs",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest.class,
      responseType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> getBatchGenerateDownloadURLsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> getBatchGenerateDownloadURLsMethod;
    if ((getBatchGenerateDownloadURLsMethod = ThumbnailServiceGrpc.getBatchGenerateDownloadURLsMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getBatchGenerateDownloadURLsMethod = ThumbnailServiceGrpc.getBatchGenerateDownloadURLsMethod) == null) {
          ThumbnailServiceGrpc.getBatchGenerateDownloadURLsMethod = getBatchGenerateDownloadURLsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGenerateDownloadURLs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("BatchGenerateDownloadURLs"))
              .build();
        }
      }
    }
    return getBatchGenerateDownloadURLsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> getGenerateUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateUploadURL",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest.class,
      responseType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest,
      yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> getGenerateUploadURLMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> getGenerateUploadURLMethod;
    if ((getGenerateUploadURLMethod = ThumbnailServiceGrpc.getGenerateUploadURLMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getGenerateUploadURLMethod = ThumbnailServiceGrpc.getGenerateUploadURLMethod) == null) {
          ThumbnailServiceGrpc.getGenerateUploadURLMethod = getGenerateUploadURLMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest, yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("GenerateUploadURL"))
              .build();
        }
      }
    }
    return getGenerateUploadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ThumbnailServiceGrpc.getDeleteMethod) == null) {
      synchronized (ThumbnailServiceGrpc.class) {
        if ((getDeleteMethod = ThumbnailServiceGrpc.getDeleteMethod) == null) {
          ThumbnailServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ThumbnailServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThumbnailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceStub>() {
        @java.lang.Override
        public ThumbnailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThumbnailServiceStub(channel, callOptions);
        }
      };
    return ThumbnailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThumbnailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceBlockingStub>() {
        @java.lang.Override
        public ThumbnailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThumbnailServiceBlockingStub(channel, callOptions);
        }
      };
    return ThumbnailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThumbnailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThumbnailServiceFutureStub>() {
        @java.lang.Override
        public ThumbnailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThumbnailServiceFutureStub(channel, callOptions);
        }
      };
    return ThumbnailServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Thumbnail management service.
   * </pre>
   */
  public static abstract class ThumbnailServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the specific thumbnail.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List thumbnails for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create thumbnail.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate urls for downloading images.
     * </pre>
     */
    public void batchGenerateDownloadURLs(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGenerateDownloadURLsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate url for uploading an image.
     * </pre>
     */
    public void generateUploadURL(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateUploadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete thumbnail.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest,
                yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest,
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getBatchGenerateDownloadURLsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest,
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse>(
                  this, METHODID_BATCH_GENERATE_DOWNLOAD_URLS)))
          .addMethod(
            getGenerateUploadURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest,
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse>(
                  this, METHODID_GENERATE_UPLOAD_URL)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Thumbnail management service.
   * </pre>
   */
  public static final class ThumbnailServiceStub extends io.grpc.stub.AbstractAsyncStub<ThumbnailServiceStub> {
    private ThumbnailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThumbnailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThumbnailServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific thumbnail.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List thumbnails for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create thumbnail.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate urls for downloading images.
     * </pre>
     */
    public void batchGenerateDownloadURLs(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGenerateDownloadURLsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate url for uploading an image.
     * </pre>
     */
    public void generateUploadURL(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateUploadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete thumbnail.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Thumbnail management service.
   * </pre>
   */
  public static final class ThumbnailServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ThumbnailServiceBlockingStub> {
    private ThumbnailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThumbnailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThumbnailServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific thumbnail.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail get(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List thumbnails for channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse list(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create thumbnail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate urls for downloading images.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse batchGenerateDownloadURLs(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGenerateDownloadURLsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate url for uploading an image.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse generateUploadURL(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateUploadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete thumbnail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Thumbnail management service.
   * </pre>
   */
  public static final class ThumbnailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ThumbnailServiceFutureStub> {
    private ThumbnailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThumbnailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThumbnailServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific thumbnail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail> get(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List thumbnails for channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse> list(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create thumbnail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate urls for downloading images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse> batchGenerateDownloadURLs(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGenerateDownloadURLsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate url for uploading an image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse> generateUploadURL(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateUploadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete thumbnail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_BATCH_GENERATE_DOWNLOAD_URLS = 3;
  private static final int METHODID_GENERATE_UPLOAD_URL = 4;
  private static final int METHODID_DELETE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThumbnailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThumbnailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GetThumbnailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailOuterClass.Thumbnail>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.ListThumbnailResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.CreateThumbnailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_GENERATE_DOWNLOAD_URLS:
          serviceImpl.batchGenerateDownloadURLs((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.BatchGenerateDownloadURLsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_UPLOAD_URL:
          serviceImpl.generateUploadURL((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.GenerateThumbnailUploadURLResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.DeleteThumbnailRequest) request,
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

  private static abstract class ThumbnailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThumbnailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.ThumbnailServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThumbnailService");
    }
  }

  private static final class ThumbnailServiceFileDescriptorSupplier
      extends ThumbnailServiceBaseDescriptorSupplier {
    ThumbnailServiceFileDescriptorSupplier() {}
  }

  private static final class ThumbnailServiceMethodDescriptorSupplier
      extends ThumbnailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThumbnailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThumbnailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThumbnailServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getBatchGenerateDownloadURLsMethod())
              .addMethod(getGenerateUploadURLMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
