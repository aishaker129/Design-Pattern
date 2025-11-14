package Design_Patterns.Iterator.task3;

import java.util.LinkedList;
import java.util.Queue;

public class TreePlaylistIterator implements Iterator<Song>{
    private Queue<Song> queue = new LinkedList<>();

    public TreePlaylistIterator(TreeNode root) {
        traverse(root);
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);
        queue.add(node.song);
        traverse(node.right);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Song next() {
        return queue.poll();
    }
}

class TreeNode {
    Song song;
    TreeNode left, right;

    public TreeNode(Song song) {
        this.song = song;
    }
}
