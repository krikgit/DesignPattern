package structural.adapter.assignment;

interface AdvanceMediaPlayerInterface {
    void loadFileName(String fileName);
    void listen();
}

class VlcPlayer implements AdvanceMediaPlayerInterface{
    String file;

    @Override
    public void loadFileName(String fileName) {
        this.file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("In VLC player - Playing..."+file);
    }
}
class MXPlayer implements AdvanceMediaPlayerInterface{
    String file;

    @Override
    public void loadFileName(String fileName) {
        this.file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("In MX player - Playing..."+file);
    }
}