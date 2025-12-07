package Design_Patterns.FlyWeightPattern.example1;

public class FlyWeightDemo {
    private static final String colors[] = {"RED","GREEN","BLUE","YELLOW","BLACK"}; 
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Circle circle = (Circle)ShapFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(49);
            circle.draw();
        }

    }

    private static final String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static final int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static final int getRandomY(){
        return (int)(Math.random()*100);
    }
}
