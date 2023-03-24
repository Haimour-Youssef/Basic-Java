package ma.education.tp4.singleton;

public class Terre {
    public double distanceToSoliel;
    public double surface;
    private static Terre instance;

    private Terre(double distanceToSoliel, double surface) {
        this.distanceToSoliel = distanceToSoliel;
        this.surface = surface;
    }
    public static Terre getInstance(double distanceToSoliel, double surface){
        if (instance == null) {
            instance = new Terre(distanceToSoliel,  surface);
        }
        return instance;
    }


}
