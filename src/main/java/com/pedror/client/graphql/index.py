import requests
import json
import time
import sys
from gql import gql, Client
from gql.transport.requests import RequestsHTTPTransport

class MusicaGraphQLClient:
    def __init__(self, url='http://localhost:8080/graphql'):
        self.url = url
        self.transport = RequestsHTTPTransport(url=self.url, use_json=True)
        self.client = Client(transport=self.transport, fetch_schema_from_transport=True)

    # printar

    # def get_usuarios(self):
    #     query = gql("""
    #         query {
    #             usuarios {
    #                 id
    #                 nome
    #                 idade
    #                 playlists {
    #                     id
    #                     nome
    #                 }
    #             }
    #         }
    #     """)
    #     start_time = time.time()  # Inicia a medição do tempo
    #     result = self.client.execute(query)
    #     end_time = time.time()  # Finaliza a medição do tempo
    #     response_time = (end_time - start_time) * 1000  # Tempo de resposta em milissegundos
    #     request_size = sys.getsizeof(json.dumps({"query": str(query)}))  # Tamanho aproximado da requisição
    #
    #     # Armazenamento dos dados em um arquivo CSV
    #     with open('graphql_performance.csv', 'a') as file:
    #         file.write(f"getUsuarios,{response_time},{request_size}\n")
    #
    #     print("Usuarios:", result)

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

    # criar
    def create_usuario(self, nome, idade, id_playlists=[]):
        mutation = gql("""
            mutation CreateUsuario($nome: String!, $idade: Int!, $idPlaylists: [Int!]) {
                createUsuario(nome: $nome, idade: $idade, idPlaylists: $idPlaylists) {
                    id
                    nome
                    idade
                }
            }
        """)
        variables = {"nome": nome, "idade": idade, "idPlaylists": id_playlists}
        result = self.client.execute(mutation, variable_values=variables)
        print("Usuário Criado:", result)
        return result

    def create_musica(self, nome, artista):
        mutation = gql("""
            mutation CreateMusica($nome: String!, $artista: String!) {
                createMusica(nome: $nome, artista: $artista) {
                    id
                    nome
                    artista
                }
            }
        """)
        variables = {"nome": nome, "artista": artista}
        result = self.client.execute(mutation, variable_values=variables)
        print("Música Criada:", result)
        return result

    def create_playlist(self, nome, id_musicas=[]):
        mutation = gql("""
            mutation CreatePlaylist($nome: String!, $idMusicas: [Int!]) {
                createPlaylist(nome: $nome, idMusicas: $idMusicas) {
                    id
                    nome
                    musicas {
                        id
                        nome
                    }
                }
            }
        """)
        variables = {"nome": nome, "idMusicas": id_musicas}
        result = self.client.execute(mutation, variable_values=variables)
        print("Playlist Criada:", result)
        return result

    # atulizar
    def update_usuario(self, id_usuario, nome, idade, id_playlists=[]):
        mutation = gql("""
            mutation UpdateUsuario($id: Int!, $nome: String!, $idade: Int!, $idPlaylists: [Int!]) {
                updateUsuario(idUsuario: $id, nome: $nome, idade: $idade, idPlaylists: $idPlaylists)
            }
        """)
        variables = {"id": id_usuario, "nome": nome, "idade": idade, "idPlaylists": id_playlists}
        result = self.client.execute(mutation, variable_values=variables)
        print("Usuário Atualizado.")
        return result

    def update_musica(self, id_musica, nome, artista):
        mutation = gql("""
            mutation UpdateMusica($id: Int!, $nome: String!, $artista: String!) {
                updateMusica(idMusica: $id, nome: $nome, artista: $artista)
            }
        """)
        variables = {"id": id_musica, "nome": nome, "artista": artista}
        result = self.client.execute(mutation, variable_values=variables)
        print("Música Atualizada.")
        return result

    def update_playlist(self, id_playlist, nome, id_musicas=[]):
        mutation = gql("""
            mutation UpdatePlaylist($id: Int!, $nome: String!, $idMusicas: [Int!]) {
                updatePlaylist(idPlaylist: $id, nome: $nome, idMusicas: $idMusicas)
            }
        """)
        variables = {"id": id_playlist, "nome": nome, "idMusicas": id_musicas}
        result = self.client.execute(mutation, variable_values=variables)
        print("Playlist Atualizada.")
        return result

    # deletar
    def delete_usuario(self, id_usuario):
        mutation = gql("""
            mutation DeleteUsuario($id: Int!) {
                deleteUsuario(idUsuario: $id)
            }
        """)
        variables = {"id": id_usuario}
        result = self.client.execute(mutation, variable_values=variables)
        print("Usuário Excluído:", result)
        return result

    def delete_musica(self, id_musica):
        mutation = gql("""
            mutation DeleteMusica($id: Int!) {
                deleteMusica(idMusica: $id)
            }
        """)
        variables = {"id": id_musica}
        result = self.client.execute(mutation, variable_values=variables)
        print("Música Excluída:", result)
        return result

    def delete_playlist(self, id_playlist):
        mutation = gql("""
            mutation DeletePlaylist($id: Int!) {
                deletePlaylist(idPlaylist: $id)
            }
        """)
        variables = {"id": id_playlist}
        result = self.client.execute(mutation, variable_values=variables)
        print("Playlist Excluída:", result)
        return result


client = MusicaGraphQLClient()
# client.get_musicas()
client.get_usuarios()
# # Você pode descomentar as chamadas abaixo para ver mais saídas
# client.get_playlists_do_usuario(1)
# client.get_musicas_da_playlist(1)
# client.get_playlists_com_musica(1)

# client.create_usuario("Pedro", 20, [1, 2]) # Crie um usuário com idades e playlists FUNCIONA
#client.create_musica("Música Teste", "Artista Teste") # Crie uma música FUNCIONA
#client.create_playlist("Playlist muito massa", [2]) # Crie uma playlist com músicas FUNCIONA

#client.update_usuario(1, "Pedro", 21, [1, 2]) # Atualize um usuário FUNCIONA
#client.update_musica(1, "Música Teste", "Artista Teste") # Atualize uma música FUNCIONA
# client.update_playlist(1, "Playlist Teste", [1, 2]) # Atualize uma playlist FUNCIONA?

# client.delete_usuario(0) # Exclua um usuário FUNCIONA
# client.delete_musica(0) # Exclua uma música FUNCIONA
# client.delete_playlist(0) # Exclua uma playlist FUNCIONA?



# Medição de desempenho

# if __name__ == "__main__":
#     with open('graphql_performance.csv', 'w') as file:
#         file.write('operation,response_time_ms,request_size_bytes\n')  # Isso escreve o cabeçalho do CSV
#
#     client = MusicaGraphQLClient()
#     client.get_usuarios()  # Executa a função get_usuarios para medir a performance