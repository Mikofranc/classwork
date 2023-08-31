import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectDataAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dd = new SimpleDateFormat();
        System.out.println(dd.toString());
        int userInput = 0;
        double sum = 0;
        int[] numbers = new int[20];
        int noIncreament = 0;
        try{
            for(int index = 0; index < numbers.length; index++) {
                noIncreament++;
                if (index ==12 && index == 20 ){
                    System.out.println("enter "+(index + 1)+"th number");
                }
                switch (index+1 %10 ){
                    case 0 -> System.out.println("enter "+(index + 1)+"th number");
                    case 1 -> System.out.println("enter "+(index + 1)+"st number");
                    case 2 -> System.out.println("enter "+(index + 1)+"nd number");
                    case 3 -> System.out.println("enter "+(index + 1)+"rd number");
                    case 4 -> System.out.println("enter "+(index + 1)+"th number");
                    case 5 -> System.out.println("enter "+(index + 1)+"th number");
                    case 6 -> System.out.println("enter "+(index + 1)+"th number");
                    case 7 -> System.out.println("enter "+(index + 1)+"th number");
                    case 8 -> System.out.println("enter "+(index + 1)+"th number");
                    case 9 -> System.out.println("enter "+(index + 1)+"th number");

                }

                userInput = scanner.nextInt();
                numbers[index] = userInput;
                sum += numbers[index];

            }
        }catch (InputMismatchException ex){
            System.out.println(ex);
        }
        System.out.println("sum of integers in the array is :   " + sum / numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
