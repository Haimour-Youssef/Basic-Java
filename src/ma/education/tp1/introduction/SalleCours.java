package ma.education.tp1.introduction;

public class SalleCours extends Salle {
    public  byte nbPlace;

    public  SalleCours(long id,String nom,byte nbPlace){
        super(id,nom);
        this.nbPlace = nbPlace;
    }
}
