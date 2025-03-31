import java.util.List;

public class Directory implements FileSystem{
    private String directoryName;
    private List<FileSystem> files;

    public Directory(String directoryName, List<FileSystem> files) {
        this.files = files;
        this.directoryName = directoryName;
    }

    public List<FileSystem> getFiles() {
        return files;
    }

    public void setFiles(List<FileSystem> files) {
        this.files = files;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for(FileSystem fileSystem : files) {
            fileSystem.ls();
        }
    }
}
