import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory rootDirectory = new Directory("root" , null);
        Directory khabilanDirectory = new Directory("khabilan", null);
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        List<FileSystem> rootFileSystem = new ArrayList<>();
        rootFileSystem.add(file1);
        rootFileSystem.add(khabilanDirectory);
        List<FileSystem> khabilanFileSystem = new ArrayList<>();
        khabilanFileSystem.add(file2);
        khabilanFileSystem.add(file3);
        khabilanFileSystem.add(file4);
        khabilanDirectory.setFiles(khabilanFileSystem);
        rootDirectory.setFiles(rootFileSystem);

        rootDirectory.ls();
    }
}