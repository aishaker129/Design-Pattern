package task_1;

public class UI {
    private Logger logger = Logger.getInstance();

    public void displayMessage(String message) {
        logger.log("Displaying message: " + message);
    }
}
