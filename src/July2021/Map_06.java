package July2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map_06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String nameInTheList = list.get(i);

            if (!result.containsKey(nameInTheList)) result.put(nameInTheList, 1);

            else {
                for (Map.Entry<String, Integer> pair : result.entrySet()) {
                    String word = pair.getKey();
                    Integer number = pair.getValue();

                    for (int j = 0; j < list.size(); j++) {
                        if (word.equals(nameInTheList)) result.replace(nameInTheList, number + 1);
                    }
                }
            }
        }
        return result;
    }
}
