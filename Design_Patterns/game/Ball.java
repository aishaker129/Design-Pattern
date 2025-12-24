import java.awt.*;

public class Ball {
    int x, y;
    int radius = 12;
    int speed;
    ColorType color;

    Ball(int x, int y, ColorType color, int speed) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.speed = speed;
    }

    Rectangle getBounds() {
        return new Rectangle(x - radius, y - radius, radius * 2, radius * 2);
    }
}
