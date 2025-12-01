
public class HomeTheater {
    private PopcornPopper popper;
    private Lights lights;
    private Screen screen;
    private Projector projector;
    private SoundSystem sound;
    private MoviePlayer player;
    

    public HomeTheater() {
        this.popper = new PopcornPopper();
        this.lights = new Lights();
        this.screen = new Screen();
        this.projector = new Projector();
        this.sound = new SoundSystem();
        this.player = new MoviePlayer();
    }

    public void startMovie(String movie) {
        System.out.println("\n=== Starting Movie Night ===");

        popper.on();
        popper.pop();

        lights.dim(20);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        sound.on();
        sound.setVolume(8);

        player.on();
        player.play(movie);
    }

    public void stopMovie() {
        System.out.println("\n=== Shutting Down Theater ===");

        player.stop();
        player.off();

        sound.off();
        projector.off();

        screen.up();
        lights.on();

        popper.off();
    }
}

class PopcornPopper {
    public void on() {
        System.out.println("Popcorn popper on");
    }
    public void off() {
        System.out.println("Popcorn popper off");
    }
    public void pop() {
        System.out.println("Popping popcorn");
    }
}

class Lights {
    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%");
    }
    public void on() {
        System.out.println("Lights on");
    }
}

class Screen {
    public void down() {
        System.out.println("Screen down");
    }
    public void up() {
        System.out.println("Screen up");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector on");
    }
    public void off() {
        System.out.println("Projector off");
    }
    public void wideScreenMode() {
        System.out.println("Projector set to widescreen mode");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound system on");
    }
    public void off() {
        System.out.println("Sound system off");
    }
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}

class MoviePlayer {
    public void on() {
        System.out.println("Movie player on");
    }
    public void off() {
        System.out.println("Movie player off");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    public void stop() {
        System.out.println("Stopping movie");
    }
}
