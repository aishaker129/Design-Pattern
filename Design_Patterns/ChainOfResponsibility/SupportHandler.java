enum Priority{
    BASIC,INTERMEDIATE,CRITICAL
}

public interface SupportHandler{
    void nextHandler(SupportHandler nextHandler);
    void handleRequest(Request request);
}

class Request{
    private Priority priority;
    public Request(Priority priority){
        this.priority = priority;
    }
    public Priority getPriority(){
        return priority;
    }
}

class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void nextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.BASIC){
            System.out.println("Level 1 handle this request");
        }
        else if(nextHandler !=null){
            nextHandler.handleRequest(request);
        }
    }
    
}

class Level2SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void nextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.INTERMEDIATE){
            System.out.println("Level 2 handle this request");
        }else if(nextHandler !=null){
            nextHandler.handleRequest(request);
        }
    }
    
}

class Level3SupportHandler implements SupportHandler{

    @Override
    public void nextHandler(SupportHandler nextHandler) {
        // No next handler
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.CRITICAL){
            System.out.println("Level 3 hanlde this request");
        }else{
            System.out.println("Cannot handle this request...");
        }
    }
    
}
