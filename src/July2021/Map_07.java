package July2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Map_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String string = reader.readLine();
            if (string.equals("")) {
                break;
            }
            Integer number = Integer.parseInt(string);
            string = reader.readLine();
            if (string.equals("")) {
                map.put("", number);
                break;
            }
            String s = string;
            map.put(s, number);
        }

        for(Map.Entry<String, Integer> pair : map.entrySet()){
            String str = pair.getKey();
            Integer num = pair.getValue();
            System.out.println(num + " " + str);
        }
    }
}
