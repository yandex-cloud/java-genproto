package yandex.cloud.api.datasphere.v1;

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
 * <pre>
 * A set of methods for managing Project resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/datasphere/v1/project_service.proto")
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v1.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
          ProjectServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
          ProjectServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
          ProjectServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod;
    if ((getOpenMethod = ProjectServiceGrpc.getOpenMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getOpenMethod = ProjectServiceGrpc.getOpenMethod) == null) {
          ProjectServiceGrpc.getOpenMethod = getOpenMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Open"))
                  .build();
          }
        }
     }
     return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest,
      yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest,
      yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest, yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> getGetMethod;
    if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
          ProjectServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest, yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest,
      yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest,
      yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest, yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> getListMethod;
    if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
          ProjectServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest, yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public void open(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists projects for the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_OPEN)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest,
                yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest,
                yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractStub<ProjectServiceStub> {
    private ProjectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public void open(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists projects for the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation open(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project get(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists projects for the specified folder.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse list(yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> open(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project> get(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists projects for the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse> list(
        yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_OPEN = 3;
  private static final int METHODID_GET = 4;
  private static final int METHODID_LIST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.UpdateProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.OpenProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.ListProjectsResponse>) responseObserver);
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

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v1.ProjectServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getOpenMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
