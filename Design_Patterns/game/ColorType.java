import java.awt.Color;

public enum ColorType {
    RED(Color.RED),
    GREEN(Color.GREEN),
    BLUE(Color.BLUE),
    YELLOW(Color.YELLOW);

    final Color awtColor;
    ColorType(Color c) { awtColor = c; }
}
