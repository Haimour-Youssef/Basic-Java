package ma.education.tp1.introduction;

public class AccesSamePackage {
    public static void main(String[] args) {
        Salle s1 = new Salle("Salle A");
        System.out.println("Nom= "+s1.nom+", id= "+s1.id);
    }
}
