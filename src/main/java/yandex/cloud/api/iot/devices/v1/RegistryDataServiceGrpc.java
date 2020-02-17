package yandex.cloud.api.iot.devices.v1;

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
 * A set of methods to work with IoT Core messages on behalf of registry
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iot/devices/v1/registry_data_service.proto")
public final class RegistryDataServiceGrpc {

  private RegistryDataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.devices.v1.RegistryDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
      yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
      yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest, yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> getPublishMethod;
    if ((getPublishMethod = RegistryDataServiceGrpc.getPublishMethod) == null) {
      synchronized (RegistryDataServiceGrpc.class) {
        if ((getPublishMethod = RegistryDataServiceGrpc.getPublishMethod) == null) {
          RegistryDataServiceGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest, yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryDataService", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryDataServiceMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistryDataServiceStub newStub(io.grpc.Channel channel) {
    return new RegistryDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegistryDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegistryDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static abstract class RegistryDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest,
                yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>(
                  this, METHODID_PUBLISH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceStub extends io.grpc.stub.AbstractStub<RegistryDataServiceStub> {
    private RegistryDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceBlockingStub extends io.grpc.stub.AbstractStub<RegistryDataServiceBlockingStub> {
    private RegistryDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse publish(yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of registry
   * </pre>
   */
  public static final class RegistryDataServiceFutureStub extends io.grpc.stub.AbstractStub<RegistryDataServiceFutureStub> {
    private RegistryDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified registry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse> publish(
        yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistryDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistryDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH:
          serviceImpl.publish((yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.PublishRegistryDataResponse>) responseObserver);
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

  private static abstract class RegistryDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.devices.v1.RegistryDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegistryDataService");
    }
  }

  private static final class RegistryDataServiceFileDescriptorSupplier
      extends RegistryDataServiceBaseDescriptorSupplier {
    RegistryDataServiceFileDescriptorSupplier() {}
  }

  private static final class RegistryDataServiceMethodDescriptorSupplier
      extends RegistryDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistryDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistryDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistryDataServiceFileDescriptorSupplier())
              .addMethod(getPublishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
