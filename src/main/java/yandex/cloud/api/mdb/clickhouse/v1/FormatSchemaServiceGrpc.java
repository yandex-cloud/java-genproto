package yandex.cloud.api.mdb.clickhouse.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/clickhouse/v1/format_schema_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FormatSchemaServiceGrpc {

  private FormatSchemaServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.clickhouse.v1.FormatSchemaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest,
      yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest,
      yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest, yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> getGetMethod;
    if ((getGetMethod = FormatSchemaServiceGrpc.getGetMethod) == null) {
      synchronized (FormatSchemaServiceGrpc.class) {
        if ((getGetMethod = FormatSchemaServiceGrpc.getGetMethod) == null) {
          FormatSchemaServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest, yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema.getDefaultInstance()))
              .setSchemaDescriptor(new FormatSchemaServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest,
      yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest,
      yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest, yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> getListMethod;
    if ((getListMethod = FormatSchemaServiceGrpc.getListMethod) == null) {
      synchronized (FormatSchemaServiceGrpc.class) {
        if ((getListMethod = FormatSchemaServiceGrpc.getListMethod) == null) {
          FormatSchemaServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest, yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FormatSchemaServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = FormatSchemaServiceGrpc.getCreateMethod) == null) {
      synchronized (FormatSchemaServiceGrpc.class) {
        if ((getCreateMethod = FormatSchemaServiceGrpc.getCreateMethod) == null) {
          FormatSchemaServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FormatSchemaServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = FormatSchemaServiceGrpc.getUpdateMethod) == null) {
      synchronized (FormatSchemaServiceGrpc.class) {
        if ((getUpdateMethod = FormatSchemaServiceGrpc.getUpdateMethod) == null) {
          FormatSchemaServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FormatSchemaServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = FormatSchemaServiceGrpc.getDeleteMethod) == null) {
      synchronized (FormatSchemaServiceGrpc.class) {
        if ((getDeleteMethod = FormatSchemaServiceGrpc.getDeleteMethod) == null) {
          FormatSchemaServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FormatSchemaServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FormatSchemaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceStub>() {
        @java.lang.Override
        public FormatSchemaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormatSchemaServiceStub(channel, callOptions);
        }
      };
    return FormatSchemaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FormatSchemaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceBlockingStub>() {
        @java.lang.Override
        public FormatSchemaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormatSchemaServiceBlockingStub(channel, callOptions);
        }
      };
    return FormatSchemaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FormatSchemaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormatSchemaServiceFutureStub>() {
        @java.lang.Override
        public FormatSchemaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormatSchemaServiceFutureStub(channel, callOptions);
        }
      };
    return FormatSchemaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FormatSchemaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest,
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest,
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class FormatSchemaServiceStub extends io.grpc.stub.AbstractAsyncStub<FormatSchemaServiceStub> {
    private FormatSchemaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatSchemaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormatSchemaServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FormatSchemaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FormatSchemaServiceBlockingStub> {
    private FormatSchemaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatSchemaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormatSchemaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema get(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse list(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FormatSchemaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FormatSchemaServiceFutureStub> {
    private FormatSchemaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatSchemaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormatSchemaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema> get(
        yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse> list(
        yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest request) {
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
    private final FormatSchemaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FormatSchemaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.GetFormatSchemaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaOuterClass.FormatSchema>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.ListFormatSchemasResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.CreateFormatSchemaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.UpdateFormatSchemaRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.DeleteFormatSchemaRequest) request,
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

  private static abstract class FormatSchemaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FormatSchemaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.clickhouse.v1.FormatSchemaServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FormatSchemaService");
    }
  }

  private static final class FormatSchemaServiceFileDescriptorSupplier
      extends FormatSchemaServiceBaseDescriptorSupplier {
    FormatSchemaServiceFileDescriptorSupplier() {}
  }

  private static final class FormatSchemaServiceMethodDescriptorSupplier
      extends FormatSchemaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FormatSchemaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FormatSchemaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FormatSchemaServiceFileDescriptorSupplier())
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
