package July2021;

public class Interface_10 {
    interface CanMove{
        Double speed();
    }

    interface CanFly extends CanMove{
        Double speed(CanFly cf);
    }

    public static void main(String[] args) throws Exception {
    }
}
