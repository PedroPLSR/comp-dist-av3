package com.pedror.dados;

import jakarta.ws.rs.GET;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class JSON_Objects {
    @Getter
    @Setter
    public static class JSON_Usuario{
        private String nome;
        private Integer idade;
        private List<Long> IdPlaylists = new ArrayList<>();
    }

    @Getter
    @Setter
    public static class JSON_Playlist{
        private String nome;
        private List<Long> IdMusicas;
    }

    @Getter
    @Setter
    public static class JSON_Musica{
        private String nome;
        private String artista;
    }

}
