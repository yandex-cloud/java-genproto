package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SecurityGroup resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/security_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRules"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRule"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
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
    io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceStub>() {
        @java.lang.Override
        public SecurityGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityGroupServiceStub(channel, callOptions);
        }
      };
    return SecurityGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceBlockingStub>() {
        @java.lang.Override
        public SecurityGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityGroupServiceFutureStub>() {
        @java.lang.Override
        public SecurityGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityGroupServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing SecurityGroup resources.
   * </pre>
   */
  public static abstract class SecurityGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SecurityGroup resource.
     * To get the list of all available SecurityGroup resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a security group in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified security group.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the rules of the specified security group.
     * </pre>
     */
    public void updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified rule.
     * </pre>
     */
    public void updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified security group.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves security groups to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified security groups.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUpdateRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_RULES)))
          .addMethod(
            getUpdateRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_RULE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest,
                yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityGroup resources.
   * </pre>
   */
  public static final class SecurityGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<SecurityGroupServiceStub> {
    private SecurityGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityGroup resource.
     * To get the list of all available SecurityGroup resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a security group in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified security group.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the rules of the specified security group.
     * </pre>
     */
    public void updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified rule.
     * </pre>
     */
    public void updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified security group.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves security groups to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified security groups.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityGroup resources.
   * </pre>
   */
  public static final class SecurityGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecurityGroupServiceBlockingStub> {
    private SecurityGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityGroup resource.
     * To get the list of all available SecurityGroup resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup get(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityGroup resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse list(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a security group in the specified folder and network.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified security group.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the rules of the specified security group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRules(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified rule.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRule(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified security group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves security groups to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified security groups.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse listOperations(yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityGroup resources.
   * </pre>
   */
  public static final class SecurityGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SecurityGroupServiceFutureStub> {
    private SecurityGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityGroup resource.
     * To get the list of all available SecurityGroup resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupOuterClass.SecurityGroup> get(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.GetSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityGroup resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsResponse> list(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a security group in the specified folder and network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.CreateSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified security group.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the rules of the specified security group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRules(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRule(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.UpdateSecurityGroupRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified security group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.DeleteSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves security groups to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.MoveSecurityGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified security groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.SecurityGroupServiceOuterClass.ListSecurityGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
