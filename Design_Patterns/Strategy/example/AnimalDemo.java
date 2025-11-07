package Design_Patterns.Strategy.example;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal dog = new Dog();

        System.out.println("Bird: "+bird.tryToFly());
        System.out.println("Dog:" +dog.tryToFly());
    }
}
