package CreditCardVerifiyer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCardVaidator creditCardVaidator = new CreditCardVaidator();
        System.out.println("Kindly Enter Card Details To Verify");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int[] cardNumber = creditCardVaidator.convertStringInputToInt(userInput);
        String cardType = creditCardVaidator.cardName(cardNumber);
        int cardLength = creditCardVaidator.checkLengthOfCard(cardNumber);
        System.out.println("****************************************************");
        System.out.println("** Credit Card Type:  "  + cardType + "  \n" +"** Credit Card Number:  "+ userInput+" \n" + "** Credit Card Length:  "+cardLength);
        String validate = creditCardVaidator.validateCard(cardNumber);
        System.out.println("** Credit Card Validity status:  "  + validate);
        System.out.println("*****************************************************");

    }
}
