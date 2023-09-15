package StreamPackage;

import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = List.of("micheal", "paul", "john","sarah", "femi", "wale");
        names.stream().forEach(n -> System.out.print(n + "  "));
    }
}
