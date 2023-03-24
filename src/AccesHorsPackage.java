import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
    public void afficher(Salle s){
        System.out.println(s.id);
        System.out.println(s.nom);
        System.out.println(id);
        System.out.println(nom);
    }
    public static void main(String[] args) {
        Salle s2 = new Salle("Salle B");
        System.out.println("Nom= "+s2.nom+", id= "+s2.id);
    }
}
