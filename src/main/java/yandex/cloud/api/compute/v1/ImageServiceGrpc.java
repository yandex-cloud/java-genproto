package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A set of methods for managing Image resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/image_service.proto")
public final class ImageServiceGrpc {

  private ImageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.ImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest,
      yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest.class,
      responseType = yandex.cloud.api.compute.v1.ImageOuterClass.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest,
      yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest, yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetMethod;
    if ((getGetMethod = ImageServiceGrpc.getGetMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetMethod = ImageServiceGrpc.getGetMethod) == null) {
          ImageServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest, yandex.cloud.api.compute.v1.ImageOuterClass.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageOuterClass.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest,
      yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetLatestByFamilyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestByFamily",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest.class,
      responseType = yandex.cloud.api.compute.v1.ImageOuterClass.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest,
      yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetLatestByFamilyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest, yandex.cloud.api.compute.v1.ImageOuterClass.Image> getGetLatestByFamilyMethod;
    if ((getGetLatestByFamilyMethod = ImageServiceGrpc.getGetLatestByFamilyMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetLatestByFamilyMethod = ImageServiceGrpc.getGetLatestByFamilyMethod) == null) {
          ImageServiceGrpc.getGetLatestByFamilyMethod = getGetLatestByFamilyMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest, yandex.cloud.api.compute.v1.ImageOuterClass.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "GetLatestByFamily"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageOuterClass.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("GetLatestByFamily"))
                  .build();
          }
        }
     }
     return getGetLatestByFamilyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest,
      yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest.class,
      responseType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest,
      yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest, yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> getListMethod;
    if ((getListMethod = ImageServiceGrpc.getListMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getListMethod = ImageServiceGrpc.getListMethod) == null) {
          ImageServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest, yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ImageServiceGrpc.getCreateMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getCreateMethod = ImageServiceGrpc.getCreateMethod) == null) {
          ImageServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ImageServiceGrpc.getUpdateMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getUpdateMethod = ImageServiceGrpc.getUpdateMethod) == null) {
          ImageServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ImageServiceGrpc.getDeleteMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getDeleteMethod = ImageServiceGrpc.getDeleteMethod) == null) {
          ImageServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest,
      yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest,
      yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest, yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ImageServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getListOperationsMethod = ImageServiceGrpc.getListOperationsMethod) == null) {
          ImageServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest, yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.ImageService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageServiceStub newStub(io.grpc.Channel channel) {
    return new ImageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static abstract class ImageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the latest image that is part of an image family.
     * </pre>
     */
    public void getLatestByFamily(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestByFamilyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an image in the specified folder.
     * You can create an image from a disk, snapshot, other image or URI.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified image.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified image.
     * Deleting an image removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified image.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest,
                yandex.cloud.api.compute.v1.ImageOuterClass.Image>(
                  this, METHODID_GET)))
          .addMethod(
            getGetLatestByFamilyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest,
                yandex.cloud.api.compute.v1.ImageOuterClass.Image>(
                  this, METHODID_GET_LATEST_BY_FAMILY)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest,
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest,
                yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceStub extends io.grpc.stub.AbstractStub<ImageServiceStub> {
    private ImageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the latest image that is part of an image family.
     * </pre>
     */
    public void getLatestByFamily(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestByFamilyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an image in the specified folder.
     * You can create an image from a disk, snapshot, other image or URI.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified image.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified image.
     * Deleting an image removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified image.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceBlockingStub extends io.grpc.stub.AbstractStub<ImageServiceBlockingStub> {
    private ImageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ImageOuterClass.Image get(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the latest image that is part of an image family.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ImageOuterClass.Image getLatestByFamily(yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestByFamilyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse list(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an image in the specified folder.
     * You can create an image from a disk, snapshot, other image or URI.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified image.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified image.
     * Deleting an image removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified image.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse listOperations(yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Image resources.
   * </pre>
   */
  public static final class ImageServiceFutureStub extends io.grpc.stub.AbstractStub<ImageServiceFutureStub> {
    private ImageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Image resource.
     * To get the list of available Image resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ImageOuterClass.Image> get(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the latest image that is part of an image family.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ImageOuterClass.Image> getLatestByFamily(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestByFamilyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Image resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse> list(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an image in the specified folder.
     * You can create an image from a disk, snapshot, other image or URI.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified image.
     * Deleting an image removes its data permanently and is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_LATEST_BY_FAMILY = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;

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
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image>) responseObserver);
          break;
        case METHODID_GET_LATEST_BY_FAMILY:
          serviceImpl.getLatestByFamily((yandex.cloud.api.compute.v1.ImageServiceOuterClass.GetImageLatestByFamilyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageOuterClass.Image>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImagesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.ImageServiceOuterClass.CreateImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.ImageServiceOuterClass.UpdateImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.ImageServiceOuterClass.DeleteImageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ImageServiceOuterClass.ListImageOperationsResponse>) responseObserver);
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
      return yandex.cloud.api.compute.v1.ImageServiceOuterClass.getDescriptor();
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
              .addMethod(getGetMethod())
              .addMethod(getGetLatestByFamilyMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
