import java.util.Scanner;

public class TheHhighest_Lowest {
    public static void main(String[] args) {
        System.out.println(" ENTER INTEGERS\n");
        Scanner userinput = new Scanner(System.in);

        int input = 0;
        int number = 0;
        int count = 0;
        while (count < 10){
           input = userinput.nextInt();
           number += input;
           count++;
        }
        System.out.println(number);

    }
}
