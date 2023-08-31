import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String input = "abczz";
        checkValueAtIndex(input);
    }

    private static void checkValueAtIndex(String input) {
        String[] word  = input.split("");
        String result  ="";
        for(int index =0; index < word.length; index++){
            if(input.contains(word[index].repeat(index))){
                result = word[index];
            }
        }
        System.out.println(result);
    }
}
