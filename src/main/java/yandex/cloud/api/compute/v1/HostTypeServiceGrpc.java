package yandex.cloud.api.compute.v1;

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
 * Set of methods to view possible host configurations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/host_type_service.proto")
public final class HostTypeServiceGrpc {

  private HostTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.HostTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest,
      yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest,
      yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest, yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> getGetMethod;
    if ((getGetMethod = HostTypeServiceGrpc.getGetMethod) == null) {
      synchronized (HostTypeServiceGrpc.class) {
        if ((getGetMethod = HostTypeServiceGrpc.getGetMethod) == null) {
          HostTypeServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest, yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostTypeService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.getDefaultInstance()))
                  .setSchemaDescriptor(new HostTypeServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest,
      yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest,
      yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest, yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> getListMethod;
    if ((getListMethod = HostTypeServiceGrpc.getListMethod) == null) {
      synchronized (HostTypeServiceGrpc.class) {
        if ((getListMethod = HostTypeServiceGrpc.getListMethod) == null) {
          HostTypeServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest, yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostTypeService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HostTypeServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HostTypeServiceStub newStub(io.grpc.Channel channel) {
    return new HostTypeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HostTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HostTypeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HostTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HostTypeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Set of methods to view possible host configurations.
   * </pre>
   */
  public static abstract class HostTypeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns information about specified host type.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List avaliable host types.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest,
                yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest,
                yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods to view possible host configurations.
   * </pre>
   */
  public static final class HostTypeServiceStub extends io.grpc.stub.AbstractStub<HostTypeServiceStub> {
    private HostTypeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostTypeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostTypeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostTypeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about specified host type.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List avaliable host types.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods to view possible host configurations.
   * </pre>
   */
  public static final class HostTypeServiceBlockingStub extends io.grpc.stub.AbstractStub<HostTypeServiceBlockingStub> {
    private HostTypeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostTypeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostTypeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about specified host type.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType get(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List avaliable host types.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse list(yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods to view possible host configurations.
   * </pre>
   */
  public static final class HostTypeServiceFutureStub extends io.grpc.stub.AbstractStub<HostTypeServiceFutureStub> {
    private HostTypeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostTypeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostTypeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostTypeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about specified host type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType> get(
        yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List avaliable host types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse> list(
        yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest request) {
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
    private final HostTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HostTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.GetHostTypeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.ListHostTypesResponse>) responseObserver);
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

  private static abstract class HostTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HostTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.HostTypeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HostTypeService");
    }
  }

  private static final class HostTypeServiceFileDescriptorSupplier
      extends HostTypeServiceBaseDescriptorSupplier {
    HostTypeServiceFileDescriptorSupplier() {}
  }

  private static final class HostTypeServiceMethodDescriptorSupplier
      extends HostTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HostTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HostTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HostTypeServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
