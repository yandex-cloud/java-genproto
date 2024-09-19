package yandex.cloud.api.ai.assistants.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/assistant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssistantServiceGrpc {

  private AssistantServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.AssistantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getCreateMethod;
    if ((getCreateMethod = AssistantServiceGrpc.getCreateMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getCreateMethod = AssistantServiceGrpc.getCreateMethod) == null) {
          AssistantServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getGetMethod;
    if ((getGetMethod = AssistantServiceGrpc.getGetMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getGetMethod = AssistantServiceGrpc.getGetMethod) == null) {
          AssistantServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> getUpdateMethod;
    if ((getUpdateMethod = AssistantServiceGrpc.getUpdateMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getUpdateMethod = AssistantServiceGrpc.getUpdateMethod) == null) {
          AssistantServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> getDeleteMethod;
    if ((getDeleteMethod = AssistantServiceGrpc.getDeleteMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getDeleteMethod = AssistantServiceGrpc.getDeleteMethod) == null) {
          AssistantServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> getListMethod;
    if ((getListMethod = AssistantServiceGrpc.getListMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getListMethod = AssistantServiceGrpc.getListMethod) == null) {
          AssistantServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> getListVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVersions",
      requestType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest,
      yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> getListVersionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = AssistantServiceGrpc.getListVersionsMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getListVersionsMethod = AssistantServiceGrpc.getListVersionsMethod) == null) {
          AssistantServiceGrpc.getListVersionsMethod = getListVersionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest, yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("ListVersions"))
              .build();
        }
      }
    }
    return getListVersionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssistantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub>() {
        @java.lang.Override
        public AssistantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceStub(channel, callOptions);
        }
      };
    return AssistantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssistantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub>() {
        @java.lang.Override
        public AssistantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceBlockingStub(channel, callOptions);
        }
      };
    return AssistantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssistantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub>() {
        @java.lang.Override
        public AssistantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceFutureStub(channel, callOptions);
        }
      };
    return AssistantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AssistantServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest,
                yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class AssistantServiceStub extends io.grpc.stub.AbstractAsyncStub<AssistantServiceStub> {
    private AssistantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssistantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssistantServiceBlockingStub> {
    private AssistantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant create(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant get(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant update(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse delete(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse list(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse listVersions(yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssistantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssistantServiceFutureStub> {
    private AssistantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> create(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> get(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant> update(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse> delete(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse> list(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse> listVersions(
        yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_LIST_VERSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssistantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssistantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.CreateAssistantRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.GetAssistantRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.UpdateAssistantRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantOuterClass.Assistant>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.DeleteAssistantResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantsResponse>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.ListAssistantVersionsResponse>) responseObserver);
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

  private static abstract class AssistantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssistantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.AssistantServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssistantService");
    }
  }

  private static final class AssistantServiceFileDescriptorSupplier
      extends AssistantServiceBaseDescriptorSupplier {
    AssistantServiceFileDescriptorSupplier() {}
  }

  private static final class AssistantServiceMethodDescriptorSupplier
      extends AssistantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssistantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssistantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssistantServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getListVersionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
