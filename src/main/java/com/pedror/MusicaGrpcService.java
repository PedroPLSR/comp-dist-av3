package com.pedror;

import com.pedror.dados.Dados;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import com.pedror.grpc.*;
import com.pedror.grpc.GetMusicasDaPlaylistRequisicao;
import com.pedror.grpc.GetMusicasDaPlaylistResposta;
import com.pedror.grpc.GetMusicasResposta;
import com.pedror.grpc.GetPlaylistDoUsuarioResposta;
import com.pedror.grpc.GetPlaylistsComMusicaRequisicao;
import com.pedror.grpc.GetPlaylistsComMusicaResposta;
import com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao;
import com.pedror.grpc.GetUsuariosResposta;
import com.pedror.grpc.MusicaGrpc;
import com.pedror.grpc.MusicaService;
import com.pedror.grpc.PlaylistGrpc;
import com.pedror.grpc.UsuarioGrpc;
import com.pedror.grpc.Vazio;
import io.quarkus.grpc.GrpcService;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class MusicaGrpcService implements MusicaService {

  @Inject
  Dados dados;

  @Override
  public Uni<GetUsuariosResposta> getUsuarios(Vazio request) {
    List<UsuarioGrpc> usuariosResposta = new ArrayList<>();

    for (Usuario usuario : dados.getUsuarios()) {
      UsuarioGrpc usuarioGrpc = GrpcUtil.toUsuarioGrpc(usuario);
      usuariosResposta.add(usuarioGrpc);
    }

    return Uni.createFrom().item(GetUsuariosResposta.newBuilder().addAllUsuarios(usuariosResposta).build());
  }

  @Override
  public Uni<GetMusicasResposta> getMusicas(Vazio request) {
    List<MusicaGrpc> musicasResposta = new ArrayList<>();

    for (Musica musica : dados.getMusicas()) {
      MusicaGrpc usuarioGrpc =
              MusicaGrpc.newBuilder()
                      .setId(musica.getIntId())
                      .setNome(musica.getNome())
                      .setArtista(musica.getArtista())
                      .build();
      musicasResposta.add(usuarioGrpc);
    }
    return Uni.createFrom().item(GetMusicasResposta.newBuilder().addAllMusicas(musicasResposta).build());
  }

  @Override
  public Uni<GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(GetPlaylistsDoUsuarioRequisicao request) {
    List<PlaylistGrpc> playlistUsuarios = new ArrayList<>();

    for (Usuario usuario : dados.getUsuarios()) {
      if (usuario.getIntId() == request.getIdUsuario()) {

        for (Playlist playlist : usuario.getPlaylists()) {
          List<MusicaGrpc> musicas = new ArrayList<>();
          for (Musica musica : playlist.getMusicas()) {
            MusicaGrpc musicaGrpc = GrpcUtil.toMusicaGrpc(musica);
            musicas.add(musicaGrpc);
          }

          PlaylistGrpc playlistGrpc =
                  PlaylistGrpc.newBuilder()
                          .setId(Math.toIntExact(playlist.getId()))
                          .setNome(playlist.getNome())
                          .addAllMusicas(musicas)
                          .build();
          playlistUsuarios.add(playlistGrpc);
        }

        break;
      }
    }

    return Uni.createFrom().item(GetPlaylistDoUsuarioResposta.newBuilder().addAllPlaylists(playlistUsuarios).build());
  }

  @Override
  public Uni<GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(GetMusicasDaPlaylistRequisicao request) {

    List<MusicaGrpc> musicas = new ArrayList<>();

    for (Playlist playlist : dados.getPlaylists()) {
      if (playlist.getIntId() == request.getIdPlaylist()) {
        for (Musica musica : playlist.getMusicas()) {
          MusicaGrpc musicaGrpc = GrpcUtil.toMusicaGrpc(musica);
          musicas.add(musicaGrpc);
        }
        break;
      }
    }

    return Uni.createFrom().item(GetMusicasDaPlaylistResposta.newBuilder().addAllMusicas(musicas).build());
  }

  @Override
  public Uni<GetPlaylistsComMusicaResposta> getPlaylistsComMusica(GetPlaylistsComMusicaRequisicao request) {

    List<PlaylistGrpc> playlists = new ArrayList<>();

    for (Playlist playlist : dados.getPlaylists()) {
      for (Musica musica : playlist.getMusicas()) {
        if (musica.getIntId() == request.getIdMusica()) {
          List<MusicaGrpc> musicas = new ArrayList<>();

          for (Musica musicaDaPlaylist : playlist.getMusicas()) {
            MusicaGrpc musicaGrpc = GrpcUtil.toMusicaGrpc(musicaDaPlaylist);
            musicas.add(musicaGrpc);
          }

          PlaylistGrpc playlistGrpc =
                  PlaylistGrpc.newBuilder()
                          .setId(playlist.getIntId())
                          .setNome(playlist.getNome())
                          .addAllMusicas(musicas)
                          .build();
          playlists.add(playlistGrpc);

          break;
        }
      }
    }

    return Uni.createFrom().item(GetPlaylistsComMusicaResposta.newBuilder().addAllPlaylists(playlists).build());
  }

}
