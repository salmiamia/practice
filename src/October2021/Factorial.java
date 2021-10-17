package October2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        String bStr = "";

        if (n == 0) return "1";
        else if (n < 0) return "0";
        else
        {
            for (int i = 1; i <= n; i++) {
                BigInteger b = BigInteger.valueOf(i);
                factorial = factorial.multiply(b);
                bStr = "" + factorial;
            }
        }

        return bStr;
    }
}
