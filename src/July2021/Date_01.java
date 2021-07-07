package July2021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date_01 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {


        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date dateToCheck = formatter.parse(date);

        Date yearStart = new Date();
        yearStart.setMonth(Calendar.JANUARY);
        yearStart.setDate(1);
        yearStart.setYear(dateToCheck.getYear());
        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setSeconds(0);

        long difference = dateToCheck.getTime() - yearStart.getTime() + 1000;

        long diffInDays = 1 + difference / 86400000;

        return diffInDays%2 != 0;
    }
}
