package FuntionalInterface;

import java.util.Set;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Set<Integer>set = Set.of(10, 20, 30, 40, 50);
        Consumer<Integer> consume =(x) -> System.out.println(x);
        set.forEach(consume);
    }
    private static void consume(Integer x){

    }
}
