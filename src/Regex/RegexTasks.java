package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTasks {
    public static void main(String[] args) {
        String text = "9";
         String regex = "[A-z]*";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher match = pattern1.matcher(text);
        System.out.println(match.matches());
    }
}
