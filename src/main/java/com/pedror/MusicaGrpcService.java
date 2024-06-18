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

  @Override
  public Uni<CriarUsuarioResposta> criarUsuario(CriarUsuarioRequisicao request) {
    Usuario usuarioCriado = dados.createUsuario(
            request.getNome(),
            request.getIdade(),
            request.getIdPlaylistsList().stream().mapToInt(i -> i).toArray()
    );
    UsuarioGrpc usuarioGrpc = GrpcUtil.toUsuarioGrpc(usuarioCriado);
    return Uni.createFrom().item(CriarUsuarioResposta.newBuilder().setUsuario(usuarioGrpc).build());
  }

  @Override
  public Uni<CriarMusicaResposta> criarMusica(CriarMusicaRequisicao request) {
    Musica musicaCriada = dados.createMusica(
            request.getNome(),
            request.getArtista()
    );
    MusicaGrpc musicaGrpc = GrpcUtil.toMusicaGrpc(musicaCriada);
    return Uni.createFrom().item(CriarMusicaResposta.newBuilder().setMusica(musicaGrpc).build());
  }

  @Override
  public Uni<CriarPlaylistResposta> criarPlaylist(CriarPlaylistRequisicao request) {
    Playlist playlistCriada = dados.createPlaylist(
            request.getNome(),
            request.getIdMusicasList().stream().mapToInt(i -> i).toArray()
    );
    PlaylistGrpc playlistGrpc = GrpcUtil.toPlaylistGrpc(playlistCriada);
    return Uni.createFrom().item(CriarPlaylistResposta.newBuilder().setPlaylist(playlistGrpc).build());
  }

  @Override
  public Uni<AtualizarUsuarioResposta> atualizarUsuario(AtualizarUsuarioRequisicao request) {
    Usuario usuarioAtualizado = new Usuario();
    usuarioAtualizado.setNome(request.getNome());
    usuarioAtualizado.setIdade(request.getIdade());
    List<Playlist> playlists = new ArrayList<>();
    for (int id : request.getIdPlaylistsList()) {
      playlists.add(dados.getPlaylists().stream().filter(p -> p.getId() == id).findFirst().orElse(null));
    }
    usuarioAtualizado.setPlaylists(playlists);
    dados.updateUsuario(request.getId(), usuarioAtualizado);

    UsuarioGrpc usuarioGrpc = GrpcUtil.toUsuarioGrpc(usuarioAtualizado);
    return Uni.createFrom().item(AtualizarUsuarioResposta.newBuilder().setUsuario(usuarioGrpc).build());
  }

  @Override
  public Uni<AtualizarMusicaResposta> atualizarMusica(AtualizarMusicaRequisicao request) {
    Musica musicaAtualizada = new Musica();
    musicaAtualizada.setNome(request.getNome());
    musicaAtualizada.setArtista(request.getArtista());
    dados.updateMusica(request.getId(), musicaAtualizada);

    MusicaGrpc musicaGrpc = GrpcUtil.toMusicaGrpc(musicaAtualizada);
    return Uni.createFrom().item(AtualizarMusicaResposta.newBuilder().setMusica(musicaGrpc).build());
  }

  @Override
  public Uni<AtualizarPlaylistResposta> atualizarPlaylist(AtualizarPlaylistRequisicao request) {
    List<Musica> musicas = new ArrayList<>();
    for (int id : request.getIdMusicasList()) {
      musicas.add(dados.getMusicas().stream().filter(m -> m.getId() == id).findFirst().orElse(null));
    }

    Playlist playlistAtualizada = new Playlist();
    playlistAtualizada.setNome(request.getNome());
    playlistAtualizada.setMusicas(musicas);
    dados.updatePlaylist(request.getId(), playlistAtualizada);

    PlaylistGrpc playlistGrpc = GrpcUtil.toPlaylistGrpc(playlistAtualizada);
    return Uni.createFrom().item(AtualizarPlaylistResposta.newBuilder().setPlaylist(playlistGrpc).build());
  }

  @Override
  public Uni<DeletarUsuarioResposta> deletarUsuario(DeletarUsuarioRequisicao request) {
    String resultado = dados.removeUsuario(request.getId());
    return Uni.createFrom().item(DeletarUsuarioResposta.newBuilder().setResultado(resultado).build());
  }

  @Override
  public Uni<DeletarMusicaResposta> deletarMusica(DeletarMusicaRequisicao request) {
    String resultado = dados.removeMusica(request.getId());
    return Uni.createFrom().item(DeletarMusicaResposta.newBuilder().setResultado(resultado).build());
  }

  @Override
  public Uni<DeletarPlaylistResposta> deletarPlaylist(DeletarPlaylistRequisicao request) {
    String resultado = dados.removePlaylist(request.getId());
    return Uni.createFrom().item(DeletarPlaylistResposta.newBuilder().setResultado(resultado).build());
  }

}
