public class CheckerStringType {

    public static boolean checkEqualsInt(String input){
        boolean result = false;
        try {
            int check = Integer.parseInt(input);
            if(Integer.parseInt(input)==check){ result= true;}
            else {result= false;}
        }catch (NumberFormatException e){
        }
        return result;
    }


    public static void main(String[] args) {
        String no = "12345";
        System.out.println(checkEqualsInt(no));
    }
}
