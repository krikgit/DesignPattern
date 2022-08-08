package behavioral.command.example;

public interface FileSystemReciever {
    void openFile();
    void writeFile();
    void closeFile();

}

class UnixFileSystemReciever implements FileSystemReciever{

    @Override
    public void openFile() {
        System.out.println(" In Unix:File opened");
    }

    @Override
    public void writeFile() {
        System.out.println(" In Unix:File written");
    }

    @Override
    public void closeFile() {
        System.out.println(" In Unix:File closed");
    }
}
class WidowsFileSystemReciever implements FileSystemReciever{

    @Override
    public void openFile() {
        System.out.println(" In Windows:File opened");
    }

    @Override
    public void writeFile() {
        System.out.println(" In Windows:File written");
    }

    @Override
    public void closeFile() {
        System.out.println(" In Windows:File closed");
    }
}
class SolarisFileSystemReciever implements FileSystemReciever{

    @Override
    public void openFile() {
        System.out.println(" In Solaris:File opened");
    }

    @Override
    public void writeFile() {
        System.out.println(" In Solaris:File written");
    }

    @Override
    public void closeFile() {
        System.out.println(" In Solaris:File closed");
    }
}
