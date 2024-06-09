package com.pedror.grpc;

import com.pedror.dados.Musica;

public class GrpcUtil {

  public static com.pedror.grpc.MusicaGrpc toMusicaGrpc(com.pedror.dados.Musica musica) {
    return com.pedror.grpc.MusicaGrpc.newBuilder()
                                     .setId(musica.getIntId())
                                     .setNome(musica.getNome())
                                     .build();
  }

  public static com.pedror.grpc.UsuarioGrpc toUsuarioGrpc(com.pedror.dados.Usuario usuario) {
    return com.pedror.grpc.UsuarioGrpc.newBuilder()
                                      .setId(usuario.getIntId())
                                      .setNome(usuario.getNome())
                                      .setIdade(usuario.getIdade())
                                      .build();
  }

  public static com.pedror.grpc.PlaylistGrpc toPlaylistGrpc(com.pedror.dados.Playlist playlist) {
    return com.pedror.grpc.PlaylistGrpc.newBuilder()
                                       .setId(playlist.getIntId())
                                       .setNome(playlist.getNome())
                                       .build();
  }

}
