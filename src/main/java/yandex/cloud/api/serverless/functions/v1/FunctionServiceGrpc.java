package yandex.cloud.api.serverless.functions.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing serverless functions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/functions/v1/function_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FunctionServiceGrpc {

  private FunctionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.functions.v1.FunctionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> getGetMethod;
    if ((getGetMethod = FunctionServiceGrpc.getGetMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getGetMethod = FunctionServiceGrpc.getGetMethod) == null) {
          FunctionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> getListMethod;
    if ((getListMethod = FunctionServiceGrpc.getListMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListMethod = FunctionServiceGrpc.getListMethod) == null) {
          FunctionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = FunctionServiceGrpc.getCreateMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getCreateMethod = FunctionServiceGrpc.getCreateMethod) == null) {
          FunctionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = FunctionServiceGrpc.getUpdateMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getUpdateMethod = FunctionServiceGrpc.getUpdateMethod) == null) {
          FunctionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = FunctionServiceGrpc.getDeleteMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getDeleteMethod = FunctionServiceGrpc.getDeleteMethod) == null) {
          FunctionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionMethod;
    if ((getGetVersionMethod = FunctionServiceGrpc.getGetVersionMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getGetVersionMethod = FunctionServiceGrpc.getGetVersionMethod) == null) {
          FunctionServiceGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionByTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersionByTag",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionByTagMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getGetVersionByTagMethod;
    if ((getGetVersionByTagMethod = FunctionServiceGrpc.getGetVersionByTagMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getGetVersionByTagMethod = FunctionServiceGrpc.getGetVersionByTagMethod) == null) {
          FunctionServiceGrpc.getGetVersionByTagMethod = getGetVersionByTagMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest, yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersionByTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("GetVersionByTag"))
              .build();
        }
      }
    }
    return getGetVersionByTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> getListVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVersions",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> getListVersionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = FunctionServiceGrpc.getListVersionsMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListVersionsMethod = FunctionServiceGrpc.getListVersionsMethod) == null) {
          FunctionServiceGrpc.getListVersionsMethod = getListVersionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListVersions"))
              .build();
        }
      }
    }
    return getListVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVersion",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteVersionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteVersionMethod;
    if ((getDeleteVersionMethod = FunctionServiceGrpc.getDeleteVersionMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getDeleteVersionMethod = FunctionServiceGrpc.getDeleteVersionMethod) == null) {
          FunctionServiceGrpc.getDeleteVersionMethod = getDeleteVersionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("DeleteVersion"))
              .build();
        }
      }
    }
    return getDeleteVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTag",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetTagMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetTagMethod;
    if ((getSetTagMethod = FunctionServiceGrpc.getSetTagMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getSetTagMethod = FunctionServiceGrpc.getSetTagMethod) == null) {
          FunctionServiceGrpc.getSetTagMethod = getSetTagMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("SetTag"))
              .build();
        }
      }
    }
    return getSetTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTag",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTagMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTagMethod;
    if ((getRemoveTagMethod = FunctionServiceGrpc.getRemoveTagMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getRemoveTagMethod = FunctionServiceGrpc.getRemoveTagMethod) == null) {
          FunctionServiceGrpc.getRemoveTagMethod = getRemoveTagMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("RemoveTag"))
              .build();
        }
      }
    }
    return getRemoveTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> getListTagHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTagHistory",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> getListTagHistoryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> getListTagHistoryMethod;
    if ((getListTagHistoryMethod = FunctionServiceGrpc.getListTagHistoryMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListTagHistoryMethod = FunctionServiceGrpc.getListTagHistoryMethod) == null) {
          FunctionServiceGrpc.getListTagHistoryMethod = getListTagHistoryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTagHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListTagHistory"))
              .build();
        }
      }
    }
    return getListTagHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVersion",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateVersionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateVersionMethod;
    if ((getCreateVersionMethod = FunctionServiceGrpc.getCreateVersionMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getCreateVersionMethod = FunctionServiceGrpc.getCreateVersionMethod) == null) {
          FunctionServiceGrpc.getCreateVersionMethod = getCreateVersionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("CreateVersion"))
              .build();
        }
      }
    }
    return getCreateVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> getListRuntimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRuntimes",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> getListRuntimesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> getListRuntimesMethod;
    if ((getListRuntimesMethod = FunctionServiceGrpc.getListRuntimesMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListRuntimesMethod = FunctionServiceGrpc.getListRuntimesMethod) == null) {
          FunctionServiceGrpc.getListRuntimesMethod = getListRuntimesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRuntimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListRuntimes"))
              .build();
        }
      }
    }
    return getListRuntimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = FunctionServiceGrpc.getListOperationsMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListOperationsMethod = FunctionServiceGrpc.getListOperationsMethod) == null) {
          FunctionServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
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
    if ((getListAccessBindingsMethod = FunctionServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListAccessBindingsMethod = FunctionServiceGrpc.getListAccessBindingsMethod) == null) {
          FunctionServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = FunctionServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = FunctionServiceGrpc.getSetAccessBindingsMethod) == null) {
          FunctionServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = FunctionServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = FunctionServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          FunctionServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> getListScalingPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScalingPolicies",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest.class,
      responseType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest,
      yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> getListScalingPoliciesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> getListScalingPoliciesMethod;
    if ((getListScalingPoliciesMethod = FunctionServiceGrpc.getListScalingPoliciesMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getListScalingPoliciesMethod = FunctionServiceGrpc.getListScalingPoliciesMethod) == null) {
          FunctionServiceGrpc.getListScalingPoliciesMethod = getListScalingPoliciesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest, yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScalingPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("ListScalingPolicies"))
              .build();
        }
      }
    }
    return getListScalingPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetScalingPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetScalingPolicy",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetScalingPolicyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetScalingPolicyMethod;
    if ((getSetScalingPolicyMethod = FunctionServiceGrpc.getSetScalingPolicyMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getSetScalingPolicyMethod = FunctionServiceGrpc.getSetScalingPolicyMethod) == null) {
          FunctionServiceGrpc.getSetScalingPolicyMethod = getSetScalingPolicyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetScalingPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("SetScalingPolicy"))
              .build();
        }
      }
    }
    return getSetScalingPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveScalingPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveScalingPolicy",
      requestType = yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveScalingPolicyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveScalingPolicyMethod;
    if ((getRemoveScalingPolicyMethod = FunctionServiceGrpc.getRemoveScalingPolicyMethod) == null) {
      synchronized (FunctionServiceGrpc.class) {
        if ((getRemoveScalingPolicyMethod = FunctionServiceGrpc.getRemoveScalingPolicyMethod) == null) {
          FunctionServiceGrpc.getRemoveScalingPolicyMethod = getRemoveScalingPolicyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveScalingPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FunctionServiceMethodDescriptorSupplier("RemoveScalingPolicy"))
              .build();
        }
      }
    }
    return getRemoveScalingPolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FunctionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FunctionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FunctionServiceStub>() {
        @java.lang.Override
        public FunctionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FunctionServiceStub(channel, callOptions);
        }
      };
    return FunctionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FunctionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FunctionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FunctionServiceBlockingStub>() {
        @java.lang.Override
        public FunctionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FunctionServiceBlockingStub(channel, callOptions);
        }
      };
    return FunctionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FunctionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FunctionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FunctionServiceFutureStub>() {
        @java.lang.Override
        public FunctionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FunctionServiceFutureStub(channel, callOptions);
        }
      };
    return FunctionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing serverless functions.
   * </pre>
   */
  public static abstract class FunctionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified function.
     * To get the list of all available functions, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of functions in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a function in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified function.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified function.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified version of a function.
     * To get the list of available version, make a [ListVersions] request.
     * </pre>
     */
    public void getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all versions with the specified tag.
     * To get the list of all available versions, make a [ListVersions] request.
     * </pre>
     */
    public void getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionByTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of versions for the specified function, or of all function versions
     * in the specified folder.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified version of a function.
     * NOTE: old untagged function versions are deleted automatically.
     * </pre>
     */
    public void deleteVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a tag for the specified version of a function.
     * </pre>
     */
    public void setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a tag from the specified version of a function.
     * </pre>
     */
    public void removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the log of tags assigned to versions of the specified function.
     * </pre>
     */
    public void listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTagHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a version for the specified function.
     * </pre>
     */
    public void createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists available runtime environments for the specified function.
     * </pre>
     */
    public void listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRuntimesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified function.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified function.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the function.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified function.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing scaling policies for specified function
     * </pre>
     */
    public void listScalingPolicies(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScalingPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set scaling policy for specified function and tag
     * </pre>
     */
    public void setScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetScalingPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove scaling policy for specified function and tag
     * </pre>
     */
    public void removeScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveScalingPolicyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            getGetVersionByTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>(
                  this, METHODID_GET_VERSION_BY_TAG)))
          .addMethod(
            getListVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getDeleteVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_VERSION)))
          .addMethod(
            getSetTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_TAG)))
          .addMethod(
            getRemoveTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_TAG)))
          .addMethod(
            getListTagHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse>(
                  this, METHODID_LIST_TAG_HISTORY)))
          .addMethod(
            getCreateVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_VERSION)))
          .addMethod(
            getListRuntimesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse>(
                  this, METHODID_LIST_RUNTIMES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
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
          .addMethod(
            getListScalingPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse>(
                  this, METHODID_LIST_SCALING_POLICIES)))
          .addMethod(
            getSetScalingPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_SCALING_POLICY)))
          .addMethod(
            getRemoveScalingPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_SCALING_POLICY)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing serverless functions.
   * </pre>
   */
  public static final class FunctionServiceStub extends io.grpc.stub.AbstractAsyncStub<FunctionServiceStub> {
    private FunctionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FunctionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified function.
     * To get the list of all available functions, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of functions in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a function in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified function.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified function.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified version of a function.
     * To get the list of available version, make a [ListVersions] request.
     * </pre>
     */
    public void getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all versions with the specified tag.
     * To get the list of all available versions, make a [ListVersions] request.
     * </pre>
     */
    public void getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionByTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of versions for the specified function, or of all function versions
     * in the specified folder.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified version of a function.
     * NOTE: old untagged function versions are deleted automatically.
     * </pre>
     */
    public void deleteVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a tag for the specified version of a function.
     * </pre>
     */
    public void setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a tag from the specified version of a function.
     * </pre>
     */
    public void removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the log of tags assigned to versions of the specified function.
     * </pre>
     */
    public void listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTagHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a version for the specified function.
     * </pre>
     */
    public void createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists available runtime environments for the specified function.
     * </pre>
     */
    public void listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRuntimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified function.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified function.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the function.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified function.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing scaling policies for specified function
     * </pre>
     */
    public void listScalingPolicies(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScalingPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set scaling policy for specified function and tag
     * </pre>
     */
    public void setScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetScalingPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove scaling policy for specified function and tag
     * </pre>
     */
    public void removeScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveScalingPolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing serverless functions.
   * </pre>
   */
  public static final class FunctionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FunctionServiceBlockingStub> {
    private FunctionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FunctionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified function.
     * To get the list of all available functions, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of functions in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a function in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified version of a function.
     * To get the list of available version, make a [ListVersions] request.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all versions with the specified tag.
     * To get the list of all available versions, make a [ListVersions] request.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionByTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of versions for the specified function, or of all function versions
     * in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified version of a function.
     * NOTE: old untagged function versions are deleted automatically.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a tag for the specified version of a function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a tag from the specified version of a function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the log of tags assigned to versions of the specified function.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTagHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a version for the specified function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available runtime environments for the specified function.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRuntimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified function.
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified function.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified function.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing scaling policies for specified function
     * </pre>
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse listScalingPolicies(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScalingPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set scaling policy for specified function and tag
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetScalingPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove scaling policy for specified function and tag
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeScalingPolicy(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveScalingPolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing serverless functions.
   * </pre>
   */
  public static final class FunctionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FunctionServiceFutureStub> {
    private FunctionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FunctionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified function.
     * To get the list of all available functions, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> get(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of functions in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> list(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a function in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified version of a function.
     * To get the list of available version, make a [ListVersions] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getVersion(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all versions with the specified tag.
     * To get the list of all available versions, make a [ListVersions] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getVersionByTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionByTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of versions for the specified function, or of all function versions
     * in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> listVersions(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified version of a function.
     * NOTE: old untagged function versions are deleted automatically.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteVersion(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a tag for the specified version of a function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a tag from the specified version of a function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the log of tags assigned to versions of the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> listTagHistory(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTagHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a version for the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createVersion(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists available runtime environments for the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> listRuntimes(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRuntimesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> listOperations(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing scaling policies for specified function
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse> listScalingPolicies(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScalingPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set scaling policy for specified function and tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setScalingPolicy(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetScalingPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove scaling policy for specified function and tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeScalingPolicy(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveScalingPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_VERSION = 5;
  private static final int METHODID_GET_VERSION_BY_TAG = 6;
  private static final int METHODID_LIST_VERSIONS = 7;
  private static final int METHODID_DELETE_VERSION = 8;
  private static final int METHODID_SET_TAG = 9;
  private static final int METHODID_REMOVE_TAG = 10;
  private static final int METHODID_LIST_TAG_HISTORY = 11;
  private static final int METHODID_CREATE_VERSION = 12;
  private static final int METHODID_LIST_RUNTIMES = 13;
  private static final int METHODID_LIST_OPERATIONS = 14;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 15;
  private static final int METHODID_SET_ACCESS_BINDINGS = 16;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 17;
  private static final int METHODID_LIST_SCALING_POLICIES = 18;
  private static final int METHODID_SET_SCALING_POLICY = 19;
  private static final int METHODID_REMOVE_SCALING_POLICY = 20;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FunctionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FunctionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>) responseObserver);
          break;
        case METHODID_GET_VERSION_BY_TAG:
          serviceImpl.getVersionByTag((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_VERSION:
          serviceImpl.deleteVersion((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionVersionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_TAG:
          serviceImpl.setTag((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_TAG:
          serviceImpl.removeTag((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_TAG_HISTORY:
          serviceImpl.listTagHistory((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_VERSION:
          serviceImpl.createVersion((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_RUNTIMES:
          serviceImpl.listRuntimes((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse>) responseObserver);
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
        case METHODID_LIST_SCALING_POLICIES:
          serviceImpl.listScalingPolicies((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListScalingPoliciesResponse>) responseObserver);
          break;
        case METHODID_SET_SCALING_POLICY:
          serviceImpl.setScalingPolicy((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetScalingPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_SCALING_POLICY:
          serviceImpl.removeScalingPolicy((yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveScalingPolicyRequest) request,
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

  private static abstract class FunctionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FunctionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FunctionService");
    }
  }

  private static final class FunctionServiceFileDescriptorSupplier
      extends FunctionServiceBaseDescriptorSupplier {
    FunctionServiceFileDescriptorSupplier() {}
  }

  private static final class FunctionServiceMethodDescriptorSupplier
      extends FunctionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FunctionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FunctionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FunctionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetVersionMethod())
              .addMethod(getGetVersionByTagMethod())
              .addMethod(getListVersionsMethod())
              .addMethod(getDeleteVersionMethod())
              .addMethod(getSetTagMethod())
              .addMethod(getRemoveTagMethod())
              .addMethod(getListTagHistoryMethod())
              .addMethod(getCreateVersionMethod())
              .addMethod(getListRuntimesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getListScalingPoliciesMethod())
              .addMethod(getSetScalingPolicyMethod())
              .addMethod(getRemoveScalingPolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
