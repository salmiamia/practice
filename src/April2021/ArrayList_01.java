package April2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ArrayList_01 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        for (int i = 0; i < 10; i++) {
            s = reader.readLine();
            list.add(0, s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
