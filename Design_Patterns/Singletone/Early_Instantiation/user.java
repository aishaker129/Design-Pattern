package Early_Instantiation;
public class user {

    public static void main(String[] args) {
        Singletone singletonInstance = Singletone.getInstance();
        singletonInstance.displayMessage();
    }
}