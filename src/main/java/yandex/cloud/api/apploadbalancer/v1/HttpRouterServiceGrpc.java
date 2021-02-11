package yandex.cloud.api.apploadbalancer.v1;

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
    comments = "Source: yandex/cloud/apploadbalancer/v1/http_router_service.proto")
public final class HttpRouterServiceGrpc {

  private HttpRouterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.apploadbalancer.v1.HttpRouterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> getGetMethod;
    if ((getGetMethod = HttpRouterServiceGrpc.getGetMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getGetMethod = HttpRouterServiceGrpc.getGetMethod) == null) {
          HttpRouterServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> getListMethod;
    if ((getListMethod = HttpRouterServiceGrpc.getListMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getListMethod = HttpRouterServiceGrpc.getListMethod) == null) {
          HttpRouterServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = HttpRouterServiceGrpc.getCreateMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getCreateMethod = HttpRouterServiceGrpc.getCreateMethod) == null) {
          HttpRouterServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = HttpRouterServiceGrpc.getUpdateMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getUpdateMethod = HttpRouterServiceGrpc.getUpdateMethod) == null) {
          HttpRouterServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = HttpRouterServiceGrpc.getDeleteMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getDeleteMethod = HttpRouterServiceGrpc.getDeleteMethod) == null) {
          HttpRouterServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = HttpRouterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (HttpRouterServiceGrpc.class) {
        if ((getListOperationsMethod = HttpRouterServiceGrpc.getListOperationsMethod) == null) {
          HttpRouterServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest, yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.HttpRouterService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HttpRouterServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HttpRouterServiceStub newStub(io.grpc.Channel channel) {
    return new HttpRouterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HttpRouterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HttpRouterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HttpRouterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HttpRouterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HttpRouterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified http router.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest,
                yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest,
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest,
                yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class HttpRouterServiceStub extends io.grpc.stub.AbstractStub<HttpRouterServiceStub> {
    private HttpRouterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HttpRouterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpRouterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HttpRouterServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified http router.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HttpRouterServiceBlockingStub extends io.grpc.stub.AbstractStub<HttpRouterServiceBlockingStub> {
    private HttpRouterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HttpRouterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpRouterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HttpRouterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter get(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse list(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified http router.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse listOperations(yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HttpRouterServiceFutureStub extends io.grpc.stub.AbstractStub<HttpRouterServiceFutureStub> {
    private HttpRouterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HttpRouterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpRouterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HttpRouterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter> get(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse> list(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified http router.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse> listOperations(
        yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HttpRouterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HttpRouterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.GetHttpRouterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterOuterClass.HttpRouter>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRoutersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.CreateHttpRouterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.UpdateHttpRouterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.DeleteHttpRouterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.ListHttpRouterOperationsResponse>) responseObserver);
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

  private static abstract class HttpRouterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HttpRouterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.apploadbalancer.v1.HttpRouterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HttpRouterService");
    }
  }

  private static final class HttpRouterServiceFileDescriptorSupplier
      extends HttpRouterServiceBaseDescriptorSupplier {
    HttpRouterServiceFileDescriptorSupplier() {}
  }

  private static final class HttpRouterServiceMethodDescriptorSupplier
      extends HttpRouterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HttpRouterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HttpRouterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HttpRouterServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
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
