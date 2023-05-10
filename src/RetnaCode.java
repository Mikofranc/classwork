import java.util.Arrays;
import java.util.Scanner;

public class RetnaCode {
    public static void main(String[] args) {
        int sum =0;
        int[] ages = new int[5];
        Scanner input = new Scanner(System.in);
        for(int index =0; index < ages.length; index++){
            ages[index] = input.nextInt();
        }
        for(int index= 0; index < ages.length; index++){
            sum += ages[index];
        }
        System.out.println(Arrays.toString(ages) + "       sum is" + sum);
    }
}
