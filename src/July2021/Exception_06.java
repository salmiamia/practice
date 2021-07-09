package July2021;

public class Exception_06 {
    public static void main(String[] args) {

        try
        {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException");
        }
    }
}
