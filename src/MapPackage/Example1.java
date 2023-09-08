package MapPackage;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    //The map takes two reference types
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("ASiwaju", 200);
        map.put("yungdidu", 500);
        map.put("chimo", 400);
        System.out.println(map);
        map.forEach((key,value)-> System.out.println(key+": "+ value));

        System.out.println();
        dictionary.putAll(map);
        System.out.println(dictionary);
        dictionary.forEach((key,value)-> System.out.println(key+": "+ value));
    }
}
