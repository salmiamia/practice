package July2021;

public class StackTrace_05 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + text);
    }
}
