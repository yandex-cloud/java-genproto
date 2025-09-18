package yandex.cloud.api.organizationmanager.v1.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing users in the Identity Provider system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> getGetMethod;
    if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMethod = UserServiceGrpc.getGetMethod) == null) {
          UserServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest, yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> getListMethod;
    if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListMethod = UserServiceGrpc.getListMethod) == null) {
          UserServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMethod = UserServiceGrpc.getCreateMethod) == null) {
          UserServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMethod = UserServiceGrpc.getUpdateMethod) == null) {
          UserServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMethod = UserServiceGrpc.getDeleteMethod) == null) {
          UserServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOwnPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOwnPassword",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOwnPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOwnPasswordMethod;
    if ((getSetOwnPasswordMethod = UserServiceGrpc.getSetOwnPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetOwnPasswordMethod = UserServiceGrpc.getSetOwnPasswordMethod) == null) {
          UserServiceGrpc.getSetOwnPasswordMethod = getSetOwnPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOwnPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SetOwnPassword"))
              .build();
        }
      }
    }
    return getSetOwnPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOthersPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOthersPassword",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOthersPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetOthersPasswordMethod;
    if ((getSetOthersPasswordMethod = UserServiceGrpc.getSetOthersPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetOthersPasswordMethod = UserServiceGrpc.getSetOthersPasswordMethod) == null) {
          UserServiceGrpc.getSetOthersPasswordMethod = getSetOthersPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOthersPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SetOthersPassword"))
              .build();
        }
      }
    }
    return getSetOthersPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suspend",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;
    if ((getSuspendMethod = UserServiceGrpc.getSuspendMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSuspendMethod = UserServiceGrpc.getSuspendMethod) == null) {
          UserServiceGrpc.getSuspendMethod = getSuspendMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suspend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Suspend"))
              .build();
        }
      }
    }
    return getSuspendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reactivate",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod;
    if ((getReactivateMethod = UserServiceGrpc.getReactivateMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getReactivateMethod = UserServiceGrpc.getReactivateMethod) == null) {
          UserServiceGrpc.getReactivateMethod = getReactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Reactivate"))
              .build();
        }
      }
    }
    return getReactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> getGeneratePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeneratePassword",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> getGeneratePasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> getGeneratePasswordMethod;
    if ((getGeneratePasswordMethod = UserServiceGrpc.getGeneratePasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGeneratePasswordMethod = UserServiceGrpc.getGeneratePasswordMethod) == null) {
          UserServiceGrpc.getGeneratePasswordMethod = getGeneratePasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneratePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GeneratePassword"))
              .build();
        }
      }
    }
    return getGeneratePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> getGetSelfPasswordMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSelfPasswordMetadata",
      requestType = com.google.protobuf.Empty.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> getGetSelfPasswordMetadataMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> getGetSelfPasswordMetadataMethod;
    if ((getGetSelfPasswordMetadataMethod = UserServiceGrpc.getGetSelfPasswordMetadataMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetSelfPasswordMetadataMethod = UserServiceGrpc.getGetSelfPasswordMetadataMethod) == null) {
          UserServiceGrpc.getGetSelfPasswordMetadataMethod = getGetSelfPasswordMetadataMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSelfPasswordMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetSelfPasswordMetadata"))
              .build();
        }
      }
    }
    return getGetSelfPasswordMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertToExternal",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod;
    if ((getConvertToExternalMethod = UserServiceGrpc.getConvertToExternalMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getConvertToExternalMethod = UserServiceGrpc.getConvertToExternalMethod) == null) {
          UserServiceGrpc.getConvertToExternalMethod = getConvertToExternalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertToExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ConvertToExternal"))
              .build();
        }
      }
    }
    return getConvertToExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPasswordHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPasswordHash",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPasswordHashMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPasswordHashMethod;
    if ((getSetPasswordHashMethod = UserServiceGrpc.getSetPasswordHashMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetPasswordHashMethod = UserServiceGrpc.getSetPasswordHashMethod) == null) {
          UserServiceGrpc.getSetPasswordHashMethod = getSetPasswordHashMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPasswordHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SetPasswordHash"))
              .build();
        }
      }
    }
    return getSetPasswordHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> getResolveExternalIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveExternalIds",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> getResolveExternalIdsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> getResolveExternalIdsMethod;
    if ((getResolveExternalIdsMethod = UserServiceGrpc.getResolveExternalIdsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getResolveExternalIdsMethod = UserServiceGrpc.getResolveExternalIdsMethod) == null) {
          UserServiceGrpc.getResolveExternalIdsMethod = getResolveExternalIdsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveExternalIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ResolveExternalIds"))
              .build();
        }
      }
    }
    return getResolveExternalIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing users in the Identity Provider system.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified user.
     * To get the list of available users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of users in the specified userpool.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a user in the specified userpool.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the password for the authenticated user.
     * </pre>
     */
    public void setOwnPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOwnPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the password for another user.
     * </pre>
     */
    public void setOthersPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOthersPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspends the specified user.
     * </pre>
     */
    public void suspend(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reactivates a previously suspended user.
     * </pre>
     */
    public void reactivate(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReactivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a new password.
     * </pre>
     */
    public void generatePassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneratePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns metadata about the authenticated user's password.
     * </pre>
     */
    public void getSelfPasswordMetadata(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSelfPasswordMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Converts a user to use external authentication.
     * </pre>
     */
    public void convertToExternal(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertToExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets a password hash for the specified user.
     * </pre>
     */
    public void setPasswordHash(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resolves external IDs to internal user IDs.
     * </pre>
     */
    public void resolveExternalIds(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveExternalIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getSetOwnPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_OWN_PASSWORD)))
          .addMethod(
            getSetOthersPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_OTHERS_PASSWORD)))
          .addMethod(
            getSuspendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SUSPEND)))
          .addMethod(
            getReactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REACTIVATE)))
          .addMethod(
            getGeneratePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse>(
                  this, METHODID_GENERATE_PASSWORD)))
          .addMethod(
            getGetSelfPasswordMetadataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata>(
                  this, METHODID_GET_SELF_PASSWORD_METADATA)))
          .addMethod(
            getConvertToExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CONVERT_TO_EXTERNAL)))
          .addMethod(
            getSetPasswordHashMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_PASSWORD_HASH)))
          .addMethod(
            getResolveExternalIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse>(
                  this, METHODID_RESOLVE_EXTERNAL_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing users in the Identity Provider system.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified user.
     * To get the list of available users, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of users in the specified userpool.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a user in the specified userpool.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the password for the authenticated user.
     * </pre>
     */
    public void setOwnPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOwnPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the password for another user.
     * </pre>
     */
    public void setOthersPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOthersPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspends the specified user.
     * </pre>
     */
    public void suspend(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reactivates a previously suspended user.
     * </pre>
     */
    public void reactivate(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a new password.
     * </pre>
     */
    public void generatePassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeneratePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns metadata about the authenticated user's password.
     * </pre>
     */
    public void getSelfPasswordMetadata(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSelfPasswordMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Converts a user to use external authentication.
     * </pre>
     */
    public void convertToExternal(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertToExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets a password hash for the specified user.
     * </pre>
     */
    public void setPasswordHash(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resolves external IDs to internal user IDs.
     * </pre>
     */
    public void resolveExternalIds(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveExternalIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing users in the Identity Provider system.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified user.
     * To get the list of available users, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User get(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of users in the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse list(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a user in the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the password for the authenticated user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setOwnPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOwnPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the password for another user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setOthersPassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOthersPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspends the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation suspend(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reactivates a previously suspended user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reactivate(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReactivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a new password.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse generatePassword(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeneratePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns metadata about the authenticated user's password.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata getSelfPasswordMetadata(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSelfPasswordMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Converts a user to use external authentication.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation convertToExternal(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertToExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets a password hash for the specified user.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setPasswordHash(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resolves external IDs to internal user IDs.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse resolveExternalIds(yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveExternalIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing users in the Identity Provider system.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified user.
     * To get the list of available users, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User> get(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of users in the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse> list(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a user in the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the password for the authenticated user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setOwnPassword(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOwnPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the password for another user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setOthersPassword(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOthersPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspends the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> suspend(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reactivates a previously suspended user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reactivate(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReactivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a new password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse> generatePassword(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeneratePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns metadata about the authenticated user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata> getSelfPasswordMetadata(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSelfPasswordMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Converts a user to use external authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> convertToExternal(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertToExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets a password hash for the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setPasswordHash(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resolves external IDs to internal user IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse> resolveExternalIds(
        yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveExternalIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_SET_OWN_PASSWORD = 5;
  private static final int METHODID_SET_OTHERS_PASSWORD = 6;
  private static final int METHODID_SUSPEND = 7;
  private static final int METHODID_REACTIVATE = 8;
  private static final int METHODID_GENERATE_PASSWORD = 9;
  private static final int METHODID_GET_SELF_PASSWORD_METADATA = 10;
  private static final int METHODID_CONVERT_TO_EXTERNAL = 11;
  private static final int METHODID_SET_PASSWORD_HASH = 12;
  private static final int METHODID_RESOLVE_EXTERNAL_IDS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_OWN_PASSWORD:
          serviceImpl.setOwnPassword((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOwnPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_OTHERS_PASSWORD:
          serviceImpl.setOthersPassword((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetOthersPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SUSPEND:
          serviceImpl.suspend((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SuspendUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REACTIVATE:
          serviceImpl.reactivate((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ReactivateUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_PASSWORD:
          serviceImpl.generatePassword((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.GeneratePasswordResponse>) responseObserver);
          break;
        case METHODID_GET_SELF_PASSWORD_METADATA:
          serviceImpl.getSelfPasswordMetadata((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.PasswordMetadata>) responseObserver);
          break;
        case METHODID_CONVERT_TO_EXTERNAL:
          serviceImpl.convertToExternal((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ConvertToExternalUserRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_PASSWORD_HASH:
          serviceImpl.setPasswordHash((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.SetPasswordHashRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESOLVE_EXTERNAL_IDS:
          serviceImpl.resolveExternalIds((yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.ResolveExternalIdsResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSetOwnPasswordMethod())
              .addMethod(getSetOthersPasswordMethod())
              .addMethod(getSuspendMethod())
              .addMethod(getReactivateMethod())
              .addMethod(getGeneratePasswordMethod())
              .addMethod(getGetSelfPasswordMetadataMethod())
              .addMethod(getConvertToExternalMethod())
              .addMethod(getSetPasswordHashMethod())
              .addMethod(getResolveExternalIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
