package com.pedror.dados;

import com.github.javafaker.Faker;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@ApplicationScoped
public class Dados {

  private final List<Usuario> usuarios = new ArrayList<>();

  private final List<Playlist> playlists = new ArrayList<>();

  private final List<Musica> musicas = new ArrayList<>();

  public Dados() {
    Faker faker = new Faker();
    for (int i = 0; i < 10; i++) {
      Usuario usuario = new Usuario();
      usuario.setId((long) i);
      usuario.setNome(faker.name().fullName());
      usuario.setIdade(faker.number().numberBetween(18, 60));
      usuario.setPlaylists(new ArrayList<>());

      //Usuário criado --------------------
      for (int j = 0; j < 5; j++) {
        Playlist playlist = new Playlist();
        playlist.setId((long) (i*10 + j));
        playlist.setNome(faker.music().genre());
        playlist.setMusicas(new ArrayList<>());
        for (int k = 0; k < 10; k++) { // Cria 10 musicas novas e coloca em uma playlist
          Musica musica = new Musica();
          musica.setId((long) (i*10 + j*5 + k));
          musica.setNome(faker.music().instrument());
          musica.setArtista(faker.artist().name());
          playlist.getMusicas().add(musica); //adiciona a musica criada na playlist atual
          musicas.add(musica); //Adiciona a musica para a lista global de musicas
        }
        usuario.getPlaylists().add(playlist);
        playlists.add(playlist);
      }
      usuarios.add(usuario);
    }

  }

  public List<Playlist> getPlaylistsDoUsuario(Long idUsuario) {
    List<Playlist> playlistUsuarios = new ArrayList<>();

    for (Usuario usuario : getUsuarios()) {
      if (usuario.getId().equals(idUsuario)) {
        playlistUsuarios = usuario.getPlaylists();
        break;
      }
    }

    return playlistUsuarios;
  }

  public List<Musica> getMusicasDaPlaylist(Long idPlaylist) {
    List<Musica> musicasPlaylist = new ArrayList<>();

    for (Playlist playlist : getPlaylists()) {
      if (playlist.getId().equals(idPlaylist)) {
        musicasPlaylist = playlist.getMusicas();
        break;
      }
    }

    return musicasPlaylist;
  }

  public List<Playlist> getPlaylistsComMusica(Long idMusica) {
    List<Playlist> playlistsComMusica = new ArrayList<>();

    for (Playlist playlist : getPlaylists()) {
      for (Musica musica : playlist.getMusicas()) {
        if (musica.getId().equals(idMusica)) {
          playlistsComMusica.add(playlist);
          break;
        }
      }
    }

    return playlistsComMusica;
  }


  //Codigo para o CRUD
  //Create
  public void createMusica(String nome, String artista){
    Musica musica = new Musica();
    musica.setNome(nome);
    musica.setArtista(artista);
    musica.setId(getMusicas().getLast().getId() + 1); //setando pra ser o ultimo + 1
    getMusicas().add(musica);
  }
  public void createUsuario(String nome, int idade, List<Playlist> playlists){
    Usuario usuario = new Usuario();
    usuario.setNome(nome);
    usuario.setIdade(idade);
    usuario.setPlaylists(playlists);
    usuario.setId(getUsuarios().getLast().getId() + 1); //setando pra ser o ultimo + 1
    getUsuarios().add(usuario);
  }

  public void createPlaylist(String nome, int... idMusicas){ //int... aceita um conjunto de ids pra colocar na playlist
    Playlist playlist = new Playlist();
    playlist.setNome(nome);
    List<Musica> list = new ArrayList<>();
    for (int id : idMusicas) {
      list.add(getMusicas().get(id));
    }
    playlist.setMusicas(list);
    playlist.setId(getPlaylists().getLast().getId() + 1);
    getPlaylists().add(playlist);
  }

  //Read depende de cada api..

  //Update
  public void updateMusica(long idMusica, Musica newMusica){
    for(Musica musica : getMusicas()){
      if(musica.getId().equals(idMusica)){
        getMusicas().set(getMusicas().indexOf(musica), newMusica);
        break;
      }
    }
  }

  public void updateUsuario(long idUsuario, Usuario newUsuario){
    for(Usuario usuario : getUsuarios()){
      if(usuario.getId().equals(idUsuario)){
        getUsuarios().set(getUsuarios().indexOf(usuario), newUsuario);
        break;
      }
    }
  }

  public void updatePlaylist(long idPlaylist, Playlist newPlaylist){
    for(Playlist playlist : getPlaylists()){
      if(playlist.getId().equals(idPlaylist)){
        getPlaylists().set(getPlaylists().indexOf(playlist), newPlaylist);
        break;
      }
    }
  }

  //Remove

  public void removeMusic(long idMusica){
    for(Musica musica : getMusicas()){
      if(musica.getId().equals(idMusica)){
        getMusicas().remove(getMusicas().indexOf(musica));
        break;
      }
    }
  }
  public void removeUsuario(long idUsuario){
    for(Usuario usuario : getUsuarios()){
      if(usuario.getId().equals(idUsuario)){
        getUsuarios().remove(getMusicas().indexOf(usuario));
        break;
      }
    }
  }
  public void removePlaylist(long idPlaylist){
    for(Playlist playlist : getPlaylists()){
      if(playlist.getId().equals(idPlaylist)){
        getPlaylists().remove(getMusicas().indexOf(playlist));
        break;
      }
    }
  }
}
