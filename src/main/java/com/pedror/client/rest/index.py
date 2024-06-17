import requests

class MusicaRestClient:
    def __init__(self):
        self.url = 'http://localhost:8080/rest/musica'
        self.headers = {'Content-Type': 'application/json'}

    # Cria
    def criaUsuario(self, nome, idade, IdPlaylists):
        body = {
            'nome': nome,
            'idade': idade,
            'IdPlaylists': IdPlaylists
        }
        return requests.post(url=f'{self.url}/criarUsuario', json=body, headers=self.headers).json()

    def criaPlaylist(self, nome, IdMusicas):
        body = {
            'nome': nome,
            'IdMusicas': IdMusicas
        }
        return requests.post(url=f'{self.url}/criarPlaylist', json=body, headers=self.headers).json()

    def criaMusica(self, nome, artista):
        body = {
            'nome': nome,
            'artista': artista
        }
        return requests.post(url=f'{self.url}/criarMusica', json=body, headers=self.headers).json()

    #lista
    def listarUsuarios(self):
        return requests.get(url=f'{self.url}/usuarios').json()

    def listarMusicas(self):
        return requests.get(url=f'{self.url}/musicas').json()

    def listarPlaylistUsuarios(self, idUsuario):
        return requests.get(url=f'{self.url}/playlists-usuario/{idUsuario}').json()

    def listarMusicasPlaylist(self, idPlaylist):
        return requests.get(url=f'{self.url}/musicas-playlist/{idPlaylist}').json()

    def listarPlaylistsComMusica(self, idMusica):
        return requests.get(url=f'{self.url}/playlists-musica/{idMusica}').json()

    #atualiza
    def atualizarUsuario(self, idUsuario, nome, idade, IdPlaylists):
        body = {
            'nome': nome,
            'idade': idade,
            'IdPlaylists': IdPlaylists
        }
        return requests.put(url=f'{self.url}/updateCliente/{idUsuario}', json=body, headers=self.headers).status_code

    def atualizaMusica(self, idMusica, nome, artista):
        body = {
            'nome': nome,
            'artista': artista
        }
        return requests.put(url=f'{self.url}/updateMusica/{idMusica}', json=body, headers=self.headers).status_code

    def atualizaPlaylist(self, idPlaylist, nome, IdMusicas):
        body = {
            'nome': nome,
            'IdMusicas': IdMusicas
        }
        return requests.put(url=f'{self.url}/updatePlaylist/{idPlaylist}', json=body, headers=self.headers).status_code

    #deleta
    def deletaUsuario(self, idUsuario):
        return requests.delete(url=f'{self.url}/deletarCliente/{idUsuario}').text

    def deletaMusica(self, idMusica):
        return requests.delete(url=f'{self.url}/deletarMusica/{idMusica}').text

    def deletaPlaylist(self, idPlaylist):
        return requests.delete(url=f'{self.url}/deletarPlaylist/{idPlaylist}').text



client = MusicaRestClient()
print(client.listarUsuarios())
print(client.listarMusicas())
