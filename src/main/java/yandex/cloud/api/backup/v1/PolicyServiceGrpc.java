package yandex.cloud.api.backup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/backup/v1/policy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.backup.v1.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest,
      yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest.class,
      responseType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest,
      yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest, yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> getListMethod;
    if ((getListMethod = PolicyServiceGrpc.getListMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListMethod = PolicyServiceGrpc.getListMethod) == null) {
          PolicyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest, yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PolicyServiceGrpc.getCreateMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getCreateMethod = PolicyServiceGrpc.getCreateMethod) == null) {
          PolicyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest,
      yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest.class,
      responseType = yandex.cloud.api.backup.v1.PolicyOuterClass.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest,
      yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest, yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> getGetMethod;
    if ((getGetMethod = PolicyServiceGrpc.getGetMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetMethod = PolicyServiceGrpc.getGetMethod) == null) {
          PolicyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest, yandex.cloud.api.backup.v1.PolicyOuterClass.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyOuterClass.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PolicyServiceGrpc.getUpdateMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getUpdateMethod = PolicyServiceGrpc.getUpdateMethod) == null) {
          PolicyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PolicyServiceGrpc.getDeleteMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getDeleteMethod = PolicyServiceGrpc.getDeleteMethod) == null) {
          PolicyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Apply",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getApplyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getApplyMethod;
    if ((getApplyMethod = PolicyServiceGrpc.getApplyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getApplyMethod = PolicyServiceGrpc.getApplyMethod) == null) {
          PolicyServiceGrpc.getApplyMethod = getApplyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Apply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Apply"))
              .build();
        }
      }
    }
    return getApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest,
      yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> getListApplicationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApplications",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest.class,
      responseType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest,
      yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> getListApplicationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest, yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> getListApplicationsMethod;
    if ((getListApplicationsMethod = PolicyServiceGrpc.getListApplicationsMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListApplicationsMethod = PolicyServiceGrpc.getListApplicationsMethod) == null) {
          PolicyServiceGrpc.getListApplicationsMethod = getListApplicationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest, yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApplications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("ListApplications"))
              .build();
        }
      }
    }
    return getListApplicationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;
    if ((getExecuteMethod = PolicyServiceGrpc.getExecuteMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getExecuteMethod = PolicyServiceGrpc.getExecuteMethod) == null) {
          PolicyServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revoke",
      requestType = yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod;
    if ((getRevokeMethod = PolicyServiceGrpc.getRevokeMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getRevokeMethod = PolicyServiceGrpc.getRevokeMethod) == null) {
          PolicyServiceGrpc.getRevokeMethod = getRevokeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("Revoke"))
              .build();
        }
      }
    }
    return getRevokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub>() {
        @java.lang.Override
        public PolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceStub(channel, callOptions);
        }
      };
    return PolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub>() {
        @java.lang.Override
        public PolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return PolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub>() {
        @java.lang.Override
        public PolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceFutureStub(channel, callOptions);
        }
      };
    return PolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List [policies](/docs/backup/concepts/policy) of specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new policy.
     * 
     * For detailed information, please see [Creating a backup policy](/docs/backup/operations/policy-vm/create).
     * </pre>
     */
    public void create(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get specific policy.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update specific policy.
     * </pre>
     */
    public void update(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specific policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply policy to [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void apply(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List applied policies using filters.
     * </pre>
     */
    public void listApplications(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApplicationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run policy on specific Compute Cloud instance. That will create backup
     * according selected policy. In order to perform this action, policy should be
     * applied to the Compute Cloud instance.
     * </pre>
     */
    public void execute(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revoke policy from Compute Cloud instance.
     * </pre>
     */
    public void revoke(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest,
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest,
                yandex.cloud.api.backup.v1.PolicyOuterClass.Policy>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_APPLY)))
          .addMethod(
            getListApplicationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest,
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse>(
                  this, METHODID_LIST_APPLICATIONS)))
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_EXECUTE)))
          .addMethod(
            getRevokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REVOKE)))
          .build();
    }
  }

  /**
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<PolicyServiceStub> {
    private PolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List [policies](/docs/backup/concepts/policy) of specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new policy.
     * 
     * For detailed information, please see [Creating a backup policy](/docs/backup/operations/policy-vm/create).
     * </pre>
     */
    public void create(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get specific policy.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update specific policy.
     * </pre>
     */
    public void update(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specific policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply policy to [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void apply(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List applied policies using filters.
     * </pre>
     */
    public void listApplications(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run policy on specific Compute Cloud instance. That will create backup
     * according selected policy. In order to perform this action, policy should be
     * applied to the Compute Cloud instance.
     * </pre>
     */
    public void execute(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revoke policy from Compute Cloud instance.
     * </pre>
     */
    public void revoke(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List [policies](/docs/backup/concepts/policy) of specified folder.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse list(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new policy.
     * 
     * For detailed information, please see [Creating a backup policy](/docs/backup/operations/policy-vm/create).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get specific policy.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.PolicyOuterClass.Policy get(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update specific policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specific policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply policy to [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation apply(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List applied policies using filters.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse listApplications(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApplicationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run policy on specific Compute Cloud instance. That will create backup
     * according selected policy. In order to perform this action, policy should be
     * applied to the Compute Cloud instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation execute(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revoke policy from Compute Cloud instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation revoke(yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List [policies](/docs/backup/concepts/policy) of specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse> list(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new policy.
     * 
     * For detailed information, please see [Creating a backup policy](/docs/backup/operations/policy-vm/create).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get specific policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.PolicyOuterClass.Policy> get(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update specific policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specific policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply policy to [Compute Cloud instance](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> apply(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List applied policies using filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse> listApplications(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApplicationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run policy on specific Compute Cloud instance. That will create backup
     * according selected policy. In order to perform this action, policy should be
     * applied to the Compute Cloud instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> execute(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revoke policy from Compute Cloud instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> revoke(
        yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_APPLY = 5;
  private static final int METHODID_LIST_APPLICATIONS = 6;
  private static final int METHODID_EXECUTE = 7;
  private static final int METHODID_REVOKE = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.CreatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyOuterClass.Policy>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.UpdatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.DeletePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_APPLY:
          serviceImpl.apply((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ApplyPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_APPLICATIONS:
          serviceImpl.listApplications((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ListApplicationsResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REVOKE:
          serviceImpl.revoke((yandex.cloud.api.backup.v1.PolicyServiceOuterClass.RevokeRequest) request,
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

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.backup.v1.PolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getApplyMethod())
              .addMethod(getListApplicationsMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getRevokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
