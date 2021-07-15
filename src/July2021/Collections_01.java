package July2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections_01 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Pushok", new Cat("Pushok"));
        map.put("Barsik", new Cat("Barsik"));
        map.put("Kotik", new Cat("Kotik"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Tishka", new Cat("Tishka"));
        map.put("Lapot", new Cat("Lapot"));
        map.put("Bazooka", new Cat("Bazooka"));
        map.put("Obormot", new Cat("Obormot"));
        map.put("Begemot", new Cat("Begemot"));
        map.put("Kompot", new Cat("Kompot"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
