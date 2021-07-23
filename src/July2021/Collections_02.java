package July2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Collections_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }


        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char ch = chars[j];
                for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                    Character c = pair.getKey();
                    Integer in = pair.getValue();
                    if (c.equals(ch)) map.replace(ch, in + 1);
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            char printChar = alphabet.get(i);
            Integer in = map.get(printChar);
            System.out.println(printChar + " " + in);
        }
    }
}
