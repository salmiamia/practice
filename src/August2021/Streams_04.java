package August2021;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Streams_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        FileOutputStream fos = new FileOutputStream(path);

        String s = reader.readLine();


        while (!s.equals("exit")) {
            String sFinal = s + "\n";
            byte[] b =sFinal.getBytes();
            fos.write(b);
            s = reader.readLine();
        }
        s = "exit";
        byte[] b =s.getBytes();
        fos.write(b);
    }
}
