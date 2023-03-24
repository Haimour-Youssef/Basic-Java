package ma.education.tp1.introduction;

public class Salle {
     public long id;
     public String nom;

    public Salle(){

    }
    public Salle(String nom){
    this.nom = nom;
    }
    public Salle(long id,String nom){
        this(nom);
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        Salle s1 = (Salle) obj;
        return(this.id==s1.id);
    }

    @Override
    public String toString() {
        return "Salle{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
