package phoneBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static Phonebook phonebook = new Phonebook();
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
       try {
           display("""
                    PHONEBOOK
                1. Add contact.
                2. Display contact.
                3. Delete contact.
                4. Edit contact.
                5. Search contact.
                6. Exit.
                """);
           int choice=scanner.nextInt();
           switch (choice){
               case 1-> addContact();
               case 2-> displayContacts();
               case 3 -> deletecontact();
               case 4 -> editContacts();
               case  5 ->searchContact();
               case 6 ->{break;}
               default -> {
                   display("   WRONG INPUT !!!\n   please enter correct input");
                   menu();
               }

           }
       }catch (InputMismatchException e){
           display("wrong input ... start again ");
       }
    }
    private static void addContact(){
        String name, phoneNumber;
        display("enter name");
        name=scanner.next();
        display("enter phone number");
        phoneNumber=scanner.next();
        if(name.length() > 0 && phoneNumber.length() > 0){
            phonebook.addcontacts(name, phoneNumber);
        }else {display("wrong input");}
        display("""
                0. previous menu
                22. Exit
                """);
        int addMenuChoice =scanner.nextInt();
        switch (addMenuChoice){
            case 0:menu();
            case 22:break;
            default:display("wrong input"); break;
        }
    }
    private static void displayContacts(){
        phonebook.displayAllContacts();
        display("""
                0. previous menu.
                22. Exit
                """);
        int displayChoice= scanner.nextInt();
        switch (displayChoice){
            case 0: menu();
            case 22: break;
            default:  display("Wrong input"); break;
        }
    }
    private static void deletecontact(){
        display("input name");
        String input=scanner.next();
        phonebook.deleteContact(input);
        display("""
                0. previous menu.
                22. Exit
                """);
        int deleteChoice= scanner.nextInt();
        switch (deleteChoice){
            case 0: menu();
            case 22: break;
            default:  display("Wrong input"); break;
        }
    }
    private static void editContacts(){
        String oldName,newName;
        display("enter name to edit");
        oldName =scanner.next();
        display("enter new name");
        newName = scanner.next();
        phonebook.editName(oldName, newName);
    }
    private static  void searchContact(){
        display("""
                1. Search by name.
                2. Search by number.
                3. Exit
                """);
        int choice = scanner.nextInt();
        switch (choice){
            case 1-> {
                display("Enter name");
                String name = scanner.next();
                phonebook.searchForContactsByName(name);
            }
            case 2->{
                display("Enter phone number");
                String number = scanner.next();
                phonebook.searchForContactsByNumber(number);
            }
            case 3 ->{break;}
            default -> {display("wrong input"); searchContact();}
        }

    }


    private static void display(String prompt){
        System.out.println(prompt);
    }
}
