package July2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting_03 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String[] array2 = array;
        ArrayList<String> arrayListString = new ArrayList<>();
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        for (int i = 0; i < array2.length; i++) {
            if (isNumber(array2[i])) arrayListInteger.add(Integer.parseInt(array2[i]));
            else arrayListString.add(array2[i]);
        }

        for (int j = 0; j < arrayListString.size() - 1; j++) {
            for (int i = 0; i < arrayListString.size() - 1; i++) {
                if (isGreaterThan(arrayListString.get(j), arrayListString.get(j + 1))) {
                    arrayListString.add(arrayListString.get(j));
                    arrayListString.remove(j);
                }
                else {
                    arrayListString.add(arrayListString.get(j + 1));
                    arrayListString.remove(j + 1);

                }
            }
        }

        Collections.sort(arrayListInteger, Collections.reverseOrder());

        int in = 0;
        int st = 0;

        for (int i = 0; i < array2.length; i++) {
            if (isNumber(array2[i])) {
                array[i] = arrayListInteger.get(in).toString();
                in++;
            }
            else {
                array[i] = arrayListString.get(st);
                st++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
