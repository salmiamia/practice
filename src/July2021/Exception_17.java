package July2021;

import java.util.ArrayList;

public class Exception_17 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 5, 6, 22, 1});
        list.add(new int[] {4, 8});
        list.add(new int[] {99, 66, 22, 11});
        list.add(new int[] {7, 6, 5, 4, 3, 2, 1});
        list.add(new int[] {});
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
