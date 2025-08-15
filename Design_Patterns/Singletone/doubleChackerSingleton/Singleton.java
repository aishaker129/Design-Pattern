package doubleChackerSingleton;

public class Singleton {
    static Singleton instance;
    
    private Singleton() {
        System.out.println("Singleton Constructor Called!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
