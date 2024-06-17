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

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::criarUsuario);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::criarMusica);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::criarPlaylist);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::atualizarUsuario);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::atualizarMusica);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::atualizarPlaylist);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deletarUsuario);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deletarMusica);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deletarPlaylist);
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

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetUsuariosMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>(this, METHODID_GET_USUARIOS, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetMusicasMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>(this, METHODID_GET_MUSICAS, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>(this, METHODID_GET_PLAYLISTS_DO_USUARIO, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetMusicasDaPlaylistMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>(this, METHODID_GET_MUSICAS_DA_PLAYLIST, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getGetPlaylistsComMusicaMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>(this, METHODID_GET_PLAYLISTS_COM_MUSICA, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getCriarUsuarioMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta>(this, METHODID_CRIAR_USUARIO, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getCriarMusicaMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta>(this, METHODID_CRIAR_MUSICA, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getCriarPlaylistMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta>(this, METHODID_CRIAR_PLAYLIST, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getAtualizarUsuarioMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta>(this, METHODID_ATUALIZAR_USUARIO, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getAtualizarMusicaMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta>(this, METHODID_ATUALIZAR_MUSICA, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getAtualizarPlaylistMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta>(this, METHODID_ATUALIZAR_PLAYLIST, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getDeletarUsuarioMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta>(this, METHODID_DELETAR_USUARIO, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getDeletarMusicaMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta>(this, METHODID_DELETAR_MUSICA, compression))).addMethod(com.pedror.grpc.MusicaServiceGrpc.getDeletarPlaylistMethod(), asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta>(this, METHODID_DELETAR_PLAYLIST, compression))).build();
        }
    }

    private static final int METHODID_GET_USUARIOS = 0;

    private static final int METHODID_GET_MUSICAS = 1;

    private static final int METHODID_GET_PLAYLISTS_DO_USUARIO = 2;

    private static final int METHODID_GET_MUSICAS_DA_PLAYLIST = 3;

    private static final int METHODID_GET_PLAYLISTS_COM_MUSICA = 4;

    private static final int METHODID_CRIAR_USUARIO = 5;

    private static final int METHODID_CRIAR_MUSICA = 6;

    private static final int METHODID_CRIAR_PLAYLIST = 7;

    private static final int METHODID_ATUALIZAR_USUARIO = 8;

    private static final int METHODID_ATUALIZAR_MUSICA = 9;

    private static final int METHODID_ATUALIZAR_PLAYLIST = 10;

    private static final int METHODID_DELETAR_USUARIO = 11;

    private static final int METHODID_DELETAR_MUSICA = 12;

    private static final int METHODID_DELETAR_PLAYLIST = 13;

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
                case METHODID_CRIAR_USUARIO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.CriarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarUsuarioResposta>) responseObserver, compression, serviceImpl::criarUsuario);
                    break;
                case METHODID_CRIAR_MUSICA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.CriarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarMusicaResposta>) responseObserver, compression, serviceImpl::criarMusica);
                    break;
                case METHODID_CRIAR_PLAYLIST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.CriarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarPlaylistResposta>) responseObserver, compression, serviceImpl::criarPlaylist);
                    break;
                case METHODID_ATUALIZAR_USUARIO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.AtualizarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarUsuarioResposta>) responseObserver, compression, serviceImpl::atualizarUsuario);
                    break;
                case METHODID_ATUALIZAR_MUSICA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.AtualizarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarMusicaResposta>) responseObserver, compression, serviceImpl::atualizarMusica);
                    break;
                case METHODID_ATUALIZAR_PLAYLIST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.AtualizarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarPlaylistResposta>) responseObserver, compression, serviceImpl::atualizarPlaylist);
                    break;
                case METHODID_DELETAR_USUARIO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.DeletarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarUsuarioResposta>) responseObserver, compression, serviceImpl::deletarUsuario);
                    break;
                case METHODID_DELETAR_MUSICA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.DeletarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarMusicaResposta>) responseObserver, compression, serviceImpl::deletarMusica);
                    break;
                case METHODID_DELETAR_PLAYLIST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.pedror.grpc.DeletarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarPlaylistResposta>) responseObserver, compression, serviceImpl::deletarPlaylist);
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
