package yandex.cloud.api.vpc.v1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/vpc/v1/security_group_service.proto")
public final class SecurityGroupServiceGrpc {

  private SecurityGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.SecurityGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest, yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> getGetMethod;
    if ((getGetMethod = SecurityGroupServiceGrpc.getGetMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getGetMethod = SecurityGroupServiceGrpc.getGetMethod) == null) {
          SecurityGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest, yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest, yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> getListMethod;
    if ((getListMethod = SecurityGroupServiceGrpc.getListMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getListMethod = SecurityGroupServiceGrpc.getListMethod) == null) {
          SecurityGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest, yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SecurityGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getCreateMethod = SecurityGroupServiceGrpc.getCreateMethod) == null) {
          SecurityGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SecurityGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getUpdateMethod = SecurityGroupServiceGrpc.getUpdateMethod) == null) {
          SecurityGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRules",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRulesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRulesMethod;
    if ((getUpdateRulesMethod = SecurityGroupServiceGrpc.getUpdateRulesMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getUpdateRulesMethod = SecurityGroupServiceGrpc.getUpdateRulesMethod) == null) {
          SecurityGroupServiceGrpc.getUpdateRulesMethod = getUpdateRulesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "UpdateRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("UpdateRules"))
                  .build();
          }
        }
     }
     return getUpdateRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRule",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRuleMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRuleMethod;
    if ((getUpdateRuleMethod = SecurityGroupServiceGrpc.getUpdateRuleMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getUpdateRuleMethod = SecurityGroupServiceGrpc.getUpdateRuleMethod) == null) {
          SecurityGroupServiceGrpc.getUpdateRuleMethod = getUpdateRuleMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "UpdateRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("UpdateRule"))
                  .build();
          }
        }
     }
     return getUpdateRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SecurityGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getDeleteMethod = SecurityGroupServiceGrpc.getDeleteMethod) == null) {
          SecurityGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = SecurityGroupServiceGrpc.getMoveMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getMoveMethod = SecurityGroupServiceGrpc.getMoveMethod) == null) {
          SecurityGroupServiceGrpc.getMoveMethod = getMoveMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("Move"))
                  .build();
          }
        }
     }
     return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest,
      yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest, yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SecurityGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SecurityGroupServiceGrpc.class) {
        if ((getListOperationsMethod = SecurityGroupServiceGrpc.getListOperationsMethod) == null) {
          SecurityGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest, yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SecurityGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityGroupServiceStub newStub(io.grpc.Channel channel) {
    return new SecurityGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityGroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecurityGroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * update rule description or labels
     * </pre>
     */
    public void updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRuleMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUpdateRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_RULES)))
          .addMethod(
            getUpdateRuleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_RULE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class SecurityGroupServiceStub extends io.grpc.stub.AbstractStub<SecurityGroupServiceStub> {
    private SecurityGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update rule description or labels
     * </pre>
     */
    public void updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecurityGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<SecurityGroupServiceBlockingStub> {
    private SecurityGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update rule description or labels
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecurityGroupServiceFutureStub extends io.grpc.stub.AbstractStub<SecurityGroupServiceFutureStub> {
    private SecurityGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> get(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> list(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRules(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update rule description or labels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRule(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_UPDATE_RULES = 4;
  private static final int METHODID_UPDATE_RULE = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_MOVE = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_RULES:
          serviceImpl.updateRules((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_RULE:
          serviceImpl.updateRule((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse>) responseObserver);
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

  private static abstract class SecurityGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityGroupService");
    }
  }

  private static final class SecurityGroupServiceFileDescriptorSupplier
      extends SecurityGroupServiceBaseDescriptorSupplier {
    SecurityGroupServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityGroupServiceMethodDescriptorSupplier
      extends SecurityGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecurityGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getUpdateRulesMethod())
              .addMethod(getUpdateRuleMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getMoveMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
