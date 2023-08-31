import java.util.Scanner;

public class AstericBarchat {
    public static void main(String[] args) {
        System.out.println("==AN APPLICATION THAT READS NUMBERS FROM 0-30 AND PRINTS ASTERICS===");
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int count1 = 0;
        if (numberOne >0 && numberOne <= 30){
            while (count1 < numberOne){
                System.out.print("*");
                count1++;
            }
            System.out.println();

        }else {
            System.out.println("ENTER NUMBER FROM 0 - 30");
        }
        int numberTwo = input.nextInt();
        if (numberTwo > 0 && numberTwo <= 30){
            int count2 = 0;
            while (count2 < numberTwo){
                System.out.print("*");
                count2++;
            }
            System.out.println();
        }else {
            System.out.println("ENTER NUMBER FROM 0 - 30");
        }

        int numberThree = input.nextInt();
        if (numberThree > 0 && numberThree <= 30) {
            int count3 = 0;
            while (count3 < numberThree){
                System.out.print("*");
                count3++;
            }
            System.out.println();
        }else {
            System.out.println("ENTER NUMBER FROM 0 - 30");
        }
        int numberFour = input.nextInt();
        if (numberFour > 0 && numberFour <= 30) {
            int count4 = 0;
            while (count4 < numberFour) {
                System.out.print("*");
                count4++;
            }
            System.out.println();
        }else {
            System.out.println("ENTER NUMBER FROM 0 - 30");
        }
        int numberFive = input.nextInt();
        if (numberFive > 0 && numberFive <= 30) {
            int count5 = 0;
            while (count5 < numberFive) {
                System.out.print("*");
                count5++;
            }
            System.out.println();
        }else {
            System.out.println("ENTER NUMBER FROM 0 - 30");
        }
    }
}
