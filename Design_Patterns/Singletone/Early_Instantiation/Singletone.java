package Early_Instantiation;
public class Singletone {
    static Singletone instance = new Singletone();
    private Singletone(){}

    public static Singletone getInstance(){
        return instance;
    }

    public void displayMessage() {
        System.out.println("Singletone Class Instance Created");
    }
}
