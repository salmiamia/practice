package May2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int [] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array2.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
    }
}
