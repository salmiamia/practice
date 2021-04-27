package April2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList_08 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int size = list.size();

        for (int i = 0; i < size; i++) {
            list.add(i * 2 + 1, list.get(i * 2));
        }

        return list;
    }
}
