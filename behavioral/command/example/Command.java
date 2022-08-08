package behavioral.command.example;

interface Command {

    void execute();
    //we can add or undo that

}

class OpenFileCommand implements Command{
    private FileSystemReciever file;

    public OpenFileCommand(FileSystemReciever file){
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.openFile();
    }
}
class WriteFileCommand implements Command{

    private FileSystemReciever file;

    public  WriteFileCommand(FileSystemReciever file){
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.writeFile();
    }
}
class CloseFileCommand implements Command{

    private FileSystemReciever file;

    public  CloseFileCommand(FileSystemReciever file){
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.closeFile();
    }
}