package February2022;

public class Threads_05 {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");
            Thread.sleep(500);
=======
import java.util.ArrayList;
import java.util.List;

public class Threads_05 {
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;

        for (int i = 0; i < horses.size(); i++) {
            if(horses.get(i).isFinished()) finishedCount ++;
            else {
                System.out.println("Waiting for " + horses.get(i).getName());
                horses.get(i).join();
            }
        }

        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse extends Thread {

    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   // Delay
            s += "" + i;
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}
