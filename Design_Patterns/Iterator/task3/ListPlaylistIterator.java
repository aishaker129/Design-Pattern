package Design_Patterns.Iterator.task3;

import java.util.List;

public class ListPlaylistIterator implements Iterator<Song>{
    private List<Song> songs;
    private int index = 0;

    public ListPlaylistIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
