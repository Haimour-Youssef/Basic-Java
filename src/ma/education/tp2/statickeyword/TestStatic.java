package ma.education.tp2.statickeyword;

public class TestStatic {
    public static void main(String[] args) {
        Etudient e1 = new Etudient(1,"Ahmed",20);
        Etudient e2 =new Etudient(2,"Said",30);
        System.out.println("id : "+e1.id+" nom : "+e1.nom+" nb Etudients : "+e1.nbEtudient);
        System.out.println("id : "+e2.id+" nom : "+e2.nom+" nb Etudients : "+e2.nbEtudient);
        System.out.println("---------------------------");
        System.out.println(Etudient.nbEtudient);
    }
}
