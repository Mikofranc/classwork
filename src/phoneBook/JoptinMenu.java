package phoneBook;

import javax.swing.*;

public class JoptinMenu {
    private static Phonebook phonebook=new Phonebook();
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("""
                1. create phone number.
                2. call number
                3. edit number.
                4. delete number.
                """);
        switch (Integer.parseInt(input)){
            case 1 -> {
               String name= JOptionPane.showInputDialog("Enter name");
               String phone= JOptionPane.showInputDialog("Enter number");
               phonebook.addcontacts(name,phone);
            }
            case 2 -> JOptionPane.showInputDialog("calling  number");
            case 3 -> JOptionPane.showInputDialog("edit added number");
            case 4 -> JOptionPane.showInputDialog("delete number");
        }
    }
}
