package com.pedror.soap;

import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "MusicaSOAPService", serviceName = "MusicaSOAPService", targetNamespace = "http://musicasoap.com")
public interface MusicaSOAPServiceInt {

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

}
