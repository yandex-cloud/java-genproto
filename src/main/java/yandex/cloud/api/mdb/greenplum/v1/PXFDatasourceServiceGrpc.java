package yandex.cloud.api.mdb.greenplum.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/greenplum/v1/pxf_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PXFDatasourceServiceGrpc {

  private PXFDatasourceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.greenplum.v1.PXFDatasourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest,
      yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest,
      yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest, yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> getListMethod;
    if ((getListMethod = PXFDatasourceServiceGrpc.getListMethod) == null) {
      synchronized (PXFDatasourceServiceGrpc.class) {
        if ((getListMethod = PXFDatasourceServiceGrpc.getListMethod) == null) {
          PXFDatasourceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest, yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PXFDatasourceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PXFDatasourceServiceGrpc.getCreateMethod) == null) {
      synchronized (PXFDatasourceServiceGrpc.class) {
        if ((getCreateMethod = PXFDatasourceServiceGrpc.getCreateMethod) == null) {
          PXFDatasourceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PXFDatasourceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PXFDatasourceServiceGrpc.getUpdateMethod) == null) {
      synchronized (PXFDatasourceServiceGrpc.class) {
        if ((getUpdateMethod = PXFDatasourceServiceGrpc.getUpdateMethod) == null) {
          PXFDatasourceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PXFDatasourceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PXFDatasourceServiceGrpc.getDeleteMethod) == null) {
      synchronized (PXFDatasourceServiceGrpc.class) {
        if ((getDeleteMethod = PXFDatasourceServiceGrpc.getDeleteMethod) == null) {
          PXFDatasourceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PXFDatasourceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PXFDatasourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceStub>() {
        @java.lang.Override
        public PXFDatasourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PXFDatasourceServiceStub(channel, callOptions);
        }
      };
    return PXFDatasourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PXFDatasourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceBlockingStub>() {
        @java.lang.Override
        public PXFDatasourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PXFDatasourceServiceBlockingStub(channel, callOptions);
        }
      };
    return PXFDatasourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PXFDatasourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PXFDatasourceServiceFutureStub>() {
        @java.lang.Override
        public PXFDatasourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PXFDatasourceServiceFutureStub(channel, callOptions);
        }
      };
    return PXFDatasourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PXFDatasourceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List all PXF datasources
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates PXF datasource
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update PXF datasource
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete PXF datasource
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest,
                yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class PXFDatasourceServiceStub extends io.grpc.stub.AbstractAsyncStub<PXFDatasourceServiceStub> {
    private PXFDatasourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PXFDatasourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PXFDatasourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all PXF datasources
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates PXF datasource
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update PXF datasource
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete PXF datasource
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PXFDatasourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PXFDatasourceServiceBlockingStub> {
    private PXFDatasourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PXFDatasourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PXFDatasourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all PXF datasources
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse list(yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates PXF datasource
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update PXF datasource
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete PXF datasource
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PXFDatasourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PXFDatasourceServiceFutureStub> {
    private PXFDatasourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PXFDatasourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PXFDatasourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all PXF datasources
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse> list(
        yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates PXF datasource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update PXF datasource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete PXF datasource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PXFDatasourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PXFDatasourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.PxfService.ListPXFDatasourcesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.greenplum.v1.PxfService.CreatePXFDatasourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.greenplum.v1.PxfService.UpdatePXFDatasourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.greenplum.v1.PxfService.DeletePXFDatasourceRequest) request,
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

  private static abstract class PXFDatasourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PXFDatasourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.greenplum.v1.PxfService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PXFDatasourceService");
    }
  }

  private static final class PXFDatasourceServiceFileDescriptorSupplier
      extends PXFDatasourceServiceBaseDescriptorSupplier {
    PXFDatasourceServiceFileDescriptorSupplier() {}
  }

  private static final class PXFDatasourceServiceMethodDescriptorSupplier
      extends PXFDatasourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PXFDatasourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PXFDatasourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PXFDatasourceServiceFileDescriptorSupplier())
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
