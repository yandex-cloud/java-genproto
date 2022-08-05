package yandex.cloud.api.iot.broker.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing broker.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iot/broker/v1/broker_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BrokerServiceGrpc {

  private BrokerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.broker.v1.BrokerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest,
      yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest,
      yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest, yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> getGetMethod;
    if ((getGetMethod = BrokerServiceGrpc.getGetMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getGetMethod = BrokerServiceGrpc.getGetMethod) == null) {
          BrokerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest, yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> getListMethod;
    if ((getListMethod = BrokerServiceGrpc.getListMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getListMethod = BrokerServiceGrpc.getListMethod) == null) {
          BrokerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = BrokerServiceGrpc.getCreateMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getCreateMethod = BrokerServiceGrpc.getCreateMethod) == null) {
          BrokerServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = BrokerServiceGrpc.getUpdateMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getUpdateMethod = BrokerServiceGrpc.getUpdateMethod) == null) {
          BrokerServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = BrokerServiceGrpc.getDeleteMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getDeleteMethod = BrokerServiceGrpc.getDeleteMethod) == null) {
          BrokerServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> getListCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCertificates",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> getListCertificatesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> getListCertificatesMethod;
    if ((getListCertificatesMethod = BrokerServiceGrpc.getListCertificatesMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getListCertificatesMethod = BrokerServiceGrpc.getListCertificatesMethod) == null) {
          BrokerServiceGrpc.getListCertificatesMethod = getListCertificatesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("ListCertificates"))
              .build();
        }
      }
    }
    return getListCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCertificate",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;
    if ((getAddCertificateMethod = BrokerServiceGrpc.getAddCertificateMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getAddCertificateMethod = BrokerServiceGrpc.getAddCertificateMethod) == null) {
          BrokerServiceGrpc.getAddCertificateMethod = getAddCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("AddCertificate"))
              .build();
        }
      }
    }
    return getAddCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCertificate",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;
    if ((getDeleteCertificateMethod = BrokerServiceGrpc.getDeleteCertificateMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getDeleteCertificateMethod = BrokerServiceGrpc.getDeleteCertificateMethod) == null) {
          BrokerServiceGrpc.getDeleteCertificateMethod = getDeleteCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("DeleteCertificate"))
              .build();
        }
      }
    }
    return getDeleteCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> getListPasswordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPasswords",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> getListPasswordsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> getListPasswordsMethod;
    if ((getListPasswordsMethod = BrokerServiceGrpc.getListPasswordsMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getListPasswordsMethod = BrokerServiceGrpc.getListPasswordsMethod) == null) {
          BrokerServiceGrpc.getListPasswordsMethod = getListPasswordsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPasswords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("ListPasswords"))
              .build();
        }
      }
    }
    return getListPasswordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPassword",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;
    if ((getAddPasswordMethod = BrokerServiceGrpc.getAddPasswordMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getAddPasswordMethod = BrokerServiceGrpc.getAddPasswordMethod) == null) {
          BrokerServiceGrpc.getAddPasswordMethod = getAddPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("AddPassword"))
              .build();
        }
      }
    }
    return getAddPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePassword",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;
    if ((getDeletePasswordMethod = BrokerServiceGrpc.getDeletePasswordMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getDeletePasswordMethod = BrokerServiceGrpc.getDeletePasswordMethod) == null) {
          BrokerServiceGrpc.getDeletePasswordMethod = getDeletePasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("DeletePassword"))
              .build();
        }
      }
    }
    return getDeletePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest.class,
      responseType = yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest,
      yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = BrokerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (BrokerServiceGrpc.class) {
        if ((getListOperationsMethod = BrokerServiceGrpc.getListOperationsMethod) == null) {
          BrokerServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest, yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerServiceStub>() {
        @java.lang.Override
        public BrokerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerServiceStub(channel, callOptions);
        }
      };
    return BrokerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerServiceBlockingStub>() {
        @java.lang.Override
        public BrokerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerServiceBlockingStub(channel, callOptions);
        }
      };
    return BrokerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerServiceFutureStub>() {
        @java.lang.Override
        public BrokerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerServiceFutureStub(channel, callOptions);
        }
      };
    return BrokerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing broker.
   * </pre>
   */
  public static abstract class BrokerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified broker.
     * To get the list of available brokers, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of brokers in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a broker in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified broker.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified broker.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of broker certificates for the specified broker.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCertificatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified broker certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified broker.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPasswordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified broker.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified broker.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest,
                yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest,
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListCertificatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest,
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse>(
                  this, METHODID_LIST_CERTIFICATES)))
          .addMethod(
            getAddCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CERTIFICATE)))
          .addMethod(
            getDeleteCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CERTIFICATE)))
          .addMethod(
            getListPasswordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest,
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse>(
                  this, METHODID_LIST_PASSWORDS)))
          .addMethod(
            getAddPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PASSWORD)))
          .addMethod(
            getDeletePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PASSWORD)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest,
                yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing broker.
   * </pre>
   */
  public static final class BrokerServiceStub extends io.grpc.stub.AbstractAsyncStub<BrokerServiceStub> {
    private BrokerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified broker.
     * To get the list of available brokers, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of brokers in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a broker in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified broker.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified broker.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of broker certificates for the specified broker.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified broker certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified broker.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified broker.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified broker.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing broker.
   * </pre>
   */
  public static final class BrokerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BrokerServiceBlockingStub> {
    private BrokerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified broker.
     * To get the list of available brokers, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker get(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of brokers in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse list(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a broker in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified broker.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified broker.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of broker certificates for the specified broker.
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse listCertificates(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCertificatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified broker certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCertificate(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified broker.
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse listPasswords(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPasswordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds password for the specified broker.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deletePassword(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified broker.
     * </pre>
     */
    public yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse listOperations(yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing broker.
   * </pre>
   */
  public static final class BrokerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BrokerServiceFutureStub> {
    private BrokerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified broker.
     * To get the list of available brokers, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker> get(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of brokers in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse> list(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a broker in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of broker certificates for the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse> listCertificates(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCertificate(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified broker certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCertificate(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse> listPasswords(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds password for the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPassword(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deletePassword(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse> listOperations(
        yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_CERTIFICATES = 5;
  private static final int METHODID_ADD_CERTIFICATE = 6;
  private static final int METHODID_DELETE_CERTIFICATE = 7;
  private static final int METHODID_LIST_PASSWORDS = 8;
  private static final int METHODID_ADD_PASSWORD = 9;
  private static final int METHODID_DELETE_PASSWORD = 10;
  private static final int METHODID_LIST_OPERATIONS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.GetBrokerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerOuterClass.Broker>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.CreateBrokerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.UpdateBrokerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_CERTIFICATES:
          serviceImpl.listCertificates((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerCertificatesResponse>) responseObserver);
          break;
        case METHODID_ADD_CERTIFICATE:
          serviceImpl.addCertificate((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CERTIFICATE:
          serviceImpl.deleteCertificate((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_PASSWORDS:
          serviceImpl.listPasswords((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerPasswordsResponse>) responseObserver);
          break;
        case METHODID_ADD_PASSWORD:
          serviceImpl.addPassword((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.AddBrokerPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PASSWORD:
          serviceImpl.deletePassword((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.DeleteBrokerPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.ListBrokerOperationsResponse>) responseObserver);
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

  private static abstract class BrokerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrokerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.broker.v1.BrokerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BrokerService");
    }
  }

  private static final class BrokerServiceFileDescriptorSupplier
      extends BrokerServiceBaseDescriptorSupplier {
    BrokerServiceFileDescriptorSupplier() {}
  }

  private static final class BrokerServiceMethodDescriptorSupplier
      extends BrokerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrokerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrokerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListCertificatesMethod())
              .addMethod(getAddCertificateMethod())
              .addMethod(getDeleteCertificateMethod())
              .addMethod(getListPasswordsMethod())
              .addMethod(getAddPasswordMethod())
              .addMethod(getDeletePasswordMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
