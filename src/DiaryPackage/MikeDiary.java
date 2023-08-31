package DiaryPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import static java.nio.file.Files.newBufferedWriter;

public class MikeDiary {
    private  ArrayList<Entry>entry = new ArrayList<>();
    private boolean isLocked;
    private String password;
    private String userName;

    public MikeDiary(String username, String password) {
        this.userName = username;
        this.password = password;
    }
    public  void unlockDiary(String password){
        if (this.password.equals(password)){
          isLocked = false;
        }
    }
    public void lockDiary(){
        isLocked =true;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void createEntry(String title, String body) {
//        Entry entry1 = new Entry();
//        entry1.setTitle(title);
//        entry1.setBody(body);
//        entry.add(entry1);
        String fileName = userName + ".txt";
        String location ="/home/micheal/Desktop/Diary_Entries/"+fileName;
        Path path =Path.of(location);
        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("title:  "+title+"     body:   "+body);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public  int sizeOfEntries(){
        return entry.size();
    }
//    public void updateEntry(int id, String title, String body){
//        Entry entry1 = new Entry(id, title, body);
//        for(Entry entry2: entry){
//            if(entry1.)
//        }
//    }
}
