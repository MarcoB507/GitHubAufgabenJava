package aufgabe18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {
     String vorname, nachname;
     Integer alter;

    public Person(String vorname, String nachname, Integer alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
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

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }


//    public Map<Person, Integer> getPersonToNumberMap() {
//        return personToNumberMap;
//    }
//
//    public void setPersonToNumberMap(Map<Person, Integer> personToNumberMap) {
//        this.personToNumberMap = personToNumberMap;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        aufgabe18.Person person = (aufgabe18.Person) o;
        return Objects.equals(vorname, person.vorname) &&
                Objects.equals(nachname, person.nachname) &&
                Objects.equals(alter, person.alter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, alter);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Max", "Mustermann", 20);
        Person person2 = new Person("Thomas", "Mueller", 34);

        Map<Person, Integer> meinehashmap = new HashMap<>();
        meinehashmap.put(person1, 1234);
        System.out.println(meinehashmap.get(person2));


    }
}
