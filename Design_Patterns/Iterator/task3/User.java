package Design_Patterns.Iterator.task3;


public class User {
    public static void main(String[] args) {
        Song[] recentSongs = {
            new Song("Shape of You"),
            new Song("Blinding Lights"),
            new Song("Senorita")
        };
        ArrayPlaylist recentPlaylist = new ArrayPlaylist(recentSongs);

      
        ListPlaylist favoritePlaylist = new ListPlaylist();
        favoritePlaylist.addSong(new Song("Believer"));
        favoritePlaylist.addSong(new Song("Counting Stars"));
        favoritePlaylist.addSong(new Song("Perfect"));

        
        TreeNode root = new TreeNode(new Song("Bohemian Rhapsody"));
        root.left = new TreeNode(new Song("Imagine"));
        root.right = new TreeNode(new Song("Hotel California"));
        TreePlaylist albumPlaylist = new TreePlaylist(root);

        
        playSongs("Recently Played", recentPlaylist.createIterator());
        playSongs("Favorite Songs", favoritePlaylist.createIterator());
        playSongs("Categorized Albums", albumPlaylist.createIterator());
    }

    private static void playSongs(String playlistName, Iterator<Song> iterator) {
        System.out.println("\n" + playlistName + " Playlist:");
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next().getTitle());
        }
    }

}
