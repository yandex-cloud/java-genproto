package yandex.cloud.api.cdn.v1;

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
 * <pre>
 * A set of methods for managing Provider Service resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/cdn/v1/provider_service.proto")
public final class ProviderServiceGrpc {

  private ProviderServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.ProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = ProviderServiceGrpc.getActivateMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getActivateMethod = ProviderServiceGrpc.getActivateMethod) == null) {
          ProviderServiceGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ProviderService", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest,
      yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> getListActivatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActivated",
      requestType = yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest,
      yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> getListActivatedMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest, yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> getListActivatedMethod;
    if ((getListActivatedMethod = ProviderServiceGrpc.getListActivatedMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getListActivatedMethod = ProviderServiceGrpc.getListActivatedMethod) == null) {
          ProviderServiceGrpc.getListActivatedMethod = getListActivatedMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest, yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.cdn.v1.ProviderService", "ListActivated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("ListActivated"))
                  .build();
          }
        }
     }
     return getListActivatedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderServiceStub newStub(io.grpc.Channel channel) {
    return new ProviderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProviderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProviderServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Provider Service resources.
   * </pre>
   */
  public static abstract class ProviderServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Activate provider for specified client.
     * </pre>
     */
    public void activate(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List activated providers for specified client.
     * </pre>
     */
    public void listActivated(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListActivatedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getListActivatedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest,
                yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse>(
                  this, METHODID_LIST_ACTIVATED)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Provider Service resources.
   * </pre>
   */
  public static final class ProviderServiceStub extends io.grpc.stub.AbstractStub<ProviderServiceStub> {
    private ProviderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate provider for specified client.
     * </pre>
     */
    public void activate(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List activated providers for specified client.
     * </pre>
     */
    public void listActivated(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListActivatedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Provider Service resources.
   * </pre>
   */
  public static final class ProviderServiceBlockingStub extends io.grpc.stub.AbstractStub<ProviderServiceBlockingStub> {
    private ProviderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate provider for specified client.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List activated providers for specified client.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse listActivated(yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListActivatedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Provider Service resources.
   * </pre>
   */
  public static final class ProviderServiceFutureStub extends io.grpc.stub.AbstractStub<ProviderServiceFutureStub> {
    private ProviderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate provider for specified client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List activated providers for specified client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse> listActivated(
        yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListActivatedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;
  private static final int METHODID_LIST_ACTIVATED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProviderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProviderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ActivateProviderRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_ACTIVATED:
          serviceImpl.listActivated((yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.ListActivatedProvidersResponse>) responseObserver);
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

  private static abstract class ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.ProviderServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProviderService");
    }
  }

  private static final class ProviderServiceFileDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier {
    ProviderServiceFileDescriptorSupplier() {}
  }

  private static final class ProviderServiceMethodDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProviderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderServiceFileDescriptorSupplier())
              .addMethod(getActivateMethod())
              .addMethod(getListActivatedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
