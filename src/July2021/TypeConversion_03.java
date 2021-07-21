package July2021;

public class TypeConversion_03 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}
