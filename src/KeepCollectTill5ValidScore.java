import java.util.Scanner;

public class KeepCollectTill5ValidScore {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("A PROGRAM THAT SUM OF VALID SCORE OF 5\n");
        int count = 0;
        int sum = 0;
        int validScores = 0;

        while (validScores < 5){
            System.out.println("Enter score: ");
            int sumInput = userInput.nextInt();
            count++;

            if (sumInput > 0 && sumInput < 100){
                sum += sumInput;
                validScores++;
            }
        }
        System.out.println("Sum of valid scores: "+ sum);
    }
}
