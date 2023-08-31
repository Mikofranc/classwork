package Files;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        String location = "/home/micheal/Desktop";
        Path path = Path.of(location);
        Path path1 = Path.of("/home/micheal/Desktop/sprinkles");
        try(DirectoryStream<Path> paths = Files.newDirectoryStream(path)){
            paths.forEach(itemPath ->{
                if(itemPath.equals(path1)){
                    try {
                        Path p = Files.createTempFile(itemPath, "file", ".txt");

                    }catch (IOException exception){
                        System.out.println(exception.getMessage());
                    }
                }
            });
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
