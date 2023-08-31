import java.util.Scanner;

public class EnforcingPrivacyWithCrptography {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER FOUR INTEGERS \n");
        Scanner userInput = new Scanner(System.in);
        int input1 = userInput.nextInt();
        int input2 = userInput.nextInt();
        int input3 = userInput.nextInt();
        int input4 = userInput.nextInt();

        int add1 = input1 + 7;
        int add2 = input2 + 7;
        int add3 = input3 + 7;
        int add4 = input4 + 7;

        int modulo1 = add1 % 10;
        int modulo2 = add2 % 10;
        int modulo3 = add3 % 10;
        int modulo4 = add4 % 10;

        System.out.print(modulo1+"   ");
        System.out.print(modulo2+"   ");
        System.out.print(modulo3+"   ");
        System.out.println(modulo4+"   ");






    }
}
