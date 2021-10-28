package October2021;

public class InitializationOrder_01 {
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    public InitializationOrder_01() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        InitializationOrder_01 s = new InitializationOrder_01();
    }

    public static void printAllFields(InitializationOrder_01 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
