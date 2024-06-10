package com.pedror.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.63.0)", comments = "Source: musica.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MusicaServiceGrpc {

    private MusicaServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "musica.MusicaService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetUsuarios", requestType = com.pedror.grpc.Vazio.class, responseType = com.pedror.grpc.GetUsuariosResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod;
        if ((getGetUsuariosMethod = MusicaServiceGrpc.getGetUsuariosMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetUsuariosMethod = MusicaServiceGrpc.getGetUsuariosMethod) == null) {
                    MusicaServiceGrpc.getGetUsuariosMethod = getGetUsuariosMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsuarios")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.Vazio.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetUsuariosResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetUsuarios")).build();
                }
            }
        }
        return getGetUsuariosMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetMusicas", requestType = com.pedror.grpc.Vazio.class, responseType = com.pedror.grpc.GetMusicasResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod;
        if ((getGetMusicasMethod = MusicaServiceGrpc.getGetMusicasMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetMusicasMethod = MusicaServiceGrpc.getGetMusicasMethod) == null) {
                    MusicaServiceGrpc.getGetMusicasMethod = getGetMusicasMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMusicas")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.Vazio.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetMusicas")).build();
                }
            }
        }
        return getGetMusicasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetPlaylistsDoUsuario", requestType = com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao.class, responseType = com.pedror.grpc.GetPlaylistDoUsuarioResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod;
        if ((getGetPlaylistsDoUsuarioMethod = MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetPlaylistsDoUsuarioMethod = MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod) == null) {
                    MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod = getGetPlaylistsDoUsuarioMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaylistsDoUsuario")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistDoUsuarioResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetPlaylistsDoUsuario")).build();
                }
            }
        }
        return getGetPlaylistsDoUsuarioMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetMusicasDaPlaylist", requestType = com.pedror.grpc.GetMusicasDaPlaylistRequisicao.class, responseType = com.pedror.grpc.GetMusicasDaPlaylistResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod;
        if ((getGetMusicasDaPlaylistMethod = MusicaServiceGrpc.getGetMusicasDaPlaylistMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetMusicasDaPlaylistMethod = MusicaServiceGrpc.getGetMusicasDaPlaylistMethod) == null) {
                    MusicaServiceGrpc.getGetMusicasDaPlaylistMethod = getGetMusicasDaPlaylistMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMusicasDaPlaylist")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasDaPlaylistRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasDaPlaylistResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetMusicasDaPlaylist")).build();
                }
            }
        }
        return getGetMusicasDaPlaylistMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetPlaylistsComMusica", requestType = com.pedror.grpc.GetPlaylistsComMusicaRequisicao.class, responseType = com.pedror.grpc.GetPlaylistsComMusicaResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod;
        if ((getGetPlaylistsComMusicaMethod = MusicaServiceGrpc.getGetPlaylistsComMusicaMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetPlaylistsComMusicaMethod = MusicaServiceGrpc.getGetPlaylistsComMusicaMethod) == null) {
                    MusicaServiceGrpc.getGetPlaylistsComMusicaMethod = getGetPlaylistsComMusicaMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaylistsComMusica")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsComMusicaRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsComMusicaResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetPlaylistsComMusica")).build();
                }
            }
        }
        return getGetPlaylistsComMusicaMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MusicaServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceStub>() {

            @java.lang.Override
            public MusicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceStub(channel, callOptions);
            }
        };
        return MusicaServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MusicaServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceBlockingStub>() {

            @java.lang.Override
            public MusicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceBlockingStub(channel, callOptions);
            }
        };
        return MusicaServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MusicaServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceFutureStub>() {

            @java.lang.Override
            public MusicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceFutureStub(channel, callOptions);
            }
        };
        return MusicaServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void getUsuarios(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsuariosMethod(), responseObserver);
        }

        /**
         */
        default void getMusicas(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMusicasMethod(), responseObserver);
        }

        /**
         */
        default void getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaylistsDoUsuarioMethod(), responseObserver);
        }

        /**
         */
        default void getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMusicasDaPlaylistMethod(), responseObserver);
        }

        /**
         */
        default void getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaylistsComMusicaMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service MusicaService.
     */
    public static abstract class MusicaServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MusicaServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service MusicaService.
     */
    public static class MusicaServiceStub extends io.grpc.stub.AbstractAsyncStub<MusicaServiceStub> {

        private MusicaServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceStub(channel, callOptions);
        }

        /**
         */
        public void getUsuarios(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetUsuariosMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getMusicas(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMusicasMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPlaylistsDoUsuarioMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMusicasDaPlaylistMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPlaylistsComMusicaMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service MusicaService.
     */
    public static class MusicaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MusicaServiceBlockingStub> {

        private MusicaServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.pedror.grpc.GetUsuariosResposta getUsuarios(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetUsuariosMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetMusicasResposta getMusicas(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMusicasMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetPlaylistDoUsuarioResposta getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPlaylistsDoUsuarioMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetMusicasDaPlaylistResposta getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMusicasDaPlaylistMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetPlaylistsComMusicaResposta getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPlaylistsComMusicaMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service MusicaService.
     */
    public static class MusicaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MusicaServiceFutureStub> {

        private MusicaServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetUsuariosMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMusicasMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetPlaylistsDoUsuarioMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMusicasDaPlaylistMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetPlaylistsComMusicaMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_USUARIOS = 0;

    private static final int METHODID_GET_MUSICAS = 1;

    private static final int METHODID_GET_PLAYLISTS_DO_USUARIO = 2;

    private static final int METHODID_GET_MUSICAS_DA_PLAYLIST = 3;

    private static final int METHODID_GET_PLAYLISTS_COM_MUSICA = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_USUARIOS:
                    serviceImpl.getUsuarios((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta>) responseObserver);
                    break;
                case METHODID_GET_MUSICAS:
                    serviceImpl.getMusicas((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta>) responseObserver);
                    break;
                case METHODID_GET_PLAYLISTS_DO_USUARIO:
                    serviceImpl.getPlaylistsDoUsuario((com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta>) responseObserver);
                    break;
                case METHODID_GET_MUSICAS_DA_PLAYLIST:
                    serviceImpl.getMusicasDaPlaylist((com.pedror.grpc.GetMusicasDaPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta>) responseObserver);
                    break;
                case METHODID_GET_PLAYLISTS_COM_MUSICA:
                    serviceImpl.getPlaylistsComMusica((com.pedror.grpc.GetPlaylistsComMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGetUsuariosMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>(service, METHODID_GET_USUARIOS))).addMethod(getGetMusicasMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>(service, METHODID_GET_MUSICAS))).addMethod(getGetPlaylistsDoUsuarioMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>(service, METHODID_GET_PLAYLISTS_DO_USUARIO))).addMethod(getGetMusicasDaPlaylistMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>(service, METHODID_GET_MUSICAS_DA_PLAYLIST))).addMethod(getGetPlaylistsComMusicaMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>(service, METHODID_GET_PLAYLISTS_COM_MUSICA))).build();
    }

    private static abstract class MusicaServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MusicaServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.pedror.grpc.MusicasGrpcProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MusicaService");
        }
    }

    private static final class MusicaServiceFileDescriptorSupplier extends MusicaServiceBaseDescriptorSupplier {

        MusicaServiceFileDescriptorSupplier() {
        }
    }

    private static final class MusicaServiceMethodDescriptorSupplier extends MusicaServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MusicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (MusicaServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MusicaServiceFileDescriptorSupplier()).addMethod(getGetUsuariosMethod()).addMethod(getGetMusicasMethod()).addMethod(getGetPlaylistsDoUsuarioMethod()).addMethod(getGetMusicasDaPlaylistMethod()).addMethod(getGetPlaylistsComMusicaMethod()).build();
                }
            }
        }
        return result;
    }
}
