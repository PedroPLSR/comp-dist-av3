package com.pedror;

import com.pedror.dados.Dados;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class MusicaGraphQLService {

  @Inject
  Dados dados;

  @Query
  @Description("Retorna todos os usuários.")
  public List<Usuario> getUsuarios() {
    return dados.getUsuarios();
  }

  @Query
  @Description("Retorna todas as músicas.")
  public List<Musica> getMusicas() {
    return dados.getMusicas();
  }

  @Query
  @Description("Retorna todas as playlists de um usuário.")
  public List<Playlist> getPlaylistsDoUsuario(Long idUsuario) {
    return dados.getPlaylistsDoUsuario(idUsuario);
  }

  @Query
  @Description("Retorna todas as músicas de uma playlist.")
  public List<Musica> getMusicasDaPlaylist(Long idPlaylist) {
    return dados.getMusicasDaPlaylist(idPlaylist);
  }

  @Query
  @Description("Retorna todas as playlists que contêm uma música.")
  public List<Playlist> getPlaylistsComMusica(Long idMusica) {
    return dados.getPlaylistsComMusica(idMusica);
  }
}