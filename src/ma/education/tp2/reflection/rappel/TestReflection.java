package ma.education.tp2.reflection.rappel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        lecture fichier des parametres
        ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
        String value = rb.getString("keyClass1");
        System.out.println("----------------"+value+"--------------");
//        Convert String type to class type
        Class c = Class.forName(value);
        System.out.println("----------------"+c+"--------------");
//        Talbleau pour les constrecteurs de la classe ConnectionDB
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constr : constructors){
            System.out.println(constr.toString());
            System.out.println(constr.getParameterCount());
        }
//        Modification de la visibilite du premier constructeur
        constructors[0].setAccessible(true);
//        Instanciation de l'Objet o par reflexion
        Object o = constructors[0].newInstance(null);
        System.out.println(o);

        ConnectionDB o1 = (ConnectionDB) constructors[1].newInstance("holla");
        ConnectionDB o2 = (ConnectionDB) constructors[1].newInstance("holla M.hassan");
        o1.test();
        o2.test();


    }
}
