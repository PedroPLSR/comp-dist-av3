// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musica.proto
// Protobuf Java Version: 3.25.0
package com.pedror.grpc;

/**
 * Protobuf type {@code musica.GetMusicasDaPlaylistRequisicao}
 */
public final class GetMusicasDaPlaylistRequisicao extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:musica.GetMusicasDaPlaylistRequisicao)
GetMusicasDaPlaylistRequisicaoOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use GetMusicasDaPlaylistRequisicao.newBuilder() to construct.
    private GetMusicasDaPlaylistRequisicao(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetMusicasDaPlaylistRequisicao() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GetMusicasDaPlaylistRequisicao();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetMusicasDaPlaylistRequisicao_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetMusicasDaPlaylistRequisicao_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.GetMusicasDaPlaylistRequisicao.class, com.pedror.grpc.GetMusicasDaPlaylistRequisicao.Builder.class);
    }

    public static final int IDPLAYLIST_FIELD_NUMBER = 1;

    private int idPlaylist_ = 0;

    /**
     * <code>int32 idPlaylist = 1;</code>
     * @return The idPlaylist.
     */
    @java.lang.Override
    public int getIdPlaylist() {
        return idPlaylist_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;
        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (idPlaylist_ != 0) {
            output.writeInt32(1, idPlaylist_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (idPlaylist_ != 0) {
            size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, idPlaylist_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.pedror.grpc.GetMusicasDaPlaylistRequisicao)) {
            return super.equals(obj);
        }
        com.pedror.grpc.GetMusicasDaPlaylistRequisicao other = (com.pedror.grpc.GetMusicasDaPlaylistRequisicao) obj;
        if (getIdPlaylist() != other.getIdPlaylist())
            return false;
        if (!getUnknownFields().equals(other.getUnknownFields()))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + IDPLAYLIST_FIELD_NUMBER;
        hash = (53 * hash) + getIdPlaylist();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.pedror.grpc.GetMusicasDaPlaylistRequisicao prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code musica.GetMusicasDaPlaylistRequisicao}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:musica.GetMusicasDaPlaylistRequisicao)
    com.pedror.grpc.GetMusicasDaPlaylistRequisicaoOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetMusicasDaPlaylistRequisicao_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetMusicasDaPlaylistRequisicao_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.GetMusicasDaPlaylistRequisicao.class, com.pedror.grpc.GetMusicasDaPlaylistRequisicao.Builder.class);
        }

        // Construct using com.pedror.grpc.GetMusicasDaPlaylistRequisicao.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            idPlaylist_ = 0;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetMusicasDaPlaylistRequisicao_descriptor;
        }

        @java.lang.Override
        public com.pedror.grpc.GetMusicasDaPlaylistRequisicao getDefaultInstanceForType() {
            return com.pedror.grpc.GetMusicasDaPlaylistRequisicao.getDefaultInstance();
        }

        @java.lang.Override
        public com.pedror.grpc.GetMusicasDaPlaylistRequisicao build() {
            com.pedror.grpc.GetMusicasDaPlaylistRequisicao result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.pedror.grpc.GetMusicasDaPlaylistRequisicao buildPartial() {
            com.pedror.grpc.GetMusicasDaPlaylistRequisicao result = new com.pedror.grpc.GetMusicasDaPlaylistRequisicao(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(com.pedror.grpc.GetMusicasDaPlaylistRequisicao result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.idPlaylist_ = idPlaylist_;
            }
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.pedror.grpc.GetMusicasDaPlaylistRequisicao) {
                return mergeFrom((com.pedror.grpc.GetMusicasDaPlaylistRequisicao) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.pedror.grpc.GetMusicasDaPlaylistRequisicao other) {
            if (other == com.pedror.grpc.GetMusicasDaPlaylistRequisicao.getDefaultInstance())
                return this;
            if (other.getIdPlaylist() != 0) {
                setIdPlaylist(other.getIdPlaylist());
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch(tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            {
                                idPlaylist_ = input.readInt32();
                                bitField0_ |= 0x00000001;
                                break;
                            }
                        // case 8
                        default:
                            {
                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                    // was an endgroup tag
                                    done = true;
                                }
                                break;
                            }
                    }
                    // switch (tag)
                }
                // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            }
            // finally
            return this;
        }

        private int bitField0_;

        private int idPlaylist_;

        /**
         * <code>int32 idPlaylist = 1;</code>
         * @return The idPlaylist.
         */
        @java.lang.Override
        public int getIdPlaylist() {
            return idPlaylist_;
        }

        /**
         * <code>int32 idPlaylist = 1;</code>
         * @param value The idPlaylist to set.
         * @return This builder for chaining.
         */
        public Builder setIdPlaylist(int value) {
            idPlaylist_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>int32 idPlaylist = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearIdPlaylist() {
            bitField0_ = (bitField0_ & ~0x00000001);
            idPlaylist_ = 0;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:musica.GetMusicasDaPlaylistRequisicao)
    }

    // @@protoc_insertion_point(class_scope:musica.GetMusicasDaPlaylistRequisicao)
    private static final com.pedror.grpc.GetMusicasDaPlaylistRequisicao DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.pedror.grpc.GetMusicasDaPlaylistRequisicao();
    }

    public static com.pedror.grpc.GetMusicasDaPlaylistRequisicao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMusicasDaPlaylistRequisicao> PARSER = new com.google.protobuf.AbstractParser<GetMusicasDaPlaylistRequisicao>() {

        @java.lang.Override
        public GetMusicasDaPlaylistRequisicao parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
                builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
        }
    };

    public static com.google.protobuf.Parser<GetMusicasDaPlaylistRequisicao> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMusicasDaPlaylistRequisicao> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.pedror.grpc.GetMusicasDaPlaylistRequisicao getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
