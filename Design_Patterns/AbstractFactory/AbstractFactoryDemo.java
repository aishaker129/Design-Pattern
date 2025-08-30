import java.util.Scanner;

interface Button{
    void rander();
}

interface Scrollbar {
    void rander();
}

class WindowsButton implements Button{
    public void rander(){
        System.out.println("Rendering Windows Button..");
    }
}

class MacButton implements Button{
    public void rander(){
        System.out.println("Rendering MacOS Button..");
    }
}

class WindowsScrollbar implements Scrollbar{
    public void rander(){
        System.out.println("Rendering Windows Scrollbar..");
    }
}

class MacOSScrollbar implements Scrollbar{
    public void rander(){
        System.out.println("Rendering MacOS Scrollbar..");
    }
}

abstract class UIFactory{
    abstract Button createButton();
    abstract Scrollbar createScrollbar();
}

class WindowsFactory extends UIFactory{
    public Button createButton(){
        return new WindowsButton();   
    }
    public Scrollbar createScrollbar(){
        return new WindowsScrollbar();
    }
}

class MacFactory extends UIFactory{
    public Button createButton(){
        return new MacButton();   
    }
    public Scrollbar createScrollbar(){
        return new MacOSScrollbar();
    }
}


public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory factory;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OS name: ");
        String os = sc.nextLine();
        if(os.equalsIgnoreCase("Windows")){
            factory = new WindowsFactory();
        } else if(os.equalsIgnoreCase("Mac")){
            factory = new MacFactory(); 
        }
        else{
            throw new IllegalArgumentException("Unsupported OS");
        }

        Button btn = factory.createButton();
        Scrollbar sb = factory.createScrollbar();
        btn.rander();
        sb.rander();
        sc.close();
        
    }
}
