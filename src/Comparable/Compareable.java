package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compareable {
    public static void main(String[] args) {
        Cat ologbo = new Cat(7, "meaow");
        Cat ologbo1= new Cat(10, "kiki");
        Cat ologbo2 = new Cat(123, "lila");

        List<Cat> cats = new ArrayList<>();
        cats.add(ologbo);
        cats.add(ologbo1);
        cats.add(ologbo2);
        Collections.sort(cats);

        System.out.println(cats);
        Comparator<Cat> catComparator = (firstCat, secondCat) ->{
            if(secondCat.compareTo(firstCat) <0)return -1;
            else if (firstCat.compareTo(secondCat) >0) return 1;
            return 0;
        };
        Collections.sort(cats,catComparator);
        System.out.println(cats);

    }
}
