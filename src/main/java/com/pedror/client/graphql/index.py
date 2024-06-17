import requests
from gql import gql, Client
from gql.transport.requests import RequestsHTTPTransport

class MusicaGraphQLClient:
    def __init__(self, url='http://localhost:8080/graphql'):
        self.url = url
        self.transport = RequestsHTTPTransport(url=self.url, use_json=True)
        self.client = Client(transport=self.transport, fetch_schema_from_transport=True)

    def get_usuarios(self):
        query = gql("""
            query {
                usuarios {
                    id
                    nome
                    idade
                    playlists {
                        id
                        nome
                    }
                }
            }
        """)
        result = self.client.execute(query)
        print("Usuarios:", result)
        return result

    def get_musicas(self):
        query = gql("""
            query {
                musicas {
                    id
                    nome
                    artista
                }
            }
        """)
        result = self.client.execute(query)
        print("Musicas:", result)
        return result

    def get_playlists_do_usuario(self, id_usuario):
        query = gql("""
            query GetPlaylistsDoUsuario($idUsuario: Int!) {
                playlistsDoUsuario(idUsuario: $idUsuario) {
                    id
                    nome
                    musicas {
                        id
                        nome
                    }
                }
            }
        """)
        variables = {"idUsuario": int(id_usuario)}  # Certifique-se de converter para inteiro
        result = self.client.execute(query, variable_values=variables)
        print(f"Playlists do Usuario {id_usuario}:", result)
        return result

    def get_musicas_da_playlist(self, id_playlist):
        query = gql("""
            query GetMusicasDaPlaylist($idPlaylist: Int!) {
                musicasDaPlaylist(idPlaylist: $idPlaylist) {
                    id
                    nome
                }
            }
        """)
        variables = {"idPlaylist": int(id_playlist)}
        result = self.client.execute(query, variable_values=variables)
        print(f"Musicas da Playlist {id_playlist}:", result)
        return result


    def get_playlists_com_musica(self, id_musica):
        query = gql("""
            query GetPlaylistsComMusica($idMusica: Int!) {
                playlistsComMusica(idMusica: $idMusica) {
                    id
                    nome
                    musicas {
                        id
                        nome
                    }
                }
            }
        """)
        variables = {"idMusica": id_musica}
        result = self.client.execute(query, variable_values=variables)
        print(f"Playlists com Musica {id_musica}:", result)
        return result

    def get_usuarios_from_url(self):
        response = requests.get(url=f'{self.url}/usuarios')
        if response.status_code == 200:
            print("Usuarios from URL:", response.json())
            return response.json()
        else:
            print(f'Erro com status code: {response.status_code}')
            return f'Erro com status code: {response.status_code}'

client = MusicaGraphQLClient()
client.get_musicas()
client.get_usuarios()
# Você pode descomentar as chamadas abaixo para ver mais saídas
client.get_playlists_do_usuario(1)
client.get_musicas_da_playlist(1)
client.get_playlists_com_musica(1)
# client.get_playlets_com_musirs_comuasi
