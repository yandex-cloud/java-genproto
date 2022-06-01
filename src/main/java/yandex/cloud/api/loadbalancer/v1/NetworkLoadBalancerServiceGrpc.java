package yandex.cloud.api.loadbalancer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing NetworkLoadBalancer resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadbalancer/v1/network_load_balancer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetworkLoadBalancerServiceGrpc {

  private NetworkLoadBalancerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadbalancer.v1.NetworkLoadBalancerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> getGetMethod;
    if ((getGetMethod = NetworkLoadBalancerServiceGrpc.getGetMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getGetMethod = NetworkLoadBalancerServiceGrpc.getGetMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> getListMethod;
    if ((getListMethod = NetworkLoadBalancerServiceGrpc.getListMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getListMethod = NetworkLoadBalancerServiceGrpc.getListMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = NetworkLoadBalancerServiceGrpc.getCreateMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getCreateMethod = NetworkLoadBalancerServiceGrpc.getCreateMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = NetworkLoadBalancerServiceGrpc.getUpdateMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getUpdateMethod = NetworkLoadBalancerServiceGrpc.getUpdateMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = NetworkLoadBalancerServiceGrpc.getDeleteMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getDeleteMethod = NetworkLoadBalancerServiceGrpc.getDeleteMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = NetworkLoadBalancerServiceGrpc.getStartMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getStartMethod = NetworkLoadBalancerServiceGrpc.getStartMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = NetworkLoadBalancerServiceGrpc.getStopMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getStopMethod = NetworkLoadBalancerServiceGrpc.getStopMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachTargetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachTargetGroup",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachTargetGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachTargetGroupMethod;
    if ((getAttachTargetGroupMethod = NetworkLoadBalancerServiceGrpc.getAttachTargetGroupMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getAttachTargetGroupMethod = NetworkLoadBalancerServiceGrpc.getAttachTargetGroupMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getAttachTargetGroupMethod = getAttachTargetGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttachTargetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("AttachTargetGroup"))
              .build();
        }
      }
    }
    return getAttachTargetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachTargetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachTargetGroup",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachTargetGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachTargetGroupMethod;
    if ((getDetachTargetGroupMethod = NetworkLoadBalancerServiceGrpc.getDetachTargetGroupMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getDetachTargetGroupMethod = NetworkLoadBalancerServiceGrpc.getDetachTargetGroupMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getDetachTargetGroupMethod = getDetachTargetGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetachTargetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("DetachTargetGroup"))
              .build();
        }
      }
    }
    return getDetachTargetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTargetStates",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod;
    if ((getGetTargetStatesMethod = NetworkLoadBalancerServiceGrpc.getGetTargetStatesMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getGetTargetStatesMethod = NetworkLoadBalancerServiceGrpc.getGetTargetStatesMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getGetTargetStatesMethod = getGetTargetStatesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTargetStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("GetTargetStates"))
              .build();
        }
      }
    }
    return getGetTargetStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddListener",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod;
    if ((getAddListenerMethod = NetworkLoadBalancerServiceGrpc.getAddListenerMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getAddListenerMethod = NetworkLoadBalancerServiceGrpc.getAddListenerMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getAddListenerMethod = getAddListenerMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("AddListener"))
              .build();
        }
      }
    }
    return getAddListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveListener",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod;
    if ((getRemoveListenerMethod = NetworkLoadBalancerServiceGrpc.getRemoveListenerMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getRemoveListenerMethod = NetworkLoadBalancerServiceGrpc.getRemoveListenerMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getRemoveListenerMethod = getRemoveListenerMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("RemoveListener"))
              .build();
        }
      }
    }
    return getRemoveListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest,
      yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = NetworkLoadBalancerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        if ((getListOperationsMethod = NetworkLoadBalancerServiceGrpc.getListOperationsMethod) == null) {
          NetworkLoadBalancerServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest, yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkLoadBalancerServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkLoadBalancerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceStub>() {
        @java.lang.Override
        public NetworkLoadBalancerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkLoadBalancerServiceStub(channel, callOptions);
        }
      };
    return NetworkLoadBalancerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkLoadBalancerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceBlockingStub>() {
        @java.lang.Override
        public NetworkLoadBalancerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkLoadBalancerServiceBlockingStub(channel, callOptions);
        }
      };
    return NetworkLoadBalancerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkLoadBalancerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkLoadBalancerServiceFutureStub>() {
        @java.lang.Override
        public NetworkLoadBalancerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkLoadBalancerServiceFutureStub(channel, callOptions);
        }
      };
    return NetworkLoadBalancerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing NetworkLoadBalancer resources.
   * </pre>
   */
  public static abstract class NetworkLoadBalancerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified NetworkLoadBalancer resource.
     * Get the list of available NetworkLoadBalancer resources by making a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of NetworkLoadBalancer resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a network load balancer in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified network load balancer.
     * </pre>
     */
    public void update(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified network load balancer.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts load balancing and health checking with the specified network load balancer with specified settings.
     * Changes network load balancer status to `` ACTIVE ``.
     * </pre>
     */
    public void start(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops load balancing and health checking with the specified network load balancer.
     * Changes load balancer status to `` STOPPED ``.
     * </pre>
     */
    public void stop(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attaches a target group to the specified network load balancer.
     * </pre>
     */
    public void attachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachTargetGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detaches the target group from the specified network load balancer.
     * </pre>
     */
    public void detachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachTargetGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets states of target resources in the attached target group.
     * </pre>
     */
    public void getTargetStates(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTargetStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a listener to the specified network load balancer.
     * </pre>
     */
    public void addListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddListenerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes the listener from the specified network load balancer.
     * </pre>
     */
    public void removeListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveListenerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified network load balancer.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest,
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest,
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getAttachTargetGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ATTACH_TARGET_GROUP)))
          .addMethod(
            getDetachTargetGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DETACH_TARGET_GROUP)))
          .addMethod(
            getGetTargetStatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest,
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse>(
                  this, METHODID_GET_TARGET_STATES)))
          .addMethod(
            getAddListenerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_LISTENER)))
          .addMethod(
            getRemoveListenerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_LISTENER)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest,
                yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing NetworkLoadBalancer resources.
   * </pre>
   */
  public static final class NetworkLoadBalancerServiceStub extends io.grpc.stub.AbstractAsyncStub<NetworkLoadBalancerServiceStub> {
    private NetworkLoadBalancerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkLoadBalancerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkLoadBalancerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified NetworkLoadBalancer resource.
     * Get the list of available NetworkLoadBalancer resources by making a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of NetworkLoadBalancer resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a network load balancer in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified network load balancer.
     * </pre>
     */
    public void update(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified network load balancer.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts load balancing and health checking with the specified network load balancer with specified settings.
     * Changes network load balancer status to `` ACTIVE ``.
     * </pre>
     */
    public void start(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops load balancing and health checking with the specified network load balancer.
     * Changes load balancer status to `` STOPPED ``.
     * </pre>
     */
    public void stop(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attaches a target group to the specified network load balancer.
     * </pre>
     */
    public void attachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachTargetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detaches the target group from the specified network load balancer.
     * </pre>
     */
    public void detachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachTargetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets states of target resources in the attached target group.
     * </pre>
     */
    public void getTargetStates(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTargetStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a listener to the specified network load balancer.
     * </pre>
     */
    public void addListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes the listener from the specified network load balancer.
     * </pre>
     */
    public void removeListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified network load balancer.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing NetworkLoadBalancer resources.
   * </pre>
   */
  public static final class NetworkLoadBalancerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkLoadBalancerServiceBlockingStub> {
    private NetworkLoadBalancerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkLoadBalancerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkLoadBalancerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified NetworkLoadBalancer resource.
     * Get the list of available NetworkLoadBalancer resources by making a [List] request.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer get(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of NetworkLoadBalancer resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse list(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a network load balancer in the specified folder using the data specified in the request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts load balancing and health checking with the specified network load balancer with specified settings.
     * Changes network load balancer status to `` ACTIVE ``.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops load balancing and health checking with the specified network load balancer.
     * Changes load balancer status to `` STOPPED ``.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches a target group to the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation attachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachTargetGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detaches the target group from the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation detachTargetGroup(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachTargetGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets states of target resources in the attached target group.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse getTargetStates(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTargetStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a listener to the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddListenerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes the listener from the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeListener(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveListenerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified network load balancer.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse listOperations(yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing NetworkLoadBalancer resources.
   * </pre>
   */
  public static final class NetworkLoadBalancerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkLoadBalancerServiceFutureStub> {
    private NetworkLoadBalancerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkLoadBalancerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkLoadBalancerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified NetworkLoadBalancer resource.
     * Get the list of available NetworkLoadBalancer resources by making a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer> get(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of NetworkLoadBalancer resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse> list(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a network load balancer in the specified folder using the data specified in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts load balancing and health checking with the specified network load balancer with specified settings.
     * Changes network load balancer status to `` ACTIVE ``.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops load balancing and health checking with the specified network load balancer.
     * Changes load balancer status to `` STOPPED ``.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attaches a target group to the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> attachTargetGroup(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachTargetGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Detaches the target group from the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> detachTargetGroup(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachTargetGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets states of target resources in the attached target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse> getTargetStates(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTargetStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a listener to the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addListener(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddListenerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes the listener from the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeListener(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveListenerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified network load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse> listOperations(
        yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_ATTACH_TARGET_GROUP = 7;
  private static final int METHODID_DETACH_TARGET_GROUP = 8;
  private static final int METHODID_GET_TARGET_STATES = 9;
  private static final int METHODID_ADD_LISTENER = 10;
  private static final int METHODID_REMOVE_LISTENER = 11;
  private static final int METHODID_LIST_OPERATIONS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkLoadBalancerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkLoadBalancerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerOuterClass.NetworkLoadBalancer>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.CreateNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.UpdateNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DeleteNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StartNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.StopNetworkLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ATTACH_TARGET_GROUP:
          serviceImpl.attachTargetGroup((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AttachNetworkLoadBalancerTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DETACH_TARGET_GROUP:
          serviceImpl.detachTargetGroup((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.DetachNetworkLoadBalancerTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_TARGET_STATES:
          serviceImpl.getTargetStates((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.GetTargetStatesResponse>) responseObserver);
          break;
        case METHODID_ADD_LISTENER:
          serviceImpl.addListener((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.AddNetworkLoadBalancerListenerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_LISTENER:
          serviceImpl.removeListener((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.RemoveNetworkLoadBalancerListenerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.ListNetworkLoadBalancerOperationsResponse>) responseObserver);
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

  private static abstract class NetworkLoadBalancerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkLoadBalancerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadbalancer.v1.NetworkLoadBalancerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkLoadBalancerService");
    }
  }

  private static final class NetworkLoadBalancerServiceFileDescriptorSupplier
      extends NetworkLoadBalancerServiceBaseDescriptorSupplier {
    NetworkLoadBalancerServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkLoadBalancerServiceMethodDescriptorSupplier
      extends NetworkLoadBalancerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkLoadBalancerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkLoadBalancerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkLoadBalancerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getAttachTargetGroupMethod())
              .addMethod(getDetachTargetGroupMethod())
              .addMethod(getGetTargetStatesMethod())
              .addMethod(getAddListenerMethod())
              .addMethod(getRemoveListenerMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
