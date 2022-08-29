package aufgabe20;

import jdk.jfr.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        //Reflection Burger = new Reflection("Kopfsalat", "Rindfleisch", "Minigurken", "scheibenKaese", "BBQ");
        //System.out.println(Burger.getClass());

        //Field[] BurgerFields = Reflection.class.getDeclaredFields();
        Method[] BurgerMethods = Burger.class.getDeclaredMethods();

        for (Method m : BurgerMethods) {
            Annotation[] an = m.getAnnotations();
            System.out.println(m.getName());


            for (Annotation a : an) {

                if (a.annotationType().equals(Description.class)) {
                    Description d = (Description) a;
                }
            }


//        System.out.println("FIELDS---------------------------");
//        for(Field f : BurgerFields) {
//            System.out.println(f);
//        }
//
//        System.out.println("METHODS---------------------------");
//        for (Method m : BurgerMethods) {
//            System.out.println(m);
//        }
        }
    }}

