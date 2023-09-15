package StreamPackage;

import java.util.stream.IntStream;

public class PrimitiveStreamExample1 {
    public static void main(String[] args) {
        var numbers =IntStream.range(1, 21);
        numbers.filter(n -> n % 2 ==0)
                .forEach(System.out::println);
    }
}
