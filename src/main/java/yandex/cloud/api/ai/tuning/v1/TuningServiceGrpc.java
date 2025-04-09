package yandex.cloud.api.ai.tuning.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/tuning/v1/tuning_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TuningServiceGrpc {

  private TuningServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.tuning.v1.TuningService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tune",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneMethod;
    if ((getTuneMethod = TuningServiceGrpc.getTuneMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getTuneMethod = TuningServiceGrpc.getTuneMethod) == null) {
          TuningServiceGrpc.getTuneMethod = getTuneMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tune"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("Tune"))
              .build();
        }
      }
    }
    return getTuneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> getListMethod;
    if ((getListMethod = TuningServiceGrpc.getListMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getListMethod = TuningServiceGrpc.getListMethod) == null) {
          TuningServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> getDescribeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> getDescribeMethod;
    if ((getDescribeMethod = TuningServiceGrpc.getDescribeMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getDescribeMethod = TuningServiceGrpc.getDescribeMethod) == null) {
          TuningServiceGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> getCancelMethod;
    if ((getCancelMethod = TuningServiceGrpc.getCancelMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getCancelMethod = TuningServiceGrpc.getCancelMethod) == null) {
          TuningServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> getGetMetricsUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetricsUrl",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> getGetMetricsUrlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> getGetMetricsUrlMethod;
    if ((getGetMetricsUrlMethod = TuningServiceGrpc.getGetMetricsUrlMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getGetMetricsUrlMethod = TuningServiceGrpc.getGetMetricsUrlMethod) == null) {
          TuningServiceGrpc.getGetMetricsUrlMethod = getGetMetricsUrlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetricsUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("GetMetricsUrl"))
              .build();
        }
      }
    }
    return getGetMetricsUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> getGetOptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOptions",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> getGetOptionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> getGetOptionsMethod;
    if ((getGetOptionsMethod = TuningServiceGrpc.getGetOptionsMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getGetOptionsMethod = TuningServiceGrpc.getGetOptionsMethod) == null) {
          TuningServiceGrpc.getGetOptionsMethod = getGetOptionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("GetOptions"))
              .build();
        }
      }
    }
    return getGetOptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> getListErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListErrors",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> getListErrorsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> getListErrorsMethod;
    if ((getListErrorsMethod = TuningServiceGrpc.getListErrorsMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getListErrorsMethod = TuningServiceGrpc.getListErrorsMethod) == null) {
          TuningServiceGrpc.getListErrorsMethod = getListErrorsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("ListErrors"))
              .build();
        }
      }
    }
    return getListErrorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> getCreateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDraft",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> getCreateDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> getCreateDraftMethod;
    if ((getCreateDraftMethod = TuningServiceGrpc.getCreateDraftMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getCreateDraftMethod = TuningServiceGrpc.getCreateDraftMethod) == null) {
          TuningServiceGrpc.getCreateDraftMethod = getCreateDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("CreateDraft"))
              .build();
        }
      }
    }
    return getCreateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> getUpdateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDraft",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> getUpdateDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> getUpdateDraftMethod;
    if ((getUpdateDraftMethod = TuningServiceGrpc.getUpdateDraftMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getUpdateDraftMethod = TuningServiceGrpc.getUpdateDraftMethod) == null) {
          TuningServiceGrpc.getUpdateDraftMethod = getUpdateDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("UpdateDraft"))
              .build();
        }
      }
    }
    return getUpdateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> getDeleteDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDraft",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest.class,
      responseType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest,
      yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> getDeleteDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> getDeleteDraftMethod;
    if ((getDeleteDraftMethod = TuningServiceGrpc.getDeleteDraftMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getDeleteDraftMethod = TuningServiceGrpc.getDeleteDraftMethod) == null) {
          TuningServiceGrpc.getDeleteDraftMethod = getDeleteDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest, yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("DeleteDraft"))
              .build();
        }
      }
    }
    return getDeleteDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TuneDraft",
      requestType = yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneDraftMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getTuneDraftMethod;
    if ((getTuneDraftMethod = TuningServiceGrpc.getTuneDraftMethod) == null) {
      synchronized (TuningServiceGrpc.class) {
        if ((getTuneDraftMethod = TuningServiceGrpc.getTuneDraftMethod) == null) {
          TuningServiceGrpc.getTuneDraftMethod = getTuneDraftMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TuneDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TuningServiceMethodDescriptorSupplier("TuneDraft"))
              .build();
        }
      }
    }
    return getTuneDraftMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TuningServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuningServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuningServiceStub>() {
        @java.lang.Override
        public TuningServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuningServiceStub(channel, callOptions);
        }
      };
    return TuningServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TuningServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuningServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuningServiceBlockingStub>() {
        @java.lang.Override
        public TuningServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuningServiceBlockingStub(channel, callOptions);
        }
      };
    return TuningServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TuningServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuningServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuningServiceFutureStub>() {
        @java.lang.Override
        public TuningServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuningServiceFutureStub(channel, callOptions);
        }
      };
    return TuningServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TuningServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void tune(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTuneMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void describe(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     */
    public void cancel(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     */
    public void getMetricsUrl(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsUrlMethod(), responseObserver);
    }

    /**
     */
    public void getOptions(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOptionsMethod(), responseObserver);
    }

    /**
     */
    public void listErrors(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListErrorsMethod(), responseObserver);
    }

    /**
     */
    public void createDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDraftMethod(), responseObserver);
    }

    /**
     */
    public void updateDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDraftMethod(), responseObserver);
    }

    /**
     */
    public void deleteDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDraftMethod(), responseObserver);
    }

    /**
     */
    public void tuneDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTuneDraftMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTuneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_TUNE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getGetMetricsUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse>(
                  this, METHODID_GET_METRICS_URL)))
          .addMethod(
            getGetOptionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse>(
                  this, METHODID_GET_OPTIONS)))
          .addMethod(
            getListErrorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse>(
                  this, METHODID_LIST_ERRORS)))
          .addMethod(
            getCreateDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse>(
                  this, METHODID_CREATE_DRAFT)))
          .addMethod(
            getUpdateDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse>(
                  this, METHODID_UPDATE_DRAFT)))
          .addMethod(
            getDeleteDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest,
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse>(
                  this, METHODID_DELETE_DRAFT)))
          .addMethod(
            getTuneDraftMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_TUNE_DRAFT)))
          .build();
    }
  }

  /**
   */
  public static final class TuningServiceStub extends io.grpc.stub.AbstractAsyncStub<TuningServiceStub> {
    private TuningServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuningServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuningServiceStub(channel, callOptions);
    }

    /**
     */
    public void tune(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTuneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancel(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetricsUrl(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOptions(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listErrors(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListErrorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tuneDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTuneDraftMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TuningServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TuningServiceBlockingStub> {
    private TuningServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuningServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuningServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation tune(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTuneMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse list(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse describe(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse cancel(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse getMetricsUrl(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse getOptions(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse listErrors(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListErrorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse createDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDraftMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse updateDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDraftMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse deleteDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDraftMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation tuneDraft(yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTuneDraftMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TuningServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TuningServiceFutureStub> {
    private TuningServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuningServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuningServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> tune(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTuneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse> list(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse> describe(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse> cancel(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse> getMetricsUrl(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse> getOptions(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse> listErrors(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListErrorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse> createDraft(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDraftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse> updateDraft(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDraftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse> deleteDraft(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDraftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> tuneDraft(
        yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTuneDraftMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TUNE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_DESCRIBE = 2;
  private static final int METHODID_CANCEL = 3;
  private static final int METHODID_GET_METRICS_URL = 4;
  private static final int METHODID_GET_OPTIONS = 5;
  private static final int METHODID_LIST_ERRORS = 6;
  private static final int METHODID_CREATE_DRAFT = 7;
  private static final int METHODID_UPDATE_DRAFT = 8;
  private static final int METHODID_DELETE_DRAFT = 9;
  private static final int METHODID_TUNE_DRAFT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TuningServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TuningServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TUNE:
          serviceImpl.tune((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuningRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListTuningsResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DescribeTuningResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CancelTuningResponse>) responseObserver);
          break;
        case METHODID_GET_METRICS_URL:
          serviceImpl.getMetricsUrl((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetMetricsUrlResponse>) responseObserver);
          break;
        case METHODID_GET_OPTIONS:
          serviceImpl.getOptions((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.GetOptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_ERRORS:
          serviceImpl.listErrors((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.ListErrorsResponse>) responseObserver);
          break;
        case METHODID_CREATE_DRAFT:
          serviceImpl.createDraft((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.CreateTuningDraftResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DRAFT:
          serviceImpl.updateDraft((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.UpdateTuningDraftResponse>) responseObserver);
          break;
        case METHODID_DELETE_DRAFT:
          serviceImpl.deleteDraft((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.DeleteTuningDraftResponse>) responseObserver);
          break;
        case METHODID_TUNE_DRAFT:
          serviceImpl.tuneDraft((yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.TuneDraftRequest) request,
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

  private static abstract class TuningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TuningServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.tuning.v1.TuningServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TuningService");
    }
  }

  private static final class TuningServiceFileDescriptorSupplier
      extends TuningServiceBaseDescriptorSupplier {
    TuningServiceFileDescriptorSupplier() {}
  }

  private static final class TuningServiceMethodDescriptorSupplier
      extends TuningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TuningServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TuningServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TuningServiceFileDescriptorSupplier())
              .addMethod(getTuneMethod())
              .addMethod(getListMethod())
              .addMethod(getDescribeMethod())
              .addMethod(getCancelMethod())
              .addMethod(getGetMetricsUrlMethod())
              .addMethod(getGetOptionsMethod())
              .addMethod(getListErrorsMethod())
              .addMethod(getCreateDraftMethod())
              .addMethod(getUpdateDraftMethod())
              .addMethod(getDeleteDraftMethod())
              .addMethod(getTuneDraftMethod())
              .build();
        }
      }
    }
    return result;
  }
}
