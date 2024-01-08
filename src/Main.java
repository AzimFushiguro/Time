import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.MILLISECOND));

    }
}