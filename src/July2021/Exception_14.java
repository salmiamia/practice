package July2021;

public class Exception_14 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
            }
        }
    }
}
