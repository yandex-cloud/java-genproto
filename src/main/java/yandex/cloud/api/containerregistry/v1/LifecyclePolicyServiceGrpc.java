package yandex.cloud.api.containerregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Lifecycle policy resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/containerregistry/v1/lifecycle_policy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LifecyclePolicyServiceGrpc {

  private LifecyclePolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.LifecyclePolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod;
    if ((getGetMethod = LifecyclePolicyServiceGrpc.getGetMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getGetMethod = LifecyclePolicyServiceGrpc.getGetMethod) == null) {
          LifecyclePolicyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> getListMethod;
    if ((getListMethod = LifecyclePolicyServiceGrpc.getListMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getListMethod = LifecyclePolicyServiceGrpc.getListMethod) == null) {
          LifecyclePolicyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LifecyclePolicyServiceGrpc.getCreateMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getCreateMethod = LifecyclePolicyServiceGrpc.getCreateMethod) == null) {
          LifecyclePolicyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = LifecyclePolicyServiceGrpc.getUpdateMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getUpdateMethod = LifecyclePolicyServiceGrpc.getUpdateMethod) == null) {
          LifecyclePolicyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LifecyclePolicyServiceGrpc.getDeleteMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getDeleteMethod = LifecyclePolicyServiceGrpc.getDeleteMethod) == null) {
          LifecyclePolicyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDryRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryRun",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDryRunMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDryRunMethod;
    if ((getDryRunMethod = LifecyclePolicyServiceGrpc.getDryRunMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getDryRunMethod = LifecyclePolicyServiceGrpc.getDryRunMethod) == null) {
          LifecyclePolicyServiceGrpc.getDryRunMethod = getDryRunMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DryRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("DryRun"))
              .build();
        }
      }
    }
    return getDryRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> getGetDryRunResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDryRunResult",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> getGetDryRunResultMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> getGetDryRunResultMethod;
    if ((getGetDryRunResultMethod = LifecyclePolicyServiceGrpc.getGetDryRunResultMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getGetDryRunResultMethod = LifecyclePolicyServiceGrpc.getGetDryRunResultMethod) == null) {
          LifecyclePolicyServiceGrpc.getGetDryRunResultMethod = getGetDryRunResultMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDryRunResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("GetDryRunResult"))
              .build();
        }
      }
    }
    return getGetDryRunResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> getListDryRunResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDryRunResults",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> getListDryRunResultsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> getListDryRunResultsMethod;
    if ((getListDryRunResultsMethod = LifecyclePolicyServiceGrpc.getListDryRunResultsMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getListDryRunResultsMethod = LifecyclePolicyServiceGrpc.getListDryRunResultsMethod) == null) {
          LifecyclePolicyServiceGrpc.getListDryRunResultsMethod = getListDryRunResultsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDryRunResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("ListDryRunResults"))
              .build();
        }
      }
    }
    return getListDryRunResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> getListDryRunResultAffectedImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDryRunResultAffectedImages",
      requestType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest,
      yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> getListDryRunResultAffectedImagesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> getListDryRunResultAffectedImagesMethod;
    if ((getListDryRunResultAffectedImagesMethod = LifecyclePolicyServiceGrpc.getListDryRunResultAffectedImagesMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getListDryRunResultAffectedImagesMethod = LifecyclePolicyServiceGrpc.getListDryRunResultAffectedImagesMethod) == null) {
          LifecyclePolicyServiceGrpc.getListDryRunResultAffectedImagesMethod = getListDryRunResultAffectedImagesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest, yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDryRunResultAffectedImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("ListDryRunResultAffectedImages"))
              .build();
        }
      }
    }
    return getListDryRunResultAffectedImagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LifecyclePolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LifecyclePolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceBlockingStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LifecyclePolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceFutureStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceFutureStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Lifecycle policy resources.
   * </pre>
   */
  public static abstract class LifecyclePolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * To get the list of all available lifecycle policies, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified repository.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified repository.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a request of a dry run of the lifecycle policy.
     * </pre>
     */
    public void dryRun(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDryRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the dry run result of the specified lifecycle policy.
     * </pre>
     */
    public void getDryRunResult(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDryRunResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of the dry run results.
     * </pre>
     */
    public void listDryRunResults(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDryRunResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of the affected images.
     * </pre>
     */
    public void listDryRunResultAffectedImages(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDryRunResultAffectedImagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest,
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDryRunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DRY_RUN)))
          .addMethod(
            getGetDryRunResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest,
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult>(
                  this, METHODID_GET_DRY_RUN_RESULT)))
          .addMethod(
            getListDryRunResultsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest,
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse>(
                  this, METHODID_LIST_DRY_RUN_RESULTS)))
          .addMethod(
            getListDryRunResultAffectedImagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest,
                yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse>(
                  this, METHODID_LIST_DRY_RUN_RESULT_AFFECTED_IMAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Lifecycle policy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<LifecyclePolicyServiceStub> {
    private LifecyclePolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * To get the list of all available lifecycle policies, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified repository.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified repository.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a request of a dry run of the lifecycle policy.
     * </pre>
     */
    public void dryRun(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDryRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the dry run result of the specified lifecycle policy.
     * </pre>
     */
    public void getDryRunResult(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDryRunResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of the dry run results.
     * </pre>
     */
    public void listDryRunResults(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDryRunResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of the affected images.
     * </pre>
     */
    public void listDryRunResultAffectedImages(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDryRunResultAffectedImagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Lifecycle policy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LifecyclePolicyServiceBlockingStub> {
    private LifecyclePolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * To get the list of all available lifecycle policies, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy get(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified repository.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse list(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified repository.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a request of a dry run of the lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation dryRun(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDryRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the dry run result of the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult getDryRunResult(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDryRunResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of the dry run results.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse listDryRunResults(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDryRunResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of the affected images.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse listDryRunResultAffectedImages(yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDryRunResultAffectedImagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Lifecycle policy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LifecyclePolicyServiceFutureStub> {
    private LifecyclePolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * To get the list of all available lifecycle policies, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> get(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse> list(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a request of a dry run of the lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> dryRun(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDryRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the dry run result of the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult> getDryRunResult(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDryRunResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of the dry run results.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse> listDryRunResults(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDryRunResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of the affected images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse> listDryRunResultAffectedImages(
        yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDryRunResultAffectedImagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_DRY_RUN = 5;
  private static final int METHODID_GET_DRY_RUN_RESULT = 6;
  private static final int METHODID_LIST_DRY_RUN_RESULTS = 7;
  private static final int METHODID_LIST_DRY_RUN_RESULT_AFFECTED_IMAGES = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LifecyclePolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LifecyclePolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePoliciesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DRY_RUN:
          serviceImpl.dryRun((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_DRY_RUN_RESULT:
          serviceImpl.getDryRunResult((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.GetDryRunLifecyclePolicyResultRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.DryRunLifecyclePolicyResult>) responseObserver);
          break;
        case METHODID_LIST_DRY_RUN_RESULTS:
          serviceImpl.listDryRunResults((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultsResponse>) responseObserver);
          break;
        case METHODID_LIST_DRY_RUN_RESULT_AFFECTED_IMAGES:
          serviceImpl.listDryRunResultAffectedImages((yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.ListDryRunLifecyclePolicyResultAffectedImagesResponse>) responseObserver);
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

  private static abstract class LifecyclePolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LifecyclePolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.LifecyclePolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LifecyclePolicyService");
    }
  }

  private static final class LifecyclePolicyServiceFileDescriptorSupplier
      extends LifecyclePolicyServiceBaseDescriptorSupplier {
    LifecyclePolicyServiceFileDescriptorSupplier() {}
  }

  private static final class LifecyclePolicyServiceMethodDescriptorSupplier
      extends LifecyclePolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LifecyclePolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LifecyclePolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LifecyclePolicyServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDryRunMethod())
              .addMethod(getGetDryRunResultMethod())
              .addMethod(getListDryRunResultsMethod())
              .addMethod(getListDryRunResultAffectedImagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
