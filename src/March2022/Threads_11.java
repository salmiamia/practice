package March2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threads_11 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }


    public static class Read3Strings extends Thread {

        String s1;
        String s2;
        String s3;

        public void run() {
            try {
                s1 = reader.readLine();
                s2 = reader.readLine();
                s3 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(s1 + " " + s2 + " " + s3);
        }
    }
}
