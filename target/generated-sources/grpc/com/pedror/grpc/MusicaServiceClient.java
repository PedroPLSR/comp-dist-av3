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
}
