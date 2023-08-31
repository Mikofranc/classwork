import java.util.Arrays;
import java.util.Scanner;

public class CollectingEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number= new int[10];
        int[] even = new int[5];
        for(int index = 0; index < number.length; index++){
            number[index] =scanner.nextInt();
            if(number[index] % 2==0){
                even[index] =number[index];
            }
        }
        System.out.println(Arrays.toString(even));

    }
}
