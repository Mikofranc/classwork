import java.util.Arrays;

public class StreamArray {
    public static void main(String[] args) {
        String [] names = {"micheal", "john", "paul", "feranmi", "sarah","femi"};
        Arrays.stream(names).forEach(System.out::println);
                
    }
}
