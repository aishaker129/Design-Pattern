package Lazy_Instantiation;

public class User {
    public static void main(String[] args) {
        Singletone singletone = Singletone.getInstance();
        singletone.displayMessage();
        
        // Trying to get another instance
        Singletone anotherInstance = Singletone.getInstance();
        if (singletone == anotherInstance) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
