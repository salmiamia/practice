package July2021;

public class Static_03 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Static_03 solution = new Static_03();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Static_03.D = 5 * D * C;

        Static_03.D = 5;
    }

    public int getA() {
        return A;
    }

}
