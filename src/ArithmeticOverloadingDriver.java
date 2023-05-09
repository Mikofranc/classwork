public class ArithmeticOverloadingDriver {
    public static void main(String[] args) {
        ArithmeticOverloadingExample calculate = new ArithmeticOverloadingExample();
        int a = calculate.add(2, 3);
        int b = calculate.add(2, 3, 4);
        int c = calculate.add(2, 3);

        System.out.println("a: " + a +   "\nb: " + b + "\nc: " + c);
    }
}
