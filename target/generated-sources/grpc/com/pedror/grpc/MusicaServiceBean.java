package com.pedror.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: musica.proto")
public class MusicaServiceBean extends MutinyMusicaServiceGrpc.MusicaServiceImplBase implements BindableService, MutinyBean {

    private final MusicaService delegate;

    MusicaServiceBean(@GrpcService MusicaService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
        try {
            return delegate.getUsuarios(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
        try {
            return delegate.getMusicas(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
        try {
            return delegate.getPlaylistsDoUsuario(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
        try {
            return delegate.getMusicasDaPlaylist(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
        try {
            return delegate.getPlaylistsComMusica(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
