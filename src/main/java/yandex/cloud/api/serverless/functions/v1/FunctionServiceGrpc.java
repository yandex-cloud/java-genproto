package yandex.cloud.api.serverless.functions.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/serverless/functions/v1/function_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "Get"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "List"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "Create"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "Update"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "Delete"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "GetVersion"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "GetVersionByTag"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "ListVersions"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "SetTag"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "RemoveTag"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "ListTagHistory"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "CreateVersion"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "ListRuntimes"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "ListOperations"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "ListAccessBindings"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "SetAccessBindings"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.functions.v1.FunctionService", "UpdateAccessBindings"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FunctionServiceStub newStub(io.grpc.Channel channel) {
    return new FunctionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FunctionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FunctionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FunctionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FunctionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FunctionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     */
    public void getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVersionByTagMethod(), responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    /**
     */
    public void setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTagMethod(), responseObserver);
    }

    /**
     */
    public void removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTagMethod(), responseObserver);
    }

    /**
     */
    public void listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListTagHistoryMethod(), responseObserver);
    }

    /**
     */
    public void createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVersionMethod(), responseObserver);
    }

    /**
     */
    public void listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRuntimesMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            getGetVersionByTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version>(
                  this, METHODID_GET_VERSION_BY_TAG)))
          .addMethod(
            getListVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getSetTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_TAG)))
          .addMethod(
            getRemoveTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_TAG)))
          .addMethod(
            getListTagHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse>(
                  this, METHODID_LIST_TAG_HISTORY)))
          .addMethod(
            getCreateVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_VERSION)))
          .addMethod(
            getListRuntimesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse>(
                  this, METHODID_LIST_RUNTIMES)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest,
                yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   */
  public static final class FunctionServiceStub extends io.grpc.stub.AbstractStub<FunctionServiceStub> {
    private FunctionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FunctionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FunctionServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVersionByTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTagHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRuntimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FunctionServiceBlockingStub extends io.grpc.stub.AbstractStub<FunctionServiceBlockingStub> {
    private FunctionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FunctionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FunctionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function get(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse list(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version getVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version getVersionByTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVersionByTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse listVersions(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeTag(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse listTagHistory(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTagHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createVersion(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse listRuntimes(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRuntimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse listOperations(yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FunctionServiceFutureStub extends io.grpc.stub.AbstractStub<FunctionServiceFutureStub> {
    private FunctionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FunctionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FunctionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FunctionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Function> get(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsResponse> list(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.UpdateFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.DeleteFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getVersion(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionOuterClass.Version> getVersionByTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.GetFunctionVersionByTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVersionByTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsResponse> listVersions(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionsVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.SetFunctionTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeTag(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.RemoveFunctionTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryResponse> listTagHistory(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionTagHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTagHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createVersion(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.CreateFunctionVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesResponse> listRuntimes(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListRuntimesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRuntimesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsResponse> listOperations(
        yandex.cloud.api.serverless.functions.v1.FunctionServiceOuterClass.ListFunctionOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
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
  private static final int METHODID_SET_TAG = 8;
  private static final int METHODID_REMOVE_TAG = 9;
  private static final int METHODID_LIST_TAG_HISTORY = 10;
  private static final int METHODID_CREATE_VERSION = 11;
  private static final int METHODID_LIST_RUNTIMES = 12;
  private static final int METHODID_LIST_OPERATIONS = 13;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 14;
  private static final int METHODID_SET_ACCESS_BINDINGS = 15;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 16;

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
              .addMethod(getSetTagMethod())
              .addMethod(getRemoveTagMethod())
              .addMethod(getListTagHistoryMethod())
              .addMethod(getCreateVersionMethod())
              .addMethod(getListRuntimesMethod())
              .addMethod(getListOperationsMethod())
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
