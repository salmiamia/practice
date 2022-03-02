package March2022;

public class Threads_04 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.isThreadRun = false;
    }

    public static class TestThread implements Runnable {
        public static boolean isThreadRun = true;
        public void run() {
            while (isThreadRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
