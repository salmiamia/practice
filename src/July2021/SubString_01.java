package July2021;

public class SubString_01 {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++) {
            System.out.println(text.substring(i));
        }
    }
}
