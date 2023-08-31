package Files.JsonUrl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = listOfUsers();
        int count = 0;
        String[] names ={"micheal", "john", "Sultan", "Adeyemi", "Joshua", "Hamzat","Ebuka", "Awal", "Esther", "Mariam"};
        String[] phoneNumber = {"09011342567", "07086342", "091833434", "090155233253", "090265344336",
                "979554544", "09365546", "07065242424", "08142332435","01234445"};

        for (User user : users){
            user.setPhonenumber(phoneNumber[count]);
            user.setName(names[count]);
            user.setUsername(names[count]);
            user.setEmail(user.getName()+"@gmail.com");
            System.out.println(user);
            count++;
        }
        String location ="/home/micheal/Desktop/sprinkles/Json.txt";
        Path path = Path.of(location);
        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(users.get(0).toString()+"\""+
                    users.get(1).toString()+"\""+
                    users.get(2).toString()+"\""+
                    users.get(3).toString()+"\""+
                    users.get(4).toString()+"\\"+
                    users.get(5).toString()+"\""+
                    users.get(6).toString()+"\""+
                    users.get(7).toString()+"\""+
                    users.get(8).toString()+"\""+
                    users.get(9).toString()+"\""
            );
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static List<User> listOfUsers() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            URL url = new URI("https://jsonplaceholder.typicode.com/users").toURL();
            InputStream stream = url.openStream();
            List<User> users =objectMapper.readValue(stream, new TypeReference<>(){});
//            displayUsers(users);
            stream.close();
            return users;
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
        return null;
    }
    private static void displayUsers(List<User> users){
        for(User user: users){
            System.out.println(user);
        }
    }
}
