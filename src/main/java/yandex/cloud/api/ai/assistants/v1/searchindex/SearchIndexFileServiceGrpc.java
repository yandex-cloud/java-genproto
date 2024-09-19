package yandex.cloud.api.ai.assistants.v1.searchindex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/searchindex/search_index_file_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchIndexFileServiceGrpc {

  private SearchIndexFileServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.searchindex.SearchIndexFileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> getGetMethod;
    if ((getGetMethod = SearchIndexFileServiceGrpc.getGetMethod) == null) {
      synchronized (SearchIndexFileServiceGrpc.class) {
        if ((getGetMethod = SearchIndexFileServiceGrpc.getGetMethod) == null) {
          SearchIndexFileServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexFileServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest,
      yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> getListMethod;
    if ((getListMethod = SearchIndexFileServiceGrpc.getListMethod) == null) {
      synchronized (SearchIndexFileServiceGrpc.class) {
        if ((getListMethod = SearchIndexFileServiceGrpc.getListMethod) == null) {
          SearchIndexFileServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest, yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchIndexFileServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchIndexFileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceStub>() {
        @java.lang.Override
        public SearchIndexFileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexFileServiceStub(channel, callOptions);
        }
      };
    return SearchIndexFileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchIndexFileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceBlockingStub>() {
        @java.lang.Override
        public SearchIndexFileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexFileServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchIndexFileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchIndexFileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchIndexFileServiceFutureStub>() {
        @java.lang.Override
        public SearchIndexFileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchIndexFileServiceFutureStub(channel, callOptions);
        }
      };
    return SearchIndexFileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchIndexFileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest,
                yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class SearchIndexFileServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchIndexFileServiceStub> {
    private SearchIndexFileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexFileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexFileServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchIndexFileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchIndexFileServiceBlockingStub> {
    private SearchIndexFileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexFileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexFileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile get(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse list(yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchIndexFileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchIndexFileServiceFutureStub> {
    private SearchIndexFileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchIndexFileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchIndexFileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile> get(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse> list(
        yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchIndexFileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchIndexFileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.GetSearchIndexFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileOuterClass.SearchIndexFile>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.ListSearchIndexFilesResponse>) responseObserver);
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

  private static abstract class SearchIndexFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchIndexFileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.searchindex.SearchIndexFileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchIndexFileService");
    }
  }

  private static final class SearchIndexFileServiceFileDescriptorSupplier
      extends SearchIndexFileServiceBaseDescriptorSupplier {
    SearchIndexFileServiceFileDescriptorSupplier() {}
  }

  private static final class SearchIndexFileServiceMethodDescriptorSupplier
      extends SearchIndexFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchIndexFileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchIndexFileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchIndexFileServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
