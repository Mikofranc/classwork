import java.util.Arrays;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {9, 7, 10, 26, 7, 1};
        int maxmber =numbers[0];
        int minNumber = numbers[0];
        for (int index = 1; index < numbers.length; index++){
            if (numbers[index] > maxmber){
                maxmber = numbers[index];
            }
            if (numbers[index] < minNumber){
                minNumber = numbers[index];
            }
        }
        System.out.println("the maximum number is:  " + maxmber);
        System.out.println("the minimum number is:   " + minNumber);

    }
}
