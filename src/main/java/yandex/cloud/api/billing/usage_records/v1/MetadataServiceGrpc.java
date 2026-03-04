package yandex.cloud.api.billing.usage_records.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MetadataService service for retrieving metadata related to usage records
 * The MetadataService provides a set of methods for retrieving metadata and reference information
 * about billing usage records within a specific billing account and date range. This metadata
 * includes information about clouds, services, SKUs, labels, and resources
 * to understand the available entity structure before building detailed usage reports.
 * Required permissions:
 * All methods in this service require one of the following permissions on the specified billing account:
 * - `billing.accounts.getReport`
 * Rate limits:
 * This API is limited to 1 request per minute per IP address.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/billing/usage_records/v1/metadata_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetadataServiceGrpc {

  private MetadataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.usage_records.v1.MetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> getGetUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsage",
      requestType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> getGetUsageMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> getGetUsageMethod;
    if ((getGetUsageMethod = MetadataServiceGrpc.getGetUsageMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetUsageMethod = MetadataServiceGrpc.getGetUsageMethod) == null) {
          MetadataServiceGrpc.getGetUsageMethod = getGetUsageMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetUsage"))
              .build();
        }
      }
    }
    return getGetUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> getGetLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLabel",
      requestType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> getGetLabelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> getGetLabelMethod;
    if ((getGetLabelMethod = MetadataServiceGrpc.getGetLabelMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetLabelMethod = MetadataServiceGrpc.getGetLabelMethod) == null) {
          MetadataServiceGrpc.getGetLabelMethod = getGetLabelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetLabel"))
              .build();
        }
      }
    }
    return getGetLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> getGetCloudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCloud",
      requestType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> getGetCloudMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> getGetCloudMethod;
    if ((getGetCloudMethod = MetadataServiceGrpc.getGetCloudMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetCloudMethod = MetadataServiceGrpc.getGetCloudMethod) == null) {
          MetadataServiceGrpc.getGetCloudMethod = getGetCloudMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCloud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetCloud"))
              .build();
        }
      }
    }
    return getGetCloudMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> getGetResourceIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceIDs",
      requestType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest.class,
      responseType = yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest,
      yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> getGetResourceIDsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> getGetResourceIDsMethod;
    if ((getGetResourceIDsMethod = MetadataServiceGrpc.getGetResourceIDsMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetResourceIDsMethod = MetadataServiceGrpc.getGetResourceIDsMethod) == null) {
          MetadataServiceGrpc.getGetResourceIDsMethod = getGetResourceIDsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest, yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetResourceIDs"))
              .build();
        }
      }
    }
    return getGetResourceIDsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceStub>() {
        @java.lang.Override
        public MetadataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceStub(channel, callOptions);
        }
      };
    return MetadataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceBlockingStub>() {
        @java.lang.Override
        public MetadataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceBlockingStub(channel, callOptions);
        }
      };
    return MetadataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceFutureStub>() {
        @java.lang.Override
        public MetadataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceFutureStub(channel, callOptions);
        }
      };
    return MetadataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MetadataService service for retrieving metadata related to usage records
   * The MetadataService provides a set of methods for retrieving metadata and reference information
   * about billing usage records within a specific billing account and date range. This metadata
   * includes information about clouds, services, SKUs, labels, and resources
   * to understand the available entity structure before building detailed usage reports.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static abstract class MetadataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetUsage returns usage metadata including available clouds, services, SKUs, label keys, and date ranges
     * for a specific billing account and date range.
     * This method provides a view of all available entities
     * that can be used for usage reporting within the specified date range
     * for the billing account and all its sub-accounts including:
     * - List of available clouds in provided data range
     * - Available label keys that can be used for filtering or grouping
     * - Available services
     * - Available SKUs
     * - Available billing accounts (user billing account and his sub-accounts)
     * Implementation details:
     * - Empty cloud_id values are translated to a "Usage is out of scope of the Cloud" designation
     * - All data is filtered to only include items that had usage during the specified date range
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getUsage(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLabel returns available label keys and values for a specific billing account
     * with pagination support.
     * This method retrieves all available label values for a specified label key
     * within the given date range. It supports filtering by label value substring
     * and provides pagination for handling large result sets.
     * The method can be used in several ways:
     * - With label_key only: Returns all values for that key with pagination
     * - With label_key and label_value: Returns array of matching labelValues with pagination
     * - With label_key and label_value_filter: Returns all values for that key with pagination
     *     and a separate array of labelValues from the labelValueFilters parameter
     * - With label_key, label_value and label_value_filter: returns only an array of matching labelValues
     *     with pagination and ignores labelValueFilters (i.e., labelValueFilters won't be returned)
     * Implementation details:
     * - Case-insensitive label value matching when label_value is provided
     * - When label_value is specified, label_value_filter is ignored
     * - Label values are sorted alphabetically
     * - Pagination occurs when results exceed page_size
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getLabel(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCloud returns available folders for specified clouds within a billing account
     * with optional filtering by cloud IDs, folder IDs and pagination support.
     * This method returns a hierarchical view of clouds and their folders that the user
     * has access to within the specified date range. Results can be filtered by
     * specific cloud IDs and/or folder IDs, and pagination is supported for handling
     * large result sets.
     * Implementation details:
     * - The method result does not contain empty cloud id information
     * - Filtering is done using case-insensitive substring matching
     * - Only clouds with at least one folder are included in the response
     * - Folder pagination is based on folder IDs, ordered alphabetically
     * - NextPageToken is only returned when there are more results available
     * - Base64-encoded page tokens are used for pagination state
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getCloud(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCloudMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetResourceIDs returns all resource IDs for a specific billing account and date range
     * with pagination support.
     * This method retrieves a list of all resource IDs that have usage records
     * within the specified date range and billing account. The results can be
     * filtered by a case-insensitive substring search on the resource ID.
     * Implementation details:
     * - Filtering is done using case-insensitive substring matching
     * - Only resource IDs with actual usage in the period are returned
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * Note: This RPC method is not yet implemented and will return UNIMPLEMENTED.
     * </pre>
     */
    public void getResourceIDs(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceIDsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest,
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse>(
                  this, METHODID_GET_USAGE)))
          .addMethod(
            getGetLabelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest,
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse>(
                  this, METHODID_GET_LABEL)))
          .addMethod(
            getGetCloudMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest,
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse>(
                  this, METHODID_GET_CLOUD)))
          .addMethod(
            getGetResourceIDsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest,
                yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse>(
                  this, METHODID_GET_RESOURCE_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * MetadataService service for retrieving metadata related to usage records
   * The MetadataService provides a set of methods for retrieving metadata and reference information
   * about billing usage records within a specific billing account and date range. This metadata
   * includes information about clouds, services, SKUs, labels, and resources
   * to understand the available entity structure before building detailed usage reports.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class MetadataServiceStub extends io.grpc.stub.AbstractAsyncStub<MetadataServiceStub> {
    private MetadataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUsage returns usage metadata including available clouds, services, SKUs, label keys, and date ranges
     * for a specific billing account and date range.
     * This method provides a view of all available entities
     * that can be used for usage reporting within the specified date range
     * for the billing account and all its sub-accounts including:
     * - List of available clouds in provided data range
     * - Available label keys that can be used for filtering or grouping
     * - Available services
     * - Available SKUs
     * - Available billing accounts (user billing account and his sub-accounts)
     * Implementation details:
     * - Empty cloud_id values are translated to a "Usage is out of scope of the Cloud" designation
     * - All data is filtered to only include items that had usage during the specified date range
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getUsage(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLabel returns available label keys and values for a specific billing account
     * with pagination support.
     * This method retrieves all available label values for a specified label key
     * within the given date range. It supports filtering by label value substring
     * and provides pagination for handling large result sets.
     * The method can be used in several ways:
     * - With label_key only: Returns all values for that key with pagination
     * - With label_key and label_value: Returns array of matching labelValues with pagination
     * - With label_key and label_value_filter: Returns all values for that key with pagination
     *     and a separate array of labelValues from the labelValueFilters parameter
     * - With label_key, label_value and label_value_filter: returns only an array of matching labelValues
     *     with pagination and ignores labelValueFilters (i.e., labelValueFilters won't be returned)
     * Implementation details:
     * - Case-insensitive label value matching when label_value is provided
     * - When label_value is specified, label_value_filter is ignored
     * - Label values are sorted alphabetically
     * - Pagination occurs when results exceed page_size
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getLabel(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCloud returns available folders for specified clouds within a billing account
     * with optional filtering by cloud IDs, folder IDs and pagination support.
     * This method returns a hierarchical view of clouds and their folders that the user
     * has access to within the specified date range. Results can be filtered by
     * specific cloud IDs and/or folder IDs, and pagination is supported for handling
     * large result sets.
     * Implementation details:
     * - The method result does not contain empty cloud id information
     * - Filtering is done using case-insensitive substring matching
     * - Only clouds with at least one folder are included in the response
     * - Folder pagination is based on folder IDs, ordered alphabetically
     * - NextPageToken is only returned when there are more results available
     * - Base64-encoded page tokens are used for pagination state
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public void getCloud(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCloudMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetResourceIDs returns all resource IDs for a specific billing account and date range
     * with pagination support.
     * This method retrieves a list of all resource IDs that have usage records
     * within the specified date range and billing account. The results can be
     * filtered by a case-insensitive substring search on the resource ID.
     * Implementation details:
     * - Filtering is done using case-insensitive substring matching
     * - Only resource IDs with actual usage in the period are returned
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * Note: This RPC method is not yet implemented and will return UNIMPLEMENTED.
     * </pre>
     */
    public void getResourceIDs(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceIDsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MetadataService service for retrieving metadata related to usage records
   * The MetadataService provides a set of methods for retrieving metadata and reference information
   * about billing usage records within a specific billing account and date range. This metadata
   * includes information about clouds, services, SKUs, labels, and resources
   * to understand the available entity structure before building detailed usage reports.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class MetadataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetadataServiceBlockingStub> {
    private MetadataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUsage returns usage metadata including available clouds, services, SKUs, label keys, and date ranges
     * for a specific billing account and date range.
     * This method provides a view of all available entities
     * that can be used for usage reporting within the specified date range
     * for the billing account and all its sub-accounts including:
     * - List of available clouds in provided data range
     * - Available label keys that can be used for filtering or grouping
     * - Available services
     * - Available SKUs
     * - Available billing accounts (user billing account and his sub-accounts)
     * Implementation details:
     * - Empty cloud_id values are translated to a "Usage is out of scope of the Cloud" designation
     * - All data is filtered to only include items that had usage during the specified date range
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse getUsage(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLabel returns available label keys and values for a specific billing account
     * with pagination support.
     * This method retrieves all available label values for a specified label key
     * within the given date range. It supports filtering by label value substring
     * and provides pagination for handling large result sets.
     * The method can be used in several ways:
     * - With label_key only: Returns all values for that key with pagination
     * - With label_key and label_value: Returns array of matching labelValues with pagination
     * - With label_key and label_value_filter: Returns all values for that key with pagination
     *     and a separate array of labelValues from the labelValueFilters parameter
     * - With label_key, label_value and label_value_filter: returns only an array of matching labelValues
     *     with pagination and ignores labelValueFilters (i.e., labelValueFilters won't be returned)
     * Implementation details:
     * - Case-insensitive label value matching when label_value is provided
     * - When label_value is specified, label_value_filter is ignored
     * - Label values are sorted alphabetically
     * - Pagination occurs when results exceed page_size
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse getLabel(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCloud returns available folders for specified clouds within a billing account
     * with optional filtering by cloud IDs, folder IDs and pagination support.
     * This method returns a hierarchical view of clouds and their folders that the user
     * has access to within the specified date range. Results can be filtered by
     * specific cloud IDs and/or folder IDs, and pagination is supported for handling
     * large result sets.
     * Implementation details:
     * - The method result does not contain empty cloud id information
     * - Filtering is done using case-insensitive substring matching
     * - Only clouds with at least one folder are included in the response
     * - Folder pagination is based on folder IDs, ordered alphabetically
     * - NextPageToken is only returned when there are more results available
     * - Base64-encoded page tokens are used for pagination state
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse getCloud(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCloudMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetResourceIDs returns all resource IDs for a specific billing account and date range
     * with pagination support.
     * This method retrieves a list of all resource IDs that have usage records
     * within the specified date range and billing account. The results can be
     * filtered by a case-insensitive substring search on the resource ID.
     * Implementation details:
     * - Filtering is done using case-insensitive substring matching
     * - Only resource IDs with actual usage in the period are returned
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * Note: This RPC method is not yet implemented and will return UNIMPLEMENTED.
     * </pre>
     */
    public yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse getResourceIDs(yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceIDsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MetadataService service for retrieving metadata related to usage records
   * The MetadataService provides a set of methods for retrieving metadata and reference information
   * about billing usage records within a specific billing account and date range. This metadata
   * includes information about clouds, services, SKUs, labels, and resources
   * to understand the available entity structure before building detailed usage reports.
   * Required permissions:
   * All methods in this service require one of the following permissions on the specified billing account:
   * - `billing.accounts.getReport`
   * Rate limits:
   * This API is limited to 1 request per minute per IP address.
   * </pre>
   */
  public static final class MetadataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MetadataServiceFutureStub> {
    private MetadataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUsage returns usage metadata including available clouds, services, SKUs, label keys, and date ranges
     * for a specific billing account and date range.
     * This method provides a view of all available entities
     * that can be used for usage reporting within the specified date range
     * for the billing account and all its sub-accounts including:
     * - List of available clouds in provided data range
     * - Available label keys that can be used for filtering or grouping
     * - Available services
     * - Available SKUs
     * - Available billing accounts (user billing account and his sub-accounts)
     * Implementation details:
     * - Empty cloud_id values are translated to a "Usage is out of scope of the Cloud" designation
     * - All data is filtered to only include items that had usage during the specified date range
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse> getUsage(
        yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLabel returns available label keys and values for a specific billing account
     * with pagination support.
     * This method retrieves all available label values for a specified label key
     * within the given date range. It supports filtering by label value substring
     * and provides pagination for handling large result sets.
     * The method can be used in several ways:
     * - With label_key only: Returns all values for that key with pagination
     * - With label_key and label_value: Returns array of matching labelValues with pagination
     * - With label_key and label_value_filter: Returns all values for that key with pagination
     *     and a separate array of labelValues from the labelValueFilters parameter
     * - With label_key, label_value and label_value_filter: returns only an array of matching labelValues
     *     with pagination and ignores labelValueFilters (i.e., labelValueFilters won't be returned)
     * Implementation details:
     * - Case-insensitive label value matching when label_value is provided
     * - When label_value is specified, label_value_filter is ignored
     * - Label values are sorted alphabetically
     * - Pagination occurs when results exceed page_size
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse> getLabel(
        yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCloud returns available folders for specified clouds within a billing account
     * with optional filtering by cloud IDs, folder IDs and pagination support.
     * This method returns a hierarchical view of clouds and their folders that the user
     * has access to within the specified date range. Results can be filtered by
     * specific cloud IDs and/or folder IDs, and pagination is supported for handling
     * large result sets.
     * Implementation details:
     * - The method result does not contain empty cloud id information
     * - Filtering is done using case-insensitive substring matching
     * - Only clouds with at least one folder are included in the response
     * - Folder pagination is based on folder IDs, ordered alphabetically
     * - NextPageToken is only returned when there are more results available
     * - Base64-encoded page tokens are used for pagination state
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse> getCloud(
        yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCloudMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetResourceIDs returns all resource IDs for a specific billing account and date range
     * with pagination support.
     * This method retrieves a list of all resource IDs that have usage records
     * within the specified date range and billing account. The results can be
     * filtered by a case-insensitive substring search on the resource ID.
     * Implementation details:
     * - Filtering is done using case-insensitive substring matching
     * - Only resource IDs with actual usage in the period are returned
     * Error handling:
     * - Returns INVALID_ARGUMENT if the request parameters fail validation
     * - Returns UNAUTHENTICATED if the user is not authenticated or the billing account does not exist
     * - Returns PERMISSION_DENIED if the user lacks required permissions
     * - Returns INTERNAL for internal server errors
     * Required permissions:
     * - `billing.accounts.getReport` on the specified billing account
     * Note: This RPC method is not yet implemented and will return UNIMPLEMENTED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse> getResourceIDs(
        yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceIDsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USAGE = 0;
  private static final int METHODID_GET_LABEL = 1;
  private static final int METHODID_GET_CLOUD = 2;
  private static final int METHODID_GET_RESOURCE_IDS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetadataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USAGE:
          serviceImpl.getUsage((yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetUsageResponse>) responseObserver);
          break;
        case METHODID_GET_LABEL:
          serviceImpl.getLabel((yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetLabelResponse>) responseObserver);
          break;
        case METHODID_GET_CLOUD:
          serviceImpl.getCloud((yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetCloudResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_IDS:
          serviceImpl.getResourceIDs((yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.GetResourceIDsResponse>) responseObserver);
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

  private static abstract class MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetadataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.usage_records.v1.MetadataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetadataService");
    }
  }

  private static final class MetadataServiceFileDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier {
    MetadataServiceFileDescriptorSupplier() {}
  }

  private static final class MetadataServiceMethodDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetadataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataServiceFileDescriptorSupplier())
              .addMethod(getGetUsageMethod())
              .addMethod(getGetLabelMethod())
              .addMethod(getGetCloudMethod())
              .addMethod(getGetResourceIDsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
