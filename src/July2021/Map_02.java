package July2021;

import java.util.HashMap;
import java.util.Map;

public class Map_02 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map <String, String> map = new HashMap<>();
        map.put("Ермаков", "Павел");
        map.put("Ермакова", "Людмила");
        map.put("Ермаков", "Глеб");
        map.put("Ковалев", "Глеб");
        map.put("Хробостова", "Ольга");
        map.put("Хробостов", "Максим");
        map.put("Ерошкина", "Наталья");
        map.put("Ерошкин", "Владимир");
        map.put("Филиппов", "Сергей");
        map.put("Филиппова", "Наталия");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
