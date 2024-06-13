from gql import gql, Client
from gql.transport.requests import RequestsHTTPTransport

class MusicaGraphQLClient:
    def __init__(self):
        self.transport = RequestsHTTPTransport(url='http://localhost:8080/graphql', use_json=True)
        self.client = Client(transport=self.transport, fetch_schema_from_transport=True)

    def criaUsuario(self, nome, idade, IdPlaylists):
        query = gql("""
            mutation {
                createUser(input: {name: "%s", age: %d, playlistIds: %s}) {
                    id
                    name
                    age
                    playlists {
                        id
                        name
                    }
                }
            }
        """ % (nome, idade, IdPlaylists))
        return self.client.execute(query)

    def criaPlaylist(self, nome, IdMusicas):
        query = gql("""
            mutation {
                createPlaylist(input: {name: "%s", musicIds: %s}) {
                    id
                    name
                    musics {
                        id
                        name
                    }
                }
            }
        """ % (nome, IdMusicas))
        return self.client.execute(query)

    def createMusica(self, nome, artista):
        query = gql("""
            mutation {
                createMusic(input: {name: "%s", artist: "%s"}) {
                    id
                    name
                    artist
                }
            }
        """ % (nome, artista))
        return self.client.execute(query)

    def listarUsuarios(self):
        query = gql("""
            query {
                users {
                    id
                    name
                    age
                    playlists {
                        id
                        name
                    }
                }
            }
        """)
        return self.client.execute(query)

    def getMusicas(self):
        query = gql("""
            query {
                musics {
                    id
                    name
                    artist
                }
            }
        """)
        return self.client.execute(query)

    def listarPlaylistsUsuario(self, idUsuario):
        query = gql("""
            query {
                user(id: %d) {
                    playlists {
                        id
                        name
                    }
                }
            }
        """ % idUsuario)
        return self.client.execute(query)

    def listarMusicasPlaylist(self, idPlaylist):
        query = gql("""
            query {
                playlist(id: %d) {
                    musics {
                        id
                        name
                    }
                }
            }
        """ % idPlaylist)
        return self.client.execute(query)

    def atualizarUsuario(self, idUsuario, nome, idade, IdPlaylists):
        query = gql("""
            mutation {
                updateUser(id: %d, input: {name: "%s", age: %d, playlistIds: %s}) {
                    id
                    name
                    age
                    playlists {
                        id
                        name
                    }
                }
            }
        """ % (idUsuario, nome, idade, IdPlaylists))
        return self.client.execute(query)

    def atualizaMusica(self, idMusica, nome, artista):
        query = gql("""
            mutation {
                updateMusic(id: %d, input: {name: "%s", artist: "%s"}) {
                    id
                    name
                    artist
                }
            }
        """ % (idMusica, nome, artista))
        return self.client.execute(query)

    def deletaUsuario(self, idUsuario):
        query = gql("""
            mutation {
                deleteUser(id: %d) {
                    id
                }
            }
        """ % idUsuario)
        return self.client.execute(query)

    def deletaMusica(self, idMusica):
        query = gql("""
            mutation {
                deleteMusic(id: %d) {
                    id
                }
            }
        """ % idMusica)
        return self.client.execute(query)


client = MusicaGraphQLClient()
client.createMusica('musicaIRADA', 'artistaMASSA')
client.getMusicas()