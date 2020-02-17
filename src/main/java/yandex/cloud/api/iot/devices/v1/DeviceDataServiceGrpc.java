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
 * A set of methods to work with IoT Core messages on behalf of device
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iot/devices/v1/device_data_service.proto")
public final class DeviceDataServiceGrpc {

  private DeviceDataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.devices.v1.DeviceDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest,
      yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest,
      yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> getPublishMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest, yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> getPublishMethod;
    if ((getPublishMethod = DeviceDataServiceGrpc.getPublishMethod) == null) {
      synchronized (DeviceDataServiceGrpc.class) {
        if ((getPublishMethod = DeviceDataServiceGrpc.getPublishMethod) == null) {
          DeviceDataServiceGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest, yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceDataService", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceDataServiceMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceDataServiceStub newStub(io.grpc.Channel channel) {
    return new DeviceDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of device
   * </pre>
   */
  public static abstract class DeviceDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Publishes message on behalf of specified device
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest,
                yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse>(
                  this, METHODID_PUBLISH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of device
   * </pre>
   */
  public static final class DeviceDataServiceStub extends io.grpc.stub.AbstractStub<DeviceDataServiceStub> {
    private DeviceDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified device
     * </pre>
     */
    public void publish(yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of device
   * </pre>
   */
  public static final class DeviceDataServiceBlockingStub extends io.grpc.stub.AbstractStub<DeviceDataServiceBlockingStub> {
    private DeviceDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified device
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse publish(yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to work with IoT Core messages on behalf of device
   * </pre>
   */
  public static final class DeviceDataServiceFutureStub extends io.grpc.stub.AbstractStub<DeviceDataServiceFutureStub> {
    private DeviceDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes message on behalf of specified device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse> publish(
        yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest request) {
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
    private final DeviceDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH:
          serviceImpl.publish((yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.PublishDeviceDataResponse>) responseObserver);
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

  private static abstract class DeviceDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.devices.v1.DeviceDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceDataService");
    }
  }

  private static final class DeviceDataServiceFileDescriptorSupplier
      extends DeviceDataServiceBaseDescriptorSupplier {
    DeviceDataServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceDataServiceMethodDescriptorSupplier
      extends DeviceDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceDataServiceFileDescriptorSupplier())
              .addMethod(getPublishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
