package July2021;

public class Exception_02 {
    public static void main(String[] args) {

        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
