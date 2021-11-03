package November2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overload_01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();


        while (!input.equals("exit")) {


            try {
                Integer tInput = Integer.parseInt(input);

                if (tInput <= 0 || tInput >= 128) {
                    print(tInput);
                }
                else throw new Exception();


            } catch (Exception a) {
                try {
                    Double tInput = Double.parseDouble(input);
                    if (input.contains(".")) {
                        print(tInput);
                    }
                    else throw new Exception();

                } catch (Exception ignored2) {
                    try {

                        short tInput = Short.parseShort(input);
                        if (tInput > 0 && tInput < 128) {
                            print(tInput);

                        }
                    } catch (Exception e) {
                        print(input);
                    }
                }
            }


            input = reader.readLine();

        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
