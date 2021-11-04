package November2021.Planet;

public class Sun implements Planet {
    private static Sun instance;
    private static String SUN;

    private Sun(){}

    public static Sun getInstance() {
        if (instance == null) instance = new Sun();
        return instance;
    }
}
