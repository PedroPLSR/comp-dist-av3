package com.pedror.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: musica.proto")
public interface MusicaService extends MutinyService {

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request);

    io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request);
}
