package com.pedror.dados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Musica {

  private Long id;

  private String nome;

  private String artista;

  public int getIntId() {
    return Math.toIntExact(id);
  }

}
