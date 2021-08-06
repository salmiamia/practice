package August2021;

import java.io.*;

public class Streams_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr = null;
        FileInputStream fis = null;
        BufferedInputStream buffer = null;

        try{
            String sourceFile = reader.readLine();
            fis = new FileInputStream(sourceFile);
            DataInputStream in = new DataInputStream(fis);
            buffer = new BufferedInputStream(in);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print(c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            fis.close();
            buffer.close();
            reader.close();
        }
    }
}
