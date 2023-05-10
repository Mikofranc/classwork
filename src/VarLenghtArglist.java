public class VarLenghtArglist {
    public static void main(String[] args) {

        int[] no = {1, 3, 5, 8, 9};
        System.out.println(add(no));
        double[] noDouble = {1, 3, 5, 8, 9};
        System.out.println(add(noDouble));
    }

    public static int add(int... number){
        int total =0;
        for (int no : number){
            total += no;
        }
        return total;
    }
    public static double add(double... number){
        int total =0;
        for (double no : number){
            total += no;
        }
        return total;
    }

}
