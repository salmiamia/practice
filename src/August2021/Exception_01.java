package August2021;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exception_01 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        //ArithmeticException
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[4];
            for (int i = 0; i <= 4; i++) {
                array[i] = array[i] + 1;
            }

        } catch (Exception e) {
            exceptions.add(e);
        }

        //NumberFormatException
        try {
            String s = "мама";
            int i = Integer.parseInt(s);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //NullPointerException
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //IndexOutOfBoundsException
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //StringIndexOutOfBoundsException
        try {
            String a = "This is like chipping ";
            char c = a.charAt(24);
            System.out.println(c);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //FileNotFoundException
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //ClassCastException
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //NegativeArraySizeException
        try {
            int i = -6;
            int[] array = new int[i];

        } catch (Exception e) {
            exceptions.add(e);
        }

        //ArrayStoreException
        try {
            Number[] a = new Double[2];
            a[0] = new Integer(4);

        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
