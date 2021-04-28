package April2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList_11 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> listAll = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            listAll.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < listAll.size(); i++) {
            if (listAll.get(i) % 3 == 0) {
                list3.add(listAll.get(i));
            }
            if (listAll.get(i) % 2 == 0) {
                list2.add(listAll.get(i));
            }
            if (listAll.get(i) % 3 != 0 && listAll.get(i) % 2 != 0) others.add(listAll.get(i));
        }

        printList(list3);
        printList(list2);
        printList(others);

    }

    public static void printList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
