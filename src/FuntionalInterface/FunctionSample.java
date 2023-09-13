package FuntionalInterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, String> function=(num)-> "this is my phone number:: " + num;
        System.out.println(function.apply(90114806));
    }
}
