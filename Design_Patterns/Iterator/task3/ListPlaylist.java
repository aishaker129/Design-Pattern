package Design_Patterns.Iterator.task3;

import java.util.ArrayList;
import java.util.List;

public class ListPlaylist implements Aggregate<Song>{
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> createIterator() {
        return (Iterator<Song>) new ListPlaylistIterator(songs);
    }

    
}
