public class VarLenghtArglist {
    public static void main(String[] args) {

        int no = add(1, 3, 5, 8, 9);
        System.out.println(no);
        double noDouble =add (1, 3, 5, 8, 9);
        System.out.println(noDouble);
    }

    private static int add(int... number){
        int total =0;
        for (int no : number){
            total += no;
        }
        return total;
    }
    private static double add(double... number){
        int total =0;
        for (double no : number){
            total += no;
        }
        return total;
    }

}
