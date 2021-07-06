package July2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uppercase_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String result = "";

        result = result + string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i - 1, i))) result = result + string.substring(i, i + 1).toUpperCase();
            else result = result + string.substring(i, i + 1);
        }
        System.out.println(result);
    }
}
