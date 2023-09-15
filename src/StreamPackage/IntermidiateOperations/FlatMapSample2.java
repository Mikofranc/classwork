package StreamPackage.IntermidiateOperations;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapSample2 {
    public static void main(String[] args) {
        List<String> words = List.of("MIKE", "JAMES", "PAUL", "BOSUN");
        var w= words.stream()
                .flatMap((word)-> Stream.of(word.split(""))).count();
        System.out.println(w);
    }
}
