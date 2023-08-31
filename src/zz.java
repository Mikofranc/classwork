import java.util.Scanner;

public class zz {
    public static void main(String[] args) {
        int number =5;
        int result = square(number);
        System.out.println(result);
        System.out.println(number);
        System.out.println("=====================");


        Account account = new Account();
        account.setName("johnson");
        System.out.println(account);
        changeAccountName(account);
        System.out.println();
        System.out.println(account);
    }

    private  static int square(int number){
        number *=number;
        return number;
    }

    private static void changeAccountName(Account account){
        account.setName("mike");
    }
}
