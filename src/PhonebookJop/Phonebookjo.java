package PhonebookJop;

import phoneBook.Contacts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Phonebookjo {
    private List<Contacts> contactsList = new ArrayList<>();

    public void addcontacts(String name, String phoneNUmber) {
        Contacts contact = new Contacts(name, phoneNUmber);
        contactsList.add(contact);
        System.out.println( "Successful !!" );
    }

    public int amountOfContacts() {
        return contactsList.size();
    }

    public void searchForContactsByName(String input) {
        for (Contacts contact : contactsList) {
            if (contact.getName().equals(input)) {
                display(contact.toString());
            }else {display("name not found");}
        }
    }
    public void call(String input){
        if (checkontactsByNumber(input)==true){
            for (Contacts contact : contactsList) {
                if (contact.getName().equals(input)) {
                    display("Calling "+contact.toString());
                }
            }
        }else {display("Calling " + input);}
    }
    public Boolean checkrContactsByName(String input) {
        for (Contacts contact : contactsList) {
            if (contact.getName().equals(input)) {
                return true;
            }
        }
        return false;
    }

    private void display(String input) {
        System.out.println(input);
    }

    public void searchForContactsByNumber(String input) {
        for (Contacts contact : contactsList) {
            if (contact.getPhoneNUmber().equals(input)) {
                display(contact.toString());
            }else {display("number not found");}
        }
    }

    private Boolean checkontactsByNumber(String input) {
        for (Contacts contact : contactsList) {
            if (contact.getPhoneNUmber().equals(input)) {
                return true;
            }
        }
        return false;
    }

    public void deleteContact(String input) {
        Iterator<Contacts> contactsIterator = contactsList.listIterator();
        while (contactsIterator.hasNext()) {
            Contacts contact = contactsIterator.next();
            if (contact.getPhoneNUmber().equals(input) || contact.getName().equals(input)) {
                contactsIterator.remove();
                display("Deleted Successfully");
            }else{display("Delete operation not successful");}
        }
    }

    public String callNumber(String input) {
        if(input.length() > 0){
            if(checkrContactsByName(input)==false || checkontactsByNumber(input)==false){
//                display("Calling\n" + input);
                return  "Calling\n" + input;
            }else {
//                display("Calling\n" + contactsList.toString());
                return "Calling\n" + contactsList.toString();
            }
        }else{
//            display("invalid input");
            return "invalid input";
        }
    }

    public void editName(String oldInput, String newInput){
        for(Contacts contact : contactsList){
            if(contact.getName().equals(oldInput)){
                contact.setName(newInput);
                display(contact.toString());
            }else {display("Contact not found");}
        }
    }
    public void editNumber(String oldInput, String newInput){
        for(Contacts contact : contactsList){
            if(contact.getPhoneNUmber().equals(oldInput)){
                contact.setPhoneNUmber(newInput);
                display(contact.toString());
            }else { display("contact not found");}
        }
    }
    public void displayAllContacts(){
        for(Contacts contacts:contactsList){
            contacts.toString();
            display(contacts.toString());
        }
    }
}
