package July2021;

public class Interface_02 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanRun, CanSwim {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements CanSwim {

        @Override
        public void swim() {

        }
    }
}
