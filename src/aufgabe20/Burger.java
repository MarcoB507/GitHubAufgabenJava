package aufgabe20;

import aufgabe20.annotation.Sort;
import aufgabe20.annotation.SortMethod;

import java.util.Objects;


public class Burger {

    @Sort("2")
    private String salat;

    @Sort("3")
    private String fleisch;

    @Sort("4")
    private String gurken;

    @Sort("5")
    private String kaese;
    @Sort("1")
    private String sosse;


    public Burger(String salat, String fleisch, String gurken, String kaese, String sosse) {
        this.salat = salat;
        this.fleisch = fleisch;
        this.gurken = gurken;
        this.kaese = kaese;
        this.sosse = sosse;
    }

    public String getSalat() {
        return salat;
    }

    public void setSalat(String salat) {
        this.salat = salat;
    }

    public String getFleisch() {
        return fleisch;
    }

    public void setFleisch(String fleisch) {
        this.fleisch = fleisch;
    }

    public String getGurken() {
        return gurken;
    }

    public void setGurken(String gurken) {
        this.gurken = gurken;
    }

    public String getKaese() {
        return kaese;
    }

    public void setKaese(String kaese) {
        this.kaese = kaese;
    }

    public String getSosse() {
        return sosse;
    }

    public void setSosse(String sosse) {
        this.sosse = sosse;
    }

    @SortMethod("")
    public String makeBurger(String b){
        return b + "wurde erledigt";
    }

    @Override
    public String toString() {
        return "Reflection{" +
                "salat='" + salat + '\'' +
                ", fleisch='" + fleisch + '\'' +
                ", gurken='" + gurken + '\'' +
                ", kaese='" + kaese + '\'' +
                ", sosse='" + sosse + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger that = (Burger) o;
        return Objects.equals(salat, that.salat) && Objects.equals(fleisch, that.fleisch) && Objects.equals(gurken, that.gurken) && Objects.equals(kaese, that.kaese) && Objects.equals(sosse, that.sosse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salat, fleisch, gurken, kaese, sosse);
    }
}
