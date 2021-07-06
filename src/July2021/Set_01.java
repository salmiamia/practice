package July2021;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_01 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        Cat cat = iterator.next();
        cats.remove(cat);

        printCats(cats);
    }

    public static Set<Cat> createCats() {

        Set <Cat> cats = new HashSet();

        for (int i = 0; i <3 ; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()){
            Cat cat = iterator.next();
            System.out.println(cat);
        }
    }

    public static class Cat {
    }
}
