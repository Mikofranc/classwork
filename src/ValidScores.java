import java.util.Scanner;

public class ValidScores {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("A PROGRAM THAT SUM SCORE OF 5\n");
        int count = 0;
        int sum = 0;
        while (count < 5) {
            System.out.println("Enter score: ");
            int sumInput = userInput.nextInt();
            count++;
            if (sumInput > 0 && sumInput < 100){
                sum += sumInput;
            }
        }
        System.out.println("The valid sum of total scores ==>" + sum );
    }
}
