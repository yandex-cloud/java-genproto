package yandex.cloud.api.ai.assistants.v1.searchindex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/searchindex/search_index_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchIndexServiceGrpc {

  private SearchIndexServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.searchindex.SearchIndexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SearchIndexServiceGrpc.getCreateMethod) == null) {
      synchronized (SearchIndexServiceGrpc.class) {
        if ((getCreateMethod = SearchIndexServiceGrpc.getCreateMethod) == null) {
          SearchIndexServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getGetMethod;
    if ((getGetMethod = SearchIndexServiceGrpc.getGetMethod) == null) {
      synchronized (SearchIndexServiceGrpc.class) {
        if ((getGetMethod = SearchIndexServiceGrpc.getGetMethod) == null) {
          SearchIndexServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> getUpdateMethod;
    if ((getUpdateMethod = SearchIndexServiceGrpc.getUpdateMethod) == null) {
      synchronized (SearchIndexServiceGrpc.class) {
        if ((getUpdateMethod = SearchIndexServiceGrpc.getUpdateMethod) == null) {
          SearchIndexServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> getDeleteMethod;
    if ((getDeleteMethod = SearchIndexServiceGrpc.getDeleteMethod) == null) {
      synchronized (SearchIndexServiceGrpc.class) {
        if ((getDeleteMethod = SearchIndexServiceGrpc.getDeleteMethod) == null) {
          SearchIndexServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> getListMethod;
    if ((getListMethod = SearchIndexServiceGrpc.getListMethod) == null) {
      synchronized (SearchIndexServiceGrpc.class) {
        if ((getListMethod = SearchIndexServiceGrpc.getListMethod) == null) {
          SearchIndexServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchIndexServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceStub>() {
        @java.lang.Override
        public SearchIndexServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexServiceStub(channel, callOptions);
        }
      };
    return SearchIndexServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchIndexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceBlockingStub>() {
        @java.lang.Override
        public SearchIndexServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchIndexServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchIndexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexServiceFutureStub>() {
        @java.lang.Override
        public SearchIndexServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexServiceFutureStub(channel, callOptions);
        }
      };
    return SearchIndexServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchIndexServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class SearchIndexServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchIndexServiceStub> {
    private SearchIndexServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchIndexServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchIndexServiceBlockingStub> {
    private SearchIndexServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex update(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse delete(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchIndexServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchIndexServiceFutureStub> {
    private SearchIndexServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> get(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex> update(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse> delete(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse> list(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchIndexServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchIndexServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.CreateSearchIndexRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.GetSearchIndexRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.UpdateSearchIndexRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexOuterClass.SearchIndex>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.DeleteSearchIndexResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.ListSearchIndicesResponse>) responseObserver);
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

  private static abstract class SearchIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchIndexServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchIndexService");
    }
  }

  private static final class SearchIndexServiceFileDescriptorSupplier
      extends SearchIndexServiceBaseDescriptorSupplier {
    SearchIndexServiceFileDescriptorSupplier() {}
  }

  private static final class SearchIndexServiceMethodDescriptorSupplier
      extends SearchIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchIndexServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchIndexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchIndexServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
