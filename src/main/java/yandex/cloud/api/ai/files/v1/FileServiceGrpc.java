package yandex.cloud.api.ai.files.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * FileService provides operations for managing files.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/files/v1/file_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileServiceGrpc {

  private FileServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.files.v1.FileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileOuterClass.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File> getCreateMethod;
    if ((getCreateMethod = FileServiceGrpc.getCreateMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getCreateMethod = FileServiceGrpc.getCreateMethod) == null) {
          FileServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileOuterClass.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileOuterClass.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File> getGetMethod;
    if ((getGetMethod = FileServiceGrpc.getGetMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getGetMethod = FileServiceGrpc.getGetMethod) == null) {
          FileServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileOuterClass.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> getGetUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUrl",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> getGetUrlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> getGetUrlMethod;
    if ((getGetUrlMethod = FileServiceGrpc.getGetUrlMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getGetUrlMethod = FileServiceGrpc.getGetUrlMethod) == null) {
          FileServiceGrpc.getGetUrlMethod = getGetUrlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("GetUrl"))
              .build();
        }
      }
    }
    return getGetUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileOuterClass.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest,
      yandex.cloud.api.ai.files.v1.FileOuterClass.File> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File> getUpdateMethod;
    if ((getUpdateMethod = FileServiceGrpc.getUpdateMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getUpdateMethod = FileServiceGrpc.getUpdateMethod) == null) {
          FileServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest, yandex.cloud.api.ai.files.v1.FileOuterClass.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileOuterClass.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> getDeleteMethod;
    if ((getDeleteMethod = FileServiceGrpc.getDeleteMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getDeleteMethod = FileServiceGrpc.getDeleteMethod) == null) {
          FileServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest.class,
      responseType = yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest,
      yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> getListMethod;
    if ((getListMethod = FileServiceGrpc.getListMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getListMethod = FileServiceGrpc.getListMethod) == null) {
          FileServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest, yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceStub>() {
        @java.lang.Override
        public FileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceStub(channel, callOptions);
        }
      };
    return FileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub>() {
        @java.lang.Override
        public FileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceBlockingStub(channel, callOptions);
        }
      };
    return FileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub>() {
        @java.lang.Override
        public FileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceFutureStub(channel, callOptions);
        }
      };
    return FileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * FileService provides operations for managing files.
   * </pre>
   */
  public static abstract class FileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new file.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific file by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a URL for accessing or downloading a specific file.
     * </pre>
     */
    public void getUrl(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing file.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a file by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List files in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest,
                yandex.cloud.api.ai.files.v1.FileOuterClass.File>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest,
                yandex.cloud.api.ai.files.v1.FileOuterClass.File>(
                  this, METHODID_GET)))
          .addMethod(
            getGetUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest,
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse>(
                  this, METHODID_GET_URL)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest,
                yandex.cloud.api.ai.files.v1.FileOuterClass.File>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest,
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest,
                yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * FileService provides operations for managing files.
   * </pre>
   */
  public static final class FileServiceStub extends io.grpc.stub.AbstractAsyncStub<FileServiceStub> {
    private FileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new file.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific file by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a URL for accessing or downloading a specific file.
     * </pre>
     */
    public void getUrl(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing file.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a file by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List files in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * FileService provides operations for managing files.
   * </pre>
   */
  public static final class FileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileServiceBlockingStub> {
    private FileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new file.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileOuterClass.File create(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific file by its ID.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileOuterClass.File get(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a URL for accessing or downloading a specific file.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse getUrl(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing file.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileOuterClass.File update(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a file by its ID.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse delete(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List files in a specific folder.
     * </pre>
     */
    public yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse list(yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * FileService provides operations for managing files.
   * </pre>
   */
  public static final class FileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FileServiceFutureStub> {
    private FileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileOuterClass.File> create(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific file by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileOuterClass.File> get(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a URL for accessing or downloading a specific file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse> getUrl(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileOuterClass.File> update(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a file by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse> delete(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List files in a specific folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse> list(
        yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_URL = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.CreateFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File>) responseObserver);
          break;
        case METHODID_GET_URL:
          serviceImpl.getUrl((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.GetFileUrlResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.UpdateFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileOuterClass.File>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.DeleteFileResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.files.v1.FileServiceOuterClass.ListFilesResponse>) responseObserver);
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

  private static abstract class FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.files.v1.FileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileService");
    }
  }

  private static final class FileServiceFileDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier {
    FileServiceFileDescriptorSupplier() {}
  }

  private static final class FileServiceMethodDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetUrlMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
