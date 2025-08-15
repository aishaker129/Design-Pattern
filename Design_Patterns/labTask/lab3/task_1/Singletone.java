package task_1;

public class Singletone {

    public static void main(String[] args) {
        Authentication auth = new Authentication();
        DataAccess data = new DataAccess();
        UI ui = new UI();

        auth.authenticateUser("user1", "pass123");
        data.fetchData("user1_data");
        data.saveData("user2_data");
        ui.displayMessage("Welcome to the application!");

        System.out.println("Testing singleton Logger instance:");
        Logger anotherLoggerInstance = Logger.getInstance();
        if(Logger.getInstance() == anotherLoggerInstance) {
            System.out.println("Logger instance is same as before.");
        } else {
            System.out.println("Logger instance is different.");
        }
    
    }
    
}
