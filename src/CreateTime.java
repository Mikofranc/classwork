public class CreateTime {
    private int hour;
    private int minute;
    private int seconds;

    public CreateTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

   public  CreateTime(int hour, int minute){
        this(hour, minute,0);
   }
    public  CreateTime(int hour){
        this(hour, 0);
    }

    public static void main(String[] args) {
        CreateTime createTime = new CreateTime(1, 2,4);


    }
}
