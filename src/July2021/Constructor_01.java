package July2021;

public class Constructor_01 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private double height;
        private boolean sex;
        private String nationality;
        private String temperament;

        public Human(){
        }

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String nationality, String temperament){
            this.nationality = nationality;
            this.temperament = temperament;
        }

        public Human(int age, double height) {
            this.age = age;
            this.height = height;
        }

        public Human(boolean sex){
            this.sex = sex;
        }

        public Human(String name, String nationality, String temperament){
            this.name = name;
            this.nationality = nationality;
            this.temperament = temperament;
        }

        public Human(double height){
            this.height = height;
        }

        public Human(String name, int age, double height, boolean sex, String nationality, String temperament){
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.nationality = nationality;
            this.temperament = temperament;
        }
    }
}
