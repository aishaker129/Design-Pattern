public class AdapterPattern {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.paly("mp3", "hello.mp3");
        audioPlayer.paly("mp4", "love.mp4");
        audioPlayer.paly("vlc", "hate.vlc");
        audioPlayer.paly("div", "alone.div");
    }
}
