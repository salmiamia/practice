package November2021.Planet;

public class Moon implements Planet{
    private static Moon instance;
    private static String MOON;

    private Moon(){}

    public static Moon getInstance() {
        if (instance == null) instance = new Moon();
        return instance;
    }
}
