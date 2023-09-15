package StreamPackage;

import java.util.List;
import java.util.Set;

public class StreamExample2 {
    public static void main(String[] args) {
        System.out.println("Stream Example using the Set collecton ");

        Set<String> names = Set.of("micheal", "paul", "john","sarah", "femi", "wale");
        System.out.println(names.stream().count());


    }
}
