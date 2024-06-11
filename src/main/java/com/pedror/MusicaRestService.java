package com.pedror;

import com.pedror.dados.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/rest/musica")
public class MusicaRestService {

  @Inject
  Dados dados;

  //Create ------------------------------------------------------------------------------------------------------------
  @POST
  @Consumes(MediaType.APPLICATION_JSON) //enviar um JSON com o objeto a ser criado (Nao vai ser considerado o ID no JSON, sendo criado um novo dentro do metodo)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/criarUsuario")
  public Usuario criarUsuario(JSON_Objects.JSON_Usuario usuario){
    return dados.createUsuario(usuario);
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON) //enviar um JSON com o objeto a ser criado (Nao vai ser considerado o ID no JSON, sendo criado um novo dentro do metodo)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/criarMusica")
  public Musica criarMusica(JSON_Objects.JSON_Musica musica){
    return dados.createMusica(musica);
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON) //enviar um JSON com o objeto a ser criado (Nao vai ser considerado o ID no JSON, sendo criado um novo dentro do metodo)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/criarPlaylist")
  public Playlist criarPlaylist(JSON_Objects.JSON_Playlist playlist){
    return dados.createPlaylist(playlist);
  }
  //Read --------------------------------------------------------------------------------------------------------------
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

  //Update ------------------------------------------------------------------------------------------------------------
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/updateCliente/{idUsuario}")
  public void updateCliente(@PathParam("idUsuario") long idUsuario, JSON_Objects.JSON_Usuario usuario){
    dados.updateUsuario(idUsuario, dados.createUsuario(usuario));
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/updateMusica/{idMusica}")
  public void updateMusica(@PathParam("idMusica") long idMusica, JSON_Objects.JSON_Musica musica){
    dados.updateMusica(idMusica, dados.createMusica(musica));
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/updatePlaylist/{idPlaylist}")
  public void updatePlaylist(@PathParam("idPlaylist") long idPlaylist, JSON_Objects.JSON_Playlist playlist){
    dados.updatePlaylist(idPlaylist, dados.createPlaylist(playlist));
  }

  //Delete ------------------------------------------------------------------------------------------------------------
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/deletarCliente/{idUsuario}")
  public String deletarCliente(@PathParam("idUsuario") long idUsuario){
    return dados.removeUsuario(idUsuario);
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/deletarMusica/{idMusica}")
  public String deletarMusica(@PathParam("idMusica") long idMusica){
    return dados.removeMusica(idMusica);
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/deletarPlaylist/{idPlaylist}")
  public String deletarPlaylist(@PathParam("idPlaylist") long idPlaylist){
    return dados.removePlaylist(idPlaylist);
  }
}
