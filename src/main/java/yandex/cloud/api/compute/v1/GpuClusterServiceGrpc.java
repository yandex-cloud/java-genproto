package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing GPU clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/gpu_cluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GpuClusterServiceGrpc {

  private GpuClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.GpuClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest,
      yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest.class,
      responseType = yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest,
      yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest, yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> getGetMethod;
    if ((getGetMethod = GpuClusterServiceGrpc.getGetMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getGetMethod = GpuClusterServiceGrpc.getGetMethod) == null) {
          GpuClusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest, yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest.class,
      responseType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> getListMethod;
    if ((getListMethod = GpuClusterServiceGrpc.getListMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getListMethod = GpuClusterServiceGrpc.getListMethod) == null) {
          GpuClusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = GpuClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getCreateMethod = GpuClusterServiceGrpc.getCreateMethod) == null) {
          GpuClusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = GpuClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getUpdateMethod = GpuClusterServiceGrpc.getUpdateMethod) == null) {
          GpuClusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = GpuClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getDeleteMethod = GpuClusterServiceGrpc.getDeleteMethod) == null) {
          GpuClusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = GpuClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getListOperationsMethod = GpuClusterServiceGrpc.getListOperationsMethod) == null) {
          GpuClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest,
      yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = GpuClusterServiceGrpc.getListInstancesMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getListInstancesMethod = GpuClusterServiceGrpc.getListInstancesMethod) == null) {
          GpuClusterServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest, yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = GpuClusterServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getListAccessBindingsMethod = GpuClusterServiceGrpc.getListAccessBindingsMethod) == null) {
          GpuClusterServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = GpuClusterServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = GpuClusterServiceGrpc.getSetAccessBindingsMethod) == null) {
          GpuClusterServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("SetAccessBindings"))
              .build();
        }
      }
    }
    return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = GpuClusterServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (GpuClusterServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = GpuClusterServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          GpuClusterServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GpuClusterServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GpuClusterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceStub>() {
        @java.lang.Override
        public GpuClusterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpuClusterServiceStub(channel, callOptions);
        }
      };
    return GpuClusterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GpuClusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceBlockingStub>() {
        @java.lang.Override
        public GpuClusterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpuClusterServiceBlockingStub(channel, callOptions);
        }
      };
    return GpuClusterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GpuClusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpuClusterServiceFutureStub>() {
        @java.lang.Override
        public GpuClusterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpuClusterServiceFutureStub(channel, callOptions);
        }
      };
    return GpuClusterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing GPU clusters.
   * </pre>
   */
  public static abstract class GpuClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified GPU cluster.
     * To get the list of available GPU clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of GPU clusters in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a GPU cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified GPU cluster.
     * Currently only name, description and labels can be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified GPU cluster.
     * GPU cluster can be deleted only if it doesn't have any instances associated with it.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified GPU cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List instances created in this GPU cluster.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the GPU cluster.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the GPU cluster.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the GPU cluster.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest,
                yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest,
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest,
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest,
                yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing GPU clusters.
   * </pre>
   */
  public static final class GpuClusterServiceStub extends io.grpc.stub.AbstractAsyncStub<GpuClusterServiceStub> {
    private GpuClusterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpuClusterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpuClusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified GPU cluster.
     * To get the list of available GPU clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of GPU clusters in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a GPU cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified GPU cluster.
     * Currently only name, description and labels can be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified GPU cluster.
     * GPU cluster can be deleted only if it doesn't have any instances associated with it.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified GPU cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List instances created in this GPU cluster.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the GPU cluster.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the GPU cluster.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the GPU cluster.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing GPU clusters.
   * </pre>
   */
  public static final class GpuClusterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GpuClusterServiceBlockingStub> {
    private GpuClusterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpuClusterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpuClusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified GPU cluster.
     * To get the list of available GPU clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster get(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of GPU clusters in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse list(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a GPU cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified GPU cluster.
     * Currently only name, description and labels can be updated.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified GPU cluster.
     * GPU cluster can be deleted only if it doesn't have any instances associated with it.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified GPU cluster.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse listOperations(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List instances created in this GPU cluster.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse listInstances(yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the GPU cluster.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the GPU cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the GPU cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing GPU clusters.
   * </pre>
   */
  public static final class GpuClusterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GpuClusterServiceFutureStub> {
    private GpuClusterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpuClusterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpuClusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified GPU cluster.
     * To get the list of available GPU clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster> get(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of GPU clusters in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse> list(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a GPU cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified GPU cluster.
     * Currently only name, description and labels can be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified GPU cluster.
     * GPU cluster can be deleted only if it doesn't have any instances associated with it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified GPU cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List instances created in this GPU cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the GPU cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the GPU cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the GPU cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_INSTANCES = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GpuClusterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GpuClusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.GetGpuClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterOuterClass.GpuCluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.CreateGpuClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.UpdateGpuClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.DeleteGpuClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.ListGpuClusterInstancesResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
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

  private static abstract class GpuClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GpuClusterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.GpuClusterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GpuClusterService");
    }
  }

  private static final class GpuClusterServiceFileDescriptorSupplier
      extends GpuClusterServiceBaseDescriptorSupplier {
    GpuClusterServiceFileDescriptorSupplier() {}
  }

  private static final class GpuClusterServiceMethodDescriptorSupplier
      extends GpuClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GpuClusterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GpuClusterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GpuClusterServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListInstancesMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
