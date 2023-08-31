import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter you name:     ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
