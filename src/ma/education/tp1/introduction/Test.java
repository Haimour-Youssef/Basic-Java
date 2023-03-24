package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Salle o1 = new Salle();
        Salle o2 = new Salle("youssef");
        Salle o3 = new Salle(01,"Haimour");

        System.out.println(o1.id);
        System.out.println(o1.nom);
        System.out.println("-------------------");
        System.out.println(o2.id);
        System.out.println(o2.nom);
        System.out.println("-------------------");
        System.out.println(o3.id);
        System.out.println(o3.nom);
    }
}
