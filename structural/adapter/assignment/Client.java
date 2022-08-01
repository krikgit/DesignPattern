package structural.adapter.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");
        System.out.println("----------------------");

        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","ulala.mp3");

        AdvanceMediaPlayerInterface mediaPlayerInterface = new MXPlayer();
        MediaPlayerInterface adapter = new AdvanceMediaPlayerAdapter(mediaPlayerInterface);
        adapter.play("mp4","rang_barshe.mp4");

        AdvanceMediaPlayerInterface mediaPlayer = new VlcPlayer();
        MediaPlayerInterface adapters = new AdvanceMediaPlayerAdapter(mediaPlayer);
        adapters.play("mp4","jhakkas.mp4");
    }
}
