package June2021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_01 {
    public static Map<String, Integer> createMap() {
        Map <String, Integer> map = new HashMap<>();
        map.put("Иванов", 700);
        map.put("Петров", 400);
        map.put("Васечкин", 850);
        map.put("Игнатова", 1100);
        map.put("Полищук", 1200);
        map.put("Данилова", 1500);
        map.put("Прохорова", 300);
        map.put("Пончиков", 250);
        map.put("Кирюшина", 500);
        map.put("Платонов", 1800);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
