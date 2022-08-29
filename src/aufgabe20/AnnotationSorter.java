package aufgabe20;

import aufgabe20.annotation.Sort;
import aufgabe20.annotation.SortMethod;
import aufgabe20.wrapper.FieldWithSortField;
import aufgabe20.wrapper.MethodWithSortMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class AnnotationSorter {

    public static List<Field> getSortedFields(Class<? extends Object> clazz) {
        List<FieldWithSortField> sortedFields = new ArrayList<>();
//        List<Field> temp = new ArrayList<>();

        for (Field f : clazz.getDeclaredFields()) {
            for (Annotation a : f.getAnnotations()) {
                if (a.annotationType().equals(Sort.class))
//                    temp.add(f);
                    sortedFields.add(new FieldWithSortField(f, (Sort) a));
            }
        }

        Collections.sort(sortedFields);

        List<Field> allSorted = new ArrayList<>();
        for (FieldWithSortField fs : sortedFields) {
            //allSorted.add(fs.getField());
        }
        return allSorted;
    }
        //return temp;




    /**
     * Gets all methods of the given class by reflection and decides which methods are relevant.
     * Those methods get sorted by the provided value of the SortMethod annotation
     *
     * @param clazz - The class which methods should be sorted
     *
     * @return - All methods of the provided class in the defined sort order
     */
    public static List<Method> getSortedMethods(Class<? extends Object> clazz) {
        List<MethodWithSortMethod> sortedMethods = new ArrayList<>();

        for ( Method m : clazz.getDeclaredMethods() ) {
            for ( Annotation a : m.getAnnotations() ) {
                if ( a.annotationType().equals(SortMethod.class) )
                    sortedMethods.add( new MethodWithSortMethod(m, (SortMethod) a) );
            }
        }

        Collections.sort(sortedMethods);
        return sortedMethods.stream().map(MethodWithSortMethod::getMethod).collect(Collectors.toList());
    }

//    public static List<Field> mySortedField(Class<? extends Object> clasz){
//        Map<Sort, Field> myMap = new HashMap<>();
//
//        Field[] myfields = clasz.getDeclaredFields();
//
//        for ( Field f : myfields){
//            for (Annotation a : f.getAnnotations()){
//                if (a.annotationType().equals(Sort.class)) myMap.put(f, (SortMethod) a);
//            }
//        }
//        return Sort;
//    }
//
//    public static List<Method> myMethods(Class<Burger> burgerClass){
//        return new ArrayList<>();
//    }
}
