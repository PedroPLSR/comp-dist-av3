package com.pedror;

import com.pedror.dados.*;
import com.pedror.soap.MusicaSOAPServiceInt;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "MusicaSOAPService", serviceName = "MusicaSOAPService", targetNamespace = "http://musicasoap.com")
public class MusicaSOAPService implements MusicaSOAPServiceInt {
  @Inject
  Dados dados;

  // Create ------------------------------------------------------------------------------------------------------------
  @WebMethod
  @Override
  public Usuario criarUsuario(JSON_Objects.JSON_Usuario usuario) {
    return dados.createUsuario(usuario);
  }

  @WebMethod
  @Override
  public Musica criarMusica(JSON_Objects.JSON_Musica musica) {
    return dados.createMusica(musica);
  }

  @WebMethod
  @Override
  public Playlist criarPlaylist(JSON_Objects.JSON_Playlist playlist) {
    return dados.createPlaylist(playlist);
  }

  // Read --------------------------------------------------------------------------------------------------------------
  @WebMethod
  @Override
  public List<Usuario> getUsuarios() {
    return dados.getUsuarios();
  }

  @WebMethod
  @Override
  public List<Musica> getMusicas() {
    return dados.getMusicas();
  }

  @WebMethod
  @Override
  public List<Playlist> getPlaylistsDoUsuario(Long idUsuario) {
    return dados.getPlaylistsDoUsuario(idUsuario);
  }

  @WebMethod
  @Override
  public List<Musica> getMusicasDaPlaylist(Long idPlaylist) {
    return dados.getMusicasDaPlaylist(idPlaylist);
  }

  @WebMethod
  @Override
  public List<Playlist> getPlaylistsComMusica(Long idMusica) {
    return dados.getPlaylistsComMusica(idMusica);
  }

  // Update ------------------------------------------------------------------------------------------------------------
  @WebMethod
  @Override
  public void updateCliente(Long idUsuario, JSON_Objects.JSON_Usuario usuario) {
    dados.updateUsuario(idUsuario, dados.createUsuario(usuario));
  }

  @WebMethod
  @Override
  public void updateMusica(Long idMusica, JSON_Objects.JSON_Musica musica) {
    dados.updateMusica(idMusica, dados.createMusica(musica));
  }

  @WebMethod
  @Override
  public void updatePlaylist(Long idPlaylist, JSON_Objects.JSON_Playlist playlist) {
    dados.updatePlaylist(idPlaylist, dados.createPlaylist(playlist));
  }

  // Delete ------------------------------------------------------------------------------------------------------------
  @WebMethod
  @Override
  public String deletarCliente(Long idUsuario) {
    return dados.removeUsuario(idUsuario);
  }

  @WebMethod
  @Override
  public String deletarMusica(Long idMusica) {
    return dados.removeMusica(idMusica);
  }

  @WebMethod
  @Override
  public String deletarPlaylist(Long idPlaylist) {
    return dados.removePlaylist(idPlaylist);
  }
}
