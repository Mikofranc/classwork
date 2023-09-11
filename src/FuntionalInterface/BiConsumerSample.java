package FuntionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =(firstInput, secondInput)-> System.out.println(firstInput + secondInput);
        Map<String, Integer> map = Map.of(
                "Amount", 2000,
                "Total",45000
        );
        map.forEach(biConsumer);
    }
}
