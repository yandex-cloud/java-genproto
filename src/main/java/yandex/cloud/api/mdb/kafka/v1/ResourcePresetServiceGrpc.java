package yandex.cloud.api.mdb.kafka.v1;

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
 * A set of methods for managing Kafka resource presets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/kafka/v1/resource_preset_service.proto")
public final class ResourcePresetServiceGrpc {

  private ResourcePresetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.kafka.v1.ResourcePresetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest,
      yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest,
      yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest, yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> getGetMethod;
    if ((getGetMethod = ResourcePresetServiceGrpc.getGetMethod) == null) {
      synchronized (ResourcePresetServiceGrpc.class) {
        if ((getGetMethod = ResourcePresetServiceGrpc.getGetMethod) == null) {
          ResourcePresetServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest, yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.kafka.v1.ResourcePresetService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourcePresetServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest,
      yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest,
      yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest, yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> getListMethod;
    if ((getListMethod = ResourcePresetServiceGrpc.getListMethod) == null) {
      synchronized (ResourcePresetServiceGrpc.class) {
        if ((getListMethod = ResourcePresetServiceGrpc.getListMethod) == null) {
          ResourcePresetServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest, yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.kafka.v1.ResourcePresetService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResourcePresetServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourcePresetServiceStub newStub(io.grpc.Channel channel) {
    return new ResourcePresetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourcePresetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResourcePresetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourcePresetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResourcePresetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Kafka resource presets.
   * </pre>
   */
  public static abstract class ResourcePresetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest,
                yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest,
                yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceStub extends io.grpc.stub.AbstractStub<ResourcePresetServiceStub> {
    private ResourcePresetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcePresetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceBlockingStub extends io.grpc.stub.AbstractStub<ResourcePresetServiceBlockingStub> {
    private ResourcePresetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcePresetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset get(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse list(yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka resource presets.
   * </pre>
   */
  public static final class ResourcePresetServiceFutureStub extends io.grpc.stub.AbstractStub<ResourcePresetServiceFutureStub> {
    private ResourcePresetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcePresetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcePresetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcePresetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified resource preset.
     * To get the list of available resource presets, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset> get(
        yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of available resource presets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse> list(
        yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest request) {
      return futureUnaryCall(
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
    private final ResourcePresetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourcePresetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.GetResourcePresetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetOuterClass.ResourcePreset>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.ListResourcePresetsResponse>) responseObserver);
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

  private static abstract class ResourcePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourcePresetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.kafka.v1.ResourcePresetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourcePresetService");
    }
  }

  private static final class ResourcePresetServiceFileDescriptorSupplier
      extends ResourcePresetServiceBaseDescriptorSupplier {
    ResourcePresetServiceFileDescriptorSupplier() {}
  }

  private static final class ResourcePresetServiceMethodDescriptorSupplier
      extends ResourcePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourcePresetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourcePresetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourcePresetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
