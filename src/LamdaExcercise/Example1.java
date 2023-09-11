package LamdaExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Comparator<String> comparator = (firstWord, secondWord) ->{
            return secondWord.compareTo(firstWord);
        };
        List<String> words = List.of("Hello", "Hi", "Hey", "Yungidu", "Hola");
        List<String> greet = new ArrayList<>(words);
        Collections.sort(greet, comparator);
        System.out.println(words);
        System.out.println(greet);

    }
}
