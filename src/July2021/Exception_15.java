package July2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exception_15 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        }
        catch (NumberFormatException | IOException e)
        {
            for (int i : list) {
                System.out.println(i);
            }
        }
    }
}
