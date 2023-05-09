import java.util.Arrays;

public class PopulateArray {
    public static void main(String[] args) {
        int[] numbers = new int[50];

        for (int index = 0; index < numbers.length; index++){
            numbers[index] =5;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
