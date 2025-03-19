package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Stream line management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/stream_line_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamLineServiceGrpc {

  private StreamLineServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.StreamLineService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest,
      yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest,
      yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest, yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> getGetMethod;
    if ((getGetMethod = StreamLineServiceGrpc.getGetMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getGetMethod = StreamLineServiceGrpc.getGetMethod) == null) {
          StreamLineServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest, yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest,
      yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest,
      yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest, yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> getListMethod;
    if ((getListMethod = StreamLineServiceGrpc.getListMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getListMethod = StreamLineServiceGrpc.getListMethod) == null) {
          StreamLineServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest, yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest,
      yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> getBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGet",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest,
      yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> getBatchGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest, yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> getBatchGetMethod;
    if ((getBatchGetMethod = StreamLineServiceGrpc.getBatchGetMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getBatchGetMethod = StreamLineServiceGrpc.getBatchGetMethod) == null) {
          StreamLineServiceGrpc.getBatchGetMethod = getBatchGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest, yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("BatchGet"))
              .build();
        }
      }
    }
    return getBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = StreamLineServiceGrpc.getCreateMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getCreateMethod = StreamLineServiceGrpc.getCreateMethod) == null) {
          StreamLineServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = StreamLineServiceGrpc.getUpdateMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getUpdateMethod = StreamLineServiceGrpc.getUpdateMethod) == null) {
          StreamLineServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = StreamLineServiceGrpc.getDeleteMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getDeleteMethod = StreamLineServiceGrpc.getDeleteMethod) == null) {
          StreamLineServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDelete",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = StreamLineServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getBatchDeleteMethod = StreamLineServiceGrpc.getBatchDeleteMethod) == null) {
          StreamLineServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("BatchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerformAction",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;
    if ((getPerformActionMethod = StreamLineServiceGrpc.getPerformActionMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getPerformActionMethod = StreamLineServiceGrpc.getPerformActionMethod) == null) {
          StreamLineServiceGrpc.getPerformActionMethod = getPerformActionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerformAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("PerformAction"))
              .build();
        }
      }
    }
    return getPerformActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest,
      yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> getGetStreamKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamKey",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest,
      yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> getGetStreamKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest, yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> getGetStreamKeyMethod;
    if ((getGetStreamKeyMethod = StreamLineServiceGrpc.getGetStreamKeyMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getGetStreamKeyMethod = StreamLineServiceGrpc.getGetStreamKeyMethod) == null) {
          StreamLineServiceGrpc.getGetStreamKeyMethod = getGetStreamKeyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest, yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStreamKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("GetStreamKey"))
              .build();
        }
      }
    }
    return getGetStreamKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateStreamKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStreamKey",
      requestType = yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateStreamKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateStreamKeyMethod;
    if ((getUpdateStreamKeyMethod = StreamLineServiceGrpc.getUpdateStreamKeyMethod) == null) {
      synchronized (StreamLineServiceGrpc.class) {
        if ((getUpdateStreamKeyMethod = StreamLineServiceGrpc.getUpdateStreamKeyMethod) == null) {
          StreamLineServiceGrpc.getUpdateStreamKeyMethod = getUpdateStreamKeyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStreamKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamLineServiceMethodDescriptorSupplier("UpdateStreamKey"))
              .build();
        }
      }
    }
    return getUpdateStreamKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamLineServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceStub>() {
        @java.lang.Override
        public StreamLineServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamLineServiceStub(channel, callOptions);
        }
      };
    return StreamLineServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamLineServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceBlockingStub>() {
        @java.lang.Override
        public StreamLineServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamLineServiceBlockingStub(channel, callOptions);
        }
      };
    return StreamLineServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamLineServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamLineServiceFutureStub>() {
        @java.lang.Override
        public StreamLineServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamLineServiceFutureStub(channel, callOptions);
        }
      };
    return StreamLineServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Stream line management service.
   * </pre>
   */
  public static abstract class StreamLineServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the specific stream line.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List lines for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch get lines for channel.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create stream line.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update stream line.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete stream line.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch delete stream lines.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform an action on the line.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get unique stream key.
     * </pre>
     */
    public void getStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update stream key.
     * </pre>
     */
    public void updateStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStreamKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest,
                yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest,
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest,
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse>(
                  this, METHODID_BATCH_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_DELETE)))
          .addMethod(
            getPerformActionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PERFORM_ACTION)))
          .addMethod(
            getGetStreamKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest,
                yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey>(
                  this, METHODID_GET_STREAM_KEY)))
          .addMethod(
            getUpdateStreamKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_STREAM_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Stream line management service.
   * </pre>
   */
  public static final class StreamLineServiceStub extends io.grpc.stub.AbstractAsyncStub<StreamLineServiceStub> {
    private StreamLineServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamLineServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamLineServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific stream line.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List lines for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch get lines for channel.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create stream line.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update stream line.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete stream line.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch delete stream lines.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform an action on the line.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get unique stream key.
     * </pre>
     */
    public void getStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update stream key.
     * </pre>
     */
    public void updateStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStreamKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Stream line management service.
   * </pre>
   */
  public static final class StreamLineServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamLineServiceBlockingStub> {
    private StreamLineServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamLineServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamLineServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific stream line.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine get(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List lines for channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse list(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch get lines for channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse batchGet(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create stream line.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update stream line.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete stream line.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch delete stream lines.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchDelete(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform an action on the line.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation performAction(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get unique stream key.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey getStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update stream key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateStreamKey(yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStreamKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Stream line management service.
   * </pre>
   */
  public static final class StreamLineServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StreamLineServiceFutureStub> {
    private StreamLineServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamLineServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamLineServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific stream line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine> get(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List lines for channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse> list(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch get lines for channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse> batchGet(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create stream line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update stream line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete stream line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch delete stream lines.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchDelete(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform an action on the line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> performAction(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get unique stream key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey> getStreamKey(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update stream key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateStreamKey(
        yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStreamKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_BATCH_GET = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_BATCH_DELETE = 6;
  private static final int METHODID_PERFORM_ACTION = 7;
  private static final int METHODID_GET_STREAM_KEY = 8;
  private static final int METHODID_UPDATE_STREAM_KEY = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamLineServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamLineServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamLineRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.StreamLine>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.ListStreamLinesResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET:
          serviceImpl.batchGet((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchGetStreamLinesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.CreateStreamLineRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamLineRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.DeleteStreamLineRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.BatchDeleteStreamLinesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PERFORM_ACTION:
          serviceImpl.performAction((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.PerformLineActionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_STREAM_KEY:
          serviceImpl.getStreamKey((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.GetStreamKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamLineOuterClass.PushStreamKey>) responseObserver);
          break;
        case METHODID_UPDATE_STREAM_KEY:
          serviceImpl.updateStreamKey((yandex.cloud.api.video.v1.StreamLineServiceOuterClass.UpdateStreamKeyRequest) request,
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

  private static abstract class StreamLineServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamLineServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.StreamLineServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamLineService");
    }
  }

  private static final class StreamLineServiceFileDescriptorSupplier
      extends StreamLineServiceBaseDescriptorSupplier {
    StreamLineServiceFileDescriptorSupplier() {}
  }

  private static final class StreamLineServiceMethodDescriptorSupplier
      extends StreamLineServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamLineServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamLineServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamLineServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getBatchGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchDeleteMethod())
              .addMethod(getPerformActionMethod())
              .addMethod(getGetStreamKeyMethod())
              .addMethod(getUpdateStreamKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
