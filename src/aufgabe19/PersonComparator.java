package aufgabe19;

import aufgabe18.Person;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PersonComparator implements Comparable<PersonComparator> {


    private Integer /*alter*/ groesse, gewicht;
    private String vorname, nachname;
    public PersonComparator(/*Integer alter,*/ Integer groesse, Integer gewicht, String vorname, String nachname) {
        //this.alter = alter;
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.vorname = vorname;
        this.nachname = nachname;
    }



//    public Integer getAlter() {
//        return alter;
//    }
//
//    public void setAlter(Integer alter) {
//        this.alter = alter;
//    }

    public Integer getGroesse() {
        return groesse;
    }

    public void setGroesse(Integer groesse) {
        this.groesse = groesse;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public void setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonComparator that = (PersonComparator) o;
        return Objects.equals(vorname, that.vorname) &&
                Objects.equals(nachname, that.nachname) &&
               // Objects.equals(alter, that.alter) &&
                Objects.equals(groesse, that.groesse) &&
                Objects.equals(gewicht, that.gewicht);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, /*alter,*/ groesse, gewicht);
    }

//    public int compareAlter(Object o1, Object o2) {
//        PersonComparator p1 = (PersonComparator) o1;
//        PersonComparator p2 = (PersonComparator) o2;
//
//        if (p1.alter == p2.alter) {
//            return 0;
//            else if (p1.alter > p2.alter) {
//                return 1;
//                else
//                return -1;
//            }
//        }
//    }
//
//    public int compareGroesse(Object o1, Object o2) {
//        PersonComparator p1 = (PersonComparator) o1;
//        PersonComparator p2 = (PersonComparator) o2;
//
//        if (p1.groesse == p2.groesse) {
//            return 0;
//            else if (p1.groesse > p2.groesse) {
//                return 1;
//                else
//                return -1;
//            }
//        }
//    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "groesse=" + groesse +
                ", gewicht=" + gewicht +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonComparator o) {
        return this.getGewicht().compareTo(o.getGewicht());
    }
//    public int comparegroesse(PersonComparator person){
//        return Integer.compare(person.getGroesse(), this.getGroesse());
//    }
//
//    public int comparegewicht(PersonComparator person){
//        return Integer.compare(person.getGewicht(), this.getGewicht());
//    }


    public static void main(String[] args) {
            aufgabe19.PersonComparator person1 = new aufgabe19.PersonComparator( 180, 80, "Max", "Mustermann");
            aufgabe19.PersonComparator person2 = new aufgabe19.PersonComparator(10, 80, "Max2", "Mustermann2");

            Map<aufgabe19.PersonComparator, Integer> meinehashmap = new HashMap<>();
            meinehashmap.put(person1, 1234);
            System.out.println(meinehashmap.get(person2));
        }



}


