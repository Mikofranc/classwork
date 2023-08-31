package ReverseSentense;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "ilovejava ";
        String ans = mostOccuringChar(sentence);
        System.out.println(ans);
    }

    public static  String mostOccuringChar(String input){
        int maxInput =0;
        String ans = "";
        String space = " ";
        for (int index =0; index < input.length(); index++){
            int count = 0;
            for(int inner =input.length()-1; inner > 0; inner --){
                if(input.charAt(index)==input.charAt(inner))count++;
            }
            if(count > maxInput){
                maxInput = count;
                ans = String.valueOf(input.charAt(index));
            }
        }
        return ans;
    }

    public static int specialCharSize(String input){
        int count =0;
        for (int index =0; index < input.length();index++){
           if(checkIfIthasSpecialCharacter(String.valueOf(input.charAt(index)))){
               count ++;
           }
        }
        return count;
    }

    public static String reverseSentence(String input) {
        String sentence = input+" ";
        validateInput.containsNumbers(sentence);
        char space = ' ';
        char comma = ',';
        List<String> word = new ArrayList<>();
        String w = "";
        StringBuilder newSentence = new StringBuilder("");
        int count = 0;
        for (int index = 0; index < sentence.length(); index++){
            if(sentence.charAt(index)!=space && sentence.charAt(index) !=comma){
                w += sentence.charAt(index);
            }else{
                word.add(w);
                w ="";
                word.add(String.valueOf(space));
            }
        }
        for(int index = word.size()-1; index >= 0; index--){
            newSentence.append(word.get(index));
        }
        return newSentence.toString().substring(1);
    }
    private static boolean checkIfIthasSpecialCharacter(String input){
        String regex = "[^a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
