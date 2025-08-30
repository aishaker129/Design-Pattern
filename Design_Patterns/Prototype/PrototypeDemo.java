interface Shape extends Cloneable {
    Shape clone();
    void draw();
}   

class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    public Shape clone(){
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supporting"+e);
        }
    }

    public void draw(){
        System.out.println("Drawing a circle radius: "+radius);
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

}

class Rectangle implements Shape{
    private int height;
    private int weight;

    public Rectangle(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    public Shape clone(){
        try {
            return (Shape)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonning not supporting..");
        }
    }

    public void draw(){
        System.out.println("Drawing a rectangle height: "+height+" and weight: "+weight);
    }

    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle(10);
        Shape rectangle = new Rectangle(5,10);

        Shape clonedCircle = circle1.clone();
        Shape clonedRectangle = rectangle.clone();

        if(clonedCircle instanceof Circle){
            ((Circle) clonedCircle).setRadius(5);
        }

        if(clonedRectangle instanceof Rectangle){
            ((Rectangle) clonedRectangle).setHeight(15);
        }

        circle1.draw();
        clonedCircle.draw();

        rectangle.draw();
        clonedRectangle.draw();
    }
}
