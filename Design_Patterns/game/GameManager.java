import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class GameManager {
     private static final GameManager INSTANCE = new GameManager();

    // Game state
    private static final int WIN_SCORE = 300;
    private int score = 0;
    private int lives = 3;
    private int level = 1;
    private ColorType targetColor = ColorType.RED;

    // world
    final int WIDTH = 640;
    final int HEIGHT = 480;

    Bucket bucket;
    final List<Ball> balls = new CopyOnWriteArrayList<>();
    final List<GameObserver> observers = new ArrayList<>();

    // patterns / strategies
    ScoringStrategy scoringStrategy = new EasyScoring();
    BallFactory ballFactory = new BallFactory();

    // timers
    private javax.swing.Timer gameTimer;
    private javax.swing.Timer spawnTimer;

    // UI
    private JFrame frame;
    private GamePanel gamePanel;
    
    // control flags
    private boolean running = false;
    private boolean paused = false;

    // configuration
    private int baseTickMs = 20;
    private int spawnIntervalMs = 800;

    private GameManager() {
        bucket = new Bucket(WIDTH / 2 - 40, WIDTH);
        pickTargetColor();
    }

    public static GameManager getInstance() { return INSTANCE; }

    public void initAndShowGUI() {
        frame = new JFrame("Color Catch - Swing Edition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        gamePanel = new GamePanel(this);
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        setupTimers();
        startNewGame();
    }

    private void setupTimers() {
        gameTimer = new javax.swing.Timer(baseTickMs, e -> {
            if (!paused) update();
            gamePanel.repaint();
        });

        spawnTimer = new javax.swing.Timer(spawnIntervalMs, e -> {
            if (!paused) spawnBall();
        });
    }

    public void startNewGame() {
        score = 0;
        lives = 3;
        level = 1;
        balls.clear();
        scoringStrategy = new EasyScoring();
        pickTargetColor();
        running = true;
        paused = false;

        if (gameTimer.isRunning()) gameTimer.stop();
        if (spawnTimer.isRunning()) spawnTimer.stop();

        gameTimer.setDelay(baseTickMs);
        spawnTimer.setDelay(spawnIntervalMs);
        gameTimer.start();
        spawnTimer.start();

        notifyObservers();
    }

    public void pauseToggle() {
        paused = !paused;
        notifyObservers();
    }

    public void stopGame() {
        running = false;
        gameTimer.stop();
        spawnTimer.stop();
    }

    public void setDifficulty(Difficulty d) {
        switch (d) {
            case EASY: scoringStrategy = new EasyScoring(); break;
            case MEDIUM: scoringStrategy = new MediumScoring(); break;
            case HARD: scoringStrategy = new HardScoring(); break;
        }
        notifyObservers();
    }

    public void spawnBall() {
        Ball b = ballFactory.createRandomBall(WIDTH, level);
        balls.add(b);
    }

    private void update() {
        for (Ball b : balls) {
            b.y += b.speed;

            if (b.getBounds().intersects(bucket.getBounds())) {
                boolean correct = (b.color == targetColor);
                if (correct) score += scoringStrategy.onCorrect();
                else {
                    score += scoringStrategy.onIncorrect();
                    lives += scoringStrategy.onIncorrectLives();
                }
                balls.remove(b);
                notifyObservers();
                checkGameOver();
                continue;
            }

            if (b.y > HEIGHT) balls.remove(b);
        }

        if (score < 0) { 
            gameOver();
            return;
        }

        if( score >= WIN_SCORE) {
            gameWon();
            return;
        }

        int threshold = level * 100;
        if (score >= threshold) levelUp();
    }

    private void checkGameOver() {
        if (lives <= 0) {
            gameOver();
        }
        
        if(score >= WIN_SCORE) {
            gameWon();
        }
    }

    private void gameOver() {
        running = false;
        gameTimer.stop();
        spawnTimer.stop();
        SwingUtilities.invokeLater(() -> {
            int opt = JOptionPane.showOptionDialog(frame,
                    "Game Over! Score: " + score + "\nPlay again?",
                    "Game Over",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, null, null);
            if (opt == JOptionPane.YES_OPTION) startNewGame();
            else System.exit(0);
        });
    }

    private void gameWon() {
    gameTimer.stop();
    spawnTimer.stop();

    SwingUtilities.invokeLater(() -> {
        int option = JOptionPane.showOptionDialog(
                frame,
                "YOU WON!\nFinal Score: " + score + "\nPlay again?",
                "Victory!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                null
        );

        if (option == JOptionPane.YES_OPTION) {
            startNewGame();
        } else {
            System.exit(0);
        }
    });
}


    private void levelUp() {
        level++;
        lives = 3;
        int newSpawn = Math.max(250, spawnTimer.getDelay() - 80);
        spawnTimer.setDelay(newSpawn);
        int newTick = Math.max(12, gameTimer.getDelay() - 2);
        gameTimer.setDelay(newTick);
        pickTargetColor();
        notifyObservers();
    }

    private void pickTargetColor() {
        ColorType[] vals = ColorType.values();
        targetColor = vals[new Random().nextInt(vals.length)];
    }

    public void addObserver(GameObserver o) { 
        observers.add(o); 
    }
    public void removeObserver(GameObserver o) { 
        observers.remove(o); 
    }
    private void notifyObservers() { 
        for (GameObserver o : observers) o.update(this); 
    }

    public int getScore() {
        return score; 
    }
    public int getLives() { 
        return lives; 
    }
    public int getLevel() { 
        return level; 
    }
    public ColorType getTargetColor() { 
        return targetColor; 
    }
    public Bucket getBucket() { 
        return bucket; 
    }
    public List<Ball> getBalls() { 
        return balls; 
    }
    public boolean isPaused() { 
        return paused; 
    }
    public boolean isRunning() { 
        return running; 
    }

    public void moveBucketLeft() { 
        bucket.moveLeft(); 
    }
    public void moveBucketRight() { 
        bucket.moveRight(); 
    }

    public void addScore(int s) { 
        score += s; 
        notifyObservers(); 
    }
    public void addLives(int l) { 
        lives += l; 
        notifyObservers(); 
    }
}
