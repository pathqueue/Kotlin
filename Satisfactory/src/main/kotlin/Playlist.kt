import java.util.*

enum class SongGenre {
    Country,
    Electronic,
    Funk,
    Hiphop,
    Jazz,
    Latin,
    Pop,
    Punk,
    Reggae,
    Rock,
    Metal,
    Soul,
    RnB
}

data class Artist(
    val nickName: String
) {
    override fun toString(): String {
        return nickName
    }
}

data class Album(
    val albumName: String,
    val releaseDate: Date
) {
    val songs: MutableList<Song> = mutableListOf()

    fun addSong(song: Song) {
        this.songs.add(song)
    }
}

data class Song(
    val artist: Artist,
    val songName: String,
    val songGenre: SongGenre,
    val releaseDate: Date,
    val duration: Int
) {
    val features: MutableList<Artist> = mutableListOf()
    val productions: MutableList<Artist> = mutableListOf()

    fun addFeature(feature: String) {
        this.features.add(Artist(feature))
    }

    fun addProduction(production: String) {
        this.productions.add(Artist(production))
    }

    override fun toString(): String {
        return "Artist: $artist\nSong Name: $songName\nSong Genre: $songGenre\n\n"
    }
}

interface Playlist {
    fun addSong(song: Song)
    fun addAlbum(album: Album)
    fun shufflePlaylist()
}

class PlayListImpl : Playlist {
    private val playlist: MutableList<Song> = mutableListOf()

    override fun addSong(song: Song) {
        this.playlist.add(song)
    }

    override fun addAlbum(album: Album) {
        this.playlist.addAll(album.songs)
    }

    override fun shufflePlaylist() {
        this.playlist.shuffle()
    }

    override fun toString(): String {
        var str = ""
        var i = 0
        playlist.forEach {
            str += (++i).toString() + '\n' + it.toString()
        }
        return str
    }
}