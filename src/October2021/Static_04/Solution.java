package October2021.Static_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset(){

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            if ("helicopter".equals(s)) result = new Helicopter();
            else if ("plane".equals(s)) {
                int i = Integer.parseInt(reader.readLine());
                result = new Plane(i);
            }
            else reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
