package StringValdtation;

public class StringValidator {
    public static boolean checkThatItsNo(String input){
        boolean answer = false;
      try {
          int number = Integer.parseInt(input);
          if(number==Integer.parseInt(input)){
              answer= true;
          }
      }catch (NumberFormatException e){
//          System.out.println("false");
      }
      return  answer;
    }

    public static boolean checkThatStringDoesNotHaveNumber(String input){
        boolean answer = true;
        try {
            int number = Integer.parseInt(input);
            if(number==Integer.parseInt(input)){
                answer= false;
            }
        }catch (NumberFormatException e){
//          System.out.println("false");
        }
        return  answer;

    }

    public static void main(String[] args) {
        String z = "123456";
        System.out.println(checkThatStringDoesNotHaveNumber(z));
        System.out.println(checkThatItsNo(z));
    }
}
