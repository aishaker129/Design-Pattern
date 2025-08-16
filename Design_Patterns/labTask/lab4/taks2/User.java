public class User {
    public static void main(String[] args) {
        AbstractMusicFactory analogFactory = new AnalogMusicFactory();
        Player analogPlayer = analogFactory.createPlayer();
        Media analogMedia = analogFactory.createMedia();
        
        System.out.println("Analog Media: " + analogMedia.getName());
        analogPlayer.play();
        
        AbstractMusicFactory digitalFactory = new DigitalMusicFactory();
        Player digitalPlayer = digitalFactory.createPlayer();
        Media digitalMedia = digitalFactory.createMedia();

        System.out.println("Digital Media: " + digitalMedia.getName());
        digitalPlayer.play();
    }
}
