package July2021;

import java.util.ArrayList;

public class Array_01 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[2]; // = new (ArrayList<String>[]) ArrayList[2]

        ArrayList<String >list1 = new ArrayList<>();
        ArrayList<String >list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add("www");
            list2.add("qqq");
        }
        arrayOfStringList[0] = list1;
        arrayOfStringList[1] = list2;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
