package aufgabe20;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Reflection {


    public static void main(String[] args) {

        List<Field> sortedFields   = AnnotationSorter.getSortedFields(Burger.class);
        List<Method> sortedMethods = AnnotationSorter.getSortedMethods(Burger.class);

        System.out.println("--- SORTED RELEVANT FIELDS ---");
        for(Field f : sortedFields) {
            System.out.println(f.getName());
        }

        System.out.println("--- SORTED RELEVANT METHODS ---");
        for(Method m : sortedMethods) {
            System.out.println(m.getName());
        }

    }
}
