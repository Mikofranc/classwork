package BankPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    private static Scanner scanner = new Scanner(System.in);
    private static  Bank bank= new Bank();
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
       try {
           display("""
                       WELCOME TO MIKO BANK
                       1. Create account.
                       2. Deposit.
                       3. Withdraw.
                       4. Transfer.
                       5. Check balance.
                       6. Exit the app.
                """);
           display("enter input");
           int choice = scanner.nextInt();
           switch (choice){
               case 1 ->createAccount();
               case 2 -> deposit();
               case 3 -> withdraw();
               case 4 -> transer();
               case 5 -> balance();
               case 6-> {break;}
               default -> {display("wrong input");menu();}
           }
       }catch (InputMismatchException e){display("wrong input");}
    }

    private static  void createAccount(){
        try {
            display("***MENU***");
            String firstName, secondName, email, phoneNumber;
            display("Enter first name");
            firstName = scanner.next();
            display("Enter second name");
            secondName= scanner.next();
            display("Enter email address");
            email = scanner.next();
            display("Enter phone number");
            phoneNumber = scanner.next();
            if (firstName.length() > 0&& secondName.length() > 0){
                if(email.length() >0 && phoneNumber.length() >0){
                    bank.createAccount(firstName,secondName,email,phoneNumber);
                    display("***SET PIN***");
                    display("Enter account number");
                    String accNo =scanner.next();
                    display("Enter pin");
                    String pin = scanner.next();
                    bank.setPassword(accNo, pin);
                }else {display("invalid email/ phone number");}
            }else {display("invalid name input");}
            display("""
                0. previous menu.
                1. To Deposit.
                2. To exit.
                """);
            int choiceInner =scanner.nextInt();
            switch (choiceInner){
                case 0 -> menu();
                case 1 -> deposit();
                case 2 -> {break;}
                default -> {break;}
            }
        }catch (InputMismatchException e){display("wrong input");}
    }
    private  static  void deposit(){
        try {
            String accNo; int amount;
            display("***DEPOSIT***");
            display("Enter Account Number");
            accNo =scanner.next();
            display("Enter amount");
            amount = scanner.nextInt();
            bank.deposit(accNo, amount);
            display("""
                0. previous menu.
                1. To exit.
                """);
            int choiceInner =scanner.nextInt();
            switch (choiceInner){
                case 0 -> menu();
                case 1 -> {break;}
                default -> {break;}
            }
        }catch (InputMismatchException e){display("wrong input");}
    }
    private  static  void withdraw(){
       try {
           display("***WITHDRAW***");
           display("Enter account number");
           String accNo= scanner.next();
           display("Enter amount");
           int amount = scanner.nextInt();
           display("Enter pin");
           String pin = scanner.next();
           bank.withdraw(accNo,amount,pin);
           display("""
                0. previous menu.
                1. To exit.
                """);
           int choiceInner =scanner.nextInt();
           switch (choiceInner){
               case 0 -> menu();
               case 1 -> {break;}
               default -> {break;}
           }
       }catch (InputMismatchException e){display("wrong input");}
    }
    private  static void transer(){
        try {
            display("***TRANSFER***");
            display("Enter receiver Account Number");
            String recAccNo = scanner.next();
            display("Enter account number");
            String accNo= scanner.next();
            display("Enter amount");
            int amount = scanner.nextInt();
            display("Enter pin");
            String pin = scanner.next();
            bank.transfer(recAccNo,amount,accNo,pin);
            display("""
                0. previous menu.
                1. To exit.
                """);
            int choiceInner =scanner.nextInt();
            switch (choiceInner){
                case 0 -> menu();
                case 1 -> {break;}
                default -> {break;}
            }
        }catch (InputMismatchException e){display("wrong input");}
    }
    private  static  void balance(){
        try {
            display("***BALANCE***");
            display("Enter account number");
            String accountNo = scanner.next();
            display("Enter pin");
            String pin = scanner.next();
            bank.balance(accountNo,pin);
            display("""
                0. previous menu.
                1. To exit.
                """);
            int choiceInner =scanner.nextInt();
            switch (choiceInner){
                case 0 -> menu();
                case 1 -> {break;}
                default -> {break;}
            }
        }catch (InputMismatchException e){display("wrong input");}
    }
    private static  void display(String prompt){
        System.out.println(prompt);
    }

}
