package October2021;

import java.util.HashMap;
import java.util.Map;

public class Static_01 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.1, "Первый");
        labels.put(2.2, "Второй");
        labels.put(2.3, "Третий");
        labels.put(2.4, "Четвертый");
        labels.put(2.5, "Пятый");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
