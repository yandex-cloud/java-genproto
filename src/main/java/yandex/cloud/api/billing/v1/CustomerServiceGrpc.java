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
 * A set of methods for managing Customer resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/billing/v1/customer_service.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.v1.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest,
      yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest.class,
      responseType = yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest,
      yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest, yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> getListMethod;
    if ((getListMethod = CustomerServiceGrpc.getListMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getListMethod = CustomerServiceGrpc.getListMethod) == null) {
          CustomerServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest, yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.CustomerService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Invite",
      requestType = yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getInviteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getInviteMethod;
    if ((getInviteMethod = CustomerServiceGrpc.getInviteMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getInviteMethod = CustomerServiceGrpc.getInviteMethod) == null) {
          CustomerServiceGrpc.getInviteMethod = getInviteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.CustomerService", "Invite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("Invite"))
                  .build();
          }
        }
     }
     return getInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = CustomerServiceGrpc.getActivateMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getActivateMethod = CustomerServiceGrpc.getActivateMethod) == null) {
          CustomerServiceGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.CustomerService", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suspend",
      requestType = yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;
    if ((getSuspendMethod = CustomerServiceGrpc.getSuspendMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSuspendMethod = CustomerServiceGrpc.getSuspendMethod) == null) {
          CustomerServiceGrpc.getSuspendMethod = getSuspendMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.billing.v1.CustomerService", "Suspend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("Suspend"))
                  .build();
          }
        }
     }
     return getSuspendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Customer resources.
   * </pre>
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of customers associated with the specified reseller.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invites customer to the specified reseller.
     * </pre>
     */
    public void invite(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activates specified customer. After customer is activated, he can use resources associated with his billing account.
     * </pre>
     */
    public void activate(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspend specified customer. After customer is suspended, he can't use resources associated with his billing account.
     * </pre>
     */
    public void suspend(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSuspendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest,
                yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getInviteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_INVITE)))
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getSuspendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SUSPEND)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Customer resources.
   * </pre>
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of customers associated with the specified reseller.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invites customer to the specified reseller.
     * </pre>
     */
    public void invite(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activates specified customer. After customer is activated, he can use resources associated with his billing account.
     * </pre>
     */
    public void activate(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspend specified customer. After customer is suspended, he can't use resources associated with his billing account.
     * </pre>
     */
    public void suspend(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Customer resources.
   * </pre>
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of customers associated with the specified reseller.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse list(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invites customer to the specified reseller.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation invite(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activates specified customer. After customer is activated, he can use resources associated with his billing account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspend specified customer. After customer is suspended, he can't use resources associated with his billing account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation suspend(yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Customer resources.
   * </pre>
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of customers associated with the specified reseller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse> list(
        yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invites customer to the specified reseller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> invite(
        yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activates specified customer. After customer is activated, he can use resources associated with his billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspend specified customer. After customer is suspended, he can't use resources associated with his billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> suspend(
        yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_INVITE = 1;
  private static final int METHODID_ACTIVATE = 2;
  private static final int METHODID_SUSPEND = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ListCustomersResponse>) responseObserver);
          break;
        case METHODID_INVITE:
          serviceImpl.invite((yandex.cloud.api.billing.v1.CustomerServiceOuterClass.InviteCustomerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.billing.v1.CustomerServiceOuterClass.ActivateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SUSPEND:
          serviceImpl.suspend((yandex.cloud.api.billing.v1.CustomerServiceOuterClass.SuspendCustomerRequest) request,
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

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.v1.CustomerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getInviteMethod())
              .addMethod(getActivateMethod())
              .addMethod(getSuspendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
