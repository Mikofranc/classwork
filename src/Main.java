public class Main {
    public static void main(String[] args) {
        /*print 1-100 if a no is divisible by 3 === bizz.... and if its divisble by 5 === buzz.
        if its divisble by 3 and 5 === fizzbuzz8*/

            int fizzbuzz = 3 * 5;

        for (int number =1; number<= 100; number++){

           if (number%fizzbuzz == 0) System.out.println("fizzbuzz");
           else if (number%5 == 0) System.out.println("buzz");
           else if (number%3 == 0) System.out.println("fizz");

           else System.out.println(number);
        }







    }
}