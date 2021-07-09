package July2021;

public class Exception_03 {
    public static void main(String[] args) {

        try
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
}
