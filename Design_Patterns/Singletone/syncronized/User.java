package syncronized;

public class User {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                Singelton singleton1 = Singelton.getInstance();
              }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                Singelton singleton2 = Singelton.getInstance();
              }
        });
        thread1.start();
        thread2.start();

    }
}
