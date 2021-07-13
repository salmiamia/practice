package July2021;

public class Static_02 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Static_02 solution = new Static_02();
        solution.A = 5;

        Static_02.D = 5;
    }

    public int getA() {
        return A;
    }

}
