package July2021;

public class TypeConversion_01 {
        public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (int) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
