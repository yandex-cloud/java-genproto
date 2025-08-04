package yandex.cloud.api.apploadbalancer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing application load balancers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/apploadbalancer/v1/load_balancer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoadBalancerServiceGrpc {

  private LoadBalancerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.apploadbalancer.v1.LoadBalancerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> getGetMethod;
    if ((getGetMethod = LoadBalancerServiceGrpc.getGetMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getGetMethod = LoadBalancerServiceGrpc.getGetMethod) == null) {
          LoadBalancerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> getListMethod;
    if ((getListMethod = LoadBalancerServiceGrpc.getListMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getListMethod = LoadBalancerServiceGrpc.getListMethod) == null) {
          LoadBalancerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LoadBalancerServiceGrpc.getCreateMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getCreateMethod = LoadBalancerServiceGrpc.getCreateMethod) == null) {
          LoadBalancerServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = LoadBalancerServiceGrpc.getUpdateMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getUpdateMethod = LoadBalancerServiceGrpc.getUpdateMethod) == null) {
          LoadBalancerServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LoadBalancerServiceGrpc.getDeleteMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getDeleteMethod = LoadBalancerServiceGrpc.getDeleteMethod) == null) {
          LoadBalancerServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = LoadBalancerServiceGrpc.getStartMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getStartMethod = LoadBalancerServiceGrpc.getStartMethod) == null) {
          LoadBalancerServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = LoadBalancerServiceGrpc.getStopMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getStopMethod = LoadBalancerServiceGrpc.getStopMethod) == null) {
          LoadBalancerServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddListener",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddListenerMethod;
    if ((getAddListenerMethod = LoadBalancerServiceGrpc.getAddListenerMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getAddListenerMethod = LoadBalancerServiceGrpc.getAddListenerMethod) == null) {
          LoadBalancerServiceGrpc.getAddListenerMethod = getAddListenerMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("AddListener"))
              .build();
        }
      }
    }
    return getAddListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveListener",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveListenerMethod;
    if ((getRemoveListenerMethod = LoadBalancerServiceGrpc.getRemoveListenerMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getRemoveListenerMethod = LoadBalancerServiceGrpc.getRemoveListenerMethod) == null) {
          LoadBalancerServiceGrpc.getRemoveListenerMethod = getRemoveListenerMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("RemoveListener"))
              .build();
        }
      }
    }
    return getRemoveListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateListener",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateListenerMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateListenerMethod;
    if ((getUpdateListenerMethod = LoadBalancerServiceGrpc.getUpdateListenerMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getUpdateListenerMethod = LoadBalancerServiceGrpc.getUpdateListenerMethod) == null) {
          LoadBalancerServiceGrpc.getUpdateListenerMethod = getUpdateListenerMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("UpdateListener"))
              .build();
        }
      }
    }
    return getUpdateListenerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddSniMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSniMatch",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddSniMatchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddSniMatchMethod;
    if ((getAddSniMatchMethod = LoadBalancerServiceGrpc.getAddSniMatchMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getAddSniMatchMethod = LoadBalancerServiceGrpc.getAddSniMatchMethod) == null) {
          LoadBalancerServiceGrpc.getAddSniMatchMethod = getAddSniMatchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSniMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("AddSniMatch"))
              .build();
        }
      }
    }
    return getAddSniMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSniMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSniMatch",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSniMatchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSniMatchMethod;
    if ((getUpdateSniMatchMethod = LoadBalancerServiceGrpc.getUpdateSniMatchMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getUpdateSniMatchMethod = LoadBalancerServiceGrpc.getUpdateSniMatchMethod) == null) {
          LoadBalancerServiceGrpc.getUpdateSniMatchMethod = getUpdateSniMatchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSniMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("UpdateSniMatch"))
              .build();
        }
      }
    }
    return getUpdateSniMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveSniMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSniMatch",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveSniMatchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveSniMatchMethod;
    if ((getRemoveSniMatchMethod = LoadBalancerServiceGrpc.getRemoveSniMatchMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getRemoveSniMatchMethod = LoadBalancerServiceGrpc.getRemoveSniMatchMethod) == null) {
          LoadBalancerServiceGrpc.getRemoveSniMatchMethod = getRemoveSniMatchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSniMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("RemoveSniMatch"))
              .build();
        }
      }
    }
    return getRemoveSniMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTargetStates",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> getGetTargetStatesMethod;
    if ((getGetTargetStatesMethod = LoadBalancerServiceGrpc.getGetTargetStatesMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getGetTargetStatesMethod = LoadBalancerServiceGrpc.getGetTargetStatesMethod) == null) {
          LoadBalancerServiceGrpc.getGetTargetStatesMethod = getGetTargetStatesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTargetStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("GetTargetStates"))
              .build();
        }
      }
    }
    return getGetTargetStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = LoadBalancerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getListOperationsMethod = LoadBalancerServiceGrpc.getListOperationsMethod) == null) {
          LoadBalancerServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest, yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartZonalShiftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartZonalShift",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartZonalShiftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartZonalShiftMethod;
    if ((getStartZonalShiftMethod = LoadBalancerServiceGrpc.getStartZonalShiftMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getStartZonalShiftMethod = LoadBalancerServiceGrpc.getStartZonalShiftMethod) == null) {
          LoadBalancerServiceGrpc.getStartZonalShiftMethod = getStartZonalShiftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartZonalShift"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("StartZonalShift"))
              .build();
        }
      }
    }
    return getStartZonalShiftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelZonalShiftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelZonalShift",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelZonalShiftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelZonalShiftMethod;
    if ((getCancelZonalShiftMethod = LoadBalancerServiceGrpc.getCancelZonalShiftMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getCancelZonalShiftMethod = LoadBalancerServiceGrpc.getCancelZonalShiftMethod) == null) {
          LoadBalancerServiceGrpc.getCancelZonalShiftMethod = getCancelZonalShiftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelZonalShift"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("CancelZonalShift"))
              .build();
        }
      }
    }
    return getCancelZonalShiftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableZones",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableZonesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableZonesMethod;
    if ((getDisableZonesMethod = LoadBalancerServiceGrpc.getDisableZonesMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getDisableZonesMethod = LoadBalancerServiceGrpc.getDisableZonesMethod) == null) {
          LoadBalancerServiceGrpc.getDisableZonesMethod = getDisableZonesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableZones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("DisableZones"))
              .build();
        }
      }
    }
    return getDisableZonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableZones",
      requestType = yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableZonesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableZonesMethod;
    if ((getEnableZonesMethod = LoadBalancerServiceGrpc.getEnableZonesMethod) == null) {
      synchronized (LoadBalancerServiceGrpc.class) {
        if ((getEnableZonesMethod = LoadBalancerServiceGrpc.getEnableZonesMethod) == null) {
          LoadBalancerServiceGrpc.getEnableZonesMethod = getEnableZonesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableZones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LoadBalancerServiceMethodDescriptorSupplier("EnableZones"))
              .build();
        }
      }
    }
    return getEnableZonesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoadBalancerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceStub>() {
        @java.lang.Override
        public LoadBalancerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadBalancerServiceStub(channel, callOptions);
        }
      };
    return LoadBalancerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoadBalancerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceBlockingStub>() {
        @java.lang.Override
        public LoadBalancerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadBalancerServiceBlockingStub(channel, callOptions);
        }
      };
    return LoadBalancerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoadBalancerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadBalancerServiceFutureStub>() {
        @java.lang.Override
        public LoadBalancerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadBalancerServiceFutureStub(channel, callOptions);
        }
      };
    return LoadBalancerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing application load balancers.
   * </pre>
   */
  public static abstract class LoadBalancerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified application load balancer.
     * To get the list of all available application load balancers, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists application load balancers in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an application load balancer in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified application load balancer.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified application load balancer.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified application load balancer.
     * </pre>
     */
    public void start(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified application load balancer.
     * </pre>
     */
    public void stop(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a listener to the specified application load balancer.
     * </pre>
     */
    public void addListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddListenerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified listener.
     * </pre>
     */
    public void removeListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveListenerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified listener of the specified application load balancer.
     * </pre>
     */
    public void updateListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateListenerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a SNI handler to the specified listener.
     * This request does not allow to add [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public void addSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSniMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified SNI handler of the specified listener.
     * This request does not allow to update [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public void updateSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSniMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SNI handler.
     * This request does not allow to delete [TlsListener.default_handler].
     * </pre>
     */
    public void removeSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSniMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the statuses of all targets of the specified backend group in all their availability zones.
     * </pre>
     */
    public void getTargetStates(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTargetStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified application load balancer.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public void startZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartZonalShiftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public void cancelZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelZonalShiftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable L7 traffic routing in zones for the specified load balancer.
     * </pre>
     */
    public void disableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableZonesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable L7 traffic routing back in zones for the specified load balancer.
     * </pre>
     */
    public void enableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableZonesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest,
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest,
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getAddListenerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_LISTENER)))
          .addMethod(
            getRemoveListenerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_LISTENER)))
          .addMethod(
            getUpdateListenerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_LISTENER)))
          .addMethod(
            getAddSniMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_SNI_MATCH)))
          .addMethod(
            getUpdateSniMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_SNI_MATCH)))
          .addMethod(
            getRemoveSniMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_SNI_MATCH)))
          .addMethod(
            getGetTargetStatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest,
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse>(
                  this, METHODID_GET_TARGET_STATES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest,
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getStartZonalShiftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_ZONAL_SHIFT)))
          .addMethod(
            getCancelZonalShiftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL_ZONAL_SHIFT)))
          .addMethod(
            getDisableZonesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DISABLE_ZONES)))
          .addMethod(
            getEnableZonesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENABLE_ZONES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing application load balancers.
   * </pre>
   */
  public static final class LoadBalancerServiceStub extends io.grpc.stub.AbstractAsyncStub<LoadBalancerServiceStub> {
    private LoadBalancerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadBalancerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified application load balancer.
     * To get the list of all available application load balancers, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists application load balancers in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an application load balancer in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified application load balancer.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified application load balancer.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified application load balancer.
     * </pre>
     */
    public void start(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified application load balancer.
     * </pre>
     */
    public void stop(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a listener to the specified application load balancer.
     * </pre>
     */
    public void addListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified listener.
     * </pre>
     */
    public void removeListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified listener of the specified application load balancer.
     * </pre>
     */
    public void updateListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateListenerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a SNI handler to the specified listener.
     * This request does not allow to add [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public void addSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSniMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified SNI handler of the specified listener.
     * This request does not allow to update [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public void updateSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSniMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SNI handler.
     * This request does not allow to delete [TlsListener.default_handler].
     * </pre>
     */
    public void removeSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSniMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the statuses of all targets of the specified backend group in all their availability zones.
     * </pre>
     */
    public void getTargetStates(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTargetStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified application load balancer.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public void startZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartZonalShiftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public void cancelZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelZonalShiftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable L7 traffic routing in zones for the specified load balancer.
     * </pre>
     */
    public void disableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableZonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable L7 traffic routing back in zones for the specified load balancer.
     * </pre>
     */
    public void enableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableZonesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing application load balancers.
   * </pre>
   */
  public static final class LoadBalancerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LoadBalancerServiceBlockingStub> {
    private LoadBalancerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadBalancerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified application load balancer.
     * To get the list of all available application load balancers, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer get(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists application load balancers in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse list(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an application load balancer in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a listener to the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddListenerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified listener.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveListenerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified listener of the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateListener(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateListenerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a SNI handler to the specified listener.
     * This request does not allow to add [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSniMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified SNI handler of the specified listener.
     * This request does not allow to update [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSniMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified SNI handler.
     * This request does not allow to delete [TlsListener.default_handler].
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeSniMatch(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSniMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the statuses of all targets of the specified backend group in all their availability zones.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse getTargetStates(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTargetStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified application load balancer.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse listOperations(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public yandex.cloud.api.operation.OperationOuterClass.Operation startZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartZonalShiftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancelZonalShift(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelZonalShiftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable L7 traffic routing in zones for the specified load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation disableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableZonesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable L7 traffic routing back in zones for the specified load balancer.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation enableZones(yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableZonesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing application load balancers.
   * </pre>
   */
  public static final class LoadBalancerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LoadBalancerServiceFutureStub> {
    private LoadBalancerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadBalancerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified application load balancer.
     * To get the list of all available application load balancers, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer> get(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists application load balancers in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse> list(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an application load balancer in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a listener to the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addListener(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddListenerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified listener.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeListener(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveListenerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified listener of the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateListener(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateListenerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a SNI handler to the specified listener.
     * This request does not allow to add [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addSniMatch(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSniMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified SNI handler of the specified listener.
     * This request does not allow to update [TlsListener.default_handler]. Make an [UpdateListener] request instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateSniMatch(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSniMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified SNI handler.
     * This request does not allow to delete [TlsListener.default_handler].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeSniMatch(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSniMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the statuses of all targets of the specified backend group in all their availability zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse> getTargetStates(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTargetStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified application load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse> listOperations(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startZonalShift(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartZonalShiftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel ZonalShift for the specified load balancer.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancelZonalShift(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelZonalShiftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable L7 traffic routing in zones for the specified load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> disableZones(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableZonesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable L7 traffic routing back in zones for the specified load balancer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> enableZones(
        yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableZonesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_ADD_LISTENER = 7;
  private static final int METHODID_REMOVE_LISTENER = 8;
  private static final int METHODID_UPDATE_LISTENER = 9;
  private static final int METHODID_ADD_SNI_MATCH = 10;
  private static final int METHODID_UPDATE_SNI_MATCH = 11;
  private static final int METHODID_REMOVE_SNI_MATCH = 12;
  private static final int METHODID_GET_TARGET_STATES = 13;
  private static final int METHODID_LIST_OPERATIONS = 14;
  private static final int METHODID_START_ZONAL_SHIFT = 15;
  private static final int METHODID_CANCEL_ZONAL_SHIFT = 16;
  private static final int METHODID_DISABLE_ZONES = 17;
  private static final int METHODID_ENABLE_ZONES = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoadBalancerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoadBalancerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerOuterClass.LoadBalancer>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CreateLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DeleteLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StopLoadBalancerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_LISTENER:
          serviceImpl.addListener((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddListenerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_LISTENER:
          serviceImpl.removeListener((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveListenerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_LISTENER:
          serviceImpl.updateListener((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateListenerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_SNI_MATCH:
          serviceImpl.addSniMatch((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.AddSniMatchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_SNI_MATCH:
          serviceImpl.updateSniMatch((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.UpdateSniMatchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_SNI_MATCH:
          serviceImpl.removeSniMatch((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.RemoveSniMatchRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_TARGET_STATES:
          serviceImpl.getTargetStates((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.GetTargetStatesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.ListLoadBalancerOperationsResponse>) responseObserver);
          break;
        case METHODID_START_ZONAL_SHIFT:
          serviceImpl.startZonalShift((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.StartZonalShiftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_ZONAL_SHIFT:
          serviceImpl.cancelZonalShift((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.CancelZonalShiftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DISABLE_ZONES:
          serviceImpl.disableZones((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.DisableZonesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ENABLE_ZONES:
          serviceImpl.enableZones((yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.EnableZonesRequest) request,
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

  private static abstract class LoadBalancerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoadBalancerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.apploadbalancer.v1.LoadBalancerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoadBalancerService");
    }
  }

  private static final class LoadBalancerServiceFileDescriptorSupplier
      extends LoadBalancerServiceBaseDescriptorSupplier {
    LoadBalancerServiceFileDescriptorSupplier() {}
  }

  private static final class LoadBalancerServiceMethodDescriptorSupplier
      extends LoadBalancerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoadBalancerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoadBalancerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoadBalancerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getAddListenerMethod())
              .addMethod(getRemoveListenerMethod())
              .addMethod(getUpdateListenerMethod())
              .addMethod(getAddSniMatchMethod())
              .addMethod(getUpdateSniMatchMethod())
              .addMethod(getRemoveSniMatchMethod())
              .addMethod(getGetTargetStatesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getStartZonalShiftMethod())
              .addMethod(getCancelZonalShiftMethod())
              .addMethod(getDisableZonesMethod())
              .addMethod(getEnableZonesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
