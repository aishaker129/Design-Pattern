package Early_Instantiation;
public class user {

    public static void main(String[] args) {
        Singletone singletonInstance = Singletone.getInstance();
        singletonInstance.displayMessage();

        Singletone anotherInstance = Singletone.getInstance();
        anotherInstance.displayMessage();

        if(singletonInstance == anotherInstance) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}