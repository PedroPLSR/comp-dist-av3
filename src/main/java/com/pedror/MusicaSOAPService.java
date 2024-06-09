package com.pedror;

import com.pedror.dados.Dados;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import com.pedror.soap.MusicaSOAPServiceInt;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "MusicaSOAPService", serviceName = "MusicaSOAPService", targetNamespace = "http://musicasoap.com")
public class MusicaSOAPService implements MusicaSOAPServiceInt {

  @Inject
  Dados dados;

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

}
