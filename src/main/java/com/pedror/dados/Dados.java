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
      for (int j = 0; j < 5; j++) {
        Playlist playlist = new Playlist();
        playlist.setId((long) j);
        playlist.setNome(faker.music().genre());
        playlist.setMusicas(new ArrayList<>());
        for (int k = 0; k < 10; k++) {
          Musica musica = new Musica();
          musica.setId((long) k);
          musica.setNome(faker.music().instrument());
          musica.setArtista(faker.artist().name());
          playlist.getMusicas().add(musica);
          musicas.add(musica);
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
}
