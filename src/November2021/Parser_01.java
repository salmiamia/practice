package November2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parser_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        char[] chars = url.toCharArray();

        List<String> list = new ArrayList<>();

        String s = "";
        String value = "";

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '?' || chars[i] == '&') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] != '?' && chars[j] != '&' && chars[j] != '=') {
                        s = s + chars[j];
                    } else {
                        list.add(s);

                        if (s.equals("obj") && chars[j] == '=') {
                            for (int k = j + 1; k < chars.length; k++) {
                                if (chars[k] != '&') {
                                    value = value + chars[k];
                                }
                                else break;

                            }

                        }

                        s = "";
                        break;

                    }
                }
            }
        }

        for (String a: list) {
            System.out.print(a + " ");
        }
        System.out.println("");

        if (value != "") {
            try {
                double d = Double.parseDouble(value);
                alert(d);
            } catch (Exception e) {
                alert(value);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
