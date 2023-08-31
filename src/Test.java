import java.util.Arrays;
public class Test {

        public static void main(String[] args) {
            int[][] arr = new int[5][];
            arr[0] = new int[5];
            arr[1] = new int[3];
            arr[2] = new int[10];
            arr[3] = new int[]{400, 500};
            arr[4] = new int[10];

            for(int index = 0; index < arr[0].length; index++) increaseFirstRow(arr, index);
            for(int index = 0; index < arr[4].length; index++) increaseByHundreds(arr, index);
            System.out.println(Arrays.deepToString(arr));

        }

    private static void increaseByHundreds(int[][] arr, int index) {
        arr[4][index]=(1+ index)* 100;
    }

    private static void increaseFirstRow(int[][] arr, int index) {
        arr[0][index]= index;
    }
}

