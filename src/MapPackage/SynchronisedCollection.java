package MapPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronisedCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        Collection<Integer> numbers = Collections.synchronizedList(nums);
        System.out.println(numbers);
        numbers.forEach(n-> System.out.println(n + 3));

    }
}
