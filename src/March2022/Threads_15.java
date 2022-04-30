package March2022;

public class Threads_15 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread () {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount < count) {
                System.out.println(new GenerateThread());
                //run();
            }
            //else interrupt();
        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }
    }
}
