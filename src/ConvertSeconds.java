import java.time.Month;

public class ConvertSeconds {
    private static final  long YEAR = 31_536_000;
    private  static final  long AMOTH = 2_419_200;
    private  static final  long WEEK = 604_800;
    private  static final  long DAY = 86_400;
    private  static final  long HOUR = 3_600;
    private  static final  long MINUTE = 60;

    private static long year;
    private static long month;
    private static long remainder;

    public static long checkSeconds(Long input){
       if(input % YEAR >= 1){
           year = input / YEAR;
           remainder = input % YEAR;
       }
        if(input > YEAR && input < AMOTH || remainder < AMOTH){

        }
        return remainder;
    }

    public static void main(String[] args) {
        Long ans = checkSeconds(31_536_760L);
        System.out.println(ans);
    }
}
