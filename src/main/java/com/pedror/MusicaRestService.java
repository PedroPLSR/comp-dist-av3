package com.pedror;

import com.pedror.dados.Dados;
import com.pedror.dados.Musica;
import com.pedror.dados.Playlist;
import com.pedror.dados.Usuario;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/rest/musica")
public class MusicaRestService {

  @Inject
  Dados dados;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/usuarios")
  public List<Usuario> getUsuarios() {
    return dados.getUsuarios();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/musicas")
  public List<Musica> getMusicas() {
    return dados.getMusicas();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/playlists-usuario/{idUsuario}")
  public List<Playlist> getPlaylistsDoUsuario(@PathParam("idUsuario") Long idUsuario) {
    return dados.getPlaylistsDoUsuario(idUsuario);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/musicas-playlist/{idPlaylist}")
  public List<Musica> getMusicasDaPlaylist(@PathParam("idPlaylist") Long idPlaylist) {
    return dados.getMusicasDaPlaylist(idPlaylist);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/playlists-musica/{idMusica}")
  public List<Playlist> getPlaylistsComMusica(@PathParam("idMusica") Long idMusica) {
    return dados.getPlaylistsComMusica(idMusica);
  }

}
