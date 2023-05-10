public class Exception {
    public static void main(String[] args) {
        try{
            int[] arr = {2,3,4,5,};
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
