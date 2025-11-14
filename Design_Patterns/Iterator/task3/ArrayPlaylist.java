package Design_Patterns.Iterator.task3;

public class ArrayPlaylist implements Aggregate<Song>{
    private Song[] songs;

    public ArrayPlaylist(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public Iterator<Song> createIterator() {
        return (Iterator<Song>) new ArrayPlaylistIterator(songs);
    }
}
