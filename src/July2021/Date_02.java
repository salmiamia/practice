package July2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_02 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = formatter1.parse(reader.readLine());

        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM", Locale.ENGLISH);
        System.out.print(formatter2.format(date).toUpperCase());

        SimpleDateFormat formatter3 = new SimpleDateFormat(" dd, yyyy", Locale.ENGLISH);
        System.out.println(formatter3.format(date));
    }
}
