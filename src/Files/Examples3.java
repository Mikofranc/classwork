package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Examples3 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("/home/micheal/Documents/account.json")){
            byte[] content = fileInputStream.readAllBytes();
            for(byte byt : content){
                System.out.print(Character.toString(byt));
            }
            System.out.println(Arrays.toString(content));
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
