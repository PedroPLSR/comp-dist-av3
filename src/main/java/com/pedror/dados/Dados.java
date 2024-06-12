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
  public Musica createMusica(String nome, String artista){
    Musica musica = new Musica();
    musica.setNome(nome);
    musica.setArtista(artista);
    musica.setId(getMusicas().get(getMusicas().size() - 1).getId() + 1); //setando pra ser o ultimo + 1
    getMusicas().add(musica);
    return musica;
  }
  public Musica createMusica(JSON_Objects.JSON_Musica newMusica){
    Musica musica = new Musica();
    musica.setNome(newMusica.getNome());
    musica.setArtista(newMusica.getArtista());
    musica.setId(getMusicas().get(getMusicas().size() - 1).getId() + 1); //setando pra ser o ultimo + 1
    getMusicas().add(musica);
    return musica;
  }

  public Usuario createUsuario(String nome, int idade, int[] idPlaylists){
    Usuario usuario = new Usuario();
    usuario.setNome(nome);
    usuario.setIdade(idade);
    List<Playlist> list = new ArrayList<>();
    for(int id : idPlaylists){
      for(Playlist playlist : getPlaylists()){
        if(playlist.getId() == (long) id){
          list.add(playlist);
          break;
        }
      }
    }
    usuario.setPlaylists(list);
    usuario.setId(getUsuarios().get(getUsuarios().size() - 1).getId() + 1); //setando pra ser o ultimo + 1
    getUsuarios().add(usuario);
    return usuario;
  }
  public Usuario createUsuario(JSON_Objects.JSON_Usuario newUsuario){
    Usuario usuario = new Usuario();
    usuario.setNome(newUsuario.getNome());
    usuario.setIdade(newUsuario.getIdade());
    List<Playlist> list = new ArrayList<>();
    for(long id : newUsuario.getIdPlaylists()){
      for(Playlist playlist : getPlaylists()){
        if(playlist.getId() == id){
          list.add(playlist);
          break;
        }
      }
    }
    usuario.setPlaylists(list);
    usuario.setId(getUsuarios().get(getUsuarios().size() - 1).getId() + 1); //setando pra ser o ultimo + 1
    getUsuarios().add(usuario);
    return usuario;
  }

  public Playlist createPlaylist(String nome, int[] idMusicas){ //int... aceita um conjunto de ids pra colocar na playlist
    Playlist playlist = new Playlist();
    playlist.setNome(nome);
    List<Musica> list = new ArrayList<>();
    for (int id : idMusicas) {
      for(Musica musica : getMusicas()){
        if(musica.getId() == (long) id){
          list.add(musica);
          break;
        }
      }
    }
    playlist.setMusicas(list);
    playlist.setId(getPlaylists().get(getPlaylists().size() - 1).getId() + 1);
    getPlaylists().add(playlist);
    return playlist;
  }
  public Playlist createPlaylist(JSON_Objects.JSON_Playlist newPlaylist){ //int... aceita um conjunto de ids pra colocar na playlist
    Playlist playlist = new Playlist();
    playlist.setNome(newPlaylist.getNome());
    List<Musica> list = new ArrayList<>();
    for (long id : newPlaylist.getIdMusicas()) {
      for(Musica musica : getMusicas()){
        if(musica.getId() == id){
          list.add(musica);
          break;
        }
      }
    }
    playlist.setMusicas(list);
    playlist.setId(getPlaylists().get(getPlaylists().size() - 1).getId() + 1);
    getPlaylists().add(playlist);
    return playlist;
  }

  //Read depende de cada api..

  //Update
  public void updateMusica(long idMusica, Musica newMusica){
    for(Musica musica : getMusicas()){
      if(musica.getId().equals(idMusica)){
        newMusica.setId(musica.getId()); //Manter o mesmo ID da musica anterior
        getMusicas().set(getMusicas().indexOf(musica), newMusica);
        break;
      }
    }
  }

  public void updateUsuario(long idUsuario, Usuario newUsuario){
    for(Usuario usuario : getUsuarios()){
      if(usuario.getId().equals(idUsuario)){
        newUsuario.setId(usuario.getId()); //Manter o mesmo ID do usuario anterior
        getUsuarios().set(getUsuarios().indexOf(usuario), newUsuario);
        break;
      }
    }
  }

  public void updatePlaylist(long idPlaylist, Playlist newPlaylist){
    for(Playlist playlist : getPlaylists()){
      if(playlist.getId().equals(idPlaylist)){
        newPlaylist.setId(playlist.getId());
        getPlaylists().set(getPlaylists().indexOf(playlist), newPlaylist);
        break;
      }
    }
  }

  //Remove

  public String removeMusica(long idMusica){
    Musica musicaRemovida = null;
    for(Musica musica : getMusicas()){
      if(musica.getId().equals(idMusica)){
        musicaRemovida = musica;
        break;
      }
    }
    if(musicaRemovida != null){
      getMusicas().remove(musicaRemovida);
      return "Musica deletada.";
    }
    return "Musica nao encontrada.";
  }
  public String removeUsuario(long idUsuario){
    Usuario usuarioRemovido = null;
    for(Usuario usuario : getUsuarios()){
      if(usuario.getId().equals(idUsuario)){
        usuarioRemovido = usuario;
        break;
      }
    }
    if(usuarioRemovido != null){
      getUsuarios().remove(usuarioRemovido);
      return "Usuario deletado.";
    }
    return "Usuario nao encontrado.";
  }
  public String removePlaylist(long idPlaylist){
    Playlist playlistRemovida = null;
    for(Playlist playlist : getPlaylists()){
      if(playlist.getId().equals(idPlaylist)){
        playlistRemovida = playlist;
        break;
      }
    }
    if(playlistRemovida != null){
      getPlaylists().remove(playlistRemovida);
      return "Playlist deletada.";
    }
    return "Playlist nao encontrada.";
  }
}
