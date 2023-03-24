package ma.education.tp2.reflection.rappel;

public class ConnectionDB {
    public String url;
    public String user;
    public String password;

    public ConnectionDB() {
        System.out.println("Constructeur par defaut");
    }
    public ConnectionDB(String user) {
        this.user = user;
    }

    public void test(){
        System.out.println("how did you do it !!!"+this.user);
    }
}
