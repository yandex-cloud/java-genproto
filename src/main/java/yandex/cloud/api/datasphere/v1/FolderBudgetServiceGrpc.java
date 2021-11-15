package yandex.cloud.api.datasphere.v1;

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
 * A set of methods for managing Datasphere folder budgets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/datasphere/v1/folder_budget_service.proto")
public final class FolderBudgetServiceGrpc {

  private FolderBudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v1.FolderBudgetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest,
      yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest,
      yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest, yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> getGetMethod;
    if ((getGetMethod = FolderBudgetServiceGrpc.getGetMethod) == null) {
      synchronized (FolderBudgetServiceGrpc.class) {
        if ((getGetMethod = FolderBudgetServiceGrpc.getGetMethod) == null) {
          FolderBudgetServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest, yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.FolderBudgetService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FolderBudgetServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest,
      com.google.protobuf.Empty> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest,
      com.google.protobuf.Empty> getSetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest, com.google.protobuf.Empty> getSetMethod;
    if ((getSetMethod = FolderBudgetServiceGrpc.getSetMethod) == null) {
      synchronized (FolderBudgetServiceGrpc.class) {
        if ((getSetMethod = FolderBudgetServiceGrpc.getSetMethod) == null) {
          FolderBudgetServiceGrpc.getSetMethod = getSetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.FolderBudgetService", "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new FolderBudgetServiceMethodDescriptorSupplier("Set"))
                  .build();
          }
        }
     }
     return getSetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FolderBudgetServiceStub newStub(io.grpc.Channel channel) {
    return new FolderBudgetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FolderBudgetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FolderBudgetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FolderBudgetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FolderBudgetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Datasphere folder budgets.
   * </pre>
   */
  public static abstract class FolderBudgetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified folder budget.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the unit balance and the limits of the specified folder budget.
     * </pre>
     */
    public void set(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest,
                yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SET)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Datasphere folder budgets.
   * </pre>
   */
  public static final class FolderBudgetServiceStub extends io.grpc.stub.AbstractStub<FolderBudgetServiceStub> {
    private FolderBudgetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FolderBudgetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FolderBudgetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FolderBudgetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified folder budget.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the unit balance and the limits of the specified folder budget.
     * </pre>
     */
    public void set(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Datasphere folder budgets.
   * </pre>
   */
  public static final class FolderBudgetServiceBlockingStub extends io.grpc.stub.AbstractStub<FolderBudgetServiceBlockingStub> {
    private FolderBudgetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FolderBudgetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FolderBudgetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FolderBudgetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified folder budget.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse get(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the unit balance and the limits of the specified folder budget.
     * </pre>
     */
    public com.google.protobuf.Empty set(yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Datasphere folder budgets.
   * </pre>
   */
  public static final class FolderBudgetServiceFutureStub extends io.grpc.stub.AbstractStub<FolderBudgetServiceFutureStub> {
    private FolderBudgetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FolderBudgetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FolderBudgetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FolderBudgetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified folder budget.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse> get(
        yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the unit balance and the limits of the specified folder budget.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> set(
        yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_SET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FolderBudgetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FolderBudgetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.GetFolderBudgetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.SetFolderBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class FolderBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FolderBudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v1.FolderBudgetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FolderBudgetService");
    }
  }

  private static final class FolderBudgetServiceFileDescriptorSupplier
      extends FolderBudgetServiceBaseDescriptorSupplier {
    FolderBudgetServiceFileDescriptorSupplier() {}
  }

  private static final class FolderBudgetServiceMethodDescriptorSupplier
      extends FolderBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FolderBudgetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FolderBudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FolderBudgetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
