package yandex.cloud.api.dns.v1;

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
    comments = "Source: yandex/cloud/dns/v1/dns_zone_service.proto")
public final class DnsZoneServiceGrpc {

  private DnsZoneServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dns.v1.DnsZoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest,
      yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest,
      yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest, yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> getGetMethod;
    if ((getGetMethod = DnsZoneServiceGrpc.getGetMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getGetMethod = DnsZoneServiceGrpc.getGetMethod) == null) {
          DnsZoneServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest, yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> getListMethod;
    if ((getListMethod = DnsZoneServiceGrpc.getListMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getListMethod = DnsZoneServiceGrpc.getListMethod) == null) {
          DnsZoneServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DnsZoneServiceGrpc.getCreateMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getCreateMethod = DnsZoneServiceGrpc.getCreateMethod) == null) {
          DnsZoneServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DnsZoneServiceGrpc.getUpdateMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getUpdateMethod = DnsZoneServiceGrpc.getUpdateMethod) == null) {
          DnsZoneServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DnsZoneServiceGrpc.getDeleteMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getDeleteMethod = DnsZoneServiceGrpc.getDeleteMethod) == null) {
          DnsZoneServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest,
      yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> getGetRecordSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecordSet",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest,
      yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> getGetRecordSetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest, yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> getGetRecordSetMethod;
    if ((getGetRecordSetMethod = DnsZoneServiceGrpc.getGetRecordSetMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getGetRecordSetMethod = DnsZoneServiceGrpc.getGetRecordSetMethod) == null) {
          DnsZoneServiceGrpc.getGetRecordSetMethod = getGetRecordSetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest, yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "GetRecordSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("GetRecordSet"))
                  .build();
          }
        }
     }
     return getGetRecordSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> getListRecordSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRecordSets",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> getListRecordSetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> getListRecordSetsMethod;
    if ((getListRecordSetsMethod = DnsZoneServiceGrpc.getListRecordSetsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getListRecordSetsMethod = DnsZoneServiceGrpc.getListRecordSetsMethod) == null) {
          DnsZoneServiceGrpc.getListRecordSetsMethod = getListRecordSetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "ListRecordSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("ListRecordSets"))
                  .build();
          }
        }
     }
     return getListRecordSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRecordSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRecordSets",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRecordSetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRecordSetsMethod;
    if ((getUpdateRecordSetsMethod = DnsZoneServiceGrpc.getUpdateRecordSetsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getUpdateRecordSetsMethod = DnsZoneServiceGrpc.getUpdateRecordSetsMethod) == null) {
          DnsZoneServiceGrpc.getUpdateRecordSetsMethod = getUpdateRecordSetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "UpdateRecordSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("UpdateRecordSets"))
                  .build();
          }
        }
     }
     return getUpdateRecordSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertRecordSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertRecordSets",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertRecordSetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertRecordSetsMethod;
    if ((getUpsertRecordSetsMethod = DnsZoneServiceGrpc.getUpsertRecordSetsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getUpsertRecordSetsMethod = DnsZoneServiceGrpc.getUpsertRecordSetsMethod) == null) {
          DnsZoneServiceGrpc.getUpsertRecordSetsMethod = getUpsertRecordSetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "UpsertRecordSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("UpsertRecordSets"))
                  .build();
          }
        }
     }
     return getUpsertRecordSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest,
      yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DnsZoneServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getListOperationsMethod = DnsZoneServiceGrpc.getListOperationsMethod) == null) {
          DnsZoneServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest, yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = DnsZoneServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getListAccessBindingsMethod = DnsZoneServiceGrpc.getListAccessBindingsMethod) == null) {
          DnsZoneServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = DnsZoneServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = DnsZoneServiceGrpc.getSetAccessBindingsMethod) == null) {
          DnsZoneServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = DnsZoneServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (DnsZoneServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = DnsZoneServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          DnsZoneServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dns.v1.DnsZoneService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new DnsZoneServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DnsZoneServiceStub newStub(io.grpc.Channel channel) {
    return new DnsZoneServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DnsZoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DnsZoneServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DnsZoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DnsZoneServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DnsZoneServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void getRecordSet(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecordSetMethod(), responseObserver);
    }

    /**
     */
    public void listRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRecordSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Метод для строго консистентного изменения состояния зоны. Возвращает ошибку если удаляемая запись не найдена, если
     * у записи с таким ключом не совпадают остальные поля, или добавляемая запись с заданным ключом уже существует. Если
     * запись по одному и тому же ключу находится в обоих списках, то она заменяется на запись в списке добавленных.
     * </pre>
     */
    public void updateRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRecordSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Метод без строго контроля для изменения состояния зоны. При удалении не проверяет наличие удаляемой записи.
     * Удаляет рекорды не по совпадению ключа, а по полному совпадению всех полей, что позволяет удалить часть рекордов из
     * рекордсета.
     * </pre>
     */
    public void upsertRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertRecordSetsMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> responseObserver) {
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
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest,
                yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest,
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetRecordSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest,
                yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet>(
                  this, METHODID_GET_RECORD_SET)))
          .addMethod(
            getListRecordSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest,
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse>(
                  this, METHODID_LIST_RECORD_SETS)))
          .addMethod(
            getUpdateRecordSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_RECORD_SETS)))
          .addMethod(
            getUpsertRecordSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPSERT_RECORD_SETS)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest,
                yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse>(
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
  public static final class DnsZoneServiceStub extends io.grpc.stub.AbstractStub<DnsZoneServiceStub> {
    private DnsZoneServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DnsZoneServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsZoneServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DnsZoneServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecordSet(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecordSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRecordSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Метод для строго консистентного изменения состояния зоны. Возвращает ошибку если удаляемая запись не найдена, если
     * у записи с таким ключом не совпадают остальные поля, или добавляемая запись с заданным ключом уже существует. Если
     * запись по одному и тому же ключу находится в обоих списках, то она заменяется на запись в списке добавленных.
     * </pre>
     */
    public void updateRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRecordSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Метод без строго контроля для изменения состояния зоны. При удалении не проверяет наличие удаляемой записи.
     * Удаляет рекорды не по совпадению ключа, а по полному совпадению всех полей, что позволяет удалить часть рекордов из
     * рекордсета.
     * </pre>
     */
    public void upsertRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertRecordSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> responseObserver) {
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
  public static final class DnsZoneServiceBlockingStub extends io.grpc.stub.AbstractStub<DnsZoneServiceBlockingStub> {
    private DnsZoneServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DnsZoneServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsZoneServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DnsZoneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone get(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse list(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet getRecordSet(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecordSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse listRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRecordSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Метод для строго консистентного изменения состояния зоны. Возвращает ошибку если удаляемая запись не найдена, если
     * у записи с таким ключом не совпадают остальные поля, или добавляемая запись с заданным ключом уже существует. Если
     * запись по одному и тому же ключу находится в обоих списках, то она заменяется на запись в списке добавленных.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRecordSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Метод без строго контроля для изменения состояния зоны. При удалении не проверяет наличие удаляемой записи.
     * Удаляет рекорды не по совпадению ключа, а по полному совпадению всех полей, что позволяет удалить часть рекордов из
     * рекордсета.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation upsertRecordSets(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertRecordSetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse listOperations(yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest request) {
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
  public static final class DnsZoneServiceFutureStub extends io.grpc.stub.AbstractStub<DnsZoneServiceFutureStub> {
    private DnsZoneServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DnsZoneServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsZoneServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DnsZoneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone> get(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse> list(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet> getRecordSet(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecordSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse> listRecordSets(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRecordSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Метод для строго консистентного изменения состояния зоны. Возвращает ошибку если удаляемая запись не найдена, если
     * у записи с таким ключом не совпадают остальные поля, или добавляемая запись с заданным ключом уже существует. Если
     * запись по одному и тому же ключу находится в обоих списках, то она заменяется на запись в списке добавленных.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRecordSets(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRecordSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Метод без строго контроля для изменения состояния зоны. При удалении не проверяет наличие удаляемой записи.
     * Удаляет рекорды не по совпадению ключа, а по полному совпадению всех полей, что позволяет удалить часть рекордов из
     * рекордсета.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> upsertRecordSets(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertRecordSetsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse> listOperations(
        yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest request) {
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
  private static final int METHODID_GET_RECORD_SET = 5;
  private static final int METHODID_LIST_RECORD_SETS = 6;
  private static final int METHODID_UPDATE_RECORD_SETS = 7;
  private static final int METHODID_UPSERT_RECORD_SETS = 8;
  private static final int METHODID_LIST_OPERATIONS = 9;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 10;
  private static final int METHODID_SET_ACCESS_BINDINGS = 11;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DnsZoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DnsZoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.DnsZone>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZonesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.CreateDnsZoneRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateDnsZoneRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.DeleteDnsZoneRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_RECORD_SET:
          serviceImpl.getRecordSet((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.GetDnsZoneRecordSetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneOuterClass.RecordSet>) responseObserver);
          break;
        case METHODID_LIST_RECORD_SETS:
          serviceImpl.listRecordSets((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneRecordSetsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RECORD_SETS:
          serviceImpl.updateRecordSets((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpdateRecordSetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPSERT_RECORD_SETS:
          serviceImpl.upsertRecordSets((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.UpsertRecordSetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.ListDnsZoneOperationsResponse>) responseObserver);
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

  private static abstract class DnsZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DnsZoneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dns.v1.DnsZoneServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DnsZoneService");
    }
  }

  private static final class DnsZoneServiceFileDescriptorSupplier
      extends DnsZoneServiceBaseDescriptorSupplier {
    DnsZoneServiceFileDescriptorSupplier() {}
  }

  private static final class DnsZoneServiceMethodDescriptorSupplier
      extends DnsZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DnsZoneServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DnsZoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DnsZoneServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetRecordSetMethod())
              .addMethod(getListRecordSetsMethod())
              .addMethod(getUpdateRecordSetsMethod())
              .addMethod(getUpsertRecordSetsMethod())
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
