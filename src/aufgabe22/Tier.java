package aufgabe22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Tier {

     String name;

     Integer alter;

     Integer gewicht;

     Integer anzBeine;



    public Tier(String name, Integer alter, Integer gewicht, Integer anzBeine) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.anzBeine = anzBeine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public void setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
    }

    public Integer getAnzBeine() {
        return anzBeine;
    }

    public void setAnzBeine(Integer anzBeine) {
        this.anzBeine = anzBeine;
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", gewicht=" + gewicht +
                ", anzBeine=" + anzBeine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tier tier = (Tier) o;
        return Objects.equals(name, tier.name) && Objects.equals(alter, tier.alter) && Objects.equals(gewicht, tier.gewicht) && Objects.equals(anzBeine, tier.anzBeine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alter, gewicht, anzBeine);
    }



        /**Methoden mittels Stream**/

        public static List<Tier> TiereMitzweiBeinen (List<Tier> f) {
            List<Tier> zweiBeine = f.stream()
                    .filter(tier -> tier.getAnzBeine() == 2)
                    .collect(Collectors.toList());
            return zweiBeine;
        }

        public static List<Tier> Alter_Zehn(List<Tier> o) {

            List<Tier> aelterzehn = o.stream()
                    .filter(tier -> tier.getAlter() > 10)
                    .collect(Collectors.toList());
            return  aelterzehn;
        }

        public static List<Tier> Alter_fünf_bis_Acht (List<Tier> m) {
            List<Tier> fuenfacht = m.stream()
                    .filter(tier -> tier.getAlter() > 4 && tier.getAlter() < 9)
                    .collect(Collectors.toList());
            return fuenfacht;
        }

        public static List<Tier> gewicht_dreißig_und_Alter_20 (List<Tier> n) {
            List<Tier> dreißigzwanzig = n.stream()
                    .filter(tier -> tier.getGewicht() > 30 && tier.getAlter() < 20)
                    .collect(Collectors.toList());
            return dreißigzwanzig;
        }

        public static List<Tier> anzahlBeine_vier_und_ungerades_Alter(List<Tier> l) {

            List<Tier> neuTiere = l.stream()
                    .filter(tier -> tier.getAnzBeine() == 4 &&
                            tier.getAlter()%2 != 0)
                    .collect(Collectors.toList());
            return neuTiere;
        }



//
//    public static void main(String[] args) {
//
//        Tier Schildkroete = new Tier("Schildkröte", 22, 1, 4);
//        Tier Hund = new Tier("Hund", 2, 15, 4);
//        Tier Katze = new Tier("Katze", 15, 7, 4);
//        Tier Loewe = new Tier("Löwe", 8, 150, 4);
//        Tier Spinne = new Tier("Spinne", 1, 0, 8);
//        Tier Elefant = new Tier("Elefant", 30, 3000, 4);
//
//
//    }
}
