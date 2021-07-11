package July2021;

import java.io.FileNotFoundException;

public class Exception_11 {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends ClassCastException {
    }

    static class MyException4 extends NullPointerException {
    }
}
