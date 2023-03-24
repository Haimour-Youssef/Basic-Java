package ma.education.tp1.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1 = new SalleCours((long) 1,"one", (byte) 20);
        SalleCours sc2 = new SalleCours((long) 2,"tow",(byte) 30);
        SalleCours sc3 = (SalleCours) s1;
        SalleCours sc4 = sc2;
//        ---------------------
        Salle s5 = new Laboratoire((long) 5,"five","java");
        SalleCours sc6 = new SalleCours((long) 6,"CDB", (byte) 22);
        SalleCours sc7 = (SalleCours) s5;
        SalleCours sc8 =sc6;
    }
}
