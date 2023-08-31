package TicTacToe;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
//        String[][] game = new String[3][3];
//        for(int index=0;index)
        int[]  no ={29, 4, 56, 73, 26, 1, 12, 7, 15};
        System.out.println(Arrays.toString(no));
        Arrays.sort(no);
        System.out.println(Arrays.toString(no));
        int[] num = new int[no.length];
        int count =0;
        for(int index = num.length-1; 0 <=index; index--){
            num[count] = no[index];
            count++;
        }
        System.out.println(Arrays.toString(num));
    }
}
