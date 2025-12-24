import java.util.Random;

public class BallFactory {
    private final Random rnd = new Random();

    public Ball createRandomBall(int width, int level) {
        int x = rnd.nextInt(width - 24) + 12;
        ColorType color = ColorType.values()[rnd.nextInt(ColorType.values().length)];
        int speed = 5 + rnd.nextInt(level + 2);
        return new Ball(x, 0, color, speed);
    }
}
