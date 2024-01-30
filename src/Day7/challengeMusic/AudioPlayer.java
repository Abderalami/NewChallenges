package Day7.challengeMusic;
public abstract class AudioPlayer implements Playable {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
