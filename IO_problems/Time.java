
import java.time.LocalTime;

public class Time{
    public static void main(String[] args){
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        int min = lt.getMinute();
        int sec = lt.getSecond();
        System.out.println(hour+":"+min+":"+sec);
    }
}