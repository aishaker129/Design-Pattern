package doubleChackerSingleton;

public class User {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                Singleton singleton1 = Singleton.getInstance();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                Singleton singleton2 = Singleton.getInstance();
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
