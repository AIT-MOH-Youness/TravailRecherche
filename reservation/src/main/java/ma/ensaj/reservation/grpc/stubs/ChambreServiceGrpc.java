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
public final class ChambreServiceGrpc {

  private ChambreServiceGrpc() {}

  public static final String SERVICE_NAME = "ChambreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateChambreRequest,
      ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> getCreateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChambre",
      requestType = ma.ensaj.reservation.grpc.stubs.CreateChambreRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.CreateChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateChambreRequest,
      ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> getCreateChambreMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.CreateChambreRequest, ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> getCreateChambreMethod;
    if ((getCreateChambreMethod = ChambreServiceGrpc.getCreateChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getCreateChambreMethod = ChambreServiceGrpc.getCreateChambreMethod) == null) {
          ChambreServiceGrpc.getCreateChambreMethod = getCreateChambreMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.CreateChambreRequest, ma.ensaj.reservation.grpc.stubs.CreateChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "CreateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.CreateChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.CreateChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("CreateChambre"))
                  .build();
          }
        }
     }
     return getCreateChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetChambreRequest,
      ma.ensaj.reservation.grpc.stubs.GetChambreResponse> getGetChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChambre",
      requestType = ma.ensaj.reservation.grpc.stubs.GetChambreRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.GetChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetChambreRequest,
      ma.ensaj.reservation.grpc.stubs.GetChambreResponse> getGetChambreMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetChambreRequest, ma.ensaj.reservation.grpc.stubs.GetChambreResponse> getGetChambreMethod;
    if ((getGetChambreMethod = ChambreServiceGrpc.getGetChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetChambreMethod = ChambreServiceGrpc.getGetChambreMethod) == null) {
          ChambreServiceGrpc.getGetChambreMethod = getGetChambreMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.GetChambreRequest, ma.ensaj.reservation.grpc.stubs.GetChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "GetChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("GetChambre"))
                  .build();
          }
        }
     }
     return getGetChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest,
      ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> getUpdateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateChambre",
      requestType = ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest,
      ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> getUpdateChambreMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest, ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> getUpdateChambreMethod;
    if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
          ChambreServiceGrpc.getUpdateChambreMethod = getUpdateChambreMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest, ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "UpdateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("UpdateChambre"))
                  .build();
          }
        }
     }
     return getUpdateChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest,
      ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> getDeleteChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChambre",
      requestType = ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest,
      ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> getDeleteChambreMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest, ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> getDeleteChambreMethod;
    if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
          ChambreServiceGrpc.getDeleteChambreMethod = getDeleteChambreMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest, ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "DeleteChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("DeleteChambre"))
                  .build();
          }
        }
     }
     return getDeleteChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest,
      ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> getGetAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllChambres",
      requestType = ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest.class,
      responseType = ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest,
      ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> getGetAllChambresMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest, ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> getGetAllChambresMethod;
    if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
          ChambreServiceGrpc.getGetAllChambresMethod = getGetAllChambresMethod = 
              io.grpc.MethodDescriptor.<ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest, ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "GetAllChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("GetAllChambres"))
                  .build();
          }
        }
     }
     return getGetAllChambresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChambreServiceStub newStub(io.grpc.Channel channel) {
    return new ChambreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChambreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChambreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChambreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChambreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChambreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createChambre(ma.ensaj.reservation.grpc.stubs.CreateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateChambreMethod(), responseObserver);
    }

    /**
     */
    public void getChambre(ma.ensaj.reservation.grpc.stubs.GetChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChambreMethod(), responseObserver);
    }

    /**
     */
    public void updateChambre(ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateChambreMethod(), responseObserver);
    }

    /**
     */
    public void deleteChambre(ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChambreMethod(), responseObserver);
    }

    /**
     */
    public void getAllChambres(ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllChambresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.CreateChambreRequest,
                ma.ensaj.reservation.grpc.stubs.CreateChambreResponse>(
                  this, METHODID_CREATE_CHAMBRE)))
          .addMethod(
            getGetChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.GetChambreRequest,
                ma.ensaj.reservation.grpc.stubs.GetChambreResponse>(
                  this, METHODID_GET_CHAMBRE)))
          .addMethod(
            getUpdateChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest,
                ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse>(
                  this, METHODID_UPDATE_CHAMBRE)))
          .addMethod(
            getDeleteChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest,
                ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse>(
                  this, METHODID_DELETE_CHAMBRE)))
          .addMethod(
            getGetAllChambresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest,
                ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse>(
                  this, METHODID_GET_ALL_CHAMBRES)))
          .build();
    }
  }

  /**
   */
  public static final class ChambreServiceStub extends io.grpc.stub.AbstractStub<ChambreServiceStub> {
    private ChambreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceStub(channel, callOptions);
    }

    /**
     */
    public void createChambre(ma.ensaj.reservation.grpc.stubs.CreateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChambre(ma.ensaj.reservation.grpc.stubs.GetChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateChambre(ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChambre(ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllChambres(ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChambreServiceBlockingStub extends io.grpc.stub.AbstractStub<ChambreServiceBlockingStub> {
    private ChambreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.CreateChambreResponse createChambre(ma.ensaj.reservation.grpc.stubs.CreateChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.GetChambreResponse getChambre(ma.ensaj.reservation.grpc.stubs.GetChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse updateChambre(ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse deleteChambre(ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse getAllChambres(ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllChambresMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChambreServiceFutureStub extends io.grpc.stub.AbstractStub<ChambreServiceFutureStub> {
    private ChambreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.CreateChambreResponse> createChambre(
        ma.ensaj.reservation.grpc.stubs.CreateChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.GetChambreResponse> getChambre(
        ma.ensaj.reservation.grpc.stubs.GetChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse> updateChambre(
        ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse> deleteChambre(
        ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse> getAllChambres(
        ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHAMBRE = 0;
  private static final int METHODID_GET_CHAMBRE = 1;
  private static final int METHODID_UPDATE_CHAMBRE = 2;
  private static final int METHODID_DELETE_CHAMBRE = 3;
  private static final int METHODID_GET_ALL_CHAMBRES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChambreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChambreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHAMBRE:
          serviceImpl.createChambre((ma.ensaj.reservation.grpc.stubs.CreateChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.CreateChambreResponse>) responseObserver);
          break;
        case METHODID_GET_CHAMBRE:
          serviceImpl.getChambre((ma.ensaj.reservation.grpc.stubs.GetChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetChambreResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CHAMBRE:
          serviceImpl.updateChambre((ma.ensaj.reservation.grpc.stubs.UpdateChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.UpdateChambreResponse>) responseObserver);
          break;
        case METHODID_DELETE_CHAMBRE:
          serviceImpl.deleteChambre((ma.ensaj.reservation.grpc.stubs.DeleteChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.DeleteChambreResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CHAMBRES:
          serviceImpl.getAllChambres((ma.ensaj.reservation.grpc.stubs.GetAllChambresRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.reservation.grpc.stubs.GetAllChambresResponse>) responseObserver);
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

  private static abstract class ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChambreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.ensaj.reservation.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChambreService");
    }
  }

  private static final class ChambreServiceFileDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier {
    ChambreServiceFileDescriptorSupplier() {}
  }

  private static final class ChambreServiceMethodDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChambreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChambreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChambreServiceFileDescriptorSupplier())
              .addMethod(getCreateChambreMethod())
              .addMethod(getGetChambreMethod())
              .addMethod(getUpdateChambreMethod())
              .addMethod(getDeleteChambreMethod())
              .addMethod(getGetAllChambresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
