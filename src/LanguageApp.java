import java.util.Scanner;

public class LanguageApp {

    public static void main(String[] args) {

        System.out.println("==LANGUAGE APP ==");
        System.out.println("PRESS 1 FOR ENGLISH \nPRESS 2 FOR YORUBA " +
                "\nPRESS 3 FOR IGBO \nPRESS 4 FOR HAUSA \n");

        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        int customerInput = input;

        switch (customerInput) {
            case 1 -> System.out.println("ENGLISH");
            case 2 -> System.out.println("YORUBA");
            case 3 -> System.out.println("IGBO");
            case 4 -> System.out.println("HAUSA");
            default -> System.out.println("PLEASE ENTER CORRECT DIGIT");
        }
    }
}
