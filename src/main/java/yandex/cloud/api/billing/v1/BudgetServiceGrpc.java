package yandex.cloud.api.billing.v1;

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
 * A set of methods for managing Budget resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/billing/v1/budget_service.proto")
public final class BudgetServiceGrpc {

  private BudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.v1.BudgetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest,
      yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest.class,
      responseType = yandex.cloud.api.billing.v1.BudgetOuterClass.Budget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest,
      yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest, yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> getGetMethod;
    if ((getGetMethod = BudgetServiceGrpc.getGetMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getGetMethod = BudgetServiceGrpc.getGetMethod) == null) {
          BudgetServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest, yandex.cloud.api.billing.v1.BudgetOuterClass.Budget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.BudgetService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BudgetOuterClass.Budget.getDefaultInstance()))
                  .setSchemaDescriptor(new BudgetServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest,
      yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest.class,
      responseType = yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest,
      yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest, yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> getListMethod;
    if ((getListMethod = BudgetServiceGrpc.getListMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getListMethod = BudgetServiceGrpc.getListMethod) == null) {
          BudgetServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest, yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.BudgetService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BudgetServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = BudgetServiceGrpc.getCreateMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getCreateMethod = BudgetServiceGrpc.getCreateMethod) == null) {
          BudgetServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.BudgetService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BudgetServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BudgetServiceStub newStub(io.grpc.Channel channel) {
    return new BudgetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BudgetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BudgetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BudgetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BudgetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Budget resources.
   * </pre>
   */
  public static abstract class BudgetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified budget.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of budgets corresponding to the specified billing account.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a budget for the specified billing account.
     * </pre>
     */
    public void create(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest,
                yandex.cloud.api.billing.v1.BudgetOuterClass.Budget>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest,
                yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Budget resources.
   * </pre>
   */
  public static final class BudgetServiceStub extends io.grpc.stub.AbstractStub<BudgetServiceStub> {
    private BudgetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BudgetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BudgetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified budget.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of budgets corresponding to the specified billing account.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a budget for the specified billing account.
     * </pre>
     */
    public void create(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Budget resources.
   * </pre>
   */
  public static final class BudgetServiceBlockingStub extends io.grpc.stub.AbstractStub<BudgetServiceBlockingStub> {
    private BudgetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BudgetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BudgetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified budget.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.BudgetOuterClass.Budget get(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of budgets corresponding to the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse list(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a budget for the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Budget resources.
   * </pre>
   */
  public static final class BudgetServiceFutureStub extends io.grpc.stub.AbstractStub<BudgetServiceFutureStub> {
    private BudgetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BudgetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BudgetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified budget.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.BudgetOuterClass.Budget> get(
        yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of budgets corresponding to the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse> list(
        yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a budget for the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BudgetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BudgetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.billing.v1.BudgetServiceOuterClass.GetBudgetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetOuterClass.Budget>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BudgetServiceOuterClass.ListBudgetsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.billing.v1.BudgetServiceOuterClass.CreateBudgetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class BudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.v1.BudgetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BudgetService");
    }
  }

  private static final class BudgetServiceFileDescriptorSupplier
      extends BudgetServiceBaseDescriptorSupplier {
    BudgetServiceFileDescriptorSupplier() {}
  }

  private static final class BudgetServiceMethodDescriptorSupplier
      extends BudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BudgetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BudgetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
