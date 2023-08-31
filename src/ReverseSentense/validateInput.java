package ReverseSentense;

public class validateInput {
    public static boolean containsNumbers(String input){
        String ans = "";
        for(int index =0; index < input.length();index++){
            if(!Character.isDigit(input.charAt(index))){
                ans = "true";
            }else {
                ans = "false";
                break;
            }
        }
        if(ans.equals("true")){
            return true;
        }throw new InvalidParameterException("Invalid input");
    }

}
