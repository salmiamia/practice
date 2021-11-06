package November2021;

public class Threads_02 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }



    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
