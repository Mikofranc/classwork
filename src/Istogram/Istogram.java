package Istogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Istogram {
    private static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','|'};
    public static boolean istogramCheck(String input) {
        var checkStrings = checkStringForAllLetterUsingRegex(input);
        int counter = 0;
        for(char characters: alphabet){
            counter = (int) count(input, characters);
            if(counter > 1 && checkStrings){
                return false;
            }
        }
      return true;
    }
    public static long count(String st, char chr){
        return st.chars().filter(ch -> ch == chr).count();
    }
//    public static boolean checkAllCharacters(String input){
//        boolean result;
//        for(char chars: alphabet){
//            for(int index =0; index > input.length(); index++){
//               result= checkinput(String.valueOf(input.charAt(index)),String.valueOf(chars));
//               if(result){
//                   return  result;z
//               }
//            }
//        }
//        return result = false;
//    }
    private static boolean checkStringForAllLetterUsingRegex(String input) {
        return input.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    public static void main(String[] args) {
        System.out.println(checkStringForAllLetterUsingRegex("the qick brwn fx jumps ov lazy d|"));
    }
}
