package Files;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class WriteToAfile {
    private static final String LOCATION = "/home/micheal/IdeaProjects/classwork/src/Files/new.txt";
    public static void main(String[] args) {
        try(DataInputStream dataInputStream =new DataInputStream(System.in);
            FileOutputStream fileOutputStream = new FileOutputStream(LOCATION)) {
            System.out.println("What is on your mind");
            byte[] post = dataInputStream.readNBytes(22);
            System.out.println(Arrays.toString(post));
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.write(post);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
