package lazyInstantiation;

public class Singletone {
    static Singletone instance;

    private Singletone() {
        System.out.println("Singletone Constructor Called!");
    }

    public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Singletone Class Instance Created!");
    }
}
