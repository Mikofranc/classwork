package DSA;

import java.util.*;

public class ArrayListExcercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of colours");
        List<String> colour = new ArrayList<>();
        for(int index =0; index < 5; index++){
            System.out.println("enter color" + (index+1));
            String inputs = scanner.next();
            colour.add(inputs);
        }
        System.out.println(colour);
        colour.remove(2);
        System.out.println(colour);

        Set<String> suffle = new HashSet<>(colour);
        System.out.println("suffled list    " + suffle   );
    }

}
