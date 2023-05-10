import java.util.Arrays;
import java.util.Scanner;

public class ArraysThatTakeInputAndSum {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER THAT YOU WANT TO ADD");
        Scanner scanner = new Scanner(System.in);
        int [] userInput = new int[5];
        int sum =0;
        int inputCollector = 0;

        for(int index = 0; index < userInput.length; index++){
            inputCollector = scanner.nextInt();
            userInput[index]= inputCollector;
            sum +=inputCollector;
        }
        System.out.println(Arrays.toString(userInput));
        System.out.println("the sum of the arrays is : " + sum);

    }
}
