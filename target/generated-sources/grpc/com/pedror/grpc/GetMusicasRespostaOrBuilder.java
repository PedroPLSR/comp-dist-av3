// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musica.proto
// Protobuf Java Version: 3.25.0
package com.pedror.grpc;

public interface GetMusicasRespostaOrBuilder extends // @@protoc_insertion_point(interface_extends:musica.GetMusicasResposta)
com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .musica.MusicaGrpc musicas = 1;</code>
     */
    java.util.List<com.pedror.grpc.MusicaGrpc> getMusicasList();

    /**
     * <code>repeated .musica.MusicaGrpc musicas = 1;</code>
     */
    com.pedror.grpc.MusicaGrpc getMusicas(int index);

    /**
     * <code>repeated .musica.MusicaGrpc musicas = 1;</code>
     */
    int getMusicasCount();

    /**
     * <code>repeated .musica.MusicaGrpc musicas = 1;</code>
     */
    java.util.List<? extends com.pedror.grpc.MusicaGrpcOrBuilder> getMusicasOrBuilderList();

    /**
     * <code>repeated .musica.MusicaGrpc musicas = 1;</code>
     */
    com.pedror.grpc.MusicaGrpcOrBuilder getMusicasOrBuilder(int index);
}
