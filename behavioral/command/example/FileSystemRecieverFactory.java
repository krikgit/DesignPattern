package behavioral.command.example;

public class FileSystemRecieverFactory {
    public static FileSystemReciever detectFilesystem(){
        String operatingSystem = System.getProperty("os.name");
        System.out.println("OS name : "+operatingSystem);
        if (operatingSystem.equalsIgnoreCase("Windows 11")){
            return  new WidowsFileSystemReciever();
        } else if (operatingSystem.equalsIgnoreCase("Unix")) {
            return new UnixFileSystemReciever();
        }else {
            return new SolarisFileSystemReciever();
        }
    }
}
