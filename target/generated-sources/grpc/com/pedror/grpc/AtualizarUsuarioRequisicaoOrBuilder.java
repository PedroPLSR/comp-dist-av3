// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musica.proto
// Protobuf Java Version: 3.25.0
package com.pedror.grpc;

public interface AtualizarUsuarioRequisicaoOrBuilder extends // @@protoc_insertion_point(interface_extends:musica.AtualizarUsuarioRequisicao)
com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string nome = 2;</code>
     * @return The nome.
     */
    java.lang.String getNome();

    /**
     * <code>string nome = 2;</code>
     * @return The bytes for nome.
     */
    com.google.protobuf.ByteString getNomeBytes();

    /**
     * <code>int32 idade = 3;</code>
     * @return The idade.
     */
    int getIdade();

    /**
     * <code>repeated int32 idPlaylists = 4;</code>
     * @return A list containing the idPlaylists.
     */
    java.util.List<java.lang.Integer> getIdPlaylistsList();

    /**
     * <code>repeated int32 idPlaylists = 4;</code>
     * @return The count of idPlaylists.
     */
    int getIdPlaylistsCount();

    /**
     * <code>repeated int32 idPlaylists = 4;</code>
     * @param index The index of the element to return.
     * @return The idPlaylists at the given index.
     */
    int getIdPlaylists(int index);
}
