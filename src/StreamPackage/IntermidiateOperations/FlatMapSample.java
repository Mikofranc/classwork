package StreamPackage.IntermidiateOperations;

import java.util.List;
import java.util.function.BinaryOperator;

public class FlatMapSample {
    public static void main(String[] args) {
        List<List<Integer>> names = List.of(
                List.of(1, 2,3, 5,7),
                List.of(8, 10, 24, 36, 34),
                List.of(10, 33, 11,23)
        );
        names.stream()
                .flatMap(integers -> integers.stream())
                .mapToInt(n ->n).sum();

         var sum = names.stream()
                 .flatMap(n -> n.stream())
                 .reduce(0, (id, no)-> id + no);
        System.out.println(sum);
    }
}
