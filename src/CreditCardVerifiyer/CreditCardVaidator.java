package CreditCardVerifiyer;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardVaidator {
    private  int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int... numbers) {
        this.numbers = numbers;
    }

    public int[] convertStringInputToInt(String numbers){
        int[] no = new int[numbers.length()];
        for(int index =0; index < no.length; index++){
            no[index] = Integer.parseInt(numbers.substring(index, index +1));
        }
        return no;
    }
    public String cardName(int...numbers){
        String cardName = null;
        if (numbers[0] == 4 && numbers.length > 0 && numbers.length < 17){
            cardName = "Visa";
        }
        else if (numbers[0] == 5 && numbers.length > 0 && numbers.length < 17){
            cardName = "MasterCard";
        }
        else if (numbers[0] == 6 && numbers.length > 0 && numbers.length < 17){
            cardName = "Discover card";
        }
       else if (numbers[0] == 3 && numbers[1] == 7 && numbers.length > 0 && numbers.length < 17){
            cardName = "AmericanExpressCard";
        }
        else {
            return ("invalid input");
        }

        return cardName;
    }
    public int checkLengthOfCard(int...numbers){
        int length = numbers.length;
        return  length;
    }
    private int[] reverseCardNumbers(int... numbers){
        int[] reversedNumber = new int[numbers.length];
        int count =0;
        for(int index = numbers.length-1; index >= 0; index --){
            reversedNumber[count] = numbers[index];
            count++;
        }
        return reversedNumber;
    }
    public String validateCard(int... numbers){
        int[] new_number =reverseCardNumbers(numbers);
        int addOtherElements =0;
        int multiplyElements =0;
        int breakElementsBiggerThanTen =0;
        int addElementsBiggerThanTen =0;
        int addNotUpToTen = 0;
        int total =0;
        String output;
        for(int index =0; index < new_number.length; index++){
            if (index %2 ==1){
                multiplyElements =new_number[index] * 2;
                if (multiplyElements ==10 || multiplyElements  > 10){
                    breakElementsBiggerThanTen = multiplyElements % 10 + 1;
                    addElementsBiggerThanTen +=breakElementsBiggerThanTen;
                }else {
                    addNotUpToTen += multiplyElements;
                }
            }else  {
                addOtherElements += new_number[index];
            }
        }
        total = addNotUpToTen + addElementsBiggerThanTen +addOtherElements;
        if (total % 10 ==0){
            output= "valid";
        }else {
            output =  "invalid";
        }
        return output;
    }
}
