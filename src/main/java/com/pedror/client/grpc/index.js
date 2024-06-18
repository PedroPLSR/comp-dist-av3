const fs = require('fs');  // Adiciona esta linha no topo do seu arquivo
const path = require('path');
const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

const PROTO_PATH = '../../../../../../../src/main/proto/musica.proto';  // Caminho para o seu arquivo .proto

const packageDefinition = protoLoader.loadSync(PROTO_PATH, {
    keepCase: true,
    longs: String,
    enums: String,
    defaults: true,
    oneofs: true
});

const musicaProto = grpc.loadPackageDefinition(packageDefinition).musica;

const client = new musicaProto.MusicaService('localhost:9000', grpc.credentials.createInsecure());



function getUsuarios() {
    client.getUsuarios({}, (error, response) => {
        if (error) {
            console.error('Erro ao buscar usuários:', error);
            return;
        }
        console.log('Usuários:', response);
    });
}

function getMusicas() {
    client.getMusicas({}, (error, response) => {
        if (error) {
            console.error('Erro ao buscar músicas:', error);
            return;
        }
        console.log('Músicas:', response);
    });
}

function getPlaylistsDoUsuario(idUsuario) {
    client.getPlaylistsDoUsuario({ idUsuario: idUsuario }, (error, response) => {
        if (error) {
            console.error('Erro ao buscar playlists do usuário:', error);
            return;
        }
        console.log('Playlists do Usuário:', response);
    });
}

function getMusicasDaPlaylist(idPlaylist) {
    client.getMusicasDaPlaylist({ idPlaylist: idPlaylist }, (error, response) => {
        if (error) {
            console.error('Erro ao buscar músicas da playlist:', error);
            return;
        }
        console.log('Músicas da Playlist:', response);
    });
}

function criarUsuario(nome, idade, idPlaylists) {
    const request = {
        nome: nome,
        idade: idade,
        idPlaylists: idPlaylists
    };

    client.criarUsuario(request, (error, response) => {
        if (error) {
            console.error('Erro ao criar usuário:', error);
            return;
        }
        console.log('Usuário Criado:', response);
    });
}

function criarMusica(nome, artista) {
    const request = {
        nome: nome,
        artista: artista
    };

    client.criarMusica(request, (error, response) => {
        if (error) {
            console.error('Erro ao criar música:', error);
            return;
        }
        console.log('Música Criada:', response);
    });
}

function criarPlaylist(nome, idMusicas) {
    const request = {
        nome: nome,
        idMusicas: idMusicas
    };

    client.criarPlaylist(request, (error, response) => {
        if (error) {
            console.error('Erro ao criar playlist:', error);
            return;
        }
        console.log('Playlist Criada:', response);
    });
}

function atualizarUsuario(id, nome, idade, idPlaylists) {
    const request = {
        id: id,
        nome: nome,
        idade: idade,
        idPlaylists: idPlaylists
    };

    client.atualizarUsuario(request, (error, response) => {
        if (error) {
            console.error('Erro ao atualizar usuário:', error);
            return;
        }
        console.log('Usuário Atualizado:', response);
    });
}

function atualizarMusica(id, nome, artista) {
    const request = {
        id: id,
        nome: nome,
        artista: artista
    };

    client.atualizarMusica(request, (error, response) => {
        if (error) {
            console.error('Erro ao atualizar música:', error);
            return;
        }
        console.log('Música Atualizada:', response);
    });
}

function atualizarPlaylist(id, nome, idMusicas) {
    const request = {
        id: id,
        nome: nome,
        idMusicas: idMusicas
    };

    client.atualizarPlaylist(request, (error, response) => {
        if (error) {
            console.error('Erro ao atualizar playlist:', error);
            return;
        }
        console.log('Playlist Atualizada:', response);
    });
}

function deletarUsuario(id) {
    client.deletarUsuario({ id: id }, (error, response) => {
        if (error) {
            console.error('Erro ao deletar usuário:', error);
            return;
        }
        console.log('Usuário Deletado:', response);
    });
}

function deletarMusica(id) {
    client.deletarMusica({ id: id }, (error, response) => {
        if (error) {
            console.error('Erro ao deletar música:', error);
            return;
        }
        console.log('Música Deletada:', response);
    });
}

function deletarPlaylist(id) {
    client.deletarPlaylist({ id: id }, (error, response) => {
        if (error) {
            console.error('Erro ao deletar playlist:', error);
            return;
        }
        console.log('Playlist Deletada:', response);
    });
}

// console.log(client)
// getUsuarios();
// getMusicas();
// getPlaylistsDoUsuario(3); // Substitua 1 pelo ID de um usuário existente
// getMusicasDaPlaylist(3); // Substitua 1 pelo ID de uma playlist existente
// criarUsuario('Alice', 30, [1, 2]);
// criarMusica('Noite Estrelada', 'Vincent');
// criarPlaylist('Minhas Favoritas', [1, 2]);
// atualizarUsuario(1, 'Alice Atualizada', 35, [3, 4]);
// atualizarMusica(2, 'Lua Nova', 'Vincent Van Gogh');
// atualizarPlaylist(1, 'Favoritas Atualizadas', [3, 4, 5]);
// deletarUsuario(1); // Substitua 1 pelo ID do usuário que deseja deletar
// deletarMusica(2); // Substitua 2 pelo ID da música que deseja deletar
// deletarPlaylist(3); // Substitua 3 pelo ID da playlist que deseja deletar

const csvFile = 'grpc_performance.csv';
fs.writeFileSync(csvFile, 'operation,response_time_ms,request_size_bytes\n');

function measureGrpcCall(operationName, request, grpcFunction) {
    const startTime = Date.now();
    const requestSize = Buffer.byteLength(JSON.stringify(request));

    grpcFunction(request, (error, response) => {
        const responseTime = Date.now() - startTime;
        const logEntry = `${operationName},${responseTime},${requestSize}\n`;
        fs.appendFileSync(csvFile, logEntry);

        if (error) {
            console.error(`Erro ao executar ${operationName}:`, error);
            return;
        }
        console.log(`${operationName} resposta:`, response);
    });
}

function getUsuarios() {
    measureGrpcCall('getUsuarios', {}, client.getUsuarios.bind(client));
}

getUsuarios()