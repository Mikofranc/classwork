import java.util.Scanner;

public class OutputAvOfValidScore {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("A PROGRAM THAT SUM OF VALID SCORE OF 5\n");
        int count = 0;
        int sum = 0;
        int validScores = 0;
        int totalSum = 0;

        while (validScores < 5){
            System.out.println("Enter score: ");
            int sumInput = userInput.nextInt();

            if (sumInput > 0 && sumInput < 100){
                sum += sumInput;
                validScores++;

            }

            totalSum = validScores+sum;

        }
        System.out.println("The average of total scores ==>" + sum/count +"\n");
        System.out.println("the sum of total score==>"+sum);
        System.out.println("valid scores is==>"+validScores);
        System.out.println("the Average of valid scores is==> "+totalSum/validScores);
    }
}
