package com.pedror.soap;

import com.pedror.dados.JSON_Objects;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "MusicaSOAPService", serviceName = "MusicaSOAPService", targetNamespace = "http://musicasoap.com")
public interface MusicaSOAPServiceInt {

  // Create
  @WebMethod
  Usuario criarUsuario(JSON_Objects.JSON_Usuario usuario);

  @WebMethod
  Musica criarMusica(JSON_Objects.JSON_Musica musica);

  @WebMethod
  Playlist criarPlaylist(JSON_Objects.JSON_Playlist playlist);

  // Read
  @WebMethod
  List<Usuario> getUsuarios();

  @WebMethod
  List<Musica> getMusicas();

  @WebMethod
  List<Playlist> getPlaylistsDoUsuario(Long idUsuario);

  @WebMethod
  List<Musica> getMusicasDaPlaylist(Long idPlaylist);

  @WebMethod
  List<Playlist> getPlaylistsComMusica(Long idMusica);

  // Update
  @WebMethod
  void updateCliente(Long idUsuario, JSON_Objects.JSON_Usuario usuario);

  @WebMethod
  void updateMusica(Long idMusica, JSON_Objects.JSON_Musica musica);

  @WebMethod
  void updatePlaylist(Long idPlaylist, JSON_Objects.JSON_Playlist playlist);

  // Delete
  @WebMethod
  String deletarCliente(Long idUsuario);

  @WebMethod
  String deletarMusica(Long idMusica);

  @WebMethod
  String deletarPlaylist(Long idPlaylist);
}
