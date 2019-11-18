package yandex.cloud.api.serverless.triggers.v1;

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
    comments = "Source: yandex/cloud/serverless/triggers/v1/trigger_service.proto")
public final class TriggerServiceGrpc {

  private TriggerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.triggers.v1.TriggerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest.class,
      responseType = yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest, yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> getGetMethod;
    if ((getGetMethod = TriggerServiceGrpc.getGetMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getGetMethod = TriggerServiceGrpc.getGetMethod) == null) {
          TriggerServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest, yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest.class,
      responseType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest, yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> getListMethod;
    if ((getListMethod = TriggerServiceGrpc.getListMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListMethod = TriggerServiceGrpc.getListMethod) == null) {
          TriggerServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest, yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TriggerServiceGrpc.getCreateMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getCreateMethod = TriggerServiceGrpc.getCreateMethod) == null) {
          TriggerServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TriggerServiceGrpc.getUpdateMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getUpdateMethod = TriggerServiceGrpc.getUpdateMethod) == null) {
          TriggerServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TriggerServiceGrpc.getDeleteMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getDeleteMethod = TriggerServiceGrpc.getDeleteMethod) == null) {
          TriggerServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest,
      yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest, yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = TriggerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListOperationsMethod = TriggerServiceGrpc.getListOperationsMethod) == null) {
          TriggerServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest, yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.triggers.v1.TriggerService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TriggerServiceStub newStub(io.grpc.Channel channel) {
    return new TriggerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TriggerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TriggerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TriggerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TriggerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TriggerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest,
                yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest,
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest,
                yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class TriggerServiceStub extends io.grpc.stub.AbstractStub<TriggerServiceStub> {
    private TriggerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TriggerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TriggerServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TriggerServiceBlockingStub extends io.grpc.stub.AbstractStub<TriggerServiceBlockingStub> {
    private TriggerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TriggerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TriggerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger get(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse list(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse listOperations(yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TriggerServiceFutureStub extends io.grpc.stub.AbstractStub<TriggerServiceFutureStub> {
    private TriggerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TriggerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TriggerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger> get(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse> list(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse> listOperations(
        yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest request) {
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
    private final TriggerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TriggerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.GetTriggerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerOuterClass.Trigger>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.CreateTriggerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.UpdateTriggerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.DeleteTriggerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.ListTriggerOperationsResponse>) responseObserver);
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

  private static abstract class TriggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TriggerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.triggers.v1.TriggerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TriggerService");
    }
  }

  private static final class TriggerServiceFileDescriptorSupplier
      extends TriggerServiceBaseDescriptorSupplier {
    TriggerServiceFileDescriptorSupplier() {}
  }

  private static final class TriggerServiceMethodDescriptorSupplier
      extends TriggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TriggerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TriggerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TriggerServiceFileDescriptorSupplier())
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
