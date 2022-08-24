package aufgabe13;

import java.util.Objects;

public class Person {
    //Felder
    private String vorname, nachname;
    private Integer alter, groesse, gewicht;

    public Person(String vorname, String nachname, Integer alter, Integer groesse, Integer gewicht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.groesse = groesse;
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

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname) && Objects.equals(alter, person.alter) && Objects.equals(groesse, person.groesse) && Objects.equals(gewicht, person.gewicht);
    }

}
