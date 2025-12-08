package Design_Patterns.Proxy_Pattern.example;

public class RealImage implements Image{
    private String fileName;
    RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading Image "+fileName);
    }

    public void display(){
        System.out.println("Displaying image "+fileName);
    }
}
