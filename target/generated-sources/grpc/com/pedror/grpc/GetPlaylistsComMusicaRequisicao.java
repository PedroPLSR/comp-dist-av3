// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musica.proto
// Protobuf Java Version: 3.25.0
package com.pedror.grpc;

/**
 * Protobuf type {@code musica.GetPlaylistsComMusicaRequisicao}
 */
public final class GetPlaylistsComMusicaRequisicao extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:musica.GetPlaylistsComMusicaRequisicao)
GetPlaylistsComMusicaRequisicaoOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use GetPlaylistsComMusicaRequisicao.newBuilder() to construct.
    private GetPlaylistsComMusicaRequisicao(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetPlaylistsComMusicaRequisicao() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GetPlaylistsComMusicaRequisicao();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetPlaylistsComMusicaRequisicao_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetPlaylistsComMusicaRequisicao_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.GetPlaylistsComMusicaRequisicao.class, com.pedror.grpc.GetPlaylistsComMusicaRequisicao.Builder.class);
    }

    public static final int IDMUSICA_FIELD_NUMBER = 1;

    private int idMusica_ = 0;

    /**
     * <code>int32 idMusica = 1;</code>
     * @return The idMusica.
     */
    @java.lang.Override
    public int getIdMusica() {
        return idMusica_;
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
        if (idMusica_ != 0) {
            output.writeInt32(1, idMusica_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (idMusica_ != 0) {
            size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, idMusica_);
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
        if (!(obj instanceof com.pedror.grpc.GetPlaylistsComMusicaRequisicao)) {
            return super.equals(obj);
        }
        com.pedror.grpc.GetPlaylistsComMusicaRequisicao other = (com.pedror.grpc.GetPlaylistsComMusicaRequisicao) obj;
        if (getIdMusica() != other.getIdMusica())
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
        hash = (37 * hash) + IDMUSICA_FIELD_NUMBER;
        hash = (53 * hash) + getIdMusica();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.pedror.grpc.GetPlaylistsComMusicaRequisicao prototype) {
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
     * Protobuf type {@code musica.GetPlaylistsComMusicaRequisicao}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:musica.GetPlaylistsComMusicaRequisicao)
    com.pedror.grpc.GetPlaylistsComMusicaRequisicaoOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetPlaylistsComMusicaRequisicao_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetPlaylistsComMusicaRequisicao_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.GetPlaylistsComMusicaRequisicao.class, com.pedror.grpc.GetPlaylistsComMusicaRequisicao.Builder.class);
        }

        // Construct using com.pedror.grpc.GetPlaylistsComMusicaRequisicao.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            idMusica_ = 0;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_GetPlaylistsComMusicaRequisicao_descriptor;
        }

        @java.lang.Override
        public com.pedror.grpc.GetPlaylistsComMusicaRequisicao getDefaultInstanceForType() {
            return com.pedror.grpc.GetPlaylistsComMusicaRequisicao.getDefaultInstance();
        }

        @java.lang.Override
        public com.pedror.grpc.GetPlaylistsComMusicaRequisicao build() {
            com.pedror.grpc.GetPlaylistsComMusicaRequisicao result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.pedror.grpc.GetPlaylistsComMusicaRequisicao buildPartial() {
            com.pedror.grpc.GetPlaylistsComMusicaRequisicao result = new com.pedror.grpc.GetPlaylistsComMusicaRequisicao(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(com.pedror.grpc.GetPlaylistsComMusicaRequisicao result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.idMusica_ = idMusica_;
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
            if (other instanceof com.pedror.grpc.GetPlaylistsComMusicaRequisicao) {
                return mergeFrom((com.pedror.grpc.GetPlaylistsComMusicaRequisicao) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.pedror.grpc.GetPlaylistsComMusicaRequisicao other) {
            if (other == com.pedror.grpc.GetPlaylistsComMusicaRequisicao.getDefaultInstance())
                return this;
            if (other.getIdMusica() != 0) {
                setIdMusica(other.getIdMusica());
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
                                idMusica_ = input.readInt32();
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

        private int idMusica_;

        /**
         * <code>int32 idMusica = 1;</code>
         * @return The idMusica.
         */
        @java.lang.Override
        public int getIdMusica() {
            return idMusica_;
        }

        /**
         * <code>int32 idMusica = 1;</code>
         * @param value The idMusica to set.
         * @return This builder for chaining.
         */
        public Builder setIdMusica(int value) {
            idMusica_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>int32 idMusica = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearIdMusica() {
            bitField0_ = (bitField0_ & ~0x00000001);
            idMusica_ = 0;
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
        // @@protoc_insertion_point(builder_scope:musica.GetPlaylistsComMusicaRequisicao)
    }

    // @@protoc_insertion_point(class_scope:musica.GetPlaylistsComMusicaRequisicao)
    private static final com.pedror.grpc.GetPlaylistsComMusicaRequisicao DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.pedror.grpc.GetPlaylistsComMusicaRequisicao();
    }

    public static com.pedror.grpc.GetPlaylistsComMusicaRequisicao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlaylistsComMusicaRequisicao> PARSER = new com.google.protobuf.AbstractParser<GetPlaylistsComMusicaRequisicao>() {

        @java.lang.Override
        public GetPlaylistsComMusicaRequisicao parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
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

    public static com.google.protobuf.Parser<GetPlaylistsComMusicaRequisicao> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlaylistsComMusicaRequisicao> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.pedror.grpc.GetPlaylistsComMusicaRequisicao getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
