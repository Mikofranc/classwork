import java.util.Arrays;

public class IncreaseArraylength {
    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    public  int[] arrayIncrease(int[] numbers) {
        int[] newArray = new int[numbers.length+ numbers.length];
        for (int index = 0; index < numbers.length; index++){
            newArray[index] = numbers[index];
        }
        return newArray;
    }




}
