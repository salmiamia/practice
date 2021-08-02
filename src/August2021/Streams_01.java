package August2021;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Streams_01 {
    public static class BufferedInputExample {

        public static void main(String[] args) throws Exception {
            InputStream inputStream = null;
            BufferedInputStream buffer = null;

            try {

                inputStream = new FileInputStream("C:/java/practice/src/August/example.txt");

                buffer = new BufferedInputStream(inputStream);

                while(buffer.available()>0) {

                    char c = (char)buffer.read();

                    System.out.println("Был прочитан символ " + c);
                }
            } catch(Exception e) {

                e.printStackTrace();

            } finally {

                inputStream.close();
                buffer.close();
            }
        }
    }
}
