import java.util.Hashtable;

public abstract class Shape implements Cloneable{
    protected String type;
    private String id;

    abstract void draw();

    public String getType(){
       return type; 
    }
    public void setType(String type){
        this.type = type;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle shaped..");
    }
}

class Square extends Shape{

    public Square(){
        type = " Squre";
    }

    @Override
    void draw() {
        System.out.println("Square shape...");
    }
    
}

class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    void draw(){
        System.out.println("Rectangle shape....");
    }
}

class ShapeCache{
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape caheShape = shapeMap.get(shapeId);
        return (Shape) caheShape.clone();
    }

    public static void loadCash(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
