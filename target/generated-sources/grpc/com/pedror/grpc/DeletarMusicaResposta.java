// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musica.proto
// Protobuf Java Version: 3.25.0
package com.pedror.grpc;

/**
 * Protobuf type {@code musica.DeletarMusicaResposta}
 */
public final class DeletarMusicaResposta extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:musica.DeletarMusicaResposta)
DeletarMusicaRespostaOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use DeletarMusicaResposta.newBuilder() to construct.
    private DeletarMusicaResposta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private DeletarMusicaResposta() {
        resultado_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new DeletarMusicaResposta();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_DeletarMusicaResposta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_DeletarMusicaResposta_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.DeletarMusicaResposta.class, com.pedror.grpc.DeletarMusicaResposta.Builder.class);
    }

    public static final int RESULTADO_FIELD_NUMBER = 1;

    @SuppressWarnings("serial")
    private volatile java.lang.Object resultado_ = "";

    /**
     * <code>string resultado = 1;</code>
     * @return The resultado.
     */
    @java.lang.Override
    public java.lang.String getResultado() {
        java.lang.Object ref = resultado_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            resultado_ = s;
            return s;
        }
    }

    /**
     * <code>string resultado = 1;</code>
     * @return The bytes for resultado.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getResultadoBytes() {
        java.lang.Object ref = resultado_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            resultado_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultado_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resultado_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultado_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resultado_);
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
        if (!(obj instanceof com.pedror.grpc.DeletarMusicaResposta)) {
            return super.equals(obj);
        }
        com.pedror.grpc.DeletarMusicaResposta other = (com.pedror.grpc.DeletarMusicaResposta) obj;
        if (!getResultado().equals(other.getResultado()))
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
        hash = (37 * hash) + RESULTADO_FIELD_NUMBER;
        hash = (53 * hash) + getResultado().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.pedror.grpc.DeletarMusicaResposta parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.pedror.grpc.DeletarMusicaResposta prototype) {
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
     * Protobuf type {@code musica.DeletarMusicaResposta}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:musica.DeletarMusicaResposta)
    com.pedror.grpc.DeletarMusicaRespostaOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_DeletarMusicaResposta_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_DeletarMusicaResposta_fieldAccessorTable.ensureFieldAccessorsInitialized(com.pedror.grpc.DeletarMusicaResposta.class, com.pedror.grpc.DeletarMusicaResposta.Builder.class);
        }

        // Construct using com.pedror.grpc.DeletarMusicaResposta.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            resultado_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.pedror.grpc.MusicasGrpcProto.internal_static_musica_DeletarMusicaResposta_descriptor;
        }

        @java.lang.Override
        public com.pedror.grpc.DeletarMusicaResposta getDefaultInstanceForType() {
            return com.pedror.grpc.DeletarMusicaResposta.getDefaultInstance();
        }

        @java.lang.Override
        public com.pedror.grpc.DeletarMusicaResposta build() {
            com.pedror.grpc.DeletarMusicaResposta result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.pedror.grpc.DeletarMusicaResposta buildPartial() {
            com.pedror.grpc.DeletarMusicaResposta result = new com.pedror.grpc.DeletarMusicaResposta(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(com.pedror.grpc.DeletarMusicaResposta result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.resultado_ = resultado_;
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
            if (other instanceof com.pedror.grpc.DeletarMusicaResposta) {
                return mergeFrom((com.pedror.grpc.DeletarMusicaResposta) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.pedror.grpc.DeletarMusicaResposta other) {
            if (other == com.pedror.grpc.DeletarMusicaResposta.getDefaultInstance())
                return this;
            if (!other.getResultado().isEmpty()) {
                resultado_ = other.resultado_;
                bitField0_ |= 0x00000001;
                onChanged();
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
                        case 10:
                            {
                                resultado_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000001;
                                break;
                            }
                        // case 10
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

        private java.lang.Object resultado_ = "";

        /**
         * <code>string resultado = 1;</code>
         * @return The resultado.
         */
        public java.lang.String getResultado() {
            java.lang.Object ref = resultado_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                resultado_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string resultado = 1;</code>
         * @return The bytes for resultado.
         */
        public com.google.protobuf.ByteString getResultadoBytes() {
            java.lang.Object ref = resultado_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                resultado_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string resultado = 1;</code>
         * @param value The resultado to set.
         * @return This builder for chaining.
         */
        public Builder setResultado(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            resultado_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>string resultado = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearResultado() {
            resultado_ = getDefaultInstance().getResultado();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>string resultado = 1;</code>
         * @param value The bytes for resultado to set.
         * @return This builder for chaining.
         */
        public Builder setResultadoBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            resultado_ = value;
            bitField0_ |= 0x00000001;
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
        // @@protoc_insertion_point(builder_scope:musica.DeletarMusicaResposta)
    }

    // @@protoc_insertion_point(class_scope:musica.DeletarMusicaResposta)
    private static final com.pedror.grpc.DeletarMusicaResposta DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.pedror.grpc.DeletarMusicaResposta();
    }

    public static com.pedror.grpc.DeletarMusicaResposta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeletarMusicaResposta> PARSER = new com.google.protobuf.AbstractParser<DeletarMusicaResposta>() {

        @java.lang.Override
        public DeletarMusicaResposta parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
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

    public static com.google.protobuf.Parser<DeletarMusicaResposta> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeletarMusicaResposta> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.pedror.grpc.DeletarMusicaResposta getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
