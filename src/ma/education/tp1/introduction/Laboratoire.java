package ma.education.tp1.introduction;

public class Laboratoire extends Salle {
    public String type;

    public Laboratoire(long id, String nom, String type) {
        super(id, nom);
        this.type = type;
    }
}
