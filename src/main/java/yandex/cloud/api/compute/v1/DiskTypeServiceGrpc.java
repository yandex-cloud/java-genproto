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
 * A set of methods to retrieve information about disk types.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/disk_type_service.proto")
public final class DiskTypeServiceGrpc {

  private DiskTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.DiskTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest,
      yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest,
      yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest, yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> getGetMethod;
    if ((getGetMethod = DiskTypeServiceGrpc.getGetMethod) == null) {
      synchronized (DiskTypeServiceGrpc.class) {
        if ((getGetMethod = DiskTypeServiceGrpc.getGetMethod) == null) {
          DiskTypeServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest, yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.DiskTypeService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType.getDefaultInstance()))
                  .setSchemaDescriptor(new DiskTypeServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest,
      yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest,
      yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest, yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> getListMethod;
    if ((getListMethod = DiskTypeServiceGrpc.getListMethod) == null) {
      synchronized (DiskTypeServiceGrpc.class) {
        if ((getListMethod = DiskTypeServiceGrpc.getListMethod) == null) {
          DiskTypeServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest, yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.DiskTypeService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DiskTypeServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiskTypeServiceStub newStub(io.grpc.Channel channel) {
    return new DiskTypeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiskTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiskTypeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiskTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiskTypeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about disk types.
   * </pre>
   */
  public static abstract class DiskTypeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the information about specified disk type.
     * To get the list of available disk types, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of disk types for the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest,
                yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest,
                yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about disk types.
   * </pre>
   */
  public static final class DiskTypeServiceStub extends io.grpc.stub.AbstractStub<DiskTypeServiceStub> {
    private DiskTypeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiskTypeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskTypeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiskTypeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about specified disk type.
     * To get the list of available disk types, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of disk types for the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about disk types.
   * </pre>
   */
  public static final class DiskTypeServiceBlockingStub extends io.grpc.stub.AbstractStub<DiskTypeServiceBlockingStub> {
    private DiskTypeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiskTypeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskTypeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiskTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about specified disk type.
     * To get the list of available disk types, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType get(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of disk types for the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse list(yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about disk types.
   * </pre>
   */
  public static final class DiskTypeServiceFutureStub extends io.grpc.stub.AbstractStub<DiskTypeServiceFutureStub> {
    private DiskTypeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiskTypeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskTypeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiskTypeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about specified disk type.
     * To get the list of available disk types, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType> get(
        yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of disk types for the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse> list(
        yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest request) {
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
    private final DiskTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiskTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.GetDiskTypeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeOuterClass.DiskType>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.ListDiskTypesResponse>) responseObserver);
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

  private static abstract class DiskTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiskTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.DiskTypeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiskTypeService");
    }
  }

  private static final class DiskTypeServiceFileDescriptorSupplier
      extends DiskTypeServiceBaseDescriptorSupplier {
    DiskTypeServiceFileDescriptorSupplier() {}
  }

  private static final class DiskTypeServiceMethodDescriptorSupplier
      extends DiskTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiskTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiskTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiskTypeServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
