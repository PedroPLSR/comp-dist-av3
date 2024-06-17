package com.pedror.grpc;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: musica.proto")
public class MusicaServiceClient implements MusicaService, MutinyClient<MutinyMusicaServiceGrpc.MutinyMusicaServiceStub> {

    private final MutinyMusicaServiceGrpc.MutinyMusicaServiceStub stub;

    public MusicaServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMusicaServiceGrpc.MutinyMusicaServiceStub, MutinyMusicaServiceGrpc.MutinyMusicaServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMusicaServiceGrpc.newMutinyStub(channel));
    }

    private MusicaServiceClient(MutinyMusicaServiceGrpc.MutinyMusicaServiceStub stub) {
        this.stub = stub;
    }

    public MusicaServiceClient newInstanceWithStub(MutinyMusicaServiceGrpc.MutinyMusicaServiceStub stub) {
        return new MusicaServiceClient(stub);
    }

    @Override
    public MutinyMusicaServiceGrpc.MutinyMusicaServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
        return stub.getUsuarios(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
        return stub.getMusicas(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
        return stub.getPlaylistsDoUsuario(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
        return stub.getMusicasDaPlaylist(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
        return stub.getPlaylistsComMusica(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
        return stub.criarUsuario(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
        return stub.criarMusica(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
        return stub.criarPlaylist(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
        return stub.atualizarUsuario(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
        return stub.atualizarMusica(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
        return stub.atualizarPlaylist(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
        return stub.deletarUsuario(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
        return stub.deletarMusica(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
        return stub.deletarPlaylist(request);
    }
}
