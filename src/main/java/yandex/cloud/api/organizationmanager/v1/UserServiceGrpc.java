package yandex.cloud.api.organizationmanager.v1;

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
 * A set of methods for managing Organization users.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/organizationmanager/v1/user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest,
      yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMembers",
      requestType = yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest,
      yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> getListMembersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest, yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> getListMembersMethod;
    if ((getListMembersMethod = UserServiceGrpc.getListMembersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListMembersMethod = UserServiceGrpc.getListMembersMethod) == null) {
          UserServiceGrpc.getListMembersMethod = getListMembersMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest, yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.UserService", "ListMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListMembers"))
                  .build();
          }
        }
     }
     return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMembership",
      requestType = yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMembershipMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMembershipMethod;
    if ((getDeleteMembershipMethod = UserServiceGrpc.getDeleteMembershipMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMembershipMethod = UserServiceGrpc.getDeleteMembershipMethod) == null) {
          UserServiceGrpc.getDeleteMembershipMethod = getDeleteMembershipMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.UserService", "DeleteMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteMembership"))
                  .build();
          }
        }
     }
     return getDeleteMembershipMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Organization users.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List organization active members.
     * </pre>
     */
    public void listMembers(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete user membership.
     * </pre>
     */
    public void deleteMembership(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMembershipMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest,
                yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getDeleteMembershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_MEMBERSHIP)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Organization users.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List organization active members.
     * </pre>
     */
    public void listMembers(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete user membership.
     * </pre>
     */
    public void deleteMembership(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMembershipMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Organization users.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List organization active members.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse listMembers(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete user membership.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteMembership(yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMembershipMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Organization users.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List organization active members.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse> listMembers(
        yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete user membership.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteMembership(
        yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMembershipMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MEMBERS = 0;
  private static final int METHODID_DELETE_MEMBERSHIP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.ListMembersResponse>) responseObserver);
          break;
        case METHODID_DELETE_MEMBERSHIP:
          serviceImpl.deleteMembership((yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.DeleteMembershipRequest) request,
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getListMembersMethod())
              .addMethod(getDeleteMembershipMethod())
              .build();
        }
      }
    }
    return result;
  }
}
