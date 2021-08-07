package August2021;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Streams_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String path = reader.readLine();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        ArrayList<Integer> list = new ArrayList();
        BufferedReader buffer = new BufferedReader(isr);

        try {
            String s = buffer.readLine();
            while (s != null) {
                int i = Integer.parseInt(s);
                list.add(i);
                s = buffer.readLine();
            }
            ArrayList <Integer> listResult = new ArrayList();
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % 2 == 0) listResult.add(list.get(j));
            }
            Collections.sort(listResult);

            for (Integer o : listResult) {
                System.out.println(o);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            isr.close();
            buffer.close();
        }
    }
}
