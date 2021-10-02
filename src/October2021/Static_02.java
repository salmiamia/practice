package October2021;

public class Static_02 {
    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Barsik";
        System.out.println(cat.name);
    }


    public static void main(String[] args) {

    }
}
