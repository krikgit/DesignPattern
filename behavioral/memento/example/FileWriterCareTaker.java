package behavioral.memento.example;

public class FileWriterCareTaker {
    //it controls the state using memento
    private Object obj;

    public void save(FileWriterUtil fileWriter){
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter){
        fileWriter.returnToLastSave(obj);
    }
}
