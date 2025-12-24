import java.awt.*;

public class Bucket {
    int x;
    final int width = 80;
    final int height = 18;
    final int fieldWidth;

    Bucket(int x, int fieldWidth) {
        this.x = x;
        this.fieldWidth = fieldWidth;
    }

    void moveLeft() { x = Math.max(0, x - 20); }
    void moveRight() { x = Math.min(fieldWidth - width, x + 20); }

    Rectangle getBounds() {
        GameManager gm = GameManager.getInstance();
        return new Rectangle(x, gm.HEIGHT - height - 10, width, height);
    }
}
