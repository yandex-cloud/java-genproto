package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Episode management service.
 * Provides methods for creating, retrieving, updating, and deleting episodes,
 * which represent specific time segments of streams
 * that can be individually accessed, managed, and published.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/episode_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EpisodeServiceGrpc {

  private EpisodeServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.EpisodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest,
      yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest.class,
      responseType = yandex.cloud.api.video.v1.EpisodeOuterClass.Episode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest,
      yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest, yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> getGetMethod;
    if ((getGetMethod = EpisodeServiceGrpc.getGetMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getGetMethod = EpisodeServiceGrpc.getGetMethod) == null) {
          EpisodeServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest, yandex.cloud.api.video.v1.EpisodeOuterClass.Episode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeOuterClass.Episode.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest.class,
      responseType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> getListMethod;
    if ((getListMethod = EpisodeServiceGrpc.getListMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getListMethod = EpisodeServiceGrpc.getListMethod) == null) {
          EpisodeServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> getBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGet",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest.class,
      responseType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> getBatchGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> getBatchGetMethod;
    if ((getBatchGetMethod = EpisodeServiceGrpc.getBatchGetMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getBatchGetMethod = EpisodeServiceGrpc.getBatchGetMethod) == null) {
          EpisodeServiceGrpc.getBatchGetMethod = getBatchGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("BatchGet"))
              .build();
        }
      }
    }
    return getBatchGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = EpisodeServiceGrpc.getCreateMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getCreateMethod = EpisodeServiceGrpc.getCreateMethod) == null) {
          EpisodeServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = EpisodeServiceGrpc.getUpdateMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getUpdateMethod = EpisodeServiceGrpc.getUpdateMethod) == null) {
          EpisodeServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = EpisodeServiceGrpc.getDeleteMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getDeleteMethod = EpisodeServiceGrpc.getDeleteMethod) == null) {
          EpisodeServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDelete",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = EpisodeServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getBatchDeleteMethod = EpisodeServiceGrpc.getBatchDeleteMethod) == null) {
          EpisodeServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("BatchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerformAction",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;
    if ((getPerformActionMethod = EpisodeServiceGrpc.getPerformActionMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getPerformActionMethod = EpisodeServiceGrpc.getPerformActionMethod) == null) {
          EpisodeServiceGrpc.getPerformActionMethod = getPerformActionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerformAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("PerformAction"))
              .build();
        }
      }
    }
    return getPerformActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> getGetPlayerURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerURL",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest.class,
      responseType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> getGetPlayerURLMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> getGetPlayerURLMethod;
    if ((getGetPlayerURLMethod = EpisodeServiceGrpc.getGetPlayerURLMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getGetPlayerURLMethod = EpisodeServiceGrpc.getGetPlayerURLMethod) == null) {
          EpisodeServiceGrpc.getGetPlayerURLMethod = getGetPlayerURLMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("GetPlayerURL"))
              .build();
        }
      }
    }
    return getGetPlayerURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> getGetManifestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetManifests",
      requestType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest.class,
      responseType = yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest,
      yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> getGetManifestsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> getGetManifestsMethod;
    if ((getGetManifestsMethod = EpisodeServiceGrpc.getGetManifestsMethod) == null) {
      synchronized (EpisodeServiceGrpc.class) {
        if ((getGetManifestsMethod = EpisodeServiceGrpc.getGetManifestsMethod) == null) {
          EpisodeServiceGrpc.getGetManifestsMethod = getGetManifestsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest, yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetManifests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EpisodeServiceMethodDescriptorSupplier("GetManifests"))
              .build();
        }
      }
    }
    return getGetManifestsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EpisodeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceStub>() {
        @java.lang.Override
        public EpisodeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpisodeServiceStub(channel, callOptions);
        }
      };
    return EpisodeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EpisodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceBlockingStub>() {
        @java.lang.Override
        public EpisodeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpisodeServiceBlockingStub(channel, callOptions);
        }
      };
    return EpisodeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EpisodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpisodeServiceFutureStub>() {
        @java.lang.Override
        public EpisodeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpisodeServiceFutureStub(channel, callOptions);
        }
      };
    return EpisodeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Episode management service.
   * Provides methods for creating, retrieving, updating, and deleting episodes,
   * which represent specific time segments of streams
   * that can be individually accessed, managed, and published.
   * </pre>
   */
  public static abstract class EpisodeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves detailed information about a specific episode by its ID.
     * Returns all episode metadata, status, and related information.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all episodes associated with a specific stream or stream line with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves multiple episodes by their IDs in a specific channel in a single request.
     * This is more efficient than making multiple Get requests when retrieving several episodes.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new episode associated with a stream or stream line.
     * Episodes can be configured with various settings including title, description,
     * time boundaries, and access rights.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing episode's metadata and settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific episode by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes multiple episodes associated with a specific stream or stream line in a single request.
     * This is more efficient than making multiple Delete requests when removing several episodes.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Performs a specific action on an episode, such as publishing or unpublishing.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a player URL for watching the episode.
     * The URL can include player parameters such as autoplay, mute, and visibility of interface controls.
     * For episodes with signed URL access, an expiration duration can be specified.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the manifest URLs for the episode's media content.
     * Manifests provide players with necessary information
     * for streaming the content with different quality levels and formats.
     * </pre>
     */
    public void getManifests(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetManifestsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest,
                yandex.cloud.api.video.v1.EpisodeOuterClass.Episode>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest,
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest,
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse>(
                  this, METHODID_BATCH_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_DELETE)))
          .addMethod(
            getPerformActionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PERFORM_ACTION)))
          .addMethod(
            getGetPlayerURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest,
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse>(
                  this, METHODID_GET_PLAYER_URL)))
          .addMethod(
            getGetManifestsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest,
                yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse>(
                  this, METHODID_GET_MANIFESTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Episode management service.
   * Provides methods for creating, retrieving, updating, and deleting episodes,
   * which represent specific time segments of streams
   * that can be individually accessed, managed, and published.
   * </pre>
   */
  public static final class EpisodeServiceStub extends io.grpc.stub.AbstractAsyncStub<EpisodeServiceStub> {
    private EpisodeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpisodeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpisodeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific episode by its ID.
     * Returns all episode metadata, status, and related information.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all episodes associated with a specific stream or stream line with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves multiple episodes by their IDs in a specific channel in a single request.
     * This is more efficient than making multiple Get requests when retrieving several episodes.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new episode associated with a stream or stream line.
     * Episodes can be configured with various settings including title, description,
     * time boundaries, and access rights.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing episode's metadata and settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific episode by its ID.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes multiple episodes associated with a specific stream or stream line in a single request.
     * This is more efficient than making multiple Delete requests when removing several episodes.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Performs a specific action on an episode, such as publishing or unpublishing.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a player URL for watching the episode.
     * The URL can include player parameters such as autoplay, mute, and visibility of interface controls.
     * For episodes with signed URL access, an expiration duration can be specified.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the manifest URLs for the episode's media content.
     * Manifests provide players with necessary information
     * for streaming the content with different quality levels and formats.
     * </pre>
     */
    public void getManifests(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetManifestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Episode management service.
   * Provides methods for creating, retrieving, updating, and deleting episodes,
   * which represent specific time segments of streams
   * that can be individually accessed, managed, and published.
   * </pre>
   */
  public static final class EpisodeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EpisodeServiceBlockingStub> {
    private EpisodeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpisodeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpisodeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific episode by its ID.
     * Returns all episode metadata, status, and related information.
     * </pre>
     */
    public yandex.cloud.api.video.v1.EpisodeOuterClass.Episode get(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all episodes associated with a specific stream or stream line with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse list(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves multiple episodes by their IDs in a specific channel in a single request.
     * This is more efficient than making multiple Get requests when retrieving several episodes.
     * </pre>
     */
    public yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse batchGet(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new episode associated with a stream or stream line.
     * Episodes can be configured with various settings including title, description,
     * time boundaries, and access rights.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing episode's metadata and settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a specific episode by its ID.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes multiple episodes associated with a specific stream or stream line in a single request.
     * This is more efficient than making multiple Delete requests when removing several episodes.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchDelete(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Performs a specific action on an episode, such as publishing or unpublishing.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation performAction(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a player URL for watching the episode.
     * The URL can include player parameters such as autoplay, mute, and visibility of interface controls.
     * For episodes with signed URL access, an expiration duration can be specified.
     * </pre>
     */
    public yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse getPlayerURL(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the manifest URLs for the episode's media content.
     * Manifests provide players with necessary information
     * for streaming the content with different quality levels and formats.
     * </pre>
     */
    public yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse getManifests(yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetManifestsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Episode management service.
   * Provides methods for creating, retrieving, updating, and deleting episodes,
   * which represent specific time segments of streams
   * that can be individually accessed, managed, and published.
   * </pre>
   */
  public static final class EpisodeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EpisodeServiceFutureStub> {
    private EpisodeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpisodeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpisodeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific episode by its ID.
     * Returns all episode metadata, status, and related information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.EpisodeOuterClass.Episode> get(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all episodes associated with a specific stream or stream line with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse> list(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves multiple episodes by their IDs in a specific channel in a single request.
     * This is more efficient than making multiple Get requests when retrieving several episodes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse> batchGet(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new episode associated with a stream or stream line.
     * Episodes can be configured with various settings including title, description,
     * time boundaries, and access rights.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing episode's metadata and settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a specific episode by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes multiple episodes associated with a specific stream or stream line in a single request.
     * This is more efficient than making multiple Delete requests when removing several episodes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchDelete(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Performs a specific action on an episode, such as publishing or unpublishing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> performAction(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a player URL for watching the episode.
     * The URL can include player parameters such as autoplay, mute, and visibility of interface controls.
     * For episodes with signed URL access, an expiration duration can be specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse> getPlayerURL(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the manifest URLs for the episode's media content.
     * Manifests provide players with necessary information
     * for streaming the content with different quality levels and formats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse> getManifests(
        yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetManifestsMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_PLAYER_URL = 8;
  private static final int METHODID_GET_MANIFESTS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EpisodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EpisodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeOuterClass.Episode>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.ListEpisodesResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET:
          serviceImpl.batchGet((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchGetEpisodesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.CreateEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.UpdateEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.DeleteEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.BatchDeleteEpisodesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PERFORM_ACTION:
          serviceImpl.performAction((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.PerformEpisodeActionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PLAYER_URL:
          serviceImpl.getPlayerURL((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodePlayerURLResponse>) responseObserver);
          break;
        case METHODID_GET_MANIFESTS:
          serviceImpl.getManifests((yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.EpisodeServiceOuterClass.GetEpisodeManifestsResponse>) responseObserver);
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

  private static abstract class EpisodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EpisodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.EpisodeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EpisodeService");
    }
  }

  private static final class EpisodeServiceFileDescriptorSupplier
      extends EpisodeServiceBaseDescriptorSupplier {
    EpisodeServiceFileDescriptorSupplier() {}
  }

  private static final class EpisodeServiceMethodDescriptorSupplier
      extends EpisodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EpisodeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EpisodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EpisodeServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getBatchGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchDeleteMethod())
              .addMethod(getPerformActionMethod())
              .addMethod(getGetPlayerURLMethod())
              .addMethod(getGetManifestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
