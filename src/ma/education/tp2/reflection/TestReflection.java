package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("----------------Q2----------------");
        System.out.println("Hello World!");
        Class cls = Salle.class;
        Field[] atrs = cls.getDeclaredFields();
        for (Field atr : atrs){
            System.out.println(atr);
        }
        System.out.println("----------------Q3----------------");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("----------------Q4----------------");
        Salle o1 = null;
        Salle o2 = null;
        Salle o3 = null;

        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor ctr: constructors){
            int count = ctr.getParameterCount();
            switch (count){
                case 0:{
                o1 = (Salle) ctr.newInstance();
                break;
                }
                case 1:{
                    o2 = (Salle) ctr.newInstance("Salle du cours JDBC");
                    break;
                }
                case 2:{
                    o3 = (Salle) ctr.newInstance((long) 1,"Salle du cours JPA");
                    break;
                }
                default:break;
            }
        }
        System.out.println("----------------Q5----------------");
        System.out.println(o1.id+" "+o1.nom);
        System.out.println(o2.id+" "+o2.nom);
        System.out.println(o3.id+" "+o3.nom);
        System.out.println("----------------Q6----------------");
        System.out.println(o2.equals(o3));
        System.out.println("----------------Q7----------------");
        System.out.println(o2.equals(o1));
    }
}
