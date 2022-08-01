package structural.adapter.assignment;

public class AdvanceMediaPlayerAdapter implements MediaPlayerInterface{

    AdvanceMediaPlayerInterface musicPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayerInterface musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        musicPlayer.loadFileName(fileName);
        musicPlayer.listen();
    }
}
