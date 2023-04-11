import java.util.Scanner;

public class ForLoopIncrease {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();
        int sum = 0;
        int count =1;
        int totalSum =0;

        for (; count < 5 ; count++){
            System.out.println("Enter inputs: ");
            sum += userInput.nextInt();
            totalSum += sum;
        }

        System.out.println("sum user inputs: "+ sum);
//        System.out.println("sum user inputs: "+ totalSum);

    }
}
