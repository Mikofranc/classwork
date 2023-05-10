public class MethodMaximumArray {
    public static void main(String[] args) {
        int[] numbers ={6,2,3,4,6,175,4,3,2,4};
        int maximum =maxValue(numbers);
        int minimum = minValue(numbers);
        System.out.println("the maximum number in the arrays is  :: " + maximum);
        System.out.println("the mainimum number in the arrays is  :: " + minimum);

    }
    public static int maxValue(int[] array){
        int maximumValue = array[0];
        for(int index =1; index < array.length; index++){
            if (array[index] > maximumValue){
                maximumValue =array[index];
            }
        }
        return maximumValue;
    }


  public static int minValue(int[] array){
        int minimumValue = array[0];
      for(int index =1; index < array.length; index++){
        if (array[index] < minimumValue){
            minimumValue = array[index];
        }
      }
      return  minimumValue;
  }
}
