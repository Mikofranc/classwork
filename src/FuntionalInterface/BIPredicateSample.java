package FuntionalInterface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BIPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, String[]> biPredicate = (input1, input2) ->
                Arrays.stream(input2).anyMatch(input1::equals);

        String[] names = {"john", "micheal","chinedu"};
        System.out.println(biPredicate.test("john", names));
    }
}
