package March2022;

public class Threads_02 {
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        tt.start();
        tt.interrupt();
    }

    public static class TestThread extends Thread {

        public void run(){};
    }
}
