package yandex.cloud.api.datatransfer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datatransfer/v1/endpoint_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EndpointServiceGrpc {

  private EndpointServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datatransfer.v1.EndpointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest,
      yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest.class,
      responseType = yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest,
      yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest, yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> getGetMethod;
    if ((getGetMethod = EndpointServiceGrpc.getGetMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getGetMethod = EndpointServiceGrpc.getGetMethod) == null) {
          EndpointServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest, yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest,
      yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest.class,
      responseType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest,
      yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest, yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> getListMethod;
    if ((getListMethod = EndpointServiceGrpc.getListMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getListMethod = EndpointServiceGrpc.getListMethod) == null) {
          EndpointServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest, yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = EndpointServiceGrpc.getCreateMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getCreateMethod = EndpointServiceGrpc.getCreateMethod) == null) {
          EndpointServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = EndpointServiceGrpc.getUpdateMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getUpdateMethod = EndpointServiceGrpc.getUpdateMethod) == null) {
          EndpointServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = EndpointServiceGrpc.getDeleteMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getDeleteMethod = EndpointServiceGrpc.getDeleteMethod) == null) {
          EndpointServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EndpointServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceStub>() {
        @java.lang.Override
        public EndpointServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceStub(channel, callOptions);
        }
      };
    return EndpointServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EndpointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceBlockingStub>() {
        @java.lang.Override
        public EndpointServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceBlockingStub(channel, callOptions);
        }
      };
    return EndpointServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EndpointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceFutureStub>() {
        @java.lang.Override
        public EndpointServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceFutureStub(channel, callOptions);
        }
      };
    return EndpointServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EndpointServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest,
                yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest,
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class EndpointServiceStub extends io.grpc.stub.AbstractAsyncStub<EndpointServiceStub> {
    private EndpointServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EndpointServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EndpointServiceBlockingStub> {
    private EndpointServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint get(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse list(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EndpointServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EndpointServiceFutureStub> {
    private EndpointServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint> get(
        yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse> list(
        yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
    private final EndpointServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EndpointServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.GetEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointOuterClass.Endpoint>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.ListEndpointsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.CreateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.UpdateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.DeleteEndpointRequest) request,
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

  private static abstract class EndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EndpointServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datatransfer.v1.EndpointServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EndpointService");
    }
  }

  private static final class EndpointServiceFileDescriptorSupplier
      extends EndpointServiceBaseDescriptorSupplier {
    EndpointServiceFileDescriptorSupplier() {}
  }

  private static final class EndpointServiceMethodDescriptorSupplier
      extends EndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EndpointServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EndpointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EndpointServiceFileDescriptorSupplier())
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
