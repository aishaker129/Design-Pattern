package task_1;

public class Authentication {
    private Logger logger = Logger.getInstance();

    public void authenticateUser(String username, String password) {
       logger.log("Authenticating user: " + username+ " and password: " + password); 
    }
}
