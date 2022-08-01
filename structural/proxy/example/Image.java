package structural.proxy.example;

public interface Image {
    void display();
}

class RealImage implements Image{

    String file=null;
    RealImage(String file){
        this.file=file;
        loadFromDisk(file);
    }

    private void loadFromDisk(String file) {
        System.out.println("Loading "+file);
    }

    @Override
    public void display() {
        System.out.println("Displaying image:"+file);
    }
}