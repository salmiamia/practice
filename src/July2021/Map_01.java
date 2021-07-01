package July2021;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {
    public static Map<String, String> createMap() {
        Map <String, String> map = new HashMap<>();
        map.put("Иванов", "Сидор");
        map.put("Петров", "Константин");
        map.put("Сидоров", "Сидор");
        map.put("Колпков", "Жорж");
        map.put("Де Монпансье", "Константин");
        map.put("Любимкин", "Антоша");
        map.put("Траволта", "Джон");
        map.put("Земли", "Пуп");
        map.put("Картошкин", "Иван");
        map.put("Морковкин", "Иван");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, Integer> frequencyOfNames = new HashMap<>();

        for (Map.Entry<String, String> pair1 : map.entrySet()) {

            String name = pair1.getValue();

            if (frequencyOfNames.containsKey(name)) {
                frequencyOfNames.replace(name, 2);
                continue;
            } else {
                frequencyOfNames.put(name, 1);
            }
        }


        for (Map.Entry<String, Integer> pair : frequencyOfNames.entrySet()) {

            Integer quantity = pair.getValue();
            String name = pair.getKey();
            if (quantity > 1) {
                removeItemFromMapByValue (map, name);
                removeItemFromMapByValue (map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        removeTheFirstNameDuplicates(createMap());
    }
}
