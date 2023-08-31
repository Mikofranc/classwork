public class MethodMaximumArray {
    public static void main(String[] args) {
        int[] numbers ={6,2,3,4,6,175,4,3,2,4};
        int maximum =maxValue(numbers);
        int minimum = minValue(numbers);
        System.out.println("the maximum number in the arrays is  :: " + maximum);
        System.out.println("the mainimum number in the arrays is  :: " + minimum);
    }
    public static int maxValue(int[] arrayOfNumbers){
        int maximumValue = arrayOfNumbers[0];
        for(int index =1; index < arrayOfNumbers.length; index++){
            if (arrayOfNumbers[index] > maximumValue){
                maximumValue =arrayOfNumbers[index];
            }
        }
        return maximumValue;
    }
  public static int minValue(int[] arrayOfNumbers){
        int minimumValue = arrayOfNumbers[0];
      for(int index =1; index < arrayOfNumbers.length; index++){
        if (arrayOfNumbers[index] < minimumValue){
            minimumValue = arrayOfNumbers[index];
        }
      }
      return  minimumValue;
  }
}
