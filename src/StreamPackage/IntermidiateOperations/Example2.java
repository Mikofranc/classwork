package StreamPackage.IntermidiateOperations;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        //Using the MAP: it is a transformational method it is used to change the the element

        List<String> names = List.of("micheal", "paul", "john","sarah", "femi", "wale");
        Stream<Person> p =names.stream()
                .map(n -> new Person(n))
                .sorted();
        System.out.println(p);
    }

}
