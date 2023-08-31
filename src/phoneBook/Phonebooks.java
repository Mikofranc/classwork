package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Phonebooks {
    private List<Phonebook>phonebookList =new ArrayList<>();
    private String firstName;
    private String secondName;
    private String email;

    public Phonebooks(String firstName, String secondName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }
    public void createPhoneBook(String firstName, String secondName, String email){
        Phonebook phonebook = new Phonebook();
        phonebookList.add(phonebook);
    }
    public  void  login(Phonebook phonebook){
//        phonebook.addcontacts();
    }
}
