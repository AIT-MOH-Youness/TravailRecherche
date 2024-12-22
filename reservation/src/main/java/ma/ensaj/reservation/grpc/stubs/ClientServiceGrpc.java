package ma.ensaj.reservation.grpc.stubs;

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
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateClientRequest,
      ma.ensaj.reservation.grpc.stubs.CreateClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = ma.ensaj.reservation.grpc.stubs.CreateClientRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.CreateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateClientRequest,
      ma.ensaj.reservation.grpc.stubs.CreateClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateClientRequest, ma.ensaj.reservation.grpc.stubs.CreateClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
          ClientServiceGrpc.getCreateClientMethod = getCreateClientMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.CreateClientRequest, ma.ensaj.reservation.grpc.stubs.CreateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.CreateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.CreateClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateClient"))
                  .build();
          }
        }
     }
     return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetClientRequest,
      ma.ensaj.reservation.grpc.stubs.GetClientResponse> getGetClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClient",
      requestType = ma.ensaj.reservation.grpc.stubs.GetClientRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.GetClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetClientRequest,
      ma.ensaj.reservation.grpc.stubs.GetClientResponse> getGetClientMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetClientRequest, ma.ensaj.reservation.grpc.stubs.GetClientResponse> getGetClientMethod;
    if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
          ClientServiceGrpc.getGetClientMethod = getGetClientMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.GetClientRequest, ma.ensaj.reservation.grpc.stubs.GetClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClient"))
                  .build();
          }
        }
     }
     return getGetClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateClientRequest,
      ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = ma.ensaj.reservation.grpc.stubs.UpdateClientRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateClientRequest,
      ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateClientRequest, ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.UpdateClientRequest, ma.ensaj.reservation.grpc.stubs.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.UpdateClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClient"))
                  .build();
          }
        }
     }
     return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteClientRequest,
      ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClient",
      requestType = ma.ensaj.reservation.grpc.stubs.DeleteClientRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteClientRequest,
      ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteClientRequest, ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
          ClientServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.DeleteClientRequest, ma.ensaj.reservation.grpc.stubs.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "DeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.DeleteClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest,
      ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> getGetAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllClients",
      requestType = ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest,
      ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> getGetAllClientsMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest, ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> getGetAllClientsMethod;
    if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
          ClientServiceGrpc.getGetAllClientsMethod = getGetAllClientsMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest, ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetAllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetAllClients"))
                  .build();
          }
        }
     }
     return getGetAllClientsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createClient(ma.ensaj.reservation.grpc.stubs.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     */
    public void getClient(ma.ensaj.reservation.grpc.stubs.GetClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientMethod(), responseObserver);
    }

    /**
     */
    public void updateClient(ma.ensaj.reservation.grpc.stubs.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(ma.ensaj.reservation.grpc.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    /**
     */
    public void getAllClients(ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllClientsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.CreateClientRequest,
                ma.ensaj.reservation.grpc.stubs.CreateClientResponse>(
                  this, METHODID_CREATE_CLIENT)))
          .addMethod(
            getGetClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.GetClientRequest,
                ma.ensaj.reservation.grpc.stubs.GetClientResponse>(
                  this, METHODID_GET_CLIENT)))
          .addMethod(
            getUpdateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.UpdateClientRequest,
                ma.ensaj.reservation.grpc.stubs.UpdateClientResponse>(
                  this, METHODID_UPDATE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.DeleteClientRequest,
                ma.ensaj.reservation.grpc.stubs.DeleteClientResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .addMethod(
            getGetAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest,
                ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse>(
                  this, METHODID_GET_ALL_CLIENTS)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void createClient(ma.ensaj.reservation.grpc.stubs.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClient(ma.ensaj.reservation.grpc.stubs.GetClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(ma.ensaj.reservation.grpc.stubs.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(ma.ensaj.reservation.grpc.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllClients(ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.CreateClientResponse createClient(ma.ensaj.reservation.grpc.stubs.CreateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.GetClientResponse getClient(ma.ensaj.reservation.grpc.stubs.GetClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.UpdateClientResponse updateClient(ma.ensaj.reservation.grpc.stubs.UpdateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.DeleteClientResponse deleteClient(ma.ensaj.reservation.grpc.stubs.DeleteClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse getAllClients(ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllClientsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.CreateClientResponse> createClient(
        ma.ensaj.reservation.grpc.stubs.CreateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.GetClientResponse> getClient(
        ma.ensaj.reservation.grpc.stubs.GetClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.UpdateClientResponse> updateClient(
        ma.ensaj.reservation.grpc.stubs.UpdateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.DeleteClientResponse> deleteClient(
        ma.ensaj.reservation.grpc.stubs.DeleteClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse> getAllClients(
        ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLIENT = 0;
  private static final int METHODID_GET_CLIENT = 1;
  private static final int METHODID_UPDATE_CLIENT = 2;
  private static final int METHODID_DELETE_CLIENT = 3;
  private static final int METHODID_GET_ALL_CLIENTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((ma.ensaj.reservation.grpc.stubs.CreateClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateClientResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT:
          serviceImpl.getClient((ma.ensaj.reservation.grpc.stubs.GetClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((ma.ensaj.reservation.grpc.stubs.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((ma.ensaj.reservation.grpc.stubs.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteClientResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CLIENTS:
          serviceImpl.getAllClients((ma.ensaj.reservation.grpc.stubs.GetAllClientsRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllClientsResponse>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getCreateClientMethod())
              .addMethod(getGetClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientMethod())
              .addMethod(getGetAllClientsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
