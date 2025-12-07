package Design_Patterns.FlyWeightPattern.example2;

public class FolderIcon implements Icon{

    private String color;
    private String image;

    FolderIcon(String color, String image){
        this.color = color;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Folder color: "+color+" imageName: "+image+" Position x: "+x+" and y: "+y);
    }
    
}
