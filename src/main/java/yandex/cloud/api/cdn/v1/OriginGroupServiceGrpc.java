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
 * Origin Groups management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/cdn/v1/origin_group_service.proto")
public final class OriginGroupServiceGrpc {

  private OriginGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.OriginGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest,
      yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest.class,
      responseType = yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest,
      yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest, yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> getGetMethod;
    if ((getGetMethod = OriginGroupServiceGrpc.getGetMethod) == null) {
      synchronized (OriginGroupServiceGrpc.class) {
        if ((getGetMethod = OriginGroupServiceGrpc.getGetMethod) == null) {
          OriginGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest, yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest,
      yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest.class,
      responseType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest,
      yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest, yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> getListMethod;
    if ((getListMethod = OriginGroupServiceGrpc.getListMethod) == null) {
      synchronized (OriginGroupServiceGrpc.class) {
        if ((getListMethod = OriginGroupServiceGrpc.getListMethod) == null) {
          OriginGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest, yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = OriginGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (OriginGroupServiceGrpc.class) {
        if ((getCreateMethod = OriginGroupServiceGrpc.getCreateMethod) == null) {
          OriginGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = OriginGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (OriginGroupServiceGrpc.class) {
        if ((getUpdateMethod = OriginGroupServiceGrpc.getUpdateMethod) == null) {
          OriginGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = OriginGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (OriginGroupServiceGrpc.class) {
        if ((getDeleteMethod = OriginGroupServiceGrpc.getDeleteMethod) == null) {
          OriginGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OriginGroupServiceStub newStub(io.grpc.Channel channel) {
    return new OriginGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OriginGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OriginGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OriginGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OriginGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Origin Groups management service.
   * </pre>
   */
  public static abstract class OriginGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets origin group with specified origin group id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates origin group.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin group via a [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes origin group with specified origin group id.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest,
                yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest,
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Origin Groups management service.
   * </pre>
   */
  public static final class OriginGroupServiceStub extends io.grpc.stub.AbstractStub<OriginGroupServiceStub> {
    private OriginGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets origin group with specified origin group id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates origin group.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin group via a [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes origin group with specified origin group id.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Origin Groups management service.
   * </pre>
   */
  public static final class OriginGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<OriginGroupServiceBlockingStub> {
    private OriginGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets origin group with specified origin group id.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup get(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse list(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates origin group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin group via a [CacheService.Purge] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes origin group with specified origin group id.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Origin Groups management service.
   * </pre>
   */
  public static final class OriginGroupServiceFutureStub extends io.grpc.stub.AbstractStub<OriginGroupServiceFutureStub> {
    private OriginGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets origin group with specified origin group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup> get(
        yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse> list(
        yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin group via a [CacheService.Purge] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes origin group with specified origin group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OriginGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OriginGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.GetOriginGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupOuterClass.OriginGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.ListOriginGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.CreateOriginGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.UpdateOriginGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.DeleteOriginGroupRequest) request,
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

  private static abstract class OriginGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OriginGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.OriginGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OriginGroupService");
    }
  }

  private static final class OriginGroupServiceFileDescriptorSupplier
      extends OriginGroupServiceBaseDescriptorSupplier {
    OriginGroupServiceFileDescriptorSupplier() {}
  }

  private static final class OriginGroupServiceMethodDescriptorSupplier
      extends OriginGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OriginGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OriginGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OriginGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
