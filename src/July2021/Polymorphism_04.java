package July2021;

public class Polymorphism_04 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat) System.out.println("Кошка");
        if (o instanceof Dog) System.out.println("Собака");
        if (o instanceof Bird) System.out.println("Птица");
        if (o instanceof Lamp) System.out.println("Лампа");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
