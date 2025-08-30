
class Logger{
    private Logger(){
        System.out.println("Logger Instance Created");
    }
    private static Logger loggerInstance;
    public static final Object lock = new Object();
    public static Logger getInstance(){
        if(loggerInstance == null){
            synchronized(lock) {
                if(loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void log(String message){
        System.out.println("Log message: " + message);
    }
}

public class ThreadSafeSingletone {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger logger1 = Logger.getInstance();
                logger1.log("This is a log message from thread 1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger logger2 = Logger.getInstance();
                logger2.log("This is a log message from thread 2");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger logger3 = Logger.getInstance();
                logger3.log("This is a log message from thread 3");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}