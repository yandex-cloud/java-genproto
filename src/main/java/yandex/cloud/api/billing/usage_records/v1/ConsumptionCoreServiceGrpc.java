package yandex.cloud.api.billing.usage_records.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for detailed consumption and usage reporting.
 * The ConsumptionCoreService provides a comprehensive set of methods for retrieving detailed
 * usage and billing information for different entities within a billing account hierarchy.
 * Each method offers aggregated data for specific entity types (a billing account, clouds,
 * folders, services, SKUs, resources, or labels) with support for various filtering options
 * and aggregation periods. Note that each request targets a single billing account.
 * All methods in this service follow the same three-level response structure:
 * 1. Overall totals for the entire request period (cost, credits, expense)
 * 2. Entity-level totals - summary data for each entity of the requested type
 * 3. Time series data - periodic breakdown for each entity according to the specified aggregation period
 *    (controlled by the aggregation_period request parameter: day/week/month/quarter/year)
 * These methods help customers and internal teams analyze usage patterns, track expenses,
 * monitor resource consumption, and generate detailed billing reports. The service
 * supports filtering by entity IDs, date ranges, labels, and other parameters to provide
 * targeted insights into cloud resource usage.
 * Required permissions:
 * All methods in this service require one of the following permissions on the specified billing account:
 * - `billing.accounts.getReport`
 * 
 * Rate limits:
 * This API is limited to 1 request per minute per IP address.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/billing/usage_records/v1/consumption_core_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConsumptionCoreServiceGrpc {

  private ConsumptionCoreServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.usage_records.v1.ConsumptionCoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> getGetBillingAccountUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingAccountUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> getGetBillingAccountUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> getGetBillingAccountUsageReportMethod;
    if ((getGetBillingAccountUsageReportMethod = ConsumptionCoreServiceGrpc.getGetBillingAccountUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetBillingAccountUsageReportMethod = ConsumptionCoreServiceGrpc.getGetBillingAccountUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetBillingAccountUsageReportMethod = getGetBillingAccountUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingAccountUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetBillingAccountUsageReport"))
              .build();
        }
      }
    }
    return getGetBillingAccountUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> getGetCloudUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCloudUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> getGetCloudUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> getGetCloudUsageReportMethod;
    if ((getGetCloudUsageReportMethod = ConsumptionCoreServiceGrpc.getGetCloudUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetCloudUsageReportMethod = ConsumptionCoreServiceGrpc.getGetCloudUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetCloudUsageReportMethod = getGetCloudUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCloudUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetCloudUsageReport"))
              .build();
        }
      }
    }
    return getGetCloudUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> getGetFolderUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFolderUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> getGetFolderUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> getGetFolderUsageReportMethod;
    if ((getGetFolderUsageReportMethod = ConsumptionCoreServiceGrpc.getGetFolderUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetFolderUsageReportMethod = ConsumptionCoreServiceGrpc.getGetFolderUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetFolderUsageReportMethod = getGetFolderUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFolderUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetFolderUsageReport"))
              .build();
        }
      }
    }
    return getGetFolderUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> getGetServiceUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> getGetServiceUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> getGetServiceUsageReportMethod;
    if ((getGetServiceUsageReportMethod = ConsumptionCoreServiceGrpc.getGetServiceUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetServiceUsageReportMethod = ConsumptionCoreServiceGrpc.getGetServiceUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetServiceUsageReportMethod = getGetServiceUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetServiceUsageReport"))
              .build();
        }
      }
    }
    return getGetServiceUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> getGetSKUUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSKUUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> getGetSKUUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> getGetSKUUsageReportMethod;
    if ((getGetSKUUsageReportMethod = ConsumptionCoreServiceGrpc.getGetSKUUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetSKUUsageReportMethod = ConsumptionCoreServiceGrpc.getGetSKUUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetSKUUsageReportMethod = getGetSKUUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSKUUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetSKUUsageReport"))
              .build();
        }
      }
    }
    return getGetSKUUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> getGetResourceUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> getGetResourceUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> getGetResourceUsageReportMethod;
    if ((getGetResourceUsageReportMethod = ConsumptionCoreServiceGrpc.getGetResourceUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetResourceUsageReportMethod = ConsumptionCoreServiceGrpc.getGetResourceUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetResourceUsageReportMethod = getGetResourceUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetResourceUsageReport"))
              .build();
        }
      }
    }
    return getGetResourceUsageReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> getGetLabelKeyUsageReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabelKeyUsageReport",
      requestType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
      yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> getGetLabelKeyUsageReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> getGetLabelKeyUsageReportMethod;
    if ((getGetLabelKeyUsageReportMethod = ConsumptionCoreServiceGrpc.getGetLabelKeyUsageReportMethod) == null) {
      synchronized (ConsumptionCoreServiceGrpc.class) {
        if ((getGetLabelKeyUsageReportMethod = ConsumptionCoreServiceGrpc.getGetLabelKeyUsageReportMethod) == null) {
          ConsumptionCoreServiceGrpc.getGetLabelKeyUsageReportMethod = getGetLabelKeyUsageReportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest, yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabelKeyUsageReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumptionCoreServiceMethodDescriptorSupplier("GetLabelKeyUsageReport"))
              .build();
        }
      }
    }
    return getGetLabelKeyUsageReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsumptionCoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceStub>() {
        @java.lang.Override
        public ConsumptionCoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumptionCoreServiceStub(channel, callOptions);
        }
      };
    return ConsumptionCoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsumptionCoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceBlockingStub>() {
        @java.lang.Override
        public ConsumptionCoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumptionCoreServiceBlockingStub(channel, callOptions);
        }
      };
    return ConsumptionCoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsumptionCoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumptionCoreServiceFutureStub>() {
        @java.lang.Override
        public ConsumptionCoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumptionCoreServiceFutureStub(channel, callOptions);
        }
      };
    return ConsumptionCoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for detailed consumption and usage reporting.
   * The ConsumptionCoreService provides a comprehensive set of methods for retrieving detailed
   * usage and billing information for different entities within a billing account hierarchy.
   * Each method offers aggregated data for specific entity types (a billing account, clouds,
   * folders, services, SKUs, resources, or labels) with support for various filtering options
   * and aggregation periods. Note that each request targets a single billing account.
   * All methods in this service follow the same three-level response structure:
   * 1. Overall totals for the entire request period (cost, credits, expense)
   * 2. Entity-level totals - summary data for each entity of the requested type
   * 3. Time series data - periodic breakdown for each entity according to the specified aggregation period
   *    (controlled by the aggregation_period request parameter: day/week/month/quarter/year)
   * These methods help customers and internal teams analyze usage patterns, track expenses,
   * monitor resource consumption, and generate detailed billing reports. The service
   * supports filtering by entity IDs, date ranges, labels, and other parameters to provide
   * targeted insights into cloud resource usage.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * 
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static abstract class ConsumptionCoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns aggregated usage report for a single specified billing account,
     * optionally filtered by clouds, folders, SKUs, labels, and period granularity.
     * This method provides a comprehensive view of all usage and costs for a specific
     * billing account, with options to filter data by various entity types and to aggregate
     * results at different time granularities (daily, monthly, etc.).
     * Implementation details:
     * - The report includes the total cost, applied credits (monetary grants, volume incentives, committed use discounts, and free credits), and final expense
     * - Results can be filtered by cloud IDs, folder IDs, service IDs, SKU IDs, resource IDs, or labels
     * - All applicable filters from the request will be applied (with AND logic between different filter types)
     * - Time-based data is grouped according to the specified aggregation period
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getBillingAccountUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingAccountUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified clouds
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by clouds
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by cloud, with each cloud's usage, costs, and credits detailed
     * - If cloud_ids are specified, only data for those clouds is included (using OR logic)
     * - When no cloud_ids are specified, data for all clouds under the billing account is returned
     * - Other filters (folder_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Hierarchical data structure allows analyzing costs across the organization's cloud resources
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getCloudUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCloudUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified folders
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by folders
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by folder, with each folder's usage, costs, and credits detailed
     * - If folder_ids are specified, only data for those folders is included (using OR logic)
     * - When no folder_ids are specified, data for all folders under the billing account is returned
     * - Other filters (cloud_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Provides visibility into costs at the project/folder level within your organization
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getFolderUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFolderUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified services
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by services
     * within the specified billing account. Services represent broad product categories
     * (like Compute, Storage, AI, etc.) that contain multiple SKUs. The data can be
     * filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by service, with each service's usage, costs, and credits detailed
     * - If service_ids are specified, only data for those services is included (using OR logic)
     * - When no service_ids are specified, data for all services under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Service data includes the service name and description
     * - Helps identify which cloud services are driving your overall costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getServiceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by SKU (Stock Keeping Unit)
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by SKUs
     * within the specified billing account. SKUs are specific billable product offerings
     * (such as specific VM types, disk types, or AI models) that belong to a parent service.
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by SKU, with each SKU's usage, costs, and credits detailed
     * - If sku_ids are specified, only data for those SKUs is included (using OR logic)
     * - When no sku_ids are specified, data for all SKUs under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, resource_ids, labels) are always applied if present
     * - SKU data includes pricing quantity, unit of measurement, and translated display names
     * - Provides the most granular view of which specific product offerings are generating costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getSKUUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSKUUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by individual resource
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by individual resources
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by resource, with each resource's usage, costs, and credits detailed
     * - If resource_ids are specified, only data for those resources is included (using OR logic)
     * - When no resource_ids are specified, data for all resources under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, labels) are always applied if present
     * - This provides the most granular view of costs as it breaks down to the individual resource level
     * - Enables precise cost analysis at the individual resource instance level (specific VMs, disks, etc.)
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getResourceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceUsageReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by label keys and values
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by label key-value pairs
     * within the specified billing account. Labels are user-defined metadata tags attached to resources
     * (such as VMs, disks, etc.) in the form of key-value pairs (e.g., "env:prod", "region:us-west").
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by label key-value pairs, with usage, costs, and credits detailed for each
     * - If labels filter is specified, only data for matching labels is included
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, resource_ids) are always applied if present
     * - Resources can have multiple labels attached (e.g., a VM might have "env:prod", "team:finance", "region:us")
     * - If a resource has multiple labels at the same point in time, the usage and cost metrics are reported for each label separately.
     *   In other words, the same resource's cost is **duplicated** across its labels rather than split. For example,
     *   if a VM costs 90 units and has 3 labels, the report will show 90 units for each label, not 30 units per label.
     * - This allows for custom business dimensions analysis based on resource tagging
     * - Usage data is aggregated for all resources that share the same label
     * - Particularly useful for cost allocation and chargeback across business units, environments, or projects
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getLabelKeyUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabelKeyUsageReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBillingAccountUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse>(
                  this, METHODID_GET_BILLING_ACCOUNT_USAGE_REPORT)))
          .addMethod(
            getGetCloudUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse>(
                  this, METHODID_GET_CLOUD_USAGE_REPORT)))
          .addMethod(
            getGetFolderUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse>(
                  this, METHODID_GET_FOLDER_USAGE_REPORT)))
          .addMethod(
            getGetServiceUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse>(
                  this, METHODID_GET_SERVICE_USAGE_REPORT)))
          .addMethod(
            getGetSKUUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse>(
                  this, METHODID_GET_SKUUSAGE_REPORT)))
          .addMethod(
            getGetResourceUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse>(
                  this, METHODID_GET_RESOURCE_USAGE_REPORT)))
          .addMethod(
            getGetLabelKeyUsageReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest,
                yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse>(
                  this, METHODID_GET_LABEL_KEY_USAGE_REPORT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for detailed consumption and usage reporting.
   * The ConsumptionCoreService provides a comprehensive set of methods for retrieving detailed
   * usage and billing information for different entities within a billing account hierarchy.
   * Each method offers aggregated data for specific entity types (a billing account, clouds,
   * folders, services, SKUs, resources, or labels) with support for various filtering options
   * and aggregation periods. Note that each request targets a single billing account.
   * All methods in this service follow the same three-level response structure:
   * 1. Overall totals for the entire request period (cost, credits, expense)
   * 2. Entity-level totals - summary data for each entity of the requested type
   * 3. Time series data - periodic breakdown for each entity according to the specified aggregation period
   *    (controlled by the aggregation_period request parameter: day/week/month/quarter/year)
   * These methods help customers and internal teams analyze usage patterns, track expenses,
   * monitor resource consumption, and generate detailed billing reports. The service
   * supports filtering by entity IDs, date ranges, labels, and other parameters to provide
   * targeted insights into cloud resource usage.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * 
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class ConsumptionCoreServiceStub extends io.grpc.stub.AbstractAsyncStub<ConsumptionCoreServiceStub> {
    private ConsumptionCoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumptionCoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumptionCoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns aggregated usage report for a single specified billing account,
     * optionally filtered by clouds, folders, SKUs, labels, and period granularity.
     * This method provides a comprehensive view of all usage and costs for a specific
     * billing account, with options to filter data by various entity types and to aggregate
     * results at different time granularities (daily, monthly, etc.).
     * Implementation details:
     * - The report includes the total cost, applied credits (monetary grants, volume incentives, committed use discounts, and free credits), and final expense
     * - Results can be filtered by cloud IDs, folder IDs, service IDs, SKU IDs, resource IDs, or labels
     * - All applicable filters from the request will be applied (with AND logic between different filter types)
     * - Time-based data is grouped according to the specified aggregation period
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getBillingAccountUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingAccountUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified clouds
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by clouds
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by cloud, with each cloud's usage, costs, and credits detailed
     * - If cloud_ids are specified, only data for those clouds is included (using OR logic)
     * - When no cloud_ids are specified, data for all clouds under the billing account is returned
     * - Other filters (folder_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Hierarchical data structure allows analyzing costs across the organization's cloud resources
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getCloudUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCloudUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified folders
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by folders
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by folder, with each folder's usage, costs, and credits detailed
     * - If folder_ids are specified, only data for those folders is included (using OR logic)
     * - When no folder_ids are specified, data for all folders under the billing account is returned
     * - Other filters (cloud_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Provides visibility into costs at the project/folder level within your organization
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getFolderUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFolderUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified services
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by services
     * within the specified billing account. Services represent broad product categories
     * (like Compute, Storage, AI, etc.) that contain multiple SKUs. The data can be
     * filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by service, with each service's usage, costs, and credits detailed
     * - If service_ids are specified, only data for those services is included (using OR logic)
     * - When no service_ids are specified, data for all services under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Service data includes the service name and description
     * - Helps identify which cloud services are driving your overall costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getServiceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by SKU (Stock Keeping Unit)
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by SKUs
     * within the specified billing account. SKUs are specific billable product offerings
     * (such as specific VM types, disk types, or AI models) that belong to a parent service.
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by SKU, with each SKU's usage, costs, and credits detailed
     * - If sku_ids are specified, only data for those SKUs is included (using OR logic)
     * - When no sku_ids are specified, data for all SKUs under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, resource_ids, labels) are always applied if present
     * - SKU data includes pricing quantity, unit of measurement, and translated display names
     * - Provides the most granular view of which specific product offerings are generating costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getSKUUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSKUUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by individual resource
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by individual resources
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by resource, with each resource's usage, costs, and credits detailed
     * - If resource_ids are specified, only data for those resources is included (using OR logic)
     * - When no resource_ids are specified, data for all resources under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, labels) are always applied if present
     * - This provides the most granular view of costs as it breaks down to the individual resource level
     * - Enables precise cost analysis at the individual resource instance level (specific VMs, disks, etc.)
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getResourceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceUsageReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated usage report by label keys and values
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by label key-value pairs
     * within the specified billing account. Labels are user-defined metadata tags attached to resources
     * (such as VMs, disks, etc.) in the form of key-value pairs (e.g., "env:prod", "region:us-west").
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by label key-value pairs, with usage, costs, and credits detailed for each
     * - If labels filter is specified, only data for matching labels is included
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, resource_ids) are always applied if present
     * - Resources can have multiple labels attached (e.g., a VM might have "env:prod", "team:finance", "region:us")
     * - If a resource has multiple labels at the same point in time, the usage and cost metrics are reported for each label separately.
     *   In other words, the same resource's cost is **duplicated** across its labels rather than split. For example,
     *   if a VM costs 90 units and has 3 labels, the report will show 90 units for each label, not 30 units per label.
     * - This allows for custom business dimensions analysis based on resource tagging
     * - Usage data is aggregated for all resources that share the same label
     * - Particularly useful for cost allocation and chargeback across business units, environments, or projects
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public void getLabelKeyUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabelKeyUsageReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for detailed consumption and usage reporting.
   * The ConsumptionCoreService provides a comprehensive set of methods for retrieving detailed
   * usage and billing information for different entities within a billing account hierarchy.
   * Each method offers aggregated data for specific entity types (a billing account, clouds,
   * folders, services, SKUs, resources, or labels) with support for various filtering options
   * and aggregation periods. Note that each request targets a single billing account.
   * All methods in this service follow the same three-level response structure:
   * 1. Overall totals for the entire request period (cost, credits, expense)
   * 2. Entity-level totals - summary data for each entity of the requested type
   * 3. Time series data - periodic breakdown for each entity according to the specified aggregation period
   *    (controlled by the aggregation_period request parameter: day/week/month/quarter/year)
   * These methods help customers and internal teams analyze usage patterns, track expenses,
   * monitor resource consumption, and generate detailed billing reports. The service
   * supports filtering by entity IDs, date ranges, labels, and other parameters to provide
   * targeted insights into cloud resource usage.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * 
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class ConsumptionCoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConsumptionCoreServiceBlockingStub> {
    private ConsumptionCoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumptionCoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumptionCoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns aggregated usage report for a single specified billing account,
     * optionally filtered by clouds, folders, SKUs, labels, and period granularity.
     * This method provides a comprehensive view of all usage and costs for a specific
     * billing account, with options to filter data by various entity types and to aggregate
     * results at different time granularities (daily, monthly, etc.).
     * Implementation details:
     * - The report includes the total cost, applied credits (monetary grants, volume incentives, committed use discounts, and free credits), and final expense
     * - Results can be filtered by cloud IDs, folder IDs, service IDs, SKU IDs, resource IDs, or labels
     * - All applicable filters from the request will be applied (with AND logic between different filter types)
     * - Time-based data is grouped according to the specified aggregation period
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse getBillingAccountUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingAccountUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified clouds
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by clouds
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by cloud, with each cloud's usage, costs, and credits detailed
     * - If cloud_ids are specified, only data for those clouds is included (using OR logic)
     * - When no cloud_ids are specified, data for all clouds under the billing account is returned
     * - Other filters (folder_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Hierarchical data structure allows analyzing costs across the organization's cloud resources
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse getCloudUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCloudUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified folders
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by folders
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by folder, with each folder's usage, costs, and credits detailed
     * - If folder_ids are specified, only data for those folders is included (using OR logic)
     * - When no folder_ids are specified, data for all folders under the billing account is returned
     * - Other filters (cloud_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Provides visibility into costs at the project/folder level within your organization
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse getFolderUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFolderUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified services
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by services
     * within the specified billing account. Services represent broad product categories
     * (like Compute, Storage, AI, etc.) that contain multiple SKUs. The data can be
     * filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by service, with each service's usage, costs, and credits detailed
     * - If service_ids are specified, only data for those services is included (using OR logic)
     * - When no service_ids are specified, data for all services under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Service data includes the service name and description
     * - Helps identify which cloud services are driving your overall costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse getServiceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by SKU (Stock Keeping Unit)
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by SKUs
     * within the specified billing account. SKUs are specific billable product offerings
     * (such as specific VM types, disk types, or AI models) that belong to a parent service.
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by SKU, with each SKU's usage, costs, and credits detailed
     * - If sku_ids are specified, only data for those SKUs is included (using OR logic)
     * - When no sku_ids are specified, data for all SKUs under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, resource_ids, labels) are always applied if present
     * - SKU data includes pricing quantity, unit of measurement, and translated display names
     * - Provides the most granular view of which specific product offerings are generating costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse getSKUUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSKUUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by individual resource
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by individual resources
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by resource, with each resource's usage, costs, and credits detailed
     * - If resource_ids are specified, only data for those resources is included (using OR logic)
     * - When no resource_ids are specified, data for all resources under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, labels) are always applied if present
     * - This provides the most granular view of costs as it breaks down to the individual resource level
     * - Enables precise cost analysis at the individual resource instance level (specific VMs, disks, etc.)
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse getResourceUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceUsageReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by label keys and values
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by label key-value pairs
     * within the specified billing account. Labels are user-defined metadata tags attached to resources
     * (such as VMs, disks, etc.) in the form of key-value pairs (e.g., "env:prod", "region:us-west").
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by label key-value pairs, with usage, costs, and credits detailed for each
     * - If labels filter is specified, only data for matching labels is included
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, resource_ids) are always applied if present
     * - Resources can have multiple labels attached (e.g., a VM might have "env:prod", "team:finance", "region:us")
     * - If a resource has multiple labels at the same point in time, the usage and cost metrics are reported for each label separately.
     *   In other words, the same resource's cost is **duplicated** across its labels rather than split. For example,
     *   if a VM costs 90 units and has 3 labels, the report will show 90 units for each label, not 30 units per label.
     * - This allows for custom business dimensions analysis based on resource tagging
     * - Usage data is aggregated for all resources that share the same label
     * - Particularly useful for cost allocation and chargeback across business units, environments, or projects
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse getLabelKeyUsageReport(yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabelKeyUsageReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for detailed consumption and usage reporting.
   * The ConsumptionCoreService provides a comprehensive set of methods for retrieving detailed
   * usage and billing information for different entities within a billing account hierarchy.
   * Each method offers aggregated data for specific entity types (a billing account, clouds,
   * folders, services, SKUs, resources, or labels) with support for various filtering options
   * and aggregation periods. Note that each request targets a single billing account.
   * All methods in this service follow the same three-level response structure:
   * 1. Overall totals for the entire request period (cost, credits, expense)
   * 2. Entity-level totals - summary data for each entity of the requested type
   * 3. Time series data - periodic breakdown for each entity according to the specified aggregation period
   *    (controlled by the aggregation_period request parameter: day/week/month/quarter/year)
   * These methods help customers and internal teams analyze usage patterns, track expenses,
   * monitor resource consumption, and generate detailed billing reports. The service
   * supports filtering by entity IDs, date ranges, labels, and other parameters to provide
   * targeted insights into cloud resource usage.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * 
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class ConsumptionCoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConsumptionCoreServiceFutureStub> {
    private ConsumptionCoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumptionCoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumptionCoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns aggregated usage report for a single specified billing account,
     * optionally filtered by clouds, folders, SKUs, labels, and period granularity.
     * This method provides a comprehensive view of all usage and costs for a specific
     * billing account, with options to filter data by various entity types and to aggregate
     * results at different time granularities (daily, monthly, etc.).
     * Implementation details:
     * - The report includes the total cost, applied credits (monetary grants, volume incentives, committed use discounts, and free credits), and final expense
     * - Results can be filtered by cloud IDs, folder IDs, service IDs, SKU IDs, resource IDs, or labels
     * - All applicable filters from the request will be applied (with AND logic between different filter types)
     * - Time-based data is grouped according to the specified aggregation period
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse> getBillingAccountUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingAccountUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified clouds
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by clouds
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by cloud, with each cloud's usage, costs, and credits detailed
     * - If cloud_ids are specified, only data for those clouds is included (using OR logic)
     * - When no cloud_ids are specified, data for all clouds under the billing account is returned
     * - Other filters (folder_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Hierarchical data structure allows analyzing costs across the organization's cloud resources
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse> getCloudUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCloudUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified folders
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by folders
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by folder, with each folder's usage, costs, and credits detailed
     * - If folder_ids are specified, only data for those folders is included (using OR logic)
     * - When no folder_ids are specified, data for all folders under the billing account is returned
     * - Other filters (cloud_ids, service_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Provides visibility into costs at the project/folder level within your organization
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse> getFolderUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFolderUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report for the specified services
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by services
     * within the specified billing account. Services represent broad product categories
     * (like Compute, Storage, AI, etc.) that contain multiple SKUs. The data can be
     * filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by service, with each service's usage, costs, and credits detailed
     * - If service_ids are specified, only data for those services is included (using OR logic)
     * - When no service_ids are specified, data for all services under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, sku_ids, resource_ids, labels) are always applied if present
     * - Service data includes the service name and description
     * - Helps identify which cloud services are driving your overall costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse> getServiceUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by SKU (Stock Keeping Unit)
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by SKUs
     * within the specified billing account. SKUs are specific billable product offerings
     * (such as specific VM types, disk types, or AI models) that belong to a parent service.
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by SKU, with each SKU's usage, costs, and credits detailed
     * - If sku_ids are specified, only data for those SKUs is included (using OR logic)
     * - When no sku_ids are specified, data for all SKUs under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, resource_ids, labels) are always applied if present
     * - SKU data includes pricing quantity, unit of measurement, and translated display names
     * - Provides the most granular view of which specific product offerings are generating costs
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse> getSKUUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSKUUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by individual resource
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by individual resources
     * within the specified billing account. The data can be filtered by various
     * entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by resource, with each resource's usage, costs, and credits detailed
     * - If resource_ids are specified, only data for those resources is included (using OR logic)
     * - When no resource_ids are specified, data for all resources under the billing account is returned
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, labels) are always applied if present
     * - This provides the most granular view of costs as it breaks down to the individual resource level
     * - Enables precise cost analysis at the individual resource instance level (specific VMs, disks, etc.)
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse> getResourceUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceUsageReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated usage report by label keys and values
     * under the specified billing account.
     * This method provides detailed usage and cost information grouped by label key-value pairs
     * within the specified billing account. Labels are user-defined metadata tags attached to resources
     * (such as VMs, disks, etc.) in the form of key-value pairs (e.g., "env:prod", "region:us-west").
     * The data can be filtered by various entity types and aggregated at different time granularities.
     * Implementation details:
     * - Results are organized by label key-value pairs, with usage, costs, and credits detailed for each
     * - If labels filter is specified, only data for matching labels is included
     * - Other filters (cloud_ids, folder_ids, service_ids, sku_ids, resource_ids) are always applied if present
     * - Resources can have multiple labels attached (e.g., a VM might have "env:prod", "team:finance", "region:us")
     * - If a resource has multiple labels at the same point in time, the usage and cost metrics are reported for each label separately.
     *   In other words, the same resource's cost is **duplicated** across its labels rather than split. For example,
     *   if a VM costs 90 units and has 3 labels, the report will show 90 units for each label, not 30 units per label.
     * - This allows for custom business dimensions analysis based on resource tagging
     * - Usage data is aggregated for all resources that share the same label
     * - Particularly useful for cost allocation and chargeback across business units, environments, or projects
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse> getLabelKeyUsageReport(
        yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabelKeyUsageReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_ACCOUNT_USAGE_REPORT = 0;
  private static final int METHODID_GET_CLOUD_USAGE_REPORT = 1;
  private static final int METHODID_GET_FOLDER_USAGE_REPORT = 2;
  private static final int METHODID_GET_SERVICE_USAGE_REPORT = 3;
  private static final int METHODID_GET_SKUUSAGE_REPORT = 4;
  private static final int METHODID_GET_RESOURCE_USAGE_REPORT = 5;
  private static final int METHODID_GET_LABEL_KEY_USAGE_REPORT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsumptionCoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsumptionCoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_ACCOUNT_USAGE_REPORT:
          serviceImpl.getBillingAccountUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.BillingAccountUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_CLOUD_USAGE_REPORT:
          serviceImpl.getCloudUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.CloudUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_FOLDER_USAGE_REPORT:
          serviceImpl.getFolderUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.FolderUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_USAGE_REPORT:
          serviceImpl.getServiceUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ServiceUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_SKUUSAGE_REPORT:
          serviceImpl.getSKUUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.SKUUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_USAGE_REPORT:
          serviceImpl.getResourceUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.ResourceUsageReportResponse>) responseObserver);
          break;
        case METHODID_GET_LABEL_KEY_USAGE_REPORT:
          serviceImpl.getLabelKeyUsageReport((yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.UsageReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.LabelKeyUsageReportResponse>) responseObserver);
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

  private static abstract class ConsumptionCoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsumptionCoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.usage_records.v1.ConsumptionCoreServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsumptionCoreService");
    }
  }

  private static final class ConsumptionCoreServiceFileDescriptorSupplier
      extends ConsumptionCoreServiceBaseDescriptorSupplier {
    ConsumptionCoreServiceFileDescriptorSupplier() {}
  }

  private static final class ConsumptionCoreServiceMethodDescriptorSupplier
      extends ConsumptionCoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsumptionCoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConsumptionCoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsumptionCoreServiceFileDescriptorSupplier())
              .addMethod(getGetBillingAccountUsageReportMethod())
              .addMethod(getGetCloudUsageReportMethod())
              .addMethod(getGetFolderUsageReportMethod())
              .addMethod(getGetServiceUsageReportMethod())
              .addMethod(getGetSKUUsageReportMethod())
              .addMethod(getGetResourceUsageReportMethod())
              .addMethod(getGetLabelKeyUsageReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
