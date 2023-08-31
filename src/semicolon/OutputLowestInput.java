package semicolon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputLowestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you integer enter -1 to end the loop");
        int stopper = -1;
        int input ;
        int min =0;

        List<Integer> numbers = new ArrayList<>();
        do {
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != -1);
        numbers.remove(numbers.size()-1);
        min = numbers.get(0);

        for(Integer no : numbers){
            if(no < min){
                min = no;
            }
        }
        System.out.println(min);

    }
    private static boolean checkInput(String input){
        String regex = "\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
