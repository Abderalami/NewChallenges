package Day7.challengeMusic;

import java.util.ArrayList;

public class LibraryMusic {
    private ArrayList<Playable> tracks;

    public LibraryMusic() {
        this.tracks = new ArrayList<>();
    }
    public void addTrack(Playable track) {
        tracks.add(track);
    }

    public void playAll() {
        for (Playable track : tracks) {
            track.play();
        }
    }

    public void pauseAll() {
        for (Playable track : tracks) {
            track.pause();
        }
    }

    public void stopAll() {
        for (Playable track : tracks) {
            track.stop();
        }
    }}
