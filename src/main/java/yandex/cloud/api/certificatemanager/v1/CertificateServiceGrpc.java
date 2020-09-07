package yandex.cloud.api.certificatemanager.v1;

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
    comments = "Source: yandex/cloud/certificatemanager/v1/certificate_service.proto")
public final class CertificateServiceGrpc {

  private CertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.certificatemanager.v1.CertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod;
    if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
          CertificateServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;
    if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
          CertificateServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
          CertificateServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
          CertificateServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
          CertificateServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestNew",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod;
    if ((getRequestNewMethod = CertificateServiceGrpc.getRequestNewMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getRequestNewMethod = CertificateServiceGrpc.getRequestNewMethod) == null) {
          CertificateServiceGrpc.getRequestNewMethod = getRequestNewMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "RequestNew"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("RequestNew"))
                  .build();
          }
        }
     }
     return getRequestNewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
          CertificateServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = CertificateServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListAccessBindingsMethod = CertificateServiceGrpc.getListAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = CertificateServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = CertificateServiceGrpc.getSetAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = CertificateServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = CertificateServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateServiceStub newStub(io.grpc.Channel channel) {
    return new CertificateServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CertificateServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CertificateServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified certificate.
     *  To get the list of available certificates, make a [CertificateService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public void requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestNewMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
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
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getRequestNewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REQUEST_NEW)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>(
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
  public static final class CertificateServiceStub extends io.grpc.stub.AbstractStub<CertificateServiceStub> {
    private CertificateServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     *  To get the list of available certificates, make a [CertificateService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public void requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestNewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CertificateServiceBlockingStub extends io.grpc.stub.AbstractStub<CertificateServiceBlockingStub> {
    private CertificateServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     *  To get the list of available certificates, make a [CertificateService.List] request.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestNewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CertificateServiceFutureStub extends io.grpc.stub.AbstractStub<CertificateServiceFutureStub> {
    private CertificateServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     *  To get the list of available certificates, make a [CertificateService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> get(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> list(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> requestNew(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestNewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> listOperations(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
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
  private static final int METHODID_REQUEST_NEW = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REQUEST_NEW:
          serviceImpl.requestNew((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>) responseObserver);
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

  private static abstract class CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CertificateService");
    }
  }

  private static final class CertificateServiceFileDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier {
    CertificateServiceFileDescriptorSupplier() {}
  }

  private static final class CertificateServiceMethodDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRequestNewMethod())
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
