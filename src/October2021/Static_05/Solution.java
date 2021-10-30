package October2021.Static_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try{
            File file = new File(Statics.FILE_NAME);
            FileReader fr = null;

            fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            String line = null;

            line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println(lines);
    }
}
