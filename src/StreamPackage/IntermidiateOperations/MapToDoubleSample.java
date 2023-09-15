package StreamPackage.IntermidiateOperations;

import java.util.List;

public class MapToDoubleSample {
    public static void main(String[] args) {
        List<String> names = List.of("micheal", "paul", "john","sarah", "femi", "wale");
        names.stream()
                .mapToDouble(name -> name.length() * 1.0)
                .forEach(System.out::println);
    }
}
