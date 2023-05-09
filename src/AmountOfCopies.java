import java.util.Scanner;

public class AmountOfCopies {
    public static void main(String[] args) {
        System.out.println("Enter amount of copies to get your price ");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput >= 1 && userInput <= 4) System.out.println("its N2,000  per copy");
        if (userInput >= 5  && userInput <= 9) System.out.println("its N1,800  per copy");
        if (userInput >= 10 && userInput <= 29) System.out.println("its N1,600  per copy");
        if (userInput >= 30 && userInput <= 49) System.out.println("its N1,500  per copy");
        if (userInput >= 50 && userInput <= 99) System.out.println("its N1,300  per copy");
        if (userInput >= 100 && userInput <= 199) System.out.println("its N1,200  per copy");
        if (userInput >= 200 && userInput <= 499) System.out.println("its N1,100  per copy");
        if (userInput >= 500 && userInput <= 1000000) System.out.println("its N1,000  per copy");


    }

}
