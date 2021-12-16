package yandex.cloud.api.cdn.v1;

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
 * Provider's resources management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/cdn/v1/resource_service.proto")
public final class ResourceServiceGrpc {

  private ResourceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.ResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod;
    if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
          ResourceServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;
    if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
          ResourceServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ResourceServiceGrpc.getCreateMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getCreateMethod = ResourceServiceGrpc.getCreateMethod) == null) {
          ResourceServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ResourceServiceGrpc.getUpdateMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getUpdateMethod = ResourceServiceGrpc.getUpdateMethod) == null) {
          ResourceServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
          ResourceServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProviderCName",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod;
    if ((getGetProviderCNameMethod = ResourceServiceGrpc.getGetProviderCNameMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getGetProviderCNameMethod = ResourceServiceGrpc.getGetProviderCNameMethod) == null) {
          ResourceServiceGrpc.getGetProviderCNameMethod = getGetProviderCNameMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ResourceService", "GetProviderCName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("GetProviderCName"))
                  .build();
          }
        }
     }
     return getGetProviderCNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceServiceStub newStub(io.grpc.Channel channel) {
    return new ResourceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResourceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResourceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static abstract class ResourceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates client's CDN resource.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates of client's CDN resource. (PATCH behavior)
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Provider's CNAME (edge endpoint) bind to specified folder id.
     * Returns UNIMPLEMENTED error, if provider doesn't support CNAME request.
     * </pre>
     */
    public void getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProviderCNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
                yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetProviderCNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>(
                  this, METHODID_GET_PROVIDER_CNAME)))
          .build();
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceStub extends io.grpc.stub.AbstractStub<ResourceServiceStub> {
    private ResourceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates client's CDN resource.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates of client's CDN resource. (PATCH behavior)
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Provider's CNAME (edge endpoint) bind to specified folder id.
     * Returns UNIMPLEMENTED error, if provider doesn't support CNAME request.
     * </pre>
     */
    public void getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProviderCNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceBlockingStub extends io.grpc.stub.AbstractStub<ResourceServiceBlockingStub> {
    private ResourceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates client's CDN resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates of client's CDN resource. (PATCH behavior)
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Provider's CNAME (edge endpoint) bind to specified folder id.
     * Returns UNIMPLEMENTED error, if provider doesn't support CNAME request.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProviderCNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceFutureStub extends io.grpc.stub.AbstractStub<ResourceServiceFutureStub> {
    private ResourceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> get(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> list(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates client's CDN resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates of client's CDN resource. (PATCH behavior)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Provider's CNAME (edge endpoint) bind to specified folder id.
     * Returns UNIMPLEMENTED error, if provider doesn't support CNAME request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getProviderCName(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProviderCNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_PROVIDER_CNAME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PROVIDER_CNAME:
          serviceImpl.getProviderCName((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>) responseObserver);
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

  private static abstract class ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceService");
    }
  }

  private static final class ResourceServiceFileDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier {
    ResourceServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceServiceMethodDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetProviderCNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
