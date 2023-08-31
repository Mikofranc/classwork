public class MultiplyWithoutMultiplySign {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        int total =0;
       if (firstNumber >=0 && secondNumber >= 0 ){
           for (int index =0; index < secondNumber; index++){
               total += firstNumber;
           }
       }else {
           if(firstNumber < 0 && secondNumber < 0){
               firstNumber = firstNumber / (- 1);
               secondNumber = secondNumber / (-1);
               for (int index =0; index < secondNumber; index++){
                   total += firstNumber;}
           }
           else if (firstNumber >= 0 && secondNumber < 0) {
               int calc =0;
               for (int index =0; index < secondNumber; index++){
                   calc += firstNumber;
               }
//                calc =firstNumber;
                total =0 - calc;
           }else if (firstNumber < 0 && secondNumber >= 0) {
               int calc =0;
               firstNumber = firstNumber / (- 1);
               calc +=firstNumber;
               total =calc;
           }
       }
        return total;
    }

    public static void main(String[] args) {
        MultiplyWithoutMultiplySign multiplyWithoutMultiplySign = new MultiplyWithoutMultiplySign();
        int number = multiplyWithoutMultiplySign.multiply(-2,- 3);
        System.out.println(number);
    }
}

