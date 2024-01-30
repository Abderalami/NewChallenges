package Day7.challengeMusic;
public class MP3 extends AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing MP3 file...");
    }

    @Override
    public void pause() {
        System.out.println("MP3 file paused.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 playback stopped.");
    }
}




