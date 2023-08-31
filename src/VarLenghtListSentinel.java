import java.util.Scanner;

public class VarLenghtListSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int total = 0;
        for(int index =0; userInput != -1; index++){
            userInput = scanner.nextInt();
            total += add(userInput);
        }
        System.out.println(total);
    }
    public static int add(int... number){
        int total =0;
        for (int no : number){
            total += no;
        }
        return total;
    }
    public static double add(double... number){
        int total =0;
        for (double no : number){
            total += no;
        }
        return total;
    }
}
