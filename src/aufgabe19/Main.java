package aufgabe19;

import aufgabe19.comparator.NameCompare;
import aufgabe19.comparator.VornameCompare;
import aufgabe19.comparator.gewichtCompare;
import aufgabe19.comparator.groesseCompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonComparator p1 = new PersonComparator(180, 80, "Max", "Kuestner");
        PersonComparator p2 = new PersonComparator(190, 87, "Klaus", "Kremer");
        PersonComparator p3 = new PersonComparator(170, 85, "Verena", "Cristner");
        PersonComparator p4 = new PersonComparator(199, 83, "Alf", "Mueller");

        List<PersonComparator> personenListe = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        /*Test 1 läuft*/

//        gebe Gewicht in Liste aus:
//        personenListe.sort(new gewichtCompare());
//        for (PersonComparator p : personenListe){
//            System.out.println(p);
//        }

        /*Test 2 läuft*/

//        //gebe Gewicht in Liste aus:
//        personenListe.sort(new groesseCompare());
//        for (PersonComparator p : personenListe){
//            System.out.println(p);
//        }

        /*Test 3 läuft*/

//        //gebe Gewicht in Liste aus:
//        personenListe.sort(new NameCompare());
//        for (PersonComparator p : personenListe){
//            System.out.println(p);
//        }
//
        /*Test 4 läuft*/

        //gebe Gewicht in Liste aus:
        personenListe.sort(new VornameCompare());
        for (PersonComparator p : personenListe){
            System.out.println(p);
        }
    }
}
