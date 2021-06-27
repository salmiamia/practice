package June2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Lists_06 {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int i = 1;
        List <Integer> list2 = new ArrayList<>();

        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j).equals(list.get(j + 1))) {
                i ++;
                list2.add(i);
            }
            else {
                i = 1;
            }
        }

        try {
            System.out.println(Collections.max(list2));
        }
        catch (NoSuchElementException e) {
            System.out.println(1);
        }
    }
}
