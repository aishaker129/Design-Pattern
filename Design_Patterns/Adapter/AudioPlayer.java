interface AdvanceMediaPlayer {
    public void playVlc(String file);
    public void playMp4(String file);
}

interface MediaPlayer {
    public void paly(String audioType, String file);
}

class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("Plying vlc file name: " + file);
    }
    @Override
    public void playMp4(String file) {
        // Noting to do here
    }
}

class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String file) {
        // Noting to do here
    }
    @Override
    public void playMp4(String file) {
        System.out.println("Playing mp4 file name: " + file);
    }
}

class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void paly(String audioType, String file) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(file);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(file);
        }
    }

}

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void paly(String audioType, String file) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file name: " + file);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.paly(audioType, file);
        } else {
            System.out.println("Invalid media formate: " + audioType + " not supported");
        }
    }

}
