public class AnalogMusicFactory extends AbstractMusicFactory {
    public Media createMedia() {
        return new CD(); 
    }

    public Player createPlayer() {
        return new CDPlayer(); 
    }
}
