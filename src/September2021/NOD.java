package September2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NOD {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberMin = Math.min(numberOne, numberTwo);
        int numberMax = Math.max(numberOne, numberTwo);

//        System.out.println("Наибольшее число: " + numberMax);
//        System.out.println("Наименьшее число: " + numberMin);

        ArrayList<Integer> ndMax = new ArrayList<>();
        ArrayList<Integer> ndMin = new ArrayList<>();

        if(numberMax%numberMin == 0) {
            System.out.println(numberMin);
        }
        else {

            for (int i = 1; i < numberMin; i++) {
                if (numberMax % i == 0) ndMax.add(i);
            }

            Collections.sort(ndMax);
            Collections.reverse(ndMax);

            for (int i = numberMin - 1; i > 0; i--) {
                if (numberMin % i == 0) ndMin.add(i);
            }

            Collections.sort(ndMin);
            Collections.reverse(ndMin);

//            System.out.println("Делители нацело для наибольшего числа: " + ndMax);
//            System.out.println("Делители нацело для наименьшего числа: " + ndMin);

            ArrayList <Integer> allOD = new ArrayList();

            for (int i = 0; i < ndMax.size(); i++) {
                for (int j = 0; j < ndMin.size(); j++) {
                    if (ndMin.get(j).equals(ndMax.get(i))) allOD.add(ndMax.get(i));
                }
            }

            System.out.println(allOD.get(0));
        }
    }
}
