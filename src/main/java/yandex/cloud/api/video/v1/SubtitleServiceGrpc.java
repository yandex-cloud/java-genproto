package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Subtitle management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/subtitle_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubtitleServiceGrpc {

  private SubtitleServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.SubtitleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest,
      yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest.class,
      responseType = yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest,
      yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest, yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> getGetMethod;
    if ((getGetMethod = SubtitleServiceGrpc.getGetMethod) == null) {
      synchronized (SubtitleServiceGrpc.class) {
        if ((getGetMethod = SubtitleServiceGrpc.getGetMethod) == null) {
          SubtitleServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest, yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle.getDefaultInstance()))
              .setSchemaDescriptor(new SubtitleServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest,
      yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest.class,
      responseType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest,
      yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest, yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> getListMethod;
    if ((getListMethod = SubtitleServiceGrpc.getListMethod) == null) {
      synchronized (SubtitleServiceGrpc.class) {
        if ((getListMethod = SubtitleServiceGrpc.getListMethod) == null) {
          SubtitleServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest, yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubtitleServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SubtitleServiceGrpc.getCreateMethod) == null) {
      synchronized (SubtitleServiceGrpc.class) {
        if ((getCreateMethod = SubtitleServiceGrpc.getCreateMethod) == null) {
          SubtitleServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubtitleServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest,
      yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> getGenerateUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateUploadURL",
      requestType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest.class,
      responseType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest,
      yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> getGenerateUploadURLMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest, yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> getGenerateUploadURLMethod;
    if ((getGenerateUploadURLMethod = SubtitleServiceGrpc.getGenerateUploadURLMethod) == null) {
      synchronized (SubtitleServiceGrpc.class) {
        if ((getGenerateUploadURLMethod = SubtitleServiceGrpc.getGenerateUploadURLMethod) == null) {
          SubtitleServiceGrpc.getGenerateUploadURLMethod = getGenerateUploadURLMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest, yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubtitleServiceMethodDescriptorSupplier("GenerateUploadURL"))
              .build();
        }
      }
    }
    return getGenerateUploadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SubtitleServiceGrpc.getDeleteMethod) == null) {
      synchronized (SubtitleServiceGrpc.class) {
        if ((getDeleteMethod = SubtitleServiceGrpc.getDeleteMethod) == null) {
          SubtitleServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubtitleServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubtitleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceStub>() {
        @java.lang.Override
        public SubtitleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubtitleServiceStub(channel, callOptions);
        }
      };
    return SubtitleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubtitleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceBlockingStub>() {
        @java.lang.Override
        public SubtitleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubtitleServiceBlockingStub(channel, callOptions);
        }
      };
    return SubtitleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubtitleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubtitleServiceFutureStub>() {
        @java.lang.Override
        public SubtitleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubtitleServiceFutureStub(channel, callOptions);
        }
      };
    return SubtitleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Subtitle management service.
   * </pre>
   */
  public static abstract class SubtitleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Return a specific subtitle.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List subtitles.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new subtitle.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate an upload URL to add a new subtitle file.
     * </pre>
     */
    public void generateUploadURL(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateUploadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a specific subtitle.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest,
                yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest,
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGenerateUploadURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest,
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse>(
                  this, METHODID_GENERATE_UPLOAD_URL)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Subtitle management service.
   * </pre>
   */
  public static final class SubtitleServiceStub extends io.grpc.stub.AbstractAsyncStub<SubtitleServiceStub> {
    private SubtitleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubtitleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubtitleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a specific subtitle.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List subtitles.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new subtitle.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate an upload URL to add a new subtitle file.
     * </pre>
     */
    public void generateUploadURL(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateUploadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a specific subtitle.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Subtitle management service.
   * </pre>
   */
  public static final class SubtitleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubtitleServiceBlockingStub> {
    private SubtitleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubtitleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubtitleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a specific subtitle.
     * </pre>
     */
    public yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle get(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List subtitles.
     * </pre>
     */
    public yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse list(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new subtitle.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate an upload URL to add a new subtitle file.
     * </pre>
     */
    public yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse generateUploadURL(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateUploadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a specific subtitle.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Subtitle management service.
   * </pre>
   */
  public static final class SubtitleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubtitleServiceFutureStub> {
    private SubtitleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubtitleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubtitleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return a specific subtitle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle> get(
        yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List subtitles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse> list(
        yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new subtitle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate an upload URL to add a new subtitle file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse> generateUploadURL(
        yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateUploadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a specific subtitle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_GENERATE_UPLOAD_URL = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubtitleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubtitleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GetSubtitleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleOuterClass.Subtitle>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.ListSubtitlesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.SubtitleServiceOuterClass.CreateSubtitleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_UPLOAD_URL:
          serviceImpl.generateUploadURL((yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.SubtitleServiceOuterClass.GenerateSubtitleUploadURLResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.SubtitleServiceOuterClass.DeleteSubtitleRequest) request,
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

  private static abstract class SubtitleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubtitleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.SubtitleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubtitleService");
    }
  }

  private static final class SubtitleServiceFileDescriptorSupplier
      extends SubtitleServiceBaseDescriptorSupplier {
    SubtitleServiceFileDescriptorSupplier() {}
  }

  private static final class SubtitleServiceMethodDescriptorSupplier
      extends SubtitleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubtitleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubtitleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubtitleServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGenerateUploadURLMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
