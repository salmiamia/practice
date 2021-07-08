package July2021;

public class Exception_01 {
    public static void main(String[] args) {
        try
        {
            int a = 42 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
    }
}
