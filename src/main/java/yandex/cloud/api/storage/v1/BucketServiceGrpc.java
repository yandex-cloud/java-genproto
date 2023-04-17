package yandex.cloud.api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing buckets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/storage/v1/bucket_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BucketServiceGrpc {

  private BucketServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.storage.v1.BucketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest,
      yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest.class,
      responseType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest,
      yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest, yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> getListMethod;
    if ((getListMethod = BucketServiceGrpc.getListMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getListMethod = BucketServiceGrpc.getListMethod) == null) {
          BucketServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest, yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest.class,
      responseType = yandex.cloud.api.storage.v1.BucketOuterClass.Bucket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest, yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> getGetMethod;
    if ((getGetMethod = BucketServiceGrpc.getGetMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getGetMethod = BucketServiceGrpc.getGetMethod) == null) {
          BucketServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest, yandex.cloud.api.storage.v1.BucketOuterClass.Bucket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketOuterClass.Bucket.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = BucketServiceGrpc.getCreateMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getCreateMethod = BucketServiceGrpc.getCreateMethod) == null) {
          BucketServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = BucketServiceGrpc.getUpdateMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getUpdateMethod = BucketServiceGrpc.getUpdateMethod) == null) {
          BucketServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = BucketServiceGrpc.getDeleteMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getDeleteMethod = BucketServiceGrpc.getDeleteMethod) == null) {
          BucketServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> getGetStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStats",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest.class,
      responseType = yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> getGetStatsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest, yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> getGetStatsMethod;
    if ((getGetStatsMethod = BucketServiceGrpc.getGetStatsMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getGetStatsMethod = BucketServiceGrpc.getGetStatsMethod) == null) {
          BucketServiceGrpc.getGetStatsMethod = getGetStatsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest, yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("GetStats"))
              .build();
        }
      }
    }
    return getGetStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> getGetHTTPSConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHTTPSConfig",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest.class,
      responseType = yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest,
      yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> getGetHTTPSConfigMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest, yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> getGetHTTPSConfigMethod;
    if ((getGetHTTPSConfigMethod = BucketServiceGrpc.getGetHTTPSConfigMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getGetHTTPSConfigMethod = BucketServiceGrpc.getGetHTTPSConfigMethod) == null) {
          BucketServiceGrpc.getGetHTTPSConfigMethod = getGetHTTPSConfigMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest, yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHTTPSConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("GetHTTPSConfig"))
              .build();
        }
      }
    }
    return getGetHTTPSConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetHTTPSConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetHTTPSConfig",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetHTTPSConfigMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetHTTPSConfigMethod;
    if ((getSetHTTPSConfigMethod = BucketServiceGrpc.getSetHTTPSConfigMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getSetHTTPSConfigMethod = BucketServiceGrpc.getSetHTTPSConfigMethod) == null) {
          BucketServiceGrpc.getSetHTTPSConfigMethod = getSetHTTPSConfigMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetHTTPSConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("SetHTTPSConfig"))
              .build();
        }
      }
    }
    return getSetHTTPSConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHTTPSConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHTTPSConfig",
      requestType = yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHTTPSConfigMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHTTPSConfigMethod;
    if ((getDeleteHTTPSConfigMethod = BucketServiceGrpc.getDeleteHTTPSConfigMethod) == null) {
      synchronized (BucketServiceGrpc.class) {
        if ((getDeleteHTTPSConfigMethod = BucketServiceGrpc.getDeleteHTTPSConfigMethod) == null) {
          BucketServiceGrpc.getDeleteHTTPSConfigMethod = getDeleteHTTPSConfigMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHTTPSConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BucketServiceMethodDescriptorSupplier("DeleteHTTPSConfig"))
              .build();
        }
      }
    }
    return getDeleteHTTPSConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BucketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BucketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BucketServiceStub>() {
        @java.lang.Override
        public BucketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BucketServiceStub(channel, callOptions);
        }
      };
    return BucketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BucketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BucketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BucketServiceBlockingStub>() {
        @java.lang.Override
        public BucketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BucketServiceBlockingStub(channel, callOptions);
        }
      };
    return BucketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BucketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BucketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BucketServiceFutureStub>() {
        @java.lang.Override
        public BucketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BucketServiceFutureStub(channel, callOptions);
        }
      };
    return BucketServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing buckets.
   * </pre>
   */
  public static abstract class BucketServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of buckets in the specified folder.
     * The following fields will not be returned for buckets in the list: [Bucket.policy], [Bucket.acl], [Bucket.cors],
     * [Bucket.website_settings], [Bucket.lifecycle_rules], [Bucket.tags].
     * </pre>
     */
    public void list(yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified bucket.
     * To get the list of all available buckets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a bucket in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified bucket.
     * In most cases, `storage.editor` role (see [documentation](/docs/storage/security/#storage-editor)) should be enough
     * to update a bucket, subject to its [policy](/docs/storage/concepts/policy).
     * </pre>
     */
    public void update(yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified bucket.
     * </pre>
     */
    public void delete(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the statistics for the specified bucket.
     * </pre>
     */
    public void getStats(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public void getHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHTTPSConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the HTTPS configuration for the specified bucket.
     * The updated configuration could take up to 30 minutes to apply to the bucket.
     * </pre>
     */
    public void setHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetHTTPSConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public void deleteHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHTTPSConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest,
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest,
                yandex.cloud.api.storage.v1.BucketOuterClass.Bucket>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest,
                yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats>(
                  this, METHODID_GET_STATS)))
          .addMethod(
            getGetHTTPSConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest,
                yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig>(
                  this, METHODID_GET_HTTPSCONFIG)))
          .addMethod(
            getSetHTTPSConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_HTTPSCONFIG)))
          .addMethod(
            getDeleteHTTPSConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_HTTPSCONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing buckets.
   * </pre>
   */
  public static final class BucketServiceStub extends io.grpc.stub.AbstractAsyncStub<BucketServiceStub> {
    private BucketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BucketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BucketServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of buckets in the specified folder.
     * The following fields will not be returned for buckets in the list: [Bucket.policy], [Bucket.acl], [Bucket.cors],
     * [Bucket.website_settings], [Bucket.lifecycle_rules], [Bucket.tags].
     * </pre>
     */
    public void list(yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified bucket.
     * To get the list of all available buckets, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a bucket in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified bucket.
     * In most cases, `storage.editor` role (see [documentation](/docs/storage/security/#storage-editor)) should be enough
     * to update a bucket, subject to its [policy](/docs/storage/concepts/policy).
     * </pre>
     */
    public void update(yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified bucket.
     * </pre>
     */
    public void delete(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the statistics for the specified bucket.
     * </pre>
     */
    public void getStats(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public void getHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHTTPSConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the HTTPS configuration for the specified bucket.
     * The updated configuration could take up to 30 minutes to apply to the bucket.
     * </pre>
     */
    public void setHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetHTTPSConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public void deleteHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHTTPSConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing buckets.
   * </pre>
   */
  public static final class BucketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BucketServiceBlockingStub> {
    private BucketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BucketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BucketServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of buckets in the specified folder.
     * The following fields will not be returned for buckets in the list: [Bucket.policy], [Bucket.acl], [Bucket.cors],
     * [Bucket.website_settings], [Bucket.lifecycle_rules], [Bucket.tags].
     * </pre>
     */
    public yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse list(yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified bucket.
     * To get the list of all available buckets, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.storage.v1.BucketOuterClass.Bucket get(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a bucket in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified bucket.
     * In most cases, `storage.editor` role (see [documentation](/docs/storage/security/#storage-editor)) should be enough
     * to update a bucket, subject to its [policy](/docs/storage/concepts/policy).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified bucket.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the statistics for the specified bucket.
     * </pre>
     */
    public yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats getStats(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig getHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHTTPSConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the HTTPS configuration for the specified bucket.
     * The updated configuration could take up to 30 minutes to apply to the bucket.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetHTTPSConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteHTTPSConfig(yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHTTPSConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing buckets.
   * </pre>
   */
  public static final class BucketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BucketServiceFutureStub> {
    private BucketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BucketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BucketServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of buckets in the specified folder.
     * The following fields will not be returned for buckets in the list: [Bucket.policy], [Bucket.acl], [Bucket.cors],
     * [Bucket.website_settings], [Bucket.lifecycle_rules], [Bucket.tags].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse> list(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified bucket.
     * To get the list of all available buckets, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.storage.v1.BucketOuterClass.Bucket> get(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a bucket in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified bucket.
     * In most cases, `storage.editor` role (see [documentation](/docs/storage/security/#storage-editor)) should be enough
     * to update a bucket, subject to its [policy](/docs/storage/concepts/policy).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the statistics for the specified bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats> getStats(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig> getHTTPSConfig(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHTTPSConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the HTTPS configuration for the specified bucket.
     * The updated configuration could take up to 30 minutes to apply to the bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setHTTPSConfig(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetHTTPSConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the HTTPS configuration for the specified bucket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteHTTPSConfig(
        yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHTTPSConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_STATS = 5;
  private static final int METHODID_GET_HTTPSCONFIG = 6;
  private static final int METHODID_SET_HTTPSCONFIG = 7;
  private static final int METHODID_DELETE_HTTPSCONFIG = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BucketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BucketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketServiceOuterClass.ListBucketsResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.Bucket>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.storage.v1.BucketServiceOuterClass.CreateBucketRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.storage.v1.BucketServiceOuterClass.UpdateBucketRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_STATS:
          serviceImpl.getStats((yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketStatsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.BucketStats>) responseObserver);
          break;
        case METHODID_GET_HTTPSCONFIG:
          serviceImpl.getHTTPSConfig((yandex.cloud.api.storage.v1.BucketServiceOuterClass.GetBucketHTTPSConfigRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.storage.v1.BucketOuterClass.HTTPSConfig>) responseObserver);
          break;
        case METHODID_SET_HTTPSCONFIG:
          serviceImpl.setHTTPSConfig((yandex.cloud.api.storage.v1.BucketServiceOuterClass.SetBucketHTTPSConfigRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_HTTPSCONFIG:
          serviceImpl.deleteHTTPSConfig((yandex.cloud.api.storage.v1.BucketServiceOuterClass.DeleteBucketHTTPSConfigRequest) request,
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

  private static abstract class BucketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BucketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.storage.v1.BucketServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BucketService");
    }
  }

  private static final class BucketServiceFileDescriptorSupplier
      extends BucketServiceBaseDescriptorSupplier {
    BucketServiceFileDescriptorSupplier() {}
  }

  private static final class BucketServiceMethodDescriptorSupplier
      extends BucketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BucketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BucketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BucketServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetStatsMethod())
              .addMethod(getGetHTTPSConfigMethod())
              .addMethod(getSetHTTPSConfigMethod())
              .addMethod(getDeleteHTTPSConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
