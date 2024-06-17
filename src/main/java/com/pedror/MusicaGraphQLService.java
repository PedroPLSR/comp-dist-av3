package com.pedror;

import com.pedror.dados.Dados;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import jakarta.inject.Inject;
import jdk.jfr.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class MusicaGraphQLService {

  @Inject
  Dados dados;

  //Create ------------------------------------------------------------------------------------------------------------
  @Mutation
  @Description("Cria um novo Usuario")
  public Usuario createUsuario(String nome, int idade, int... idPlaylists){
    return dados.createUsuario(nome,idade,idPlaylists);
  }
  @Mutation
  @Description("Cria uma nova Musica")
  public Musica createMusica(String nome, String artista){
    return dados.createMusica(nome, artista);
  }
  @Mutation
  @Description("Cria uma nova Playlist")
  public Playlist createPlaylist(String nome, int... idMusicas){
    return dados.createPlaylist(nome,idMusicas);
  }
  //Read --------------------------------------------------------------------------------------------------------------
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
  public List<Playlist> getPlaylistsDoUsuario(int idUsuario) {
    return dados.getPlaylistsDoUsuario((long) idUsuario);
  }

  @Query
  @Description("Retorna todas as músicas de uma playlist.")
  public List<Musica> getMusicasDaPlaylist(int idPlaylist) {
    return dados.getMusicasDaPlaylist((long) idPlaylist);
  }

  @Query
  @Description("Retorna todas as playlists que contêm uma música.")
  public List<Playlist> getPlaylistsComMusica(int idMusica) {
    return dados.getPlaylistsComMusica((long) idMusica);
  }


  //Update-------------------------------------------------------------------------------------------------------------
  @Mutation
  @Description("Substitui uma Musica por uma nova - Parametros: Long idMusica: ID da musica a ser atualizada; String nome: Nome da nova musica; String artista: artista da nova musica")
  public void updateMusica(int idMusica, String nome, String artista){
    dados.updateMusica(idMusica, dados.createMusica(nome, artista));
  }
  @Mutation
  @Description("Substitui uma Playlist por uma nova - Parametros: Long idPlaylist: ID da Playlist a ser atualizada; String nome: Nome da nova Playlist; int... idMusicas: lista de musicas da playlist")
  public void updatePlaylist(int idPlaylist, String nome, int... idMusicas){
    dados.updatePlaylist(idPlaylist, dados.createPlaylist(nome, idMusicas));
  }
  @Mutation
  @Description("Substitui uma Playlist por uma nova - Parametros: Long idPlaylist: ID da Playlist a ser atualizada; String nome: Nome da nova Playlist; int... idMusicas: lista de musicas da playlist")
  public void updateUsuario(int idUsuario, String nome, int idade, int... idPlaylists){
    dados.updateUsuario(idUsuario, dados.createUsuario(nome, idade, idPlaylists));
  }

  //Delete ------------------------------------------------------------------------------------------------------------

  @Mutation
  @Description("Deleta um Usuario")
  public String deleteUsuario(int idUsuario){
     return dados.removeUsuario((long) idUsuario);
  }
  @Mutation
  @Description("Deleta uma Musica")
  public String deleteMusica(int idMusica){
     return dados.removeMusica((long) idMusica);
  }
  @Mutation
  @Description("Deleta uma Playlist")
  public String deletePlaylist(int idPlaylist){
     return dados.removePlaylist((long) idPlaylist);
  }
}