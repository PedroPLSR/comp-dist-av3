const soap = require('soap');
const url = 'http://localhost:8080/soap/musica?wsdl';

function getUsuarios() {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.getUsuarios({}, function(err, result) {
            if (err) throw err;
            console.log('Lista de Usuários:', result);
        });
    });
}

function getMusicas() {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.getMusicas({}, function(err, result) {
            if (err) throw err;
            console.log('Lista de Músicas:', result);
        });
    });
}

function getPlaylistsDoUsuario(idUsuario) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.getPlaylistsDoUsuario({ arg0: idUsuario }, function(err, result) {  // Mudança de 'idUsuario' para 'arg0' ou outra chave que o WSDL define
            if (err) throw err;
            console.log(`Playlists do Usuário ${idUsuario}:`, result);
        });
    });
}

function getMusicasDaPlaylist(idPlaylist) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.getMusicasDaPlaylist({ arg0: idPlaylist }, function(err, result) {  // Similar ajuste como acima
            if (err) throw err;
            console.log(`Músicas da Playlist ${idPlaylist}:`, result);
        });
    });
}

function getPlaylistsComMusica(idMusica) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.getPlaylistsComMusica({ arg0: idMusica }, function(err, result) {
            if (err) throw err;
            console.log(`Playlists com a Música ${idMusica}:`, result);
        });
    });
}

function criarUsuario(usuario) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.criarUsuario({ arg0: usuario }, function(err, result) {
            if (err) throw err;
            console.log('Usuário Criado:', result);
        });
    });
}

function criarMusica(musica) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.criarMusica({ arg0: musica }, function(err, result) {
            if (err) throw err;
            console.log('Música Criada:', result);
        });
    });
}

function criarPlaylist(playlist) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        // Encapsulando os dados de playlist dentro de 'arg0'
        client.criarPlaylist({ arg0: { nome: playlist.nome, idMusicas: playlist.musicas } }, function(err, result) {
            if (err) throw err;
            console.log('Playlist Criada:', result);
        });
    });
}

function updateUsuario(idUsuario, usuario) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.updateCliente({ arg0: idUsuario, arg1: usuario }, function(err, result) {
            if (err) throw err;
            console.log('Usuário Atualizado!');
        });
    });
}

function updateMusica(idMusica, musica) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.updateMusica({ arg0: idMusica, arg1: musica }, function(err, result) {
            if (err) throw err;
            console.log('Música Atualizada!');
        });
    });
}

function updatePlaylist(idPlaylist, playlist) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        // Ajustando para usar 'idMusicas' no lugar de 'musicas'
        client.updatePlaylist({ arg0: idPlaylist, arg1: { nome: playlist.nome, idMusicas: playlist.musicas } }, function(err, result) {
            if (err) throw err;
            console.log('Playlist Atualizada!');
        });
    });
}

function deletarCliente(idUsuario) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.deletarCliente({ arg0: idUsuario }, function(err, result) {
            if (err) throw err;
            console.log('Cliente deletado:', result);
        });
    });
}

function deletarMusica(idMusica) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.deletarMusica({ arg0: idMusica }, function(err, result) {
            if (err) throw err;
            console.log('Música deletada:', result);
        });
    });
}

function deletarPlaylist(idPlaylist) {
    soap.createClient(url, function(err, client) {
        if (err) throw err;
        client.deletarPlaylist({ arg0: idPlaylist }, function(err, result) {
            if (err) throw err;
            console.log('Playlist deletada:', result);
        });
    });
}


// Dados de exemplo
const novoUsuario = {
    nome: "Novo Usuário",
    idade: 30
};

const novaMusica = {
    nome: "Nova Música",  // Alterado de 'titulo' para 'nome' para atender a expectativa do WSDL
    artista: "Novo Artista"
};

const novaPlaylist = {
    nome: "Nova Playlist",
    musicas: [1, 2]  // IDs de músicas que deveriam existir no sistema
};

const usuarioAtualizado = {
    nome: "Usuário Atualizado",
    idade: 35
};

const musicaAtualizada = {
    nome: "Música Atualizada",
    artista: "Artista Atualizado"
};

const playlistAtualizada = {
    nome: "Playlist Atualizada",
    musicas: [1, 3]  // Assume-se que esses IDs de música existem no sistema
};


// Testando as funções
// getUsuarios();
// getMusicas();
// getPlaylistsDoUsuario(2); // Use um ID válido
// getMusicasDaPlaylist(3); // Use um ID válido
// getPlaylistsComMusica(5); // Use um ID válido
// criarUsuario(novoUsuario);
// criarMusica(novaMusica);
// criarPlaylist(novaPlaylist);
// updateUsuario(1, usuarioAtualizado);
// updateMusica(1, musicaAtualizada);
// updatePlaylist(1, playlistAtualizada);
// deletarCliente(2);
// deletarMusica(2);
// deletarPlaylist(3);