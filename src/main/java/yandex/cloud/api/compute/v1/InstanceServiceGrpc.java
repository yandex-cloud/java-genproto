package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Instance resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/instance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstanceServiceGrpc {

  private InstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.InstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest,
      yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest.class,
      responseType = yandex.cloud.api.compute.v1.InstanceOuterClass.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest,
      yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest, yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> getGetMethod;
    if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getGetMethod = InstanceServiceGrpc.getGetMethod) == null) {
          InstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest, yandex.cloud.api.compute.v1.InstanceOuterClass.Instance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceOuterClass.Instance.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> getListMethod;
    if ((getListMethod = InstanceServiceGrpc.getListMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getListMethod = InstanceServiceGrpc.getListMethod) == null) {
          InstanceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = InstanceServiceGrpc.getCreateMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getCreateMethod = InstanceServiceGrpc.getCreateMethod) == null) {
          InstanceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = InstanceServiceGrpc.getUpdateMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getUpdateMethod = InstanceServiceGrpc.getUpdateMethod) == null) {
          InstanceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = InstanceServiceGrpc.getDeleteMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getDeleteMethod = InstanceServiceGrpc.getDeleteMethod) == null) {
          InstanceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetadata",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMetadataMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMetadataMethod;
    if ((getUpdateMetadataMethod = InstanceServiceGrpc.getUpdateMetadataMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getUpdateMetadataMethod = InstanceServiceGrpc.getUpdateMetadataMethod) == null) {
          InstanceServiceGrpc.getUpdateMetadataMethod = getUpdateMetadataMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("UpdateMetadata"))
              .build();
        }
      }
    }
    return getUpdateMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> getGetSerialPortOutputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSerialPortOutput",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest.class,
      responseType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> getGetSerialPortOutputMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> getGetSerialPortOutputMethod;
    if ((getGetSerialPortOutputMethod = InstanceServiceGrpc.getGetSerialPortOutputMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getGetSerialPortOutputMethod = InstanceServiceGrpc.getGetSerialPortOutputMethod) == null) {
          InstanceServiceGrpc.getGetSerialPortOutputMethod = getGetSerialPortOutputMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSerialPortOutput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("GetSerialPortOutput"))
              .build();
        }
      }
    }
    return getGetSerialPortOutputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = InstanceServiceGrpc.getStopMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getStopMethod = InstanceServiceGrpc.getStopMethod) == null) {
          InstanceServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = InstanceServiceGrpc.getStartMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getStartMethod = InstanceServiceGrpc.getStartMethod) == null) {
          InstanceServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restart",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod;
    if ((getRestartMethod = InstanceServiceGrpc.getRestartMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getRestartMethod = InstanceServiceGrpc.getRestartMethod) == null) {
          InstanceServiceGrpc.getRestartMethod = getRestartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Restart"))
              .build();
        }
      }
    }
    return getRestartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachDiskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachDisk",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachDiskMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachDiskMethod;
    if ((getAttachDiskMethod = InstanceServiceGrpc.getAttachDiskMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getAttachDiskMethod = InstanceServiceGrpc.getAttachDiskMethod) == null) {
          InstanceServiceGrpc.getAttachDiskMethod = getAttachDiskMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttachDisk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("AttachDisk"))
              .build();
        }
      }
    }
    return getAttachDiskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachDiskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachDisk",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachDiskMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachDiskMethod;
    if ((getDetachDiskMethod = InstanceServiceGrpc.getDetachDiskMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getDetachDiskMethod = InstanceServiceGrpc.getDetachDiskMethod) == null) {
          InstanceServiceGrpc.getDetachDiskMethod = getDetachDiskMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetachDisk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("DetachDisk"))
              .build();
        }
      }
    }
    return getDetachDiskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachFilesystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachFilesystem",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachFilesystemMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachFilesystemMethod;
    if ((getAttachFilesystemMethod = InstanceServiceGrpc.getAttachFilesystemMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getAttachFilesystemMethod = InstanceServiceGrpc.getAttachFilesystemMethod) == null) {
          InstanceServiceGrpc.getAttachFilesystemMethod = getAttachFilesystemMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttachFilesystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("AttachFilesystem"))
              .build();
        }
      }
    }
    return getAttachFilesystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachFilesystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachFilesystem",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachFilesystemMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachFilesystemMethod;
    if ((getDetachFilesystemMethod = InstanceServiceGrpc.getDetachFilesystemMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getDetachFilesystemMethod = InstanceServiceGrpc.getDetachFilesystemMethod) == null) {
          InstanceServiceGrpc.getDetachFilesystemMethod = getDetachFilesystemMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetachFilesystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("DetachFilesystem"))
              .build();
        }
      }
    }
    return getDetachFilesystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachNetworkInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachNetworkInterface",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachNetworkInterfaceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAttachNetworkInterfaceMethod;
    if ((getAttachNetworkInterfaceMethod = InstanceServiceGrpc.getAttachNetworkInterfaceMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getAttachNetworkInterfaceMethod = InstanceServiceGrpc.getAttachNetworkInterfaceMethod) == null) {
          InstanceServiceGrpc.getAttachNetworkInterfaceMethod = getAttachNetworkInterfaceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttachNetworkInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("AttachNetworkInterface"))
              .build();
        }
      }
    }
    return getAttachNetworkInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachNetworkInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachNetworkInterface",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachNetworkInterfaceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDetachNetworkInterfaceMethod;
    if ((getDetachNetworkInterfaceMethod = InstanceServiceGrpc.getDetachNetworkInterfaceMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getDetachNetworkInterfaceMethod = InstanceServiceGrpc.getDetachNetworkInterfaceMethod) == null) {
          InstanceServiceGrpc.getDetachNetworkInterfaceMethod = getDetachNetworkInterfaceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetachNetworkInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("DetachNetworkInterface"))
              .build();
        }
      }
    }
    return getDetachNetworkInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOneToOneNatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOneToOneNat",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOneToOneNatMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOneToOneNatMethod;
    if ((getAddOneToOneNatMethod = InstanceServiceGrpc.getAddOneToOneNatMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getAddOneToOneNatMethod = InstanceServiceGrpc.getAddOneToOneNatMethod) == null) {
          InstanceServiceGrpc.getAddOneToOneNatMethod = getAddOneToOneNatMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOneToOneNat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("AddOneToOneNat"))
              .build();
        }
      }
    }
    return getAddOneToOneNatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveOneToOneNatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOneToOneNat",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveOneToOneNatMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveOneToOneNatMethod;
    if ((getRemoveOneToOneNatMethod = InstanceServiceGrpc.getRemoveOneToOneNatMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getRemoveOneToOneNatMethod = InstanceServiceGrpc.getRemoveOneToOneNatMethod) == null) {
          InstanceServiceGrpc.getRemoveOneToOneNatMethod = getRemoveOneToOneNatMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOneToOneNat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("RemoveOneToOneNat"))
              .build();
        }
      }
    }
    return getRemoveOneToOneNatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateNetworkInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetworkInterface",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateNetworkInterfaceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateNetworkInterfaceMethod;
    if ((getUpdateNetworkInterfaceMethod = InstanceServiceGrpc.getUpdateNetworkInterfaceMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getUpdateNetworkInterfaceMethod = InstanceServiceGrpc.getUpdateNetworkInterfaceMethod) == null) {
          InstanceServiceGrpc.getUpdateNetworkInterfaceMethod = getUpdateNetworkInterfaceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNetworkInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("UpdateNetworkInterface"))
              .build();
        }
      }
    }
    return getUpdateNetworkInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest,
      yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = InstanceServiceGrpc.getListOperationsMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getListOperationsMethod = InstanceServiceGrpc.getListOperationsMethod) == null) {
          InstanceServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest, yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = InstanceServiceGrpc.getMoveMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getMoveMethod = InstanceServiceGrpc.getMoveMethod) == null) {
          InstanceServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relocate",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;
    if ((getRelocateMethod = InstanceServiceGrpc.getRelocateMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getRelocateMethod = InstanceServiceGrpc.getRelocateMethod) == null) {
          InstanceServiceGrpc.getRelocateMethod = getRelocateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("Relocate"))
              .build();
        }
      }
    }
    return getRelocateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSimulateMaintenanceEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateMaintenanceEvent",
      requestType = yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSimulateMaintenanceEventMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSimulateMaintenanceEventMethod;
    if ((getSimulateMaintenanceEventMethod = InstanceServiceGrpc.getSimulateMaintenanceEventMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getSimulateMaintenanceEventMethod = InstanceServiceGrpc.getSimulateMaintenanceEventMethod) == null) {
          InstanceServiceGrpc.getSimulateMaintenanceEventMethod = getSimulateMaintenanceEventMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimulateMaintenanceEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("SimulateMaintenanceEvent"))
              .build();
        }
      }
    }
    return getSimulateMaintenanceEventMethod;
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
    if ((getListAccessBindingsMethod = InstanceServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getListAccessBindingsMethod = InstanceServiceGrpc.getListAccessBindingsMethod) == null) {
          InstanceServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = InstanceServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = InstanceServiceGrpc.getSetAccessBindingsMethod) == null) {
          InstanceServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = InstanceServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (InstanceServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = InstanceServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          InstanceServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceStub>() {
        @java.lang.Override
        public InstanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceStub(channel, callOptions);
        }
      };
    return InstanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceBlockingStub>() {
        @java.lang.Override
        public InstanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceBlockingStub(channel, callOptions);
        }
      };
    return InstanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceServiceFutureStub>() {
        @java.lang.Override
        public InstanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceServiceFutureStub(channel, callOptions);
        }
      };
    return InstanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Instance resources.
   * </pre>
   */
  public static abstract class InstanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Instance resource.
     * To get the list of available Instance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Instance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an instance in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of the specified instance.
     * </pre>
     */
    public void updateMetadata(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the serial port output of the specified Instance resource.
     * </pre>
     */
    public void getSerialPortOutput(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSerialPortOutputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the running instance.
     * You can start the instance later using the [InstanceService.Start] method.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the stopped instance.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restarts the running instance.
     * </pre>
     */
    public void restart(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attaches the disk to the instance.
     * </pre>
     */
    public void attachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachDiskMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detaches the disk from the instance.
     * </pre>
     */
    public void detachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachDiskMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attaches the filesystem to the instance.
     * The instance and the filesystem must reside in the same availability zone.
     * To use the instance with an attached filesystem, the latter must be mounted.
     * For details, see [documentation](/docs/compute/operations/filesystem/attach-to-vm).
     * </pre>
     */
    public void attachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachFilesystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detaches the filesystem from the instance.
     * </pre>
     */
    public void detachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachFilesystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attaches the network-interface to the instance.
     * To attach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public void attachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachNetworkInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detaches the network-interface to the instance.
     * To Detach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public void detachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachNetworkInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables One-to-one NAT on the network interface.
     * </pre>
     */
    public void addOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOneToOneNatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes One-to-one NAT from the network interface.
     * </pre>
     */
    public void removeOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOneToOneNatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance network interface.
     * </pre>
     */
    public void updateNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNetworkInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified instance to another folder of the same cloud.
     * The instance must be stopped before moving. To stop the instance, make a [Stop] request.
     * After moving, the instance will start recording its Monitoring default metrics to its new folder. Metrics
     * that have been recorded to the source folder prior to moving will be retained.
     * </pre>
     */
    public void move(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified instance to another availability zone
     * Running instance will be restarted during this operation.
     * </pre>
     */
    public void relocate(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelocateMethod(), responseObserver);
    }

    /**
     */
    public void simulateMaintenanceEvent(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimulateMaintenanceEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the instance.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the instance.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the instance.
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
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest,
                yandex.cloud.api.compute.v1.InstanceOuterClass.Instance>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest,
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMetadataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_METADATA)))
          .addMethod(
            getGetSerialPortOutputMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest,
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse>(
                  this, METHODID_GET_SERIAL_PORT_OUTPUT)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getRestartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTART)))
          .addMethod(
            getAttachDiskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ATTACH_DISK)))
          .addMethod(
            getDetachDiskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DETACH_DISK)))
          .addMethod(
            getAttachFilesystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ATTACH_FILESYSTEM)))
          .addMethod(
            getDetachFilesystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DETACH_FILESYSTEM)))
          .addMethod(
            getAttachNetworkInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ATTACH_NETWORK_INTERFACE)))
          .addMethod(
            getDetachNetworkInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DETACH_NETWORK_INTERFACE)))
          .addMethod(
            getAddOneToOneNatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_ONE_TO_ONE_NAT)))
          .addMethod(
            getRemoveOneToOneNatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_ONE_TO_ONE_NAT)))
          .addMethod(
            getUpdateNetworkInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_NETWORK_INTERFACE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest,
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getRelocateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RELOCATE)))
          .addMethod(
            getSimulateMaintenanceEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SIMULATE_MAINTENANCE_EVENT)))
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
   * A set of methods for managing Instance resources.
   * </pre>
   */
  public static final class InstanceServiceStub extends io.grpc.stub.AbstractAsyncStub<InstanceServiceStub> {
    private InstanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Instance resource.
     * To get the list of available Instance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Instance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of the specified instance.
     * </pre>
     */
    public void updateMetadata(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the serial port output of the specified Instance resource.
     * </pre>
     */
    public void getSerialPortOutput(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSerialPortOutputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the running instance.
     * You can start the instance later using the [InstanceService.Start] method.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the stopped instance.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restarts the running instance.
     * </pre>
     */
    public void restart(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attaches the disk to the instance.
     * </pre>
     */
    public void attachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachDiskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detaches the disk from the instance.
     * </pre>
     */
    public void detachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachDiskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attaches the filesystem to the instance.
     * The instance and the filesystem must reside in the same availability zone.
     * To use the instance with an attached filesystem, the latter must be mounted.
     * For details, see [documentation](/docs/compute/operations/filesystem/attach-to-vm).
     * </pre>
     */
    public void attachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachFilesystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detaches the filesystem from the instance.
     * </pre>
     */
    public void detachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachFilesystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attaches the network-interface to the instance.
     * To attach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public void attachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachNetworkInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detaches the network-interface to the instance.
     * To Detach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public void detachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachNetworkInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables One-to-one NAT on the network interface.
     * </pre>
     */
    public void addOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOneToOneNatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes One-to-one NAT from the network interface.
     * </pre>
     */
    public void removeOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOneToOneNatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance network interface.
     * </pre>
     */
    public void updateNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNetworkInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified instance to another folder of the same cloud.
     * The instance must be stopped before moving. To stop the instance, make a [Stop] request.
     * After moving, the instance will start recording its Monitoring default metrics to its new folder. Metrics
     * that have been recorded to the source folder prior to moving will be retained.
     * </pre>
     */
    public void move(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified instance to another availability zone
     * Running instance will be restarted during this operation.
     * </pre>
     */
    public void relocate(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simulateMaintenanceEvent(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimulateMaintenanceEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the instance.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the instance.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the instance.
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
   * A set of methods for managing Instance resources.
   * </pre>
   */
  public static final class InstanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InstanceServiceBlockingStub> {
    private InstanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Instance resource.
     * To get the list of available Instance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.InstanceOuterClass.Instance get(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Instance resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse list(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the metadata of the specified instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateMetadata(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the serial port output of the specified Instance resource.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse getSerialPortOutput(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSerialPortOutputMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the running instance.
     * You can start the instance later using the [InstanceService.Start] method.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the stopped instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restarts the running instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restart(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches the disk to the instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation attachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachDiskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detaches the disk from the instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation detachDisk(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachDiskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches the filesystem to the instance.
     * The instance and the filesystem must reside in the same availability zone.
     * To use the instance with an attached filesystem, the latter must be mounted.
     * For details, see [documentation](/docs/compute/operations/filesystem/attach-to-vm).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation attachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachFilesystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detaches the filesystem from the instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation detachFilesystem(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachFilesystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches the network-interface to the instance.
     * To attach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation attachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachNetworkInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detaches the network-interface to the instance.
     * To Detach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation detachNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachNetworkInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables One-to-one NAT on the network interface.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOneToOneNatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes One-to-one NAT from the network interface.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeOneToOneNat(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOneToOneNatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance network interface.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateNetworkInterface(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNetworkInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse listOperations(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified instance to another folder of the same cloud.
     * The instance must be stopped before moving. To stop the instance, make a [Stop] request.
     * After moving, the instance will start recording its Monitoring default metrics to its new folder. Metrics
     * that have been recorded to the source folder prior to moving will be retained.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified instance to another availability zone
     * Running instance will be restarted during this operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation relocate(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelocateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation simulateMaintenanceEvent(yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimulateMaintenanceEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the instance.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Instance resources.
   * </pre>
   */
  public static final class InstanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InstanceServiceFutureStub> {
    private InstanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Instance resource.
     * To get the list of available Instance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.InstanceOuterClass.Instance> get(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Instance resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse> list(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an instance in the specified folder.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the metadata of the specified instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateMetadata(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the serial port output of the specified Instance resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse> getSerialPortOutput(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSerialPortOutputMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the running instance.
     * You can start the instance later using the [InstanceService.Start] method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the stopped instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restarts the running instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restart(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attaches the disk to the instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> attachDisk(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachDiskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Detaches the disk from the instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> detachDisk(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachDiskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attaches the filesystem to the instance.
     * The instance and the filesystem must reside in the same availability zone.
     * To use the instance with an attached filesystem, the latter must be mounted.
     * For details, see [documentation](/docs/compute/operations/filesystem/attach-to-vm).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> attachFilesystem(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachFilesystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Detaches the filesystem from the instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> detachFilesystem(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachFilesystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attaches the network-interface to the instance.
     * To attach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> attachNetworkInterface(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachNetworkInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Detaches the network-interface to the instance.
     * To Detach a network-interface, the instance must have a `STOPPED` status ([Instance.status]).
     * To check the instance status, make a [InstanceService.Get] request.
     * To stop the running instance, make a [InstanceService.Stop] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> detachNetworkInterface(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachNetworkInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables One-to-one NAT on the network interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addOneToOneNat(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOneToOneNatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes One-to-one NAT from the network interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeOneToOneNat(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOneToOneNatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified instance network interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateNetworkInterface(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNetworkInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified instance to another folder of the same cloud.
     * The instance must be stopped before moving. To stop the instance, make a [Stop] request.
     * After moving, the instance will start recording its Monitoring default metrics to its new folder. Metrics
     * that have been recorded to the source folder prior to moving will be retained.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified instance to another availability zone
     * Running instance will be restarted during this operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> relocate(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> simulateMaintenanceEvent(
        yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimulateMaintenanceEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the instance.
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
  private static final int METHODID_UPDATE_METADATA = 5;
  private static final int METHODID_GET_SERIAL_PORT_OUTPUT = 6;
  private static final int METHODID_STOP = 7;
  private static final int METHODID_START = 8;
  private static final int METHODID_RESTART = 9;
  private static final int METHODID_ATTACH_DISK = 10;
  private static final int METHODID_DETACH_DISK = 11;
  private static final int METHODID_ATTACH_FILESYSTEM = 12;
  private static final int METHODID_DETACH_FILESYSTEM = 13;
  private static final int METHODID_ATTACH_NETWORK_INTERFACE = 14;
  private static final int METHODID_DETACH_NETWORK_INTERFACE = 15;
  private static final int METHODID_ADD_ONE_TO_ONE_NAT = 16;
  private static final int METHODID_REMOVE_ONE_TO_ONE_NAT = 17;
  private static final int METHODID_UPDATE_NETWORK_INTERFACE = 18;
  private static final int METHODID_LIST_OPERATIONS = 19;
  private static final int METHODID_MOVE = 20;
  private static final int METHODID_RELOCATE = 21;
  private static final int METHODID_SIMULATE_MAINTENANCE_EVENT = 22;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 23;
  private static final int METHODID_SET_ACCESS_BINDINGS = 24;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 25;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceOuterClass.Instance>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstancesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_METADATA:
          serviceImpl.updateMetadata((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceMetadataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_SERIAL_PORT_OUTPUT:
          serviceImpl.getSerialPortOutput((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.GetInstanceSerialPortOutputResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StopInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.StartInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTART:
          serviceImpl.restart((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RestartInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ATTACH_DISK:
          serviceImpl.attachDisk((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DETACH_DISK:
          serviceImpl.detachDisk((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ATTACH_FILESYSTEM:
          serviceImpl.attachFilesystem((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DETACH_FILESYSTEM:
          serviceImpl.detachFilesystem((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceFilesystemRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ATTACH_NETWORK_INTERFACE:
          serviceImpl.attachNetworkInterface((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AttachInstanceNetworkInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DETACH_NETWORK_INTERFACE:
          serviceImpl.detachNetworkInterface((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.DetachInstanceNetworkInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_ONE_TO_ONE_NAT:
          serviceImpl.addOneToOneNat((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.AddInstanceOneToOneNatRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_ONE_TO_ONE_NAT:
          serviceImpl.removeOneToOneNat((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RemoveInstanceOneToOneNatRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK_INTERFACE:
          serviceImpl.updateNetworkInterface((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.UpdateInstanceNetworkInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.InstanceServiceOuterClass.ListInstanceOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.MoveInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RELOCATE:
          serviceImpl.relocate((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.RelocateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SIMULATE_MAINTENANCE_EVENT:
          serviceImpl.simulateMaintenanceEvent((yandex.cloud.api.compute.v1.InstanceServiceOuterClass.SimulateInstanceMaintenanceEventRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.InstanceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceService");
    }
  }

  private static final class InstanceServiceFileDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier {
    InstanceServiceFileDescriptorSupplier() {}
  }

  private static final class InstanceServiceMethodDescriptorSupplier
      extends InstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMetadataMethod())
              .addMethod(getGetSerialPortOutputMethod())
              .addMethod(getStopMethod())
              .addMethod(getStartMethod())
              .addMethod(getRestartMethod())
              .addMethod(getAttachDiskMethod())
              .addMethod(getDetachDiskMethod())
              .addMethod(getAttachFilesystemMethod())
              .addMethod(getDetachFilesystemMethod())
              .addMethod(getAttachNetworkInterfaceMethod())
              .addMethod(getDetachNetworkInterfaceMethod())
              .addMethod(getAddOneToOneNatMethod())
              .addMethod(getRemoveOneToOneNatMethod())
              .addMethod(getUpdateNetworkInterfaceMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .addMethod(getRelocateMethod())
              .addMethod(getSimulateMaintenanceEventMethod())
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
