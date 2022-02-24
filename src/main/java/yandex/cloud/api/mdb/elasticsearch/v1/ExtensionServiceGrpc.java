package yandex.cloud.api.mdb.elasticsearch.v1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/elasticsearch/v1/extension_service.proto")
public final class ExtensionServiceGrpc {

  private ExtensionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.elasticsearch.v1.ExtensionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest, yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> getGetMethod;
    if ((getGetMethod = ExtensionServiceGrpc.getGetMethod) == null) {
      synchronized (ExtensionServiceGrpc.class) {
        if ((getGetMethod = ExtensionServiceGrpc.getGetMethod) == null) {
          ExtensionServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest, yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.ExtensionService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest, yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> getListMethod;
    if ((getListMethod = ExtensionServiceGrpc.getListMethod) == null) {
      synchronized (ExtensionServiceGrpc.class) {
        if ((getListMethod = ExtensionServiceGrpc.getListMethod) == null) {
          ExtensionServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest, yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.ExtensionService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ExtensionServiceGrpc.getCreateMethod) == null) {
      synchronized (ExtensionServiceGrpc.class) {
        if ((getCreateMethod = ExtensionServiceGrpc.getCreateMethod) == null) {
          ExtensionServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.ExtensionService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ExtensionServiceGrpc.getUpdateMethod) == null) {
      synchronized (ExtensionServiceGrpc.class) {
        if ((getUpdateMethod = ExtensionServiceGrpc.getUpdateMethod) == null) {
          ExtensionServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.ExtensionService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ExtensionServiceGrpc.getDeleteMethod) == null) {
      synchronized (ExtensionServiceGrpc.class) {
        if ((getDeleteMethod = ExtensionServiceGrpc.getDeleteMethod) == null) {
          ExtensionServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.ExtensionService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ExtensionServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtensionServiceStub newStub(io.grpc.Channel channel) {
    return new ExtensionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtensionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExtensionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtensionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExtensionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExtensionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified extension of Elasticsearch cluster.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available extensions for the specified Elasticsearch cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new extension version.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified extension.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified extension.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ExtensionServiceStub extends io.grpc.stub.AbstractStub<ExtensionServiceStub> {
    private ExtensionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified extension of Elasticsearch cluster.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available extensions for the specified Elasticsearch cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new extension version.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified extension.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified extension.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExtensionServiceBlockingStub extends io.grpc.stub.AbstractStub<ExtensionServiceBlockingStub> {
    private ExtensionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified extension of Elasticsearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension get(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of available extensions for the specified Elasticsearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse list(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new extension version.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified extension.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified extension.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExtensionServiceFutureStub extends io.grpc.stub.AbstractStub<ExtensionServiceFutureStub> {
    private ExtensionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExtensionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExtensionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified extension of Elasticsearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension> get(
        yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of available extensions for the specified Elasticsearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse> list(
        yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new extension version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified extension.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified extension.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest request) {
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
    private final ExtensionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExtensionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.GetExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionOuterClass.Extension>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.ListExtensionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.CreateExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.UpdateExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.DeleteExtensionRequest) request,
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

  private static abstract class ExtensionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtensionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.elasticsearch.v1.ExtensionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtensionService");
    }
  }

  private static final class ExtensionServiceFileDescriptorSupplier
      extends ExtensionServiceBaseDescriptorSupplier {
    ExtensionServiceFileDescriptorSupplier() {}
  }

  private static final class ExtensionServiceMethodDescriptorSupplier
      extends ExtensionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExtensionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExtensionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtensionServiceFileDescriptorSupplier())
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
