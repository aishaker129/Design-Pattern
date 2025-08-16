public class DigitalMusicFactory extends AbstractMusicFactory {
    public Media createMedia() {
        return new Album(); 
    }

    public Player createPlayer() {
        return new MP3Player(); 
    }
}
