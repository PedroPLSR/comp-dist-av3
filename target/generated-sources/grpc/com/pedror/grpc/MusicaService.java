package com.pedror.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: musica.proto")
public interface MusicaService extends MutinyService {

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request);
}
