package Design_Patterns.Proxy_Pattern.example;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fineName;

    ProxyImage(String fileName){
        this.fineName = fileName;
    }

    public void display(){
        if(realImage == null){
            realImage = new RealImage(fineName);
        }
        realImage.display();
    }
}
