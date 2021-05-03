package May2021;

public class Constructor_01 {
    public static void main(String[] args) {
        Human Grandfather1 = new Human("Peter", true, 65);
        Human Grandfather2 = new Human("Mario", true, 69);
        Human Grandmother1 = new Human("Clara", false, 64);
        Human Grandmother2 = new Human("Tina", false, 70);
        Human Father = new Human("Donald", true, 45, Grandfather1, Grandmother1);
        Human Mother = new Human("Natalie", false, 43, Grandfather2, Grandmother2);
        Human Son1 = new Human("Ben", true, 16, Father, Mother);
        Human Son2 = new Human("Brian", true, 12, Father, Mother);
        Human Daughter = new Human("Rosa", false, 8, Father, Mother);

        System.out.println(Grandfather1);
        System.out.println(Grandfather2);
        System.out.println(Grandmother1);
        System.out.println(Grandmother2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Son1);
        System.out.println(Son2);
        System.out.println(Daughter);
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
