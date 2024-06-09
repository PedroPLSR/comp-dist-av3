package com.pedror.dados;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Playlist {

  private Long id;

  private String nome;

  private List<Musica> musicas;

  public int getIntId() {
    return Math.toIntExact(id);
  }

}
