package semicolon;

import java.util.Arrays;

public class RemovedNumber {
    public static void main(String[] args) {
        int[] enteredNumbers = {10,3,6,1, 2,3,4 ,23, 5};
        int[] ans = checkNumberRemovedAndMax(enteredNumbers);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] checkNumberRemovedAndMax(int[] enteredNumbers){
        int[][] arrResult = new int[enteredNumbers.length][2];
        int sum =0;
        int max =0;
        int indexMaxNo = 0;
        int indexlowestNo = 0;
        int[] ans = new int[2];
        for(int i =0; i < enteredNumbers.length; i++) {
            for (int index = 0; index < enteredNumbers.length; index++) {
                sum += enteredNumbers[index];
            }
            arrResult[i][1] =sum-enteredNumbers[i];
            sum =0;
        }

        for(int index =0; index < enteredNumbers.length; index++){
            if(arrResult[index][1] > max){
                max=arrResult[index][1];
                indexMaxNo = index;
            }
        }

        int min = arrResult[0][0];
        for(int index =0; index < enteredNumbers.length; index++){
            if( arrResult[index][1] < min){
                min =arrResult[index][1];
                indexlowestNo = indexMaxNo;
            }
        }

        ans[0]= enteredNumbers[indexMaxNo];
        ans[1] = enteredNumbers[indexlowestNo];
        return ans;
    }


}

