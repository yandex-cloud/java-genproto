package yandex.cloud.api.datacatalog.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datacatalog/v1/catalog_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CatalogServiceGrpc {

  private CatalogServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datacatalog.v1.CatalogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest,
      yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> getGetCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCatalog",
      requestType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest.class,
      responseType = yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest,
      yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> getGetCatalogMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest, yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> getGetCatalogMethod;
    if ((getGetCatalogMethod = CatalogServiceGrpc.getGetCatalogMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getGetCatalogMethod = CatalogServiceGrpc.getGetCatalogMethod) == null) {
          CatalogServiceGrpc.getGetCatalogMethod = getGetCatalogMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest, yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("GetCatalog"))
              .build();
        }
      }
    }
    return getGetCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest,
      yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> getListCatalogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCatalogs",
      requestType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest.class,
      responseType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest,
      yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> getListCatalogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest, yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> getListCatalogsMethod;
    if ((getListCatalogsMethod = CatalogServiceGrpc.getListCatalogsMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getListCatalogsMethod = CatalogServiceGrpc.getListCatalogsMethod) == null) {
          CatalogServiceGrpc.getListCatalogsMethod = getListCatalogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest, yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCatalogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("ListCatalogs"))
              .build();
        }
      }
    }
    return getListCatalogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCatalog",
      requestType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateCatalogMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateCatalogMethod;
    if ((getCreateCatalogMethod = CatalogServiceGrpc.getCreateCatalogMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getCreateCatalogMethod = CatalogServiceGrpc.getCreateCatalogMethod) == null) {
          CatalogServiceGrpc.getCreateCatalogMethod = getCreateCatalogMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("CreateCatalog"))
              .build();
        }
      }
    }
    return getCreateCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCatalog",
      requestType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCatalogMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCatalogMethod;
    if ((getDeleteCatalogMethod = CatalogServiceGrpc.getDeleteCatalogMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getDeleteCatalogMethod = CatalogServiceGrpc.getDeleteCatalogMethod) == null) {
          CatalogServiceGrpc.getDeleteCatalogMethod = getDeleteCatalogMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("DeleteCatalog"))
              .build();
        }
      }
    }
    return getDeleteCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCatalog",
      requestType = yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateCatalogMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateCatalogMethod;
    if ((getUpdateCatalogMethod = CatalogServiceGrpc.getUpdateCatalogMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getUpdateCatalogMethod = CatalogServiceGrpc.getUpdateCatalogMethod) == null) {
          CatalogServiceGrpc.getUpdateCatalogMethod = getUpdateCatalogMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("UpdateCatalog"))
              .build();
        }
      }
    }
    return getUpdateCatalogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatalogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogServiceStub>() {
        @java.lang.Override
        public CatalogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogServiceStub(channel, callOptions);
        }
      };
    return CatalogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatalogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogServiceBlockingStub>() {
        @java.lang.Override
        public CatalogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogServiceBlockingStub(channel, callOptions);
        }
      };
    return CatalogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CatalogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogServiceFutureStub>() {
        @java.lang.Override
        public CatalogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogServiceFutureStub(channel, callOptions);
        }
      };
    return CatalogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CatalogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified catalog.
     * </pre>
     */
    public void getCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of catalogs in the specified folder.
     * </pre>
     */
    public void listCatalogs(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCatalogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a catalog.
     * </pre>
     */
    public void createCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a catalog.
     * </pre>
     */
    public void deleteCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified catalog.
     * </pre>
     */
    public void updateCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCatalogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest,
                yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog>(
                  this, METHODID_GET_CATALOG)))
          .addMethod(
            getListCatalogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest,
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse>(
                  this, METHODID_LIST_CATALOGS)))
          .addMethod(
            getCreateCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_CATALOG)))
          .addMethod(
            getDeleteCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CATALOG)))
          .addMethod(
            getUpdateCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_CATALOG)))
          .build();
    }
  }

  /**
   */
  public static final class CatalogServiceStub extends io.grpc.stub.AbstractAsyncStub<CatalogServiceStub> {
    private CatalogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified catalog.
     * </pre>
     */
    public void getCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of catalogs in the specified folder.
     * </pre>
     */
    public void listCatalogs(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCatalogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a catalog.
     * </pre>
     */
    public void createCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a catalog.
     * </pre>
     */
    public void deleteCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified catalog.
     * </pre>
     */
    public void updateCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCatalogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CatalogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CatalogServiceBlockingStub> {
    private CatalogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified catalog.
     * </pre>
     */
    public yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog getCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of catalogs in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse listCatalogs(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCatalogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a catalog.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a catalog.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified catalog.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateCatalog(yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCatalogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CatalogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CatalogServiceFutureStub> {
    private CatalogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified catalog.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog> getCatalog(
        yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of catalogs in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse> listCatalogs(
        yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCatalogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a catalog.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createCatalog(
        yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a catalog.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCatalog(
        yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified catalog.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateCatalog(
        yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCatalogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CATALOG = 0;
  private static final int METHODID_LIST_CATALOGS = 1;
  private static final int METHODID_CREATE_CATALOG = 2;
  private static final int METHODID_DELETE_CATALOG = 3;
  private static final int METHODID_UPDATE_CATALOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatalogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CatalogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATALOG:
          serviceImpl.getCatalog((yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.GetCatalogRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogOuterClass.Catalog>) responseObserver);
          break;
        case METHODID_LIST_CATALOGS:
          serviceImpl.listCatalogs((yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.ListCatalogsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CATALOG:
          serviceImpl.createCatalog((yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.CreateCatalogRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CATALOG:
          serviceImpl.deleteCatalog((yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.DeleteCatalogRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_CATALOG:
          serviceImpl.updateCatalog((yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.UpdateCatalogRequest) request,
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

  private static abstract class CatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CatalogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datacatalog.v1.CatalogServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CatalogService");
    }
  }

  private static final class CatalogServiceFileDescriptorSupplier
      extends CatalogServiceBaseDescriptorSupplier {
    CatalogServiceFileDescriptorSupplier() {}
  }

  private static final class CatalogServiceMethodDescriptorSupplier
      extends CatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CatalogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CatalogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CatalogServiceFileDescriptorSupplier())
              .addMethod(getGetCatalogMethod())
              .addMethod(getListCatalogsMethod())
              .addMethod(getCreateCatalogMethod())
              .addMethod(getDeleteCatalogMethod())
              .addMethod(getUpdateCatalogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
