import java.util.Scanner;

public class CollectingPostive_Zero_NegativeIntegers {
    public static void main(String[] args) {
        System.out.println("==AN APP THAT TAKES POSITIVE AND NEGATIVE INTEGERS & PRINT THE RESULT==");
        Scanner userInput = new Scanner (System.in);
        int collector =0;
        int input =0;
        int positive =0;
        int negative = 0;
        int zero =0;


        while (input != -2301){
            collector += input;
            input = userInput.nextInt();
            System.out.println(collector);
            if (input > 0){
                positive += input;

            }
            if (input < 0){
                negative += input;
            }
            if (input == 0){
                zero += input;
            }

        }
        System.out.println("THE SUM OF POSITIVE NO IS: "+positive);
        System.out.println("THE SUM OF NEGATIVE NO IS: "+negative);
        System.out.println("THE SUM OF ZERO NO IS: "+zero);


    }
}
