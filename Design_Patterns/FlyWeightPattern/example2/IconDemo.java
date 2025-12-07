package Design_Patterns.FlyWeightPattern.example2;

public class IconDemo {
    public static void main(String[] args) {
        IconFactory factory = new IconFactory();

        Icon icon1 = factory.getIcon("file");
        icon1.draw(100, 200);

        Icon icon2 = factory.getIcon("Folder");
        icon2.draw(300, 500);
    }
}
