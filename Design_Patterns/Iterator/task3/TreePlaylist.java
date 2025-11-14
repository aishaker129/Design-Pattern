package Design_Patterns.Iterator.task3;

class TreePlaylist implements Aggregate<Song> {
    private TreeNode root;

    public TreePlaylist(TreeNode root) {
        this.root = root;
    }

    @Override
    public Iterator<Song> createIterator() {
        return (Iterator<Song>) new TreePlaylistIterator(root);
    }
}
