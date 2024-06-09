package com.pedror.dados;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Usuario {

  private Long id;

  private String nome;

  private Integer idade;

  private List<Playlist> playlists;

  public int getIntId() {
    return Math.toIntExact(id);
  }

}
