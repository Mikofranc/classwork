package semicolon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};
        System.out.println(Arrays.toString(swap(num, 2, 3)));
    }

    public static int[] swap(int[] num, int firstPosition, int secondPosition) {
        List<Integer> newList = new ArrayList<>();
        for(int index = 0; index < num.length; index++){
            newList.add(num[index]);
        }
        newList.set(firstPosition, num[secondPosition]);
        newList.set(secondPosition, num[firstPosition]);

        for(int index =0 ;index < num.length; index++){
            num[index]=newList.get(index);
        }
        return num;
    }
}
