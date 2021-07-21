package July2021;

public class TypeConversion_04 {
    public static void main(String[] args) {
        int a = (byte) 44; //44
        int b = (short) 300; //44
        short c = (short) (b - a);
        System.out.println(c);
    }
}
