package com.pedror.grpc;

import static com.pedror.grpc.MusicaServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: musica.proto")
public final class MutinyMusicaServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMusicaServiceGrpc() {
    }

    public static MutinyMusicaServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMusicaServiceStub(channel);
    }

    public static class MutinyMusicaServiceStub extends io.grpc.stub.AbstractStub<MutinyMusicaServiceStub> implements io.quarkus.grpc.MutinyStub {

        private MusicaServiceGrpc.MusicaServiceStub delegateStub;

        private MutinyMusicaServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MusicaServiceGrpc.newStub(channel);
        }

        private MutinyMusicaServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MusicaServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMusicaServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMusicaServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getUsuarios);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMusicas);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getPlaylistsDoUsuario);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMusicasDaPlaylist);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getPlaylistsComMusica);
        }
    }

    public static abstract class MusicaServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MusicaServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetUsuariosMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>(this, METHODID_GET_USUARIOS, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetMusicasMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>(this, METHODID_GET_MUSICAS, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>(this, METHODID_GET_PLAYLISTS_DO_USUARIO, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetMusicasDaPlaylistMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>(this, METHODID_GET_MUSICAS_DA_PLAYLIST, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetPlaylistsComMusicaMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>(this, METHODID_GET_PLAYLISTS_COM_MUSICA, compression))).build();
        }
    }

    private static final int METHODID_GET_USUARIOS = 0;

    private static final int METHODID_GET_MUSICAS = 1;

    private static final int METHODID_GET_PLAYLISTS_DO_USUARIO = 2;

    private static final int METHODID_GET_MUSICAS_DA_PLAYLIST = 3;

    private static final int METHODID_GET_PLAYLISTS_COM_MUSICA = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MusicaServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MusicaServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_USUARIOS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta>) responseObserver, compression, serviceImpl::getUsuarios);
                    break;
                case METHODID_GET_MUSICAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta>) responseObserver, compression, serviceImpl::getMusicas);
                    break;
                case METHODID_GET_PLAYLISTS_DO_USUARIO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta>) responseObserver, compression, serviceImpl::getPlaylistsDoUsuario);
                    break;
                case METHODID_GET_MUSICAS_DA_PLAYLIST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.GetMusicasDaPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta>) responseObserver, compression, serviceImpl::getMusicasDaPlaylist);
                    break;
                case METHODID_GET_PLAYLISTS_COM_MUSICA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.GetPlaylistsComMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta>) responseObserver, compression, serviceImpl::getPlaylistsComMusica);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
