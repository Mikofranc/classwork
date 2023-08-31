public class LeetCodeTask {
    public static void main(String[] args) {
        String input = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String name = "";
        for(int index =0; index < input.length(); index++){
            int check = indices[index];
            for(int j =0; j < input.length(); j++){
                name = String.valueOf(input.charAt(check));
            }
            System.out.print(name);
        }
    }
}
