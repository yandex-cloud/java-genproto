package yandex.cloud.api.ai.dataset.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing datasets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/dataset/v1/dataset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.dataset.v1.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> getDescribeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> getDescribeMethod;
    if ((getDescribeMethod = DatasetServiceGrpc.getDescribeMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDescribeMethod = DatasetServiceGrpc.getDescribeMethod) == null) {
          DatasetServiceGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validate",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateMethod;
    if ((getValidateMethod = DatasetServiceGrpc.getValidateMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getValidateMethod = DatasetServiceGrpc.getValidateMethod) == null) {
          DatasetServiceGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> getCreateMethod;
    if ((getCreateMethod = DatasetServiceGrpc.getCreateMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateMethod = DatasetServiceGrpc.getCreateMethod) == null) {
          DatasetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> getUpdateMethod;
    if ((getUpdateMethod = DatasetServiceGrpc.getUpdateMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateMethod = DatasetServiceGrpc.getUpdateMethod) == null) {
          DatasetServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> getDeleteMethod;
    if ((getDeleteMethod = DatasetServiceGrpc.getDeleteMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteMethod = DatasetServiceGrpc.getDeleteMethod) == null) {
          DatasetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> getListMethod;
    if ((getListMethod = DatasetServiceGrpc.getListMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListMethod = DatasetServiceGrpc.getListMethod) == null) {
          DatasetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> getListUploadFormatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUploadFormats",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> getListUploadFormatsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> getListUploadFormatsMethod;
    if ((getListUploadFormatsMethod = DatasetServiceGrpc.getListUploadFormatsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListUploadFormatsMethod = DatasetServiceGrpc.getListUploadFormatsMethod) == null) {
          DatasetServiceGrpc.getListUploadFormatsMethod = getListUploadFormatsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUploadFormats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListUploadFormats"))
              .build();
        }
      }
    }
    return getListUploadFormatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> getListUploadSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUploadSchemas",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> getListUploadSchemasMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> getListUploadSchemasMethod;
    if ((getListUploadSchemasMethod = DatasetServiceGrpc.getListUploadSchemasMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListUploadSchemasMethod = DatasetServiceGrpc.getListUploadSchemasMethod) == null) {
          DatasetServiceGrpc.getListUploadSchemasMethod = getListUploadSchemasMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUploadSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListUploadSchemas"))
              .build();
        }
      }
    }
    return getListUploadSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> getGetUploadDraftUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadDraftUrl",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> getGetUploadDraftUrlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> getGetUploadDraftUrlMethod;
    if ((getGetUploadDraftUrlMethod = DatasetServiceGrpc.getGetUploadDraftUrlMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetUploadDraftUrlMethod = DatasetServiceGrpc.getGetUploadDraftUrlMethod) == null) {
          DatasetServiceGrpc.getGetUploadDraftUrlMethod = getGetUploadDraftUrlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadDraftUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetUploadDraftUrl"))
              .build();
        }
      }
    }
    return getGetUploadDraftUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> getGetDownloadUrlsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDownloadUrls",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> getGetDownloadUrlsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> getGetDownloadUrlsMethod;
    if ((getGetDownloadUrlsMethod = DatasetServiceGrpc.getGetDownloadUrlsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDownloadUrlsMethod = DatasetServiceGrpc.getGetDownloadUrlsMethod) == null) {
          DatasetServiceGrpc.getGetDownloadUrlsMethod = getGetDownloadUrlsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDownloadUrls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDownloadUrls"))
              .build();
        }
      }
    }
    return getGetDownloadUrlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> getStartMultipartUploadDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMultipartUploadDraft",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> getStartMultipartUploadDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> getStartMultipartUploadDraftMethod;
    if ((getStartMultipartUploadDraftMethod = DatasetServiceGrpc.getStartMultipartUploadDraftMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getStartMultipartUploadDraftMethod = DatasetServiceGrpc.getStartMultipartUploadDraftMethod) == null) {
          DatasetServiceGrpc.getStartMultipartUploadDraftMethod = getStartMultipartUploadDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartMultipartUploadDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("StartMultipartUploadDraft"))
              .build();
        }
      }
    }
    return getStartMultipartUploadDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> getFinishMultipartUploadDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishMultipartUploadDraft",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> getFinishMultipartUploadDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> getFinishMultipartUploadDraftMethod;
    if ((getFinishMultipartUploadDraftMethod = DatasetServiceGrpc.getFinishMultipartUploadDraftMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getFinishMultipartUploadDraftMethod = DatasetServiceGrpc.getFinishMultipartUploadDraftMethod) == null) {
          DatasetServiceGrpc.getFinishMultipartUploadDraftMethod = getFinishMultipartUploadDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishMultipartUploadDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("FinishMultipartUploadDraft"))
              .build();
        }
      }
    }
    return getFinishMultipartUploadDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> getListTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTypes",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> getListTypesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> getListTypesMethod;
    if ((getListTypesMethod = DatasetServiceGrpc.getListTypesMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListTypesMethod = DatasetServiceGrpc.getListTypesMethod) == null) {
          DatasetServiceGrpc.getListTypesMethod = getListTypesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListTypes"))
              .build();
        }
      }
    }
    return getListTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> getGetPreviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPreview",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> getGetPreviewMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> getGetPreviewMethod;
    if ((getGetPreviewMethod = DatasetServiceGrpc.getGetPreviewMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetPreviewMethod = DatasetServiceGrpc.getGetPreviewMethod) == null) {
          DatasetServiceGrpc.getGetPreviewMethod = getGetPreviewMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPreview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetPreview"))
              .build();
        }
      }
    }
    return getGetPreviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> getListOperationsIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperationsIds",
      requestType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest.class,
      responseType = yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest,
      yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> getListOperationsIdsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> getListOperationsIdsMethod;
    if ((getListOperationsIdsMethod = DatasetServiceGrpc.getListOperationsIdsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListOperationsIdsMethod = DatasetServiceGrpc.getListOperationsIdsMethod) == null) {
          DatasetServiceGrpc.getListOperationsIdsMethod = getListOperationsIdsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest, yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperationsIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListOperationsIds"))
              .build();
        }
      }
    }
    return getListOperationsIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub>() {
        @java.lang.Override
        public DatasetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceStub(channel, callOptions);
        }
      };
    return DatasetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub>() {
        @java.lang.Override
        public DatasetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceBlockingStub(channel, callOptions);
        }
      };
    return DatasetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub>() {
        @java.lang.Override
        public DatasetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceFutureStub(channel, callOptions);
        }
      };
    return DatasetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing datasets.
   * </pre>
   */
  public static abstract class DatasetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns dataset information by dataset id.
     * </pre>
     */
    public void describe(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts dataset validation process.
     * </pre>
     */
    public void validate(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates dataset.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates dataset.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes dataset.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists datasets in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated. Use ListUploadSchemas.
     * </pre>
     */
    @java.lang.Deprecated
    public void listUploadFormats(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUploadFormatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists supported dataset upload formats types and schemas for the specified dataset task type.
     * </pre>
     */
    public void listUploadSchemas(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUploadSchemasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns an S3 presigned URL for dataset upload.
     * This method only applicable if the dataset size does not exceed 5GB.
     * </pre>
     */
    public void getUploadDraftUrl(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadDraftUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get urls to download dataset
     * </pre>
     */
    public void getDownloadUrls(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDownloadUrlsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of S3 presigned URLs for multipart upload of dataset.
     * </pre>
     */
    public void startMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMultipartUploadDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finishes multipart upload of the dataset.
     * </pre>
     */
    public void finishMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishMultipartUploadDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of dataset types
     * </pre>
     */
    public void listTypes(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a preview of dataset types
     * </pre>
     */
    public void getPreview(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPreviewMethod(), responseObserver);
    }

    /**
     */
    public void listOperationsIds(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getValidateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_VALIDATE)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListUploadFormatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse>(
                  this, METHODID_LIST_UPLOAD_FORMATS)))
          .addMethod(
            getListUploadSchemasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse>(
                  this, METHODID_LIST_UPLOAD_SCHEMAS)))
          .addMethod(
            getGetUploadDraftUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse>(
                  this, METHODID_GET_UPLOAD_DRAFT_URL)))
          .addMethod(
            getGetDownloadUrlsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse>(
                  this, METHODID_GET_DOWNLOAD_URLS)))
          .addMethod(
            getStartMultipartUploadDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse>(
                  this, METHODID_START_MULTIPART_UPLOAD_DRAFT)))
          .addMethod(
            getFinishMultipartUploadDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse>(
                  this, METHODID_FINISH_MULTIPART_UPLOAD_DRAFT)))
          .addMethod(
            getListTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse>(
                  this, METHODID_LIST_TYPES)))
          .addMethod(
            getGetPreviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse>(
                  this, METHODID_GET_PREVIEW)))
          .addMethod(
            getListOperationsIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest,
                yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse>(
                  this, METHODID_LIST_OPERATIONS_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing datasets.
   * </pre>
   */
  public static final class DatasetServiceStub extends io.grpc.stub.AbstractAsyncStub<DatasetServiceStub> {
    private DatasetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns dataset information by dataset id.
     * </pre>
     */
    public void describe(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts dataset validation process.
     * </pre>
     */
    public void validate(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates dataset.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates dataset.
     * </pre>
     */
    public void update(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes dataset.
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists datasets in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated. Use ListUploadSchemas.
     * </pre>
     */
    @java.lang.Deprecated
    public void listUploadFormats(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUploadFormatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists supported dataset upload formats types and schemas for the specified dataset task type.
     * </pre>
     */
    public void listUploadSchemas(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUploadSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns an S3 presigned URL for dataset upload.
     * This method only applicable if the dataset size does not exceed 5GB.
     * </pre>
     */
    public void getUploadDraftUrl(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadDraftUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get urls to download dataset
     * </pre>
     */
    public void getDownloadUrls(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDownloadUrlsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of S3 presigned URLs for multipart upload of dataset.
     * </pre>
     */
    public void startMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMultipartUploadDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finishes multipart upload of the dataset.
     * </pre>
     */
    public void finishMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishMultipartUploadDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of dataset types
     * </pre>
     */
    public void listTypes(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a preview of dataset types
     * </pre>
     */
    public void getPreview(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPreviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperationsIds(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing datasets.
   * </pre>
   */
  public static final class DatasetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DatasetServiceBlockingStub> {
    private DatasetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns dataset information by dataset id.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse describe(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts dataset validation process.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation validate(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates dataset.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse create(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates dataset.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse update(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes dataset.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse delete(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists datasets in specified folder.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse list(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated. Use ListUploadSchemas.
     * </pre>
     */
    @java.lang.Deprecated
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse listUploadFormats(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUploadFormatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists supported dataset upload formats types and schemas for the specified dataset task type.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse listUploadSchemas(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUploadSchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns an S3 presigned URL for dataset upload.
     * This method only applicable if the dataset size does not exceed 5GB.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse getUploadDraftUrl(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadDraftUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get urls to download dataset
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse getDownloadUrls(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDownloadUrlsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of S3 presigned URLs for multipart upload of dataset.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse startMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMultipartUploadDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finishes multipart upload of the dataset.
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse finishMultipartUploadDraft(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishMultipartUploadDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of dataset types
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse listTypes(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a preview of dataset types
     * </pre>
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse getPreview(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPreviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse listOperationsIds(yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing datasets.
   * </pre>
   */
  public static final class DatasetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DatasetServiceFutureStub> {
    private DatasetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns dataset information by dataset id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse> describe(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts dataset validation process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> validate(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse> create(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse> update(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse> delete(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists datasets in specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse> list(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated. Use ListUploadSchemas.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse> listUploadFormats(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUploadFormatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists supported dataset upload formats types and schemas for the specified dataset task type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse> listUploadSchemas(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUploadSchemasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns an S3 presigned URL for dataset upload.
     * This method only applicable if the dataset size does not exceed 5GB.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse> getUploadDraftUrl(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadDraftUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get urls to download dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse> getDownloadUrls(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDownloadUrlsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of S3 presigned URLs for multipart upload of dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse> startMultipartUploadDraft(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMultipartUploadDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finishes multipart upload of the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse> finishMultipartUploadDraft(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishMultipartUploadDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of dataset types
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse> listTypes(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a preview of dataset types
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse> getPreview(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPreviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse> listOperationsIds(
        yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE = 0;
  private static final int METHODID_VALIDATE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST = 5;
  private static final int METHODID_LIST_UPLOAD_FORMATS = 6;
  private static final int METHODID_LIST_UPLOAD_SCHEMAS = 7;
  private static final int METHODID_GET_UPLOAD_DRAFT_URL = 8;
  private static final int METHODID_GET_DOWNLOAD_URLS = 9;
  private static final int METHODID_START_MULTIPART_UPLOAD_DRAFT = 10;
  private static final int METHODID_FINISH_MULTIPART_UPLOAD_DRAFT = 11;
  private static final int METHODID_LIST_TYPES = 12;
  private static final int METHODID_GET_PREVIEW = 13;
  private static final int METHODID_LIST_OPERATIONS_IDS = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatasetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatasetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DescribeDatasetResponse>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ValidateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.CreateDatasetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.UpdateDatasetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.DeleteDatasetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListDatasetsResponse>) responseObserver);
          break;
        case METHODID_LIST_UPLOAD_FORMATS:
          serviceImpl.listUploadFormats((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadFormatsResponse>) responseObserver);
          break;
        case METHODID_LIST_UPLOAD_SCHEMAS:
          serviceImpl.listUploadSchemas((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListUploadSchemasResponse>) responseObserver);
          break;
        case METHODID_GET_UPLOAD_DRAFT_URL:
          serviceImpl.getUploadDraftUrl((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetUploadDraftUrlResponse>) responseObserver);
          break;
        case METHODID_GET_DOWNLOAD_URLS:
          serviceImpl.getDownloadUrls((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDownloadUrlsResponse>) responseObserver);
          break;
        case METHODID_START_MULTIPART_UPLOAD_DRAFT:
          serviceImpl.startMultipartUploadDraft((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.StartMultipartUploadDraftResponse>) responseObserver);
          break;
        case METHODID_FINISH_MULTIPART_UPLOAD_DRAFT:
          serviceImpl.finishMultipartUploadDraft((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.FinishMultipartUploadDraftResponse>) responseObserver);
          break;
        case METHODID_LIST_TYPES:
          serviceImpl.listTypes((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListTypesResponse>) responseObserver);
          break;
        case METHODID_GET_PREVIEW:
          serviceImpl.getPreview((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.GetDatasetPreviewResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS_IDS:
          serviceImpl.listOperationsIds((yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.ListOperationsIdsResponse>) responseObserver);
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

  private static abstract class DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.dataset.v1.DatasetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetService");
    }
  }

  private static final class DatasetServiceFileDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier {
    DatasetServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetServiceMethodDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatasetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatasetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetServiceFileDescriptorSupplier())
              .addMethod(getDescribeMethod())
              .addMethod(getValidateMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getListUploadFormatsMethod())
              .addMethod(getListUploadSchemasMethod())
              .addMethod(getGetUploadDraftUrlMethod())
              .addMethod(getGetDownloadUrlsMethod())
              .addMethod(getStartMultipartUploadDraftMethod())
              .addMethod(getFinishMultipartUploadDraftMethod())
              .addMethod(getListTypesMethod())
              .addMethod(getGetPreviewMethod())
              .addMethod(getListOperationsIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
