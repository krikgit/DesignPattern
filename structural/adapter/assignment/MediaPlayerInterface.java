package structural.adapter.assignment;

public interface MediaPlayerInterface {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayerInterface{

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing..."+fileName);
        }else {
            System.out.println("Invalid!! "+audioType+" format is not supported.");
        }
    }
}
