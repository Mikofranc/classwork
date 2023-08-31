import java.util.Scanner;

public class ScoresOf5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("A PROGRAM THAT SUM SCORE OF 5\n");
//        System.out.println("Enter score: ");
//        int input = userInput.nextInt();
        int count = 0;
        int sumInput;
        int sum = 0;
        while (count < 5) {
            System.out.println("Enter score: ");
            sumInput = userInput.nextInt();
            sum += sumInput;
            count++;
        }
//        sum+=input;
        System.out.println("The sum of total scores ==>" + sum );
    }
}
