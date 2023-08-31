import java.util.Scanner;

public class CreateMultilplicationTable {

    public static void main(String[] args) {
        System.out.println("==A PROGRAM THAT CREATES MULTIPLICATION TABLE ==");
        System.out.println("Enter integer that you want to multiply");
        Scanner userinput = new Scanner(System.in);
        int input = userinput.nextInt();
        int result =0;

        for (int count = 1; count <= 12; count++){
            result = count * input;
            System.out.println(input+" * "+count+" = "+result);

        }
    }
}
