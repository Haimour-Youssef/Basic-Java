package ma.education.tp4.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Terre t1 = Terre.getInstance(19000,8000);
        Terre t2 = Terre.getInstance(20000,5000);
        System.out.println(t1.distanceToSoliel+" "+t1.surface);
        System.out.println(t2.distanceToSoliel+" "+t2.surface);
    }
}
