package semicolon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class checkInputAndPrint {
    public static void main(String[] args) {
        try{
            System.out.println("Please enter a number");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            checkInput(input);
        }catch (InputMismatchException exception){
            System.out.println("Wrong input");
        }

    }

    private static void checkInput(int input) {
        switch (input) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Wrong input");
        }
    }
}
