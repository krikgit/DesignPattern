package behavioral.command.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Command Design Pattern");
        System.out.println("======================");

        FileSystemReciever fileSystem = FileSystemRecieverFactory.detectFilesystem();
        FileInvoker invoker = null;

        OpenFileCommand openOps = new OpenFileCommand(fileSystem);
        invoker = new FileInvoker(openOps);
        invoker.execute();

        WriteFileCommand writeOps = new WriteFileCommand(fileSystem);
        invoker = new FileInvoker(writeOps);
        invoker.execute();

        CloseFileCommand closeOps = new CloseFileCommand(fileSystem);
        invoker = new FileInvoker(closeOps);
        invoker.execute();

    }
}
