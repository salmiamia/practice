package April2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList_05 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<String >();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        int max = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < min) min = list.get(i).length();
            if (list.get(i).length() > max) max = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min || list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
