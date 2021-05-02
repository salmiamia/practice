package May2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_01 {
    public static void main(String[] args) throws IOException {

        int[] array = getInts();

        int maximum = array[0];
        int minimum = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > maximum) maximum = array[i + 1];
            if (array[i + 1] < minimum) minimum = array[i + 1];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

}
