package AdapterPattern;

// Target Interface: What the client expects to work with
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee: An incompatible class with different functionality
class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}

// Adapter: Adapts VideoPlayer to work as a MediaPlayer
class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter() {
        this.videoPlayer = new VideoPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // Adapt the incompatible interface (VideoPlayer) to the expected MediaPlayer interface
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}

// Client: Uses the adapter to play media
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("audio")) {
            System.out.println("Playing audio: " + fileName);
        } else if (audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type");
        }
    }
}

// Test client
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("audio", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
        audioPlayer.play("video", "clip.avi");
    }
}

