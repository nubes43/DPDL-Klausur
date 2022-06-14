import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {

    public static void main(String[] args) {

        String path = "/etc/hosts";

        File file = new File(path);

        long changed = file.lastModified();

        Date date = new Date(changed);

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(date);

        System.out.println("Letzte Änderung: " + calendar.getTime());

        String datesString = new SimpleDateFormat("dd.MM.YYYY").format(calendar.getTime());
        System.out.println(datesString);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK) + " " + calendar.get(Calendar.DAY_OF_MONTH) + " "
                + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
        // String timeStamp = new
        // SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
