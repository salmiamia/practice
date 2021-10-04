package October2021;

public class Initialization_01 {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;


    public static void main(String[] args) {

        Initialization_01 s = new Initialization_01();

        System.out.println(s.intVar + " " + s.doubleVar + " " + s.DoubleVar + " " + s.booleanVar + " " + s.ObjectVar + " " + s.ExceptionVar + " " + s.StringVar);
    }
}
