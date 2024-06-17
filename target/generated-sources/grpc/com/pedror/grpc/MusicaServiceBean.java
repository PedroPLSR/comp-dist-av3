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

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
        try {
            return delegate.criarUsuario(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
        try {
            return delegate.criarMusica(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
        try {
            return delegate.criarPlaylist(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
        try {
            return delegate.atualizarUsuario(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
        try {
            return delegate.atualizarMusica(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
        try {
            return delegate.atualizarPlaylist(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
        try {
            return delegate.deletarUsuario(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
        try {
            return delegate.deletarMusica(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
        try {
            return delegate.deletarPlaylist(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
