import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements KeyListener, GameObserver {
    
    final GameManager gm;
    final int prefW, prefH;

    GamePanel(GameManager gm) {
        this.gm = gm;
        this.prefW = gm.WIDTH;
        this.prefH = gm.HEIGHT;
        setPreferredSize(new Dimension(prefW, prefH));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        gm.addObserver(this);
        SwingUtilities.invokeLater(() -> askDifficulty());
    }

    private void askDifficulty() {
        String[] options = {"Easy", "Medium", "Hard"};
        int choice = JOptionPane.showOptionDialog(this,
                "Choose Difficulty:", "Difficulty",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if (choice == 1) gm.setDifficulty(Difficulty.MEDIUM);
        else if (choice == 2) gm.setDifficulty(Difficulty.HARD);
        else gm.setDifficulty(Difficulty.EASY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame((Graphics2D) g);
    }

    private void drawGame(Graphics2D g2) {
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(0, 0, getWidth(), 40);

        g2.setColor(Color.WHITE);
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 14f));
        String header = String.format("Target: %s   Level: %d   Score: %d   Lives: %d   %s",
                gm.getTargetColor().name(), gm.getLevel(), gm.getScore(), gm.getLives(), gm.isPaused() ? "[PAUSED]" : "");
        g2.drawString(header, 10, 25);

        Bucket b = gm.getBucket();
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRect(b.x, getHeight() - b.height - 10, b.width, b.height);
        g2.setColor(Color.WHITE);
        g2.drawRect(b.x, getHeight() - b.height - 10, b.width, b.height);

        for (Ball ball : gm.getBalls()) {
            g2.setColor(ball.color.awtColor);
            g2.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
            g2.setColor(Color.BLACK);
            g2.drawOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
        }

        g2.setColor(gm.getTargetColor().awtColor);
        g2.fillRect(getWidth() - 90, 5, 80, 30);
        g2.setColor(Color.WHITE);
        g2.drawRect(getWidth() - 90, 5, 80, 30);
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyPressed(KeyEvent e) {
        int kc = e.getKeyCode();
        if (kc == KeyEvent.VK_LEFT || kc == KeyEvent.VK_A) gm.moveBucketLeft();
        else if (kc == KeyEvent.VK_RIGHT || kc == KeyEvent.VK_D) gm.moveBucketRight();
        else if (kc == KeyEvent.VK_P) gm.pauseToggle();
        else if (kc == KeyEvent.VK_R) gm.startNewGame();
        else if (kc == KeyEvent.VK_ESCAPE || kc == KeyEvent.VK_Q) System.exit(0); // ✅ Quit with ESC or Q
    }

    @Override
    public void update(GameManager g) { repaint(); }
}
