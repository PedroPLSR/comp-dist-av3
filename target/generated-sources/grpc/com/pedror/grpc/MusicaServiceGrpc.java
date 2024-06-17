package com.pedror.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.63.0)", comments = "Source: musica.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MusicaServiceGrpc {

    private MusicaServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "musica.MusicaService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetUsuarios", requestType = com.pedror.grpc.Vazio.class, responseType = com.pedror.grpc.GetUsuariosResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta> getGetUsuariosMethod;
        if ((getGetUsuariosMethod = MusicaServiceGrpc.getGetUsuariosMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetUsuariosMethod = MusicaServiceGrpc.getGetUsuariosMethod) == null) {
                    MusicaServiceGrpc.getGetUsuariosMethod = getGetUsuariosMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsuarios")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.Vazio.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetUsuariosResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetUsuarios")).build();
                }
            }
        }
        return getGetUsuariosMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetMusicas", requestType = com.pedror.grpc.Vazio.class, responseType = com.pedror.grpc.GetMusicasResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta> getGetMusicasMethod;
        if ((getGetMusicasMethod = MusicaServiceGrpc.getGetMusicasMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetMusicasMethod = MusicaServiceGrpc.getGetMusicasMethod) == null) {
                    MusicaServiceGrpc.getGetMusicasMethod = getGetMusicasMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMusicas")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.Vazio.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetMusicas")).build();
                }
            }
        }
        return getGetMusicasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetPlaylistsDoUsuario", requestType = com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao.class, responseType = com.pedror.grpc.GetPlaylistDoUsuarioResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta> getGetPlaylistsDoUsuarioMethod;
        if ((getGetPlaylistsDoUsuarioMethod = MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetPlaylistsDoUsuarioMethod = MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod) == null) {
                    MusicaServiceGrpc.getGetPlaylistsDoUsuarioMethod = getGetPlaylistsDoUsuarioMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaylistsDoUsuario")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistDoUsuarioResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetPlaylistsDoUsuario")).build();
                }
            }
        }
        return getGetPlaylistsDoUsuarioMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetMusicasDaPlaylist", requestType = com.pedror.grpc.GetMusicasDaPlaylistRequisicao.class, responseType = com.pedror.grpc.GetMusicasDaPlaylistResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta> getGetMusicasDaPlaylistMethod;
        if ((getGetMusicasDaPlaylistMethod = MusicaServiceGrpc.getGetMusicasDaPlaylistMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetMusicasDaPlaylistMethod = MusicaServiceGrpc.getGetMusicasDaPlaylistMethod) == null) {
                    MusicaServiceGrpc.getGetMusicasDaPlaylistMethod = getGetMusicasDaPlaylistMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMusicasDaPlaylist")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasDaPlaylistRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetMusicasDaPlaylistResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetMusicasDaPlaylist")).build();
                }
            }
        }
        return getGetMusicasDaPlaylistMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetPlaylistsComMusica", requestType = com.pedror.grpc.GetPlaylistsComMusicaRequisicao.class, responseType = com.pedror.grpc.GetPlaylistsComMusicaResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta> getGetPlaylistsComMusicaMethod;
        if ((getGetPlaylistsComMusicaMethod = MusicaServiceGrpc.getGetPlaylistsComMusicaMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getGetPlaylistsComMusicaMethod = MusicaServiceGrpc.getGetPlaylistsComMusicaMethod) == null) {
                    MusicaServiceGrpc.getGetPlaylistsComMusicaMethod = getGetPlaylistsComMusicaMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaylistsComMusica")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsComMusicaRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.GetPlaylistsComMusicaResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("GetPlaylistsComMusica")).build();
                }
            }
        }
        return getGetPlaylistsComMusicaMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta> getCriarUsuarioMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "CriarUsuario", requestType = com.pedror.grpc.CriarUsuarioRequisicao.class, responseType = com.pedror.grpc.CriarUsuarioResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta> getCriarUsuarioMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta> getCriarUsuarioMethod;
        if ((getCriarUsuarioMethod = MusicaServiceGrpc.getCriarUsuarioMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getCriarUsuarioMethod = MusicaServiceGrpc.getCriarUsuarioMethod) == null) {
                    MusicaServiceGrpc.getCriarUsuarioMethod = getCriarUsuarioMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "CriarUsuario")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarUsuarioRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarUsuarioResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("CriarUsuario")).build();
                }
            }
        }
        return getCriarUsuarioMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta> getCriarMusicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "CriarMusica", requestType = com.pedror.grpc.CriarMusicaRequisicao.class, responseType = com.pedror.grpc.CriarMusicaResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta> getCriarMusicaMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta> getCriarMusicaMethod;
        if ((getCriarMusicaMethod = MusicaServiceGrpc.getCriarMusicaMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getCriarMusicaMethod = MusicaServiceGrpc.getCriarMusicaMethod) == null) {
                    MusicaServiceGrpc.getCriarMusicaMethod = getCriarMusicaMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "CriarMusica")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarMusicaRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarMusicaResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("CriarMusica")).build();
                }
            }
        }
        return getCriarMusicaMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta> getCriarPlaylistMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "CriarPlaylist", requestType = com.pedror.grpc.CriarPlaylistRequisicao.class, responseType = com.pedror.grpc.CriarPlaylistResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta> getCriarPlaylistMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta> getCriarPlaylistMethod;
        if ((getCriarPlaylistMethod = MusicaServiceGrpc.getCriarPlaylistMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getCriarPlaylistMethod = MusicaServiceGrpc.getCriarPlaylistMethod) == null) {
                    MusicaServiceGrpc.getCriarPlaylistMethod = getCriarPlaylistMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "CriarPlaylist")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarPlaylistRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.CriarPlaylistResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("CriarPlaylist")).build();
                }
            }
        }
        return getCriarPlaylistMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta> getAtualizarUsuarioMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "AtualizarUsuario", requestType = com.pedror.grpc.AtualizarUsuarioRequisicao.class, responseType = com.pedror.grpc.AtualizarUsuarioResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta> getAtualizarUsuarioMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta> getAtualizarUsuarioMethod;
        if ((getAtualizarUsuarioMethod = MusicaServiceGrpc.getAtualizarUsuarioMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getAtualizarUsuarioMethod = MusicaServiceGrpc.getAtualizarUsuarioMethod) == null) {
                    MusicaServiceGrpc.getAtualizarUsuarioMethod = getAtualizarUsuarioMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtualizarUsuario")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarUsuarioRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarUsuarioResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("AtualizarUsuario")).build();
                }
            }
        }
        return getAtualizarUsuarioMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta> getAtualizarMusicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "AtualizarMusica", requestType = com.pedror.grpc.AtualizarMusicaRequisicao.class, responseType = com.pedror.grpc.AtualizarMusicaResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta> getAtualizarMusicaMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta> getAtualizarMusicaMethod;
        if ((getAtualizarMusicaMethod = MusicaServiceGrpc.getAtualizarMusicaMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getAtualizarMusicaMethod = MusicaServiceGrpc.getAtualizarMusicaMethod) == null) {
                    MusicaServiceGrpc.getAtualizarMusicaMethod = getAtualizarMusicaMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtualizarMusica")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarMusicaRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarMusicaResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("AtualizarMusica")).build();
                }
            }
        }
        return getAtualizarMusicaMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta> getAtualizarPlaylistMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "AtualizarPlaylist", requestType = com.pedror.grpc.AtualizarPlaylistRequisicao.class, responseType = com.pedror.grpc.AtualizarPlaylistResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta> getAtualizarPlaylistMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta> getAtualizarPlaylistMethod;
        if ((getAtualizarPlaylistMethod = MusicaServiceGrpc.getAtualizarPlaylistMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getAtualizarPlaylistMethod = MusicaServiceGrpc.getAtualizarPlaylistMethod) == null) {
                    MusicaServiceGrpc.getAtualizarPlaylistMethod = getAtualizarPlaylistMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "AtualizarPlaylist")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarPlaylistRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.AtualizarPlaylistResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("AtualizarPlaylist")).build();
                }
            }
        }
        return getAtualizarPlaylistMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta> getDeletarUsuarioMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DeletarUsuario", requestType = com.pedror.grpc.DeletarUsuarioRequisicao.class, responseType = com.pedror.grpc.DeletarUsuarioResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta> getDeletarUsuarioMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta> getDeletarUsuarioMethod;
        if ((getDeletarUsuarioMethod = MusicaServiceGrpc.getDeletarUsuarioMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getDeletarUsuarioMethod = MusicaServiceGrpc.getDeletarUsuarioMethod) == null) {
                    MusicaServiceGrpc.getDeletarUsuarioMethod = getDeletarUsuarioMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletarUsuario")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarUsuarioRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarUsuarioResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("DeletarUsuario")).build();
                }
            }
        }
        return getDeletarUsuarioMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta> getDeletarMusicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DeletarMusica", requestType = com.pedror.grpc.DeletarMusicaRequisicao.class, responseType = com.pedror.grpc.DeletarMusicaResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta> getDeletarMusicaMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta> getDeletarMusicaMethod;
        if ((getDeletarMusicaMethod = MusicaServiceGrpc.getDeletarMusicaMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getDeletarMusicaMethod = MusicaServiceGrpc.getDeletarMusicaMethod) == null) {
                    MusicaServiceGrpc.getDeletarMusicaMethod = getDeletarMusicaMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletarMusica")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarMusicaRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarMusicaResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("DeletarMusica")).build();
                }
            }
        }
        return getDeletarMusicaMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta> getDeletarPlaylistMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DeletarPlaylist", requestType = com.pedror.grpc.DeletarPlaylistRequisicao.class, responseType = com.pedror.grpc.DeletarPlaylistResposta.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta> getDeletarPlaylistMethod() {
        io.grpc.MethodDescriptor<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta> getDeletarPlaylistMethod;
        if ((getDeletarPlaylistMethod = MusicaServiceGrpc.getDeletarPlaylistMethod) == null) {
            synchronized (MusicaServiceGrpc.class) {
                if ((getDeletarPlaylistMethod = MusicaServiceGrpc.getDeletarPlaylistMethod) == null) {
                    MusicaServiceGrpc.getDeletarPlaylistMethod = getDeletarPlaylistMethod = io.grpc.MethodDescriptor.<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletarPlaylist")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarPlaylistRequisicao.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.pedror.grpc.DeletarPlaylistResposta.getDefaultInstance())).setSchemaDescriptor(new MusicaServiceMethodDescriptorSupplier("DeletarPlaylist")).build();
                }
            }
        }
        return getDeletarPlaylistMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MusicaServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceStub>() {

            @java.lang.Override
            public MusicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceStub(channel, callOptions);
            }
        };
        return MusicaServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MusicaServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceBlockingStub>() {

            @java.lang.Override
            public MusicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceBlockingStub(channel, callOptions);
            }
        };
        return MusicaServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MusicaServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MusicaServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MusicaServiceFutureStub>() {

            @java.lang.Override
            public MusicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MusicaServiceFutureStub(channel, callOptions);
            }
        };
        return MusicaServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void getUsuarios(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsuariosMethod(), responseObserver);
        }

        /**
         */
        default void getMusicas(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMusicasMethod(), responseObserver);
        }

        /**
         */
        default void getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaylistsDoUsuarioMethod(), responseObserver);
        }

        /**
         */
        default void getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMusicasDaPlaylistMethod(), responseObserver);
        }

        /**
         */
        default void getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaylistsComMusicaMethod(), responseObserver);
        }

        /**
         */
        default void criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarUsuarioResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCriarUsuarioMethod(), responseObserver);
        }

        /**
         */
        default void criarMusica(com.pedror.grpc.CriarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarMusicaResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCriarMusicaMethod(), responseObserver);
        }

        /**
         */
        default void criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarPlaylistResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCriarPlaylistMethod(), responseObserver);
        }

        /**
         */
        default void atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarUsuarioResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtualizarUsuarioMethod(), responseObserver);
        }

        /**
         */
        default void atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarMusicaResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtualizarMusicaMethod(), responseObserver);
        }

        /**
         */
        default void atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarPlaylistResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtualizarPlaylistMethod(), responseObserver);
        }

        /**
         */
        default void deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarUsuarioResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarUsuarioMethod(), responseObserver);
        }

        /**
         */
        default void deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarMusicaResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarMusicaMethod(), responseObserver);
        }

        /**
         */
        default void deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarPlaylistResposta> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarPlaylistMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service MusicaService.
     */
    public static abstract class MusicaServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MusicaServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service MusicaService.
     */
    public static class MusicaServiceStub extends io.grpc.stub.AbstractAsyncStub<MusicaServiceStub> {

        private MusicaServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceStub(channel, callOptions);
        }

        /**
         */
        public void getUsuarios(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetUsuariosMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getMusicas(com.pedror.grpc.Vazio request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMusicasMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPlaylistsDoUsuarioMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMusicasDaPlaylistMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPlaylistsComMusicaMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarUsuarioResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCriarUsuarioMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void criarMusica(com.pedror.grpc.CriarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarMusicaResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCriarMusicaMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.CriarPlaylistResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCriarPlaylistMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarUsuarioResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAtualizarUsuarioMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarMusicaResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAtualizarMusicaMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarPlaylistResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAtualizarPlaylistMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarUsuarioResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeletarUsuarioMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarMusicaResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeletarMusicaMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request, io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarPlaylistResposta> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeletarPlaylistMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service MusicaService.
     */
    public static class MusicaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MusicaServiceBlockingStub> {

        private MusicaServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.pedror.grpc.GetUsuariosResposta getUsuarios(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetUsuariosMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetMusicasResposta getMusicas(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMusicasMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetPlaylistDoUsuarioResposta getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPlaylistsDoUsuarioMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetMusicasDaPlaylistResposta getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMusicasDaPlaylistMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.GetPlaylistsComMusicaResposta getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPlaylistsComMusicaMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.CriarUsuarioResposta criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCriarUsuarioMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.CriarMusicaResposta criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCriarMusicaMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.CriarPlaylistResposta criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCriarPlaylistMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.AtualizarUsuarioResposta atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAtualizarUsuarioMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.AtualizarMusicaResposta atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAtualizarMusicaMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.AtualizarPlaylistResposta atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAtualizarPlaylistMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.DeletarUsuarioResposta deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeletarUsuarioMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.DeletarMusicaResposta deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeletarMusicaMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.pedror.grpc.DeletarPlaylistResposta deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeletarPlaylistMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service MusicaService.
     */
    public static class MusicaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MusicaServiceFutureStub> {

        private MusicaServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MusicaServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MusicaServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetUsuariosResposta> getUsuarios(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetUsuariosMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetMusicasResposta> getMusicas(com.pedror.grpc.Vazio request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMusicasMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetPlaylistDoUsuarioResposta> getPlaylistsDoUsuario(com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetPlaylistsDoUsuarioMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetMusicasDaPlaylistResposta> getMusicasDaPlaylist(com.pedror.grpc.GetMusicasDaPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMusicasDaPlaylistMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.GetPlaylistsComMusicaResposta> getPlaylistsComMusica(com.pedror.grpc.GetPlaylistsComMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetPlaylistsComMusicaMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.CriarUsuarioResposta> criarUsuario(com.pedror.grpc.CriarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCriarUsuarioMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.CriarMusicaResposta> criarMusica(com.pedror.grpc.CriarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCriarMusicaMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.CriarPlaylistResposta> criarPlaylist(com.pedror.grpc.CriarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCriarPlaylistMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.AtualizarUsuarioResposta> atualizarUsuario(com.pedror.grpc.AtualizarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAtualizarUsuarioMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.AtualizarMusicaResposta> atualizarMusica(com.pedror.grpc.AtualizarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAtualizarMusicaMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.AtualizarPlaylistResposta> atualizarPlaylist(com.pedror.grpc.AtualizarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAtualizarPlaylistMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.DeletarUsuarioResposta> deletarUsuario(com.pedror.grpc.DeletarUsuarioRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeletarUsuarioMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.DeletarMusicaResposta> deletarMusica(com.pedror.grpc.DeletarMusicaRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeletarMusicaMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.pedror.grpc.DeletarPlaylistResposta> deletarPlaylist(com.pedror.grpc.DeletarPlaylistRequisicao request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeletarPlaylistMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_USUARIOS = 0;

    private static final int METHODID_GET_MUSICAS = 1;

    private static final int METHODID_GET_PLAYLISTS_DO_USUARIO = 2;

    private static final int METHODID_GET_MUSICAS_DA_PLAYLIST = 3;

    private static final int METHODID_GET_PLAYLISTS_COM_MUSICA = 4;

    private static final int METHODID_CRIAR_USUARIO = 5;

    private static final int METHODID_CRIAR_MUSICA = 6;

    private static final int METHODID_CRIAR_PLAYLIST = 7;

    private static final int METHODID_ATUALIZAR_USUARIO = 8;

    private static final int METHODID_ATUALIZAR_MUSICA = 9;

    private static final int METHODID_ATUALIZAR_PLAYLIST = 10;

    private static final int METHODID_DELETAR_USUARIO = 11;

    private static final int METHODID_DELETAR_MUSICA = 12;

    private static final int METHODID_DELETAR_PLAYLIST = 13;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_USUARIOS:
                    serviceImpl.getUsuarios((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetUsuariosResposta>) responseObserver);
                    break;
                case METHODID_GET_MUSICAS:
                    serviceImpl.getMusicas((com.pedror.grpc.Vazio) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasResposta>) responseObserver);
                    break;
                case METHODID_GET_PLAYLISTS_DO_USUARIO:
                    serviceImpl.getPlaylistsDoUsuario((com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistDoUsuarioResposta>) responseObserver);
                    break;
                case METHODID_GET_MUSICAS_DA_PLAYLIST:
                    serviceImpl.getMusicasDaPlaylist((com.pedror.grpc.GetMusicasDaPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetMusicasDaPlaylistResposta>) responseObserver);
                    break;
                case METHODID_GET_PLAYLISTS_COM_MUSICA:
                    serviceImpl.getPlaylistsComMusica((com.pedror.grpc.GetPlaylistsComMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.GetPlaylistsComMusicaResposta>) responseObserver);
                    break;
                case METHODID_CRIAR_USUARIO:
                    serviceImpl.criarUsuario((com.pedror.grpc.CriarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarUsuarioResposta>) responseObserver);
                    break;
                case METHODID_CRIAR_MUSICA:
                    serviceImpl.criarMusica((com.pedror.grpc.CriarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarMusicaResposta>) responseObserver);
                    break;
                case METHODID_CRIAR_PLAYLIST:
                    serviceImpl.criarPlaylist((com.pedror.grpc.CriarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.CriarPlaylistResposta>) responseObserver);
                    break;
                case METHODID_ATUALIZAR_USUARIO:
                    serviceImpl.atualizarUsuario((com.pedror.grpc.AtualizarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarUsuarioResposta>) responseObserver);
                    break;
                case METHODID_ATUALIZAR_MUSICA:
                    serviceImpl.atualizarMusica((com.pedror.grpc.AtualizarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarMusicaResposta>) responseObserver);
                    break;
                case METHODID_ATUALIZAR_PLAYLIST:
                    serviceImpl.atualizarPlaylist((com.pedror.grpc.AtualizarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.AtualizarPlaylistResposta>) responseObserver);
                    break;
                case METHODID_DELETAR_USUARIO:
                    serviceImpl.deletarUsuario((com.pedror.grpc.DeletarUsuarioRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarUsuarioResposta>) responseObserver);
                    break;
                case METHODID_DELETAR_MUSICA:
                    serviceImpl.deletarMusica((com.pedror.grpc.DeletarMusicaRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarMusicaResposta>) responseObserver);
                    break;
                case METHODID_DELETAR_PLAYLIST:
                    serviceImpl.deletarPlaylist((com.pedror.grpc.DeletarPlaylistRequisicao) request, (io.grpc.stub.StreamObserver<com.pedror.grpc.DeletarPlaylistResposta>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGetUsuariosMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetUsuariosResposta>(service, METHODID_GET_USUARIOS))).addMethod(getGetMusicasMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.Vazio, com.pedror.grpc.GetMusicasResposta>(service, METHODID_GET_MUSICAS))).addMethod(getGetPlaylistsDoUsuarioMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsDoUsuarioRequisicao, com.pedror.grpc.GetPlaylistDoUsuarioResposta>(service, METHODID_GET_PLAYLISTS_DO_USUARIO))).addMethod(getGetMusicasDaPlaylistMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetMusicasDaPlaylistRequisicao, com.pedror.grpc.GetMusicasDaPlaylistResposta>(service, METHODID_GET_MUSICAS_DA_PLAYLIST))).addMethod(getGetPlaylistsComMusicaMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.GetPlaylistsComMusicaRequisicao, com.pedror.grpc.GetPlaylistsComMusicaResposta>(service, METHODID_GET_PLAYLISTS_COM_MUSICA))).addMethod(getCriarUsuarioMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarUsuarioRequisicao, com.pedror.grpc.CriarUsuarioResposta>(service, METHODID_CRIAR_USUARIO))).addMethod(getCriarMusicaMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarMusicaRequisicao, com.pedror.grpc.CriarMusicaResposta>(service, METHODID_CRIAR_MUSICA))).addMethod(getCriarPlaylistMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.CriarPlaylistRequisicao, com.pedror.grpc.CriarPlaylistResposta>(service, METHODID_CRIAR_PLAYLIST))).addMethod(getAtualizarUsuarioMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarUsuarioRequisicao, com.pedror.grpc.AtualizarUsuarioResposta>(service, METHODID_ATUALIZAR_USUARIO))).addMethod(getAtualizarMusicaMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarMusicaRequisicao, com.pedror.grpc.AtualizarMusicaResposta>(service, METHODID_ATUALIZAR_MUSICA))).addMethod(getAtualizarPlaylistMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.AtualizarPlaylistRequisicao, com.pedror.grpc.AtualizarPlaylistResposta>(service, METHODID_ATUALIZAR_PLAYLIST))).addMethod(getDeletarUsuarioMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarUsuarioRequisicao, com.pedror.grpc.DeletarUsuarioResposta>(service, METHODID_DELETAR_USUARIO))).addMethod(getDeletarMusicaMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarMusicaRequisicao, com.pedror.grpc.DeletarMusicaResposta>(service, METHODID_DELETAR_MUSICA))).addMethod(getDeletarPlaylistMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.pedror.grpc.DeletarPlaylistRequisicao, com.pedror.grpc.DeletarPlaylistResposta>(service, METHODID_DELETAR_PLAYLIST))).build();
    }

    private static abstract class MusicaServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MusicaServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.pedror.grpc.MusicasGrpcProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MusicaService");
        }
    }

    private static final class MusicaServiceFileDescriptorSupplier extends MusicaServiceBaseDescriptorSupplier {

        MusicaServiceFileDescriptorSupplier() {
        }
    }

    private static final class MusicaServiceMethodDescriptorSupplier extends MusicaServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MusicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (MusicaServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MusicaServiceFileDescriptorSupplier()).addMethod(getGetUsuariosMethod()).addMethod(getGetMusicasMethod()).addMethod(getGetPlaylistsDoUsuarioMethod()).addMethod(getGetMusicasDaPlaylistMethod()).addMethod(getGetPlaylistsComMusicaMethod()).addMethod(getCriarUsuarioMethod()).addMethod(getCriarMusicaMethod()).addMethod(getCriarPlaylistMethod()).addMethod(getAtualizarUsuarioMethod()).addMethod(getAtualizarMusicaMethod()).addMethod(getAtualizarPlaylistMethod()).addMethod(getDeletarUsuarioMethod()).addMethod(getDeletarMusicaMethod()).addMethod(getDeletarPlaylistMethod()).build();
                }
            }
        }
        return result;
    }
}
