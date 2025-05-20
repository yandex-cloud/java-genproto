package yandex.cloud.api.clouddesktop.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing desktop resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/clouddesktop/v1/desktop_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DesktopServiceGrpc {

  private DesktopServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.clouddesktop.v1.api.DesktopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest, yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> getGetMethod;
    if ((getGetMethod = DesktopServiceGrpc.getGetMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getGetMethod = DesktopServiceGrpc.getGetMethod) == null) {
          DesktopServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest, yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> getGetRdpFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRdpFile",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> getGetRdpFileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> getGetRdpFileMethod;
    if ((getGetRdpFileMethod = DesktopServiceGrpc.getGetRdpFileMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getGetRdpFileMethod = DesktopServiceGrpc.getGetRdpFileMethod) == null) {
          DesktopServiceGrpc.getGetRdpFileMethod = getGetRdpFileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRdpFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("GetRdpFile"))
              .build();
        }
      }
    }
    return getGetRdpFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> getListMethod;
    if ((getListMethod = DesktopServiceGrpc.getListMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getListMethod = DesktopServiceGrpc.getListMethod) == null) {
          DesktopServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DesktopServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getListOperationsMethod = DesktopServiceGrpc.getListOperationsMethod) == null) {
          DesktopServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DesktopServiceGrpc.getCreateMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getCreateMethod = DesktopServiceGrpc.getCreateMethod) == null) {
          DesktopServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdatePropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProperties",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdatePropertiesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdatePropertiesMethod;
    if ((getUpdatePropertiesMethod = DesktopServiceGrpc.getUpdatePropertiesMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getUpdatePropertiesMethod = DesktopServiceGrpc.getUpdatePropertiesMethod) == null) {
          DesktopServiceGrpc.getUpdatePropertiesMethod = getUpdatePropertiesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("UpdateProperties"))
              .build();
        }
      }
    }
    return getUpdatePropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DesktopServiceGrpc.getDeleteMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getDeleteMethod = DesktopServiceGrpc.getDeleteMethod) == null) {
          DesktopServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetPassword",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = DesktopServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getResetPasswordMethod = DesktopServiceGrpc.getResetPasswordMethod) == null) {
          DesktopServiceGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest, yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("ResetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restart",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestartMethod;
    if ((getRestartMethod = DesktopServiceGrpc.getRestartMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getRestartMethod = DesktopServiceGrpc.getRestartMethod) == null) {
          DesktopServiceGrpc.getRestartMethod = getRestartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Restart"))
              .build();
        }
      }
    }
    return getRestartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DesktopServiceGrpc.getUpdateMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getUpdateMethod = DesktopServiceGrpc.getUpdateMethod) == null) {
          DesktopServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = DesktopServiceGrpc.getStartMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getStartMethod = DesktopServiceGrpc.getStartMethod) == null) {
          DesktopServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = DesktopServiceGrpc.getStopMethod) == null) {
      synchronized (DesktopServiceGrpc.class) {
        if ((getStopMethod = DesktopServiceGrpc.getStopMethod) == null) {
          DesktopServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DesktopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopServiceStub>() {
        @java.lang.Override
        public DesktopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopServiceStub(channel, callOptions);
        }
      };
    return DesktopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DesktopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopServiceBlockingStub>() {
        @java.lang.Override
        public DesktopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopServiceBlockingStub(channel, callOptions);
        }
      };
    return DesktopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DesktopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopServiceFutureStub>() {
        @java.lang.Override
        public DesktopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopServiceFutureStub(channel, callOptions);
        }
      };
    return DesktopServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing desktop resources.
   * </pre>
   */
  public static abstract class DesktopServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified desktop resource.
     * To get the list of available desktops, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a RDP file for the specified desktop.
     * </pre>
     */
    public void getRdpFile(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRdpFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktop resources.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates desktop in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates desktop properties.
     * </pre>
     */
    public void updateProperties(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset password
     * </pre>
     */
    public void resetPassword(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restart the specified desktop.
     * </pre>
     */
    public void restart(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sync desktop with group configuration
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start the specified desktop.
     * </pre>
     */
    public void start(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop the specified desktop.
     * </pre>
     */
    public void stop(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop>(
                  this, METHODID_GET)))
          .addMethod(
            getGetRdpFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse>(
                  this, METHODID_GET_RDP_FILE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdatePropertiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_PROPERTIES)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getResetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .addMethod(
            getRestartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTART)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing desktop resources.
   * </pre>
   */
  public static final class DesktopServiceStub extends io.grpc.stub.AbstractAsyncStub<DesktopServiceStub> {
    private DesktopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop resource.
     * To get the list of available desktops, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a RDP file for the specified desktop.
     * </pre>
     */
    public void getRdpFile(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRdpFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktop resources.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates desktop in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates desktop properties.
     * </pre>
     */
    public void updateProperties(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset password
     * </pre>
     */
    public void resetPassword(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restart the specified desktop.
     * </pre>
     */
    public void restart(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sync desktop with group configuration
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start the specified desktop.
     * </pre>
     */
    public void start(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop the specified desktop.
     * </pre>
     */
    public void stop(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing desktop resources.
   * </pre>
   */
  public static final class DesktopServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DesktopServiceBlockingStub> {
    private DesktopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop resource.
     * To get the list of available desktops, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop get(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a RDP file for the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse getRdpFile(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRdpFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktop resources.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse list(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse listOperations(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates desktop in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates desktop properties.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateProperties(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset password
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse resetPassword(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restart the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restart(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sync desktop with group configuration
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop the specified desktop.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing desktop resources.
   * </pre>
   */
  public static final class DesktopServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DesktopServiceFutureStub> {
    private DesktopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop resource.
     * To get the list of available desktops, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop> get(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a RDP file for the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse> getRdpFile(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRdpFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktop resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse> list(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse> listOperations(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates desktop in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates desktop properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateProperties(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse> resetPassword(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restart the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restart(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sync desktop with group configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop the specified desktop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_RDP_FILE = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_LIST_OPERATIONS = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_UPDATE_PROPERTIES = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_RESET_PASSWORD = 7;
  private static final int METHODID_RESTART = 8;
  private static final int METHODID_UPDATE = 9;
  private static final int METHODID_START = 10;
  private static final int METHODID_STOP = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DesktopServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DesktopServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetDesktopRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopOuterClass.Desktop>) responseObserver);
          break;
        case METHODID_GET_RDP_FILE:
          serviceImpl.getRdpFile((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.GetRdpFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RdpFileResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ListDesktopOperationsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.CreateDesktopRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTIES:
          serviceImpl.updateProperties((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdatePropertiesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.DeleteDesktopRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.ResetPasswordResponse>) responseObserver);
          break;
        case METHODID_RESTART:
          serviceImpl.restart((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.RestartRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StartRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.StopRequest) request,
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

  private static abstract class DesktopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DesktopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.clouddesktop.v1.DesktopServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DesktopService");
    }
  }

  private static final class DesktopServiceFileDescriptorSupplier
      extends DesktopServiceBaseDescriptorSupplier {
    DesktopServiceFileDescriptorSupplier() {}
  }

  private static final class DesktopServiceMethodDescriptorSupplier
      extends DesktopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DesktopServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DesktopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DesktopServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetRdpFileMethod())
              .addMethod(getListMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdatePropertiesMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getRestartMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
