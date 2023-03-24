package ma.education.tp2.statickeyword;

public class Etudient {
    public long id;
    public String nom;
    public static int nbEtudient;
    /*
    a : Est ce que chaque etudient a son propre id ? oui ou non
    b : Est ce que chaque etudient a son propre nom ? oui ou non
    C : Est ce que chaque etudient a son propre nombre des etudients ? Oui ou Non
    Si la reponce oui, danc l'attrebut non static
    Si la reponce non, alor l'attrebut doit etre static
     */
    public Etudient(long id, String nom, int nb){
        this.id=id;
        this.nom=nom;
        this.nbEtudient += nb;
    }

}
