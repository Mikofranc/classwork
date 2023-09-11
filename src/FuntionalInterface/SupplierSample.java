package FuntionalInterface;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "hello";
        System.out.println(supplier.get());
    }
}
