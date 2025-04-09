package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Server resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/server_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerServiceGrpc {

  private ServerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.ServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest, yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> getGetMethod;
    if ((getGetMethod = ServerServiceGrpc.getGetMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getGetMethod = ServerServiceGrpc.getGetMethod) == null) {
          ServerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest, yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest, yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> getListMethod;
    if ((getListMethod = ServerServiceGrpc.getListMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListMethod = ServerServiceGrpc.getListMethod) == null) {
          ServerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest, yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ServerServiceGrpc.getCreateMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getCreateMethod = ServerServiceGrpc.getCreateMethod) == null) {
          ServerServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreate",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchCreateMethod;
    if ((getBatchCreateMethod = ServerServiceGrpc.getBatchCreateMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getBatchCreateMethod = ServerServiceGrpc.getBatchCreateMethod) == null) {
          ServerServiceGrpc.getBatchCreateMethod = getBatchCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("BatchCreate"))
              .build();
        }
      }
    }
    return getBatchCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ServerServiceGrpc.getUpdateMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getUpdateMethod = ServerServiceGrpc.getUpdateMethod) == null) {
          ServerServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PowerOff",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOffMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOffMethod;
    if ((getPowerOffMethod = ServerServiceGrpc.getPowerOffMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getPowerOffMethod = ServerServiceGrpc.getPowerOffMethod) == null) {
          ServerServiceGrpc.getPowerOffMethod = getPowerOffMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PowerOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("PowerOff"))
              .build();
        }
      }
    }
    return getPowerOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PowerOn",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOnMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPowerOnMethod;
    if ((getPowerOnMethod = ServerServiceGrpc.getPowerOnMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getPowerOnMethod = ServerServiceGrpc.getPowerOnMethod) == null) {
          ServerServiceGrpc.getPowerOnMethod = getPowerOnMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PowerOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("PowerOn"))
              .build();
        }
      }
    }
    return getPowerOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRebootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reboot",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRebootMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRebootMethod;
    if ((getRebootMethod = ServerServiceGrpc.getRebootMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getRebootMethod = ServerServiceGrpc.getRebootMethod) == null) {
          ServerServiceGrpc.getRebootMethod = getRebootMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reboot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Reboot"))
              .build();
        }
      }
    }
    return getRebootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReinstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reinstall",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReinstallMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getReinstallMethod;
    if ((getReinstallMethod = ServerServiceGrpc.getReinstallMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getReinstallMethod = ServerServiceGrpc.getReinstallMethod) == null) {
          ServerServiceGrpc.getReinstallMethod = getReinstallMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reinstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Reinstall"))
              .build();
        }
      }
    }
    return getReinstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartProlongationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartProlongation",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartProlongationMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartProlongationMethod;
    if ((getStartProlongationMethod = ServerServiceGrpc.getStartProlongationMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getStartProlongationMethod = ServerServiceGrpc.getStartProlongationMethod) == null) {
          ServerServiceGrpc.getStartProlongationMethod = getStartProlongationMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartProlongation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("StartProlongation"))
              .build();
        }
      }
    }
    return getStartProlongationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopProlongationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopProlongation",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopProlongationMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopProlongationMethod;
    if ((getStopProlongationMethod = ServerServiceGrpc.getStopProlongationMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getStopProlongationMethod = ServerServiceGrpc.getStopProlongationMethod) == null) {
          ServerServiceGrpc.getStopProlongationMethod = getStopProlongationMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopProlongation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("StopProlongation"))
              .build();
        }
      }
    }
    return getStopProlongationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest, yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ServerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListOperationsMethod = ServerServiceGrpc.getListOperationsMethod) == null) {
          ServerServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest, yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceStub>() {
        @java.lang.Override
        public ServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceStub(channel, callOptions);
        }
      };
    return ServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingStub>() {
        @java.lang.Override
        public ServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceFutureStub>() {
        @java.lang.Override
        public ServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceFutureStub(channel, callOptions);
        }
      };
    return ServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Server resources.
   * </pre>
   */
  public static abstract class ServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific Server resource.
     * To get the list of available Server resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Server resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a server in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates multiple servers in the specified folder.
     * </pre>
     */
    public void batchCreate(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified server.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Powers off the specified server.
     * </pre>
     */
    public void powerOff(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPowerOffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Powers on the specified server.
     * </pre>
     */
    public void powerOn(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPowerOnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reboots the specified server.
     * </pre>
     */
    public void reboot(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebootMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reinstalls the specified server.
     * </pre>
     */
    public void reinstall(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReinstallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts prolongation of the specified server.
     * </pre>
     */
    public void startProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartProlongationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops prolongation of the specified server.
     * </pre>
     */
    public void stopProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopProlongationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified server.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest,
                yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest,
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getBatchCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getPowerOffMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_POWER_OFF)))
          .addMethod(
            getPowerOnMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_POWER_ON)))
          .addMethod(
            getRebootMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REBOOT)))
          .addMethod(
            getReinstallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REINSTALL)))
          .addMethod(
            getStartProlongationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_PROLONGATION)))
          .addMethod(
            getStopProlongationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP_PROLONGATION)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest,
                yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Server resources.
   * </pre>
   */
  public static final class ServerServiceStub extends io.grpc.stub.AbstractAsyncStub<ServerServiceStub> {
    private ServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Server resource.
     * To get the list of available Server resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Server resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a server in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates multiple servers in the specified folder.
     * </pre>
     */
    public void batchCreate(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified server.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Powers off the specified server.
     * </pre>
     */
    public void powerOff(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPowerOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Powers on the specified server.
     * </pre>
     */
    public void powerOn(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPowerOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reboots the specified server.
     * </pre>
     */
    public void reboot(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reinstalls the specified server.
     * </pre>
     */
    public void reinstall(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReinstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts prolongation of the specified server.
     * </pre>
     */
    public void startProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartProlongationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops prolongation of the specified server.
     * </pre>
     */
    public void stopProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopProlongationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified server.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Server resources.
   * </pre>
   */
  public static final class ServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerServiceBlockingStub> {
    private ServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Server resource.
     * To get the list of available Server resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server get(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Server resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse list(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a server in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates multiple servers in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchCreate(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Powers off the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation powerOff(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPowerOffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Powers on the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation powerOn(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPowerOnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reboots the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reboot(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reinstalls the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reinstall(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReinstallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts prolongation of the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation startProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartProlongationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops prolongation of the specified server.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stopProlongation(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopProlongationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified server.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse listOperations(yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Server resources.
   * </pre>
   */
  public static final class ServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServerServiceFutureStub> {
    private ServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific Server resource.
     * To get the list of available Server resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server> get(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Server resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse> list(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a server in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates multiple servers in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchCreate(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Powers off the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> powerOff(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPowerOffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Powers on the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> powerOn(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPowerOnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reboots the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reboot(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reinstalls the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reinstall(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReinstallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts prolongation of the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startProlongation(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartProlongationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops prolongation of the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stopProlongation(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopProlongationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse> listOperations(
        yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_BATCH_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_POWER_OFF = 5;
  private static final int METHODID_POWER_ON = 6;
  private static final int METHODID_REBOOT = 7;
  private static final int METHODID_REINSTALL = 8;
  private static final int METHODID_START_PROLONGATION = 9;
  private static final int METHODID_STOP_PROLONGATION = 10;
  private static final int METHODID_LIST_OPERATIONS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.GetServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerOuterClass.Server>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.CreateServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_CREATE:
          serviceImpl.batchCreate((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.BatchCreateServersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.UpdateServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_POWER_OFF:
          serviceImpl.powerOff((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOffServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_POWER_ON:
          serviceImpl.powerOn((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.PowerOnServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REBOOT:
          serviceImpl.reboot((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.RebootServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REINSTALL:
          serviceImpl.reinstall((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ReinstallServerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START_PROLONGATION:
          serviceImpl.startProlongation((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StartProlongationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP_PROLONGATION:
          serviceImpl.stopProlongation((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.StopProlongationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.ListServerOperationsResponse>) responseObserver);
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

  private static abstract class ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.ServerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerService");
    }
  }

  private static final class ServerServiceFileDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier {
    ServerServiceFileDescriptorSupplier() {}
  }

  private static final class ServerServiceMethodDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getBatchCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getPowerOffMethod())
              .addMethod(getPowerOnMethod())
              .addMethod(getRebootMethod())
              .addMethod(getReinstallMethod())
              .addMethod(getStartProlongationMethod())
              .addMethod(getStopProlongationMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
