package November2021.Planet;

public class Earth implements Planet {
    private static Earth instance;
    private static String EARTH;

    private Earth(){}

    public static Earth getInstance() {
        if (instance == null) instance = new Earth();
        return instance;
    }
}
