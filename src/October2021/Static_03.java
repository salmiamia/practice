package October2021;

public class Static_03 {
    public static int A = 0;

    private static int initializeState() {
        throw new RuntimeException();
    }
    static {

        int state = initializeState();

    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
