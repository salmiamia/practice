package August2021;

import java.io.*;
import java.util.ArrayList;

public class Streams_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));

        ArrayList<String > list = new ArrayList<>();

        String string = reader.readLine();
        while (!string.equals("exit")) {
            list.add(string);
            string = reader.readLine();
        }
        list.add("exit");

        try {
            for (String value : list) {
                writer.write(value + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            writer.close();
        }
    }
}
