package July2021;

public class Exception_13 {
    public static void main(String[] args) {

        try
        {
            divideByZero();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void
    divideByZero() {
        System.out.println(10/0);
    }
}
