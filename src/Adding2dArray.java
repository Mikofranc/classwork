import  java.util.Arrays;
public class Adding2dArray {
    public static void main(String[] args) {
        int[][] numbers ={
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };
        int firstNo = numbers[0][1] ;
        int secondNo = numbers[1][2] ;

        for(int index =0; index < numbers[1].length; index++){
            System.out.println(Arrays.deepToString(numbers));
        }

        System.out.println(firstNo * secondNo);

    }
}
