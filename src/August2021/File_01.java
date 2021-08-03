package August2021;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class File_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //C:\Users\Mia\Desktop\Лермонтов.txt

        try {
            File file = new File(s);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {

        }
    }
}
