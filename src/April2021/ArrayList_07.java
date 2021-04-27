package April2021;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_07 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");

        int size = list.size();

        for (int i = 0; i < size; i++) {
            list.add(i * 2 + 1, "именно");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
