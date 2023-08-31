package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        String loction ="/home/micheal/Desktop";
        Path path = Paths.get(loction);

        //READING FROM A FILE.
//        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
//            Stream<String> content = bufferedReader.lines();
//            content.forEach(System.out::println);
//        }catch (IOException exception){
//            System.err.println(exception.getMessage());
//        }

        //WRITING TO A FILE.
//        try (BufferedWriter writer = Files.newBufferedWriter(path)){
//           writer.write("""
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   """);
//        }catch (IOException exception){
//            System.err.println(exception.getMessage());
//        }

        //READING FROM DIRECTORY
        try(DirectoryStream<Path> paths= Files.newDirectoryStream(path)){
                paths.forEach(System.out::println);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
