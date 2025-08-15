package syncronized;

public class Singelton {
    static Singelton instance;

    private Singelton() {
        System.out.println("Singelton Constructor Called!");
    }

    public static synchronized Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}
