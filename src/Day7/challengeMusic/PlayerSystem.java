package Day7.challengeMusic;

public class PlayerSystem {
    public static void main(String[] args) {
        MP3 mp3Player = new MP3();
        CD cdPlayer = new CD();

        LibraryMusic musicLibrary = new LibraryMusic();
        musicLibrary.addTrack(mp3Player);
        musicLibrary.addTrack(cdPlayer);

        musicLibrary.playAll();
        musicLibrary.pauseAll();
        musicLibrary.stopAll();
    }
}
