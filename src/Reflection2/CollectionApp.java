package Reflection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionApp {

    public static void main(String[] args) {
        System.out.println("An app that tells you Political zone after you input state\n");
        System.out.println("ENTER STATE");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        getZone(input);
    }

    public static void getZone(String input) {
        Zones arr[] = Zones.values();
        String check = null;
        for (Zones zones : arr){
            for (String z : zones.getStates()){
                if (z.equals(input)){
                    System.out.println(zones);
                }
            }
        }
    }

}
