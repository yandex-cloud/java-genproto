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
 * Origin management service.
 * Origin is not a standalone entity. It can live only within origin group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/cdn/v1/origin_service.proto")
public final class OriginServiceGrpc {

  private OriginServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.OriginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest,
      yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest.class,
      responseType = yandex.cloud.api.cdn.v1.OriginOuterClass.Origin.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest,
      yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest, yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> getGetMethod;
    if ((getGetMethod = OriginServiceGrpc.getGetMethod) == null) {
      synchronized (OriginServiceGrpc.class) {
        if ((getGetMethod = OriginServiceGrpc.getGetMethod) == null) {
          OriginServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest, yandex.cloud.api.cdn.v1.OriginOuterClass.Origin>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginOuterClass.Origin.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest,
      yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest.class,
      responseType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest,
      yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest, yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> getListMethod;
    if ((getListMethod = OriginServiceGrpc.getListMethod) == null) {
      synchronized (OriginServiceGrpc.class) {
        if ((getListMethod = OriginServiceGrpc.getListMethod) == null) {
          OriginServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest, yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = OriginServiceGrpc.getCreateMethod) == null) {
      synchronized (OriginServiceGrpc.class) {
        if ((getCreateMethod = OriginServiceGrpc.getCreateMethod) == null) {
          OriginServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = OriginServiceGrpc.getUpdateMethod) == null) {
      synchronized (OriginServiceGrpc.class) {
        if ((getUpdateMethod = OriginServiceGrpc.getUpdateMethod) == null) {
          OriginServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = OriginServiceGrpc.getDeleteMethod) == null) {
      synchronized (OriginServiceGrpc.class) {
        if ((getDeleteMethod = OriginServiceGrpc.getDeleteMethod) == null) {
          OriginServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.OriginService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OriginServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OriginServiceStub newStub(io.grpc.Channel channel) {
    return new OriginServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OriginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OriginServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OriginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OriginServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Origin management service.
   * Origin is not a standalone entity. It can live only within origin group.
   * </pre>
   */
  public static abstract class OriginServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get origin in origin group.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates origin inside origin group.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified origin from the origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin via a [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes origin from origin group.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest,
                yandex.cloud.api.cdn.v1.OriginOuterClass.Origin>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest,
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Origin management service.
   * Origin is not a standalone entity. It can live only within origin group.
   * </pre>
   */
  public static final class OriginServiceStub extends io.grpc.stub.AbstractStub<OriginServiceStub> {
    private OriginServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get origin in origin group.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates origin inside origin group.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified origin from the origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin via a [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes origin from origin group.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Origin management service.
   * Origin is not a standalone entity. It can live only within origin group.
   * </pre>
   */
  public static final class OriginServiceBlockingStub extends io.grpc.stub.AbstractStub<OriginServiceBlockingStub> {
    private OriginServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get origin in origin group.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.OriginOuterClass.Origin get(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse list(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates origin inside origin group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified origin from the origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin via a [CacheService.Purge] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes origin from origin group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Origin management service.
   * Origin is not a standalone entity. It can live only within origin group.
   * </pre>
   */
  public static final class OriginServiceFutureStub extends io.grpc.stub.AbstractStub<OriginServiceFutureStub> {
    private OriginServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OriginServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OriginServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OriginServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get origin in origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.OriginOuterClass.Origin> get(
        yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists origins of origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse> list(
        yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates origin inside origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified origin from the origin group.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge cache of the resources that
     * use the origin via a [CacheService.Purge] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes origin from origin group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest request) {
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
    private final OriginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OriginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.OriginServiceOuterClass.GetOriginRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginOuterClass.Origin>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.OriginServiceOuterClass.ListOriginsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cdn.v1.OriginServiceOuterClass.CreateOriginRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.OriginServiceOuterClass.UpdateOriginRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cdn.v1.OriginServiceOuterClass.DeleteOriginRequest) request,
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

  private static abstract class OriginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OriginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.OriginServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OriginService");
    }
  }

  private static final class OriginServiceFileDescriptorSupplier
      extends OriginServiceBaseDescriptorSupplier {
    OriginServiceFileDescriptorSupplier() {}
  }

  private static final class OriginServiceMethodDescriptorSupplier
      extends OriginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OriginServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OriginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OriginServiceFileDescriptorSupplier())
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
