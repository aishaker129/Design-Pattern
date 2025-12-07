package Design_Patterns.FlyWeightPattern.example2;

public class FileIcon implements Icon{
    private String type;
    private String image;

    FileIcon(String type, String image){
        this.type = type;
        this.image = image;
    }

    @Override
    public void draw(int x, int y){
        System.out.println("File type: "+type+ " ImageName: "+image+" position x: "+x+ " and y: "+y);
    }
}
