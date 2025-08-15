package task_1;

public class DataAccess {
    private Logger logger = Logger.getInstance();

    public void fetchData(String data) {
        logger.log("Fetching data: " + data);
    }

    public void saveData(String data) {
        logger.log("Saving data: " + data);
    }
}
