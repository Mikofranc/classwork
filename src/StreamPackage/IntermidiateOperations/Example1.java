package StreamPackage.IntermidiateOperations;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        //Using the MAP: it is a transformational method it is used to change the the element

        List<String> names = List.of("micheal", "paul", "john","sarah", "femi", "wale");
        names.stream().map(n -> n.length()).forEach(System.out::println);
    }
}
