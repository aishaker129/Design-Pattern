package Design_Patterns.Facad_Pattern.Shape;

public class User {
    public static void main(String[] args) {
        ShapeCreator shapeMaker = new ShapeCreator();

        shapeMaker.drawCircle();
        shapeMaker.drawRactangle();
        shapeMaker.drawTringle();
    }
}
