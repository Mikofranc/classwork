import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                TickTakToe");
        System.out.println("""
                select number to put ur selection
                                    1 | 2| 3
                                    4 | 5| 6
                                    7 | 8| 9
                """);
        System.out.println("Userone choose ur selection 'X' or 'O'");
        String userOne = scanner.next();
        String userTwo;
        if(userOne.equalsIgnoreCase("X")){
            System.out.println("User two is 'O'");
             userTwo = "O";
        }else {
            System.out.println("User two is 'X'");
            userTwo = "X";
        }
        System.out.println("===========================\n===========================");

        int numberOfiterations = 9;
        String[][] board = new String[3][3];
        int selection;
        int [] enteredNumbers = new int[9];
        for(int index =0; index < numberOfiterations; index++){
            if(index % 2 ==0){
                System.out.println("user one enter ur selection");
                selection = scanner.nextInt();
                switch (selection){
                    case 1 -> board[0][0] = userOne.toUpperCase();
                    case 2 -> board[0][1] = userOne.toUpperCase();
                    case 3 -> board[0][2] = userOne.toUpperCase();
                    case 4 -> board[1][0] = userOne.toUpperCase();
                    case 5 -> board[1][1] = userOne.toUpperCase();
                    case 6 -> board[1][2] = userOne.toUpperCase();
                    case 7 -> board[2][0] = userOne.toUpperCase();
                    case 8 -> board[2][1] = userOne.toUpperCase();
                    case 9 -> board[2][3] = userOne.toUpperCase();
                    default -> System.out.println("wrong selection");
                }
            }else {
                System.out.println("user two enter ur selection");
                selection = scanner.nextInt();
                switch (selection){
                    case 1 -> board[0][0] = userOne.toUpperCase();
                    case 2 -> board[0][1] = userOne.toUpperCase();
                    case 3 -> board[0][2] = userOne.toUpperCase();
                    case 4 -> board[1][0] = userOne.toUpperCase();
                    case 5 -> board[1][1] = userOne.toUpperCase();
                    case 6 -> board[1][2] = userOne.toUpperCase();
                    case 7 -> board[2][0] = userOne.toUpperCase();
                    case 8 -> board[2][1] = userOne.toUpperCase();
                    case 9 -> board[2][3] = userOne.toUpperCase();
                    default -> System.out.println("wrong selection");
                }
            }

        }
        System.out.println(Arrays.deepToString(board));
    }
}
