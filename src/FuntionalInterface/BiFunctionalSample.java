package FuntionalInterface;

import java.util.function.BiFunction;

public class BiFunctionalSample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =(input1, input2)-> input1.hashCode()==input2;
    }

}
