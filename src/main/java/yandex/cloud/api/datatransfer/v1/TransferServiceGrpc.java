package yandex.cloud.api.datatransfer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datatransfer/v1/transfer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransferServiceGrpc {

  private TransferServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datatransfer.v1.TransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TransferServiceGrpc.getCreateMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getCreateMethod = TransferServiceGrpc.getCreateMethod) == null) {
          TransferServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TransferServiceGrpc.getUpdateMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getUpdateMethod = TransferServiceGrpc.getUpdateMethod) == null) {
          TransferServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TransferServiceGrpc.getDeleteMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getDeleteMethod = TransferServiceGrpc.getDeleteMethod) == null) {
          TransferServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest,
      yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest.class,
      responseType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest,
      yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest, yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> getListMethod;
    if ((getListMethod = TransferServiceGrpc.getListMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getListMethod = TransferServiceGrpc.getListMethod) == null) {
          TransferServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest, yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest,
      yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest.class,
      responseType = yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest,
      yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest, yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> getGetMethod;
    if ((getGetMethod = TransferServiceGrpc.getGetMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getGetMethod = TransferServiceGrpc.getGetMethod) == null) {
          TransferServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest, yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = TransferServiceGrpc.getDeactivateMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getDeactivateMethod = TransferServiceGrpc.getDeactivateMethod) == null) {
          TransferServiceGrpc.getDeactivateMethod = getDeactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Deactivate"))
              .build();
        }
      }
    }
    return getDeactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = TransferServiceGrpc.getActivateMethod) == null) {
      synchronized (TransferServiceGrpc.class) {
        if ((getActivateMethod = TransferServiceGrpc.getActivateMethod) == null) {
          TransferServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TransferServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransferServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceStub>() {
        @java.lang.Override
        public TransferServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceStub(channel, callOptions);
        }
      };
    return TransferServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceBlockingStub>() {
        @java.lang.Override
        public TransferServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceBlockingStub(channel, callOptions);
        }
      };
    return TransferServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransferServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransferServiceFutureStub>() {
        @java.lang.Override
        public TransferServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransferServiceFutureStub(channel, callOptions);
        }
      };
    return TransferServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransferServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void deactivate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    /**
     */
    public void activate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest,
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest,
                yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer>(
                  this, METHODID_GET)))
          .addMethod(
            getDeactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   */
  public static final class TransferServiceStub extends io.grpc.stub.AbstractAsyncStub<TransferServiceStub> {
    private TransferServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransferServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransferServiceBlockingStub> {
    private TransferServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse list(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer get(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransferServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TransferServiceFutureStub> {
    private TransferServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransferServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransferServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse> list(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer> get(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_GET = 4;
  private static final int METHODID_DEACTIVATE = 5;
  private static final int METHODID_ACTIVATE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.CreateTransferRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.UpdateTransferRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeleteTransferRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ListTransfersResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.GetTransferRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.TransferOuterClass.Transfer>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.DeactivateTransferRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.ActivateTransferRequest) request,
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

  private static abstract class TransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datatransfer.v1.TransferServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransferService");
    }
  }

  private static final class TransferServiceFileDescriptorSupplier
      extends TransferServiceBaseDescriptorSupplier {
    TransferServiceFileDescriptorSupplier() {}
  }

  private static final class TransferServiceMethodDescriptorSupplier
      extends TransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransferServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransferServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeactivateMethod())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
