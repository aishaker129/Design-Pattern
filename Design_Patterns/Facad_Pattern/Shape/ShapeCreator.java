package Design_Patterns.Facad_Pattern.Shape;

public class ShapeCreator {
    Tringle t;
    Circle c;
    Ractangle r;

    ShapeCreator(){
        t = new Tringle();
        c = new Circle();
        r = new Ractangle();
    }

    public void drawTringle(){
        t.draw();
    }
    public void drawCircle(){
        c.draw();
    }
    public void drawRactangle(){
        r.draw();   
    }
    
}
