import javax.swing.SwingUtilities;

public class ColorCatch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameManager gm = GameManager.getInstance();
            gm.initAndShowGUI();
        });
    }
}
