package July2021;

public class AbstractClass_03 {
    public static void main(String[] args) {

    }

    public  static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
