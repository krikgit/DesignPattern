package behavioral.memento.example;

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String text){
        this.content.append(text);
    }

    //create memento
    public Memento save(){
        return new Memento(this.fileName,this.content);
    }

    //restore to previous state
    public void returnToLastSave(Object obj){
        Memento memento = (Memento)obj;
        this.fileName=memento.getFileName();
        this.content = memento.getContent();
    }
}
