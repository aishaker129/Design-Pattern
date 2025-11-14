package Design_Patterns.Iterator.task3;


public class ArrayPlaylistIterator implements Iterator<Song>{
    private Song[] songs;
    private int index = 0;

    public ArrayPlaylistIterator(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.length;
    }

    @Override
    public Song next() {
        return songs[index++];
    }
}
