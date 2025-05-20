package yandex.cloud.api.clouddesktop.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for managing desktop images.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/clouddesktop/v1/desktop_image_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DesktopImageServiceGrpc {

  private DesktopImageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.clouddesktop.v1.api.DesktopImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest, yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> getListMethod;
    if ((getListMethod = DesktopImageServiceGrpc.getListMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getListMethod = DesktopImageServiceGrpc.getListMethod) == null) {
          DesktopImageServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest, yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest, yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> getGetMethod;
    if ((getGetMethod = DesktopImageServiceGrpc.getGetMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getGetMethod = DesktopImageServiceGrpc.getGetMethod) == null) {
          DesktopImageServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest, yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Copy",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyMethod;
    if ((getCopyMethod = DesktopImageServiceGrpc.getCopyMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getCopyMethod = DesktopImageServiceGrpc.getCopyMethod) == null) {
          DesktopImageServiceGrpc.getCopyMethod = getCopyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Copy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("Copy"))
              .build();
        }
      }
    }
    return getCopyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DesktopImageServiceGrpc.getUpdateMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getUpdateMethod = DesktopImageServiceGrpc.getUpdateMethod) == null) {
          DesktopImageServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyFromDesktopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyFromDesktop",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyFromDesktopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCopyFromDesktopMethod;
    if ((getCopyFromDesktopMethod = DesktopImageServiceGrpc.getCopyFromDesktopMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getCopyFromDesktopMethod = DesktopImageServiceGrpc.getCopyFromDesktopMethod) == null) {
          DesktopImageServiceGrpc.getCopyFromDesktopMethod = getCopyFromDesktopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyFromDesktop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("CopyFromDesktop"))
              .build();
        }
      }
    }
    return getCopyFromDesktopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DesktopImageServiceGrpc.getDeleteMethod) == null) {
      synchronized (DesktopImageServiceGrpc.class) {
        if ((getDeleteMethod = DesktopImageServiceGrpc.getDeleteMethod) == null) {
          DesktopImageServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopImageServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DesktopImageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceStub>() {
        @java.lang.Override
        public DesktopImageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopImageServiceStub(channel, callOptions);
        }
      };
    return DesktopImageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DesktopImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceBlockingStub>() {
        @java.lang.Override
        public DesktopImageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopImageServiceBlockingStub(channel, callOptions);
        }
      };
    return DesktopImageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DesktopImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopImageServiceFutureStub>() {
        @java.lang.Override
        public DesktopImageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopImageServiceFutureStub(channel, callOptions);
        }
      };
    return DesktopImageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for managing desktop images.
   * </pre>
   */
  public static abstract class DesktopImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists desktop images in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified desktop image.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copies the specified image to desktop image.
     * </pre>
     */
    public void copy(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates desktop image properties.
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copies the specified desktop image from the specified desktop.
     * </pre>
     */
    public void copyFromDesktop(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyFromDesktopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop image.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage>(
                  this, METHODID_GET)))
          .addMethod(
            getCopyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_COPY)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getCopyFromDesktopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_COPY_FROM_DESKTOP)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for managing desktop images.
   * </pre>
   */
  public static final class DesktopImageServiceStub extends io.grpc.stub.AbstractAsyncStub<DesktopImageServiceStub> {
    private DesktopImageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopImageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists desktop images in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified desktop image.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies the specified image to desktop image.
     * </pre>
     */
    public void copy(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates desktop image properties.
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies the specified desktop image from the specified desktop.
     * </pre>
     */
    public void copyFromDesktop(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyFromDesktopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop image.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for managing desktop images.
   * </pre>
   */
  public static final class DesktopImageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DesktopImageServiceBlockingStub> {
    private DesktopImageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopImageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists desktop images in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse list(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified desktop image.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage get(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies the specified image to desktop image.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation copy(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates desktop image properties.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies the specified desktop image from the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation copyFromDesktop(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyFromDesktopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop image.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for managing desktop images.
   * </pre>
   */
  public static final class DesktopImageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DesktopImageServiceFutureStub> {
    private DesktopImageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopImageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists desktop images in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse> list(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified desktop image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage> get(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies the specified image to desktop image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> copy(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates desktop image properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies the specified desktop image from the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> copyFromDesktop(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyFromDesktopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_COPY = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_COPY_FROM_DESKTOP = 4;
  private static final int METHODID_DELETE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DesktopImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DesktopImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.ListDesktopImagesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.GetDesktopImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopImageOuterClass.DesktopImage>) responseObserver);
          break;
        case METHODID_COPY:
          serviceImpl.copy((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyDesktopImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.UpdateDesktopImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_COPY_FROM_DESKTOP:
          serviceImpl.copyFromDesktop((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.CopyFromDesktopRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.DeleteDesktopImageRequest) request,
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

  private static abstract class DesktopImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DesktopImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.clouddesktop.v1.DesktopImageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DesktopImageService");
    }
  }

  private static final class DesktopImageServiceFileDescriptorSupplier
      extends DesktopImageServiceBaseDescriptorSupplier {
    DesktopImageServiceFileDescriptorSupplier() {}
  }

  private static final class DesktopImageServiceMethodDescriptorSupplier
      extends DesktopImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DesktopImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DesktopImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DesktopImageServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getCopyMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getCopyFromDesktopMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
