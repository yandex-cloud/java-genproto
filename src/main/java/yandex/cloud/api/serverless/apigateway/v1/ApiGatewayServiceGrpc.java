package yandex.cloud.api.serverless.apigateway.v1;

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
 * <pre>
 * A set of methods for managing API gateways.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/serverless/apigateway/v1/apigateway_service.proto")
public final class ApiGatewayServiceGrpc {

  private ApiGatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.apigateway.v1.ApiGatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest,
      yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest,
      yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest, yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> getGetMethod;
    if ((getGetMethod = ApiGatewayServiceGrpc.getGetMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getGetMethod = ApiGatewayServiceGrpc.getGetMethod) == null) {
          ApiGatewayServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest, yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> getListMethod;
    if ((getListMethod = ApiGatewayServiceGrpc.getListMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getListMethod = ApiGatewayServiceGrpc.getListMethod) == null) {
          ApiGatewayServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ApiGatewayServiceGrpc.getCreateMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getCreateMethod = ApiGatewayServiceGrpc.getCreateMethod) == null) {
          ApiGatewayServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ApiGatewayServiceGrpc.getUpdateMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getUpdateMethod = ApiGatewayServiceGrpc.getUpdateMethod) == null) {
          ApiGatewayServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ApiGatewayServiceGrpc.getDeleteMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getDeleteMethod = ApiGatewayServiceGrpc.getDeleteMethod) == null) {
          ApiGatewayServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> getGetOpenapiSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOpenapiSpec",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> getGetOpenapiSpecMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> getGetOpenapiSpecMethod;
    if ((getGetOpenapiSpecMethod = ApiGatewayServiceGrpc.getGetOpenapiSpecMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getGetOpenapiSpecMethod = ApiGatewayServiceGrpc.getGetOpenapiSpecMethod) == null) {
          ApiGatewayServiceGrpc.getGetOpenapiSpecMethod = getGetOpenapiSpecMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "GetOpenapiSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("GetOpenapiSpec"))
                  .build();
          }
        }
     }
     return getGetOpenapiSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest,
      yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ApiGatewayServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getListOperationsMethod = ApiGatewayServiceGrpc.getListOperationsMethod) == null) {
          ApiGatewayServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest, yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = ApiGatewayServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getListAccessBindingsMethod = ApiGatewayServiceGrpc.getListAccessBindingsMethod) == null) {
          ApiGatewayServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = ApiGatewayServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = ApiGatewayServiceGrpc.getSetAccessBindingsMethod) == null) {
          ApiGatewayServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = ApiGatewayServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (ApiGatewayServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = ApiGatewayServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          ApiGatewayServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.apigateway.v1.ApiGatewayService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiGatewayServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiGatewayServiceStub newStub(io.grpc.Channel channel) {
    return new ApiGatewayServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiGatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiGatewayServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiGatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiGatewayServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing API gateways.
   * </pre>
   */
  public static abstract class ApiGatewayServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified API gateway. Note that only API gateway basic attributes are returned.
     * To get associated openapi specification, make a [GetOpenapiSpec] request.
     * To get the list of all available API gateways, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of API gateways in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an API gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified API gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the OpenAPI specification of specified API gateway.
     * </pre>
     */
    public void getOpenapiSpec(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOpenapiSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified API gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified API gateway.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified API gateway.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified API gateway.
     * </pre>
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
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest,
                yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest,
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetOpenapiSpecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest,
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse>(
                  this, METHODID_GET_OPENAPI_SPEC)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest,
                yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse>(
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
   * <pre>
   * A set of methods for managing API gateways.
   * </pre>
   */
  public static final class ApiGatewayServiceStub extends io.grpc.stub.AbstractStub<ApiGatewayServiceStub> {
    private ApiGatewayServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiGatewayServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiGatewayServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiGatewayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified API gateway. Note that only API gateway basic attributes are returned.
     * To get associated openapi specification, make a [GetOpenapiSpec] request.
     * To get the list of all available API gateways, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of API gateways in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an API gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified API gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the OpenAPI specification of specified API gateway.
     * </pre>
     */
    public void getOpenapiSpec(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOpenapiSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified API gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified API gateway.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified API gateway.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified API gateway.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API gateways.
   * </pre>
   */
  public static final class ApiGatewayServiceBlockingStub extends io.grpc.stub.AbstractStub<ApiGatewayServiceBlockingStub> {
    private ApiGatewayServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiGatewayServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiGatewayServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiGatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified API gateway. Note that only API gateway basic attributes are returned.
     * To get associated openapi specification, make a [GetOpenapiSpec] request.
     * To get the list of all available API gateways, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway get(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of API gateways in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse list(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an API gateway in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the OpenAPI specification of specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse getOpenapiSpec(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOpenapiSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse listOperations(yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified API gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API gateways.
   * </pre>
   */
  public static final class ApiGatewayServiceFutureStub extends io.grpc.stub.AbstractStub<ApiGatewayServiceFutureStub> {
    private ApiGatewayServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiGatewayServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiGatewayServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiGatewayServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified API gateway. Note that only API gateway basic attributes are returned.
     * To get associated openapi specification, make a [GetOpenapiSpec] request.
     * To get the list of all available API gateways, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway> get(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of API gateways in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse> list(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an API gateway in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the OpenAPI specification of specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse> getOpenapiSpec(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOpenapiSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse> listOperations(
        yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified API gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified API gateway.
     * </pre>
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
  private static final int METHODID_GET_OPENAPI_SPEC = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiGatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiGatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetApiGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.Apigateway.ApiGateway>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListApiGatewayResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.CreateApiGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.UpdateApiGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.DeleteApiGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_OPENAPI_SPEC:
          serviceImpl.getOpenapiSpec((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.GetOpenapiSpecResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.ListOperationsResponse>) responseObserver);
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

  private static abstract class ApiGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiGatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.apigateway.v1.ApigatewayService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiGatewayService");
    }
  }

  private static final class ApiGatewayServiceFileDescriptorSupplier
      extends ApiGatewayServiceBaseDescriptorSupplier {
    ApiGatewayServiceFileDescriptorSupplier() {}
  }

  private static final class ApiGatewayServiceMethodDescriptorSupplier
      extends ApiGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiGatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiGatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiGatewayServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetOpenapiSpecMethod())
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