package yandex.cloud.api.ai.assistants.v1.threads;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/threads/message_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessageServiceGrpc {

  private MessageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.threads.MessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getCreateMethod;
    if ((getCreateMethod = MessageServiceGrpc.getCreateMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getCreateMethod = MessageServiceGrpc.getCreateMethod) == null) {
          MessageServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getGetMethod;
    if ((getGetMethod = MessageServiceGrpc.getGetMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getGetMethod = MessageServiceGrpc.getGetMethod) == null) {
          MessageServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest,
      yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> getListMethod;
    if ((getListMethod = MessageServiceGrpc.getListMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getListMethod = MessageServiceGrpc.getListMethod) == null) {
          MessageServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest, yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub>() {
        @java.lang.Override
        public MessageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceStub(channel, callOptions);
        }
      };
    return MessageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub>() {
        @java.lang.Override
        public MessageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceBlockingStub(channel, callOptions);
        }
      };
    return MessageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub>() {
        @java.lang.Override
        public MessageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceFutureStub(channel, callOptions);
        }
      };
    return MessageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest,
                yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest,
                yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest,
                yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class MessageServiceStub extends io.grpc.stub.AbstractAsyncStub<MessageServiceStub> {
    private MessageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessageServiceBlockingStub> {
    private MessageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message create(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message get(yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> list(
        yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessageServiceFutureStub> {
    private MessageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> create(
        yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message> get(
        yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.GetMessageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.ListMessagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.MessageOuterClass.Message>) responseObserver);
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

  private static abstract class MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.threads.MessageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageService");
    }
  }

  private static final class MessageServiceFileDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier {
    MessageServiceFileDescriptorSupplier() {}
  }

  private static final class MessageServiceMethodDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
