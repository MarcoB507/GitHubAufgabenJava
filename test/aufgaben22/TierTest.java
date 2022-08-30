package aufgaben22;

import aufgabe22.Tier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TierTest {
    Tier Schildkroete;
    Tier Hund;
    Tier Katze;
    Tier Loewe;
    Tier Spinne;
    Tier Elefant;
    Tier Huhn;
     List<Tier> meineTiere;

    @BeforeEach
    public void init() {

        Schildkroete = new Tier("Schildkröte", 22, 1, 4);
        Hund = new Tier("Hund", 2, 15, 4);
        Katze = new Tier("Katze", 15, 7, 4);
        Loewe = new Tier("Löwe", 8, 150, 4);
        Spinne = new Tier("Spinne", 1, 0, 8);
        Elefant = new Tier("Elefant", 30, 3000, 4);
        Huhn =  new Tier("Huhn", 1, 1, 2);

        meineTiere = new ArrayList<>(Arrays.asList(Schildkroete, Hund,
                Katze, Loewe, Spinne, Elefant, Huhn));
//        meineTiere.add(Schildkroete);
//        meineTiere.add(Hund);
//        meineTiere.add(Katze;
//        meineTiere.add(Loewe);
//        meineTiere.add(Spinne);
//        meineTiere.add(Elefant);
    }

    /**Testphase: Stream**/

    @Test
    public void teste_tiere_mit_2_beinen_Stream(){
        assertTrue((Tier.TiereMitzweiBeinen(meineTiere).containsAll(Arrays.asList(Huhn))));
   }

   @Test
   public void teste_tiere_mit_alter_größer_zehn_Stream(){
        assertTrue(Tier.Alter_Zehn(meineTiere).containsAll(Arrays.asList(Schildkroete, Katze, Elefant)));
   }

   @Test
   public void teste_tiere_mit_alter_zwischen_fünf_und_acht_Stream(){
        assertTrue(Tier.Alter_fünf_bis_Acht(meineTiere).containsAll(Arrays.asList(Loewe)));
   }

   @Test
   public void teste_tiere_mit_dreißigkilo_und_jüngerzwanzig_Stream(){
        assertTrue(Tier.gewicht_dreißig_und_Alter_20(meineTiere).containsAll(Arrays.asList(Loewe)));
   }

   @Test
   public void alle_tiere_mit_4_beinen_ungerades_alter_Stream() {
       assertTrue(Tier.anzahlBeine_vier_und_ungerades_Alter(meineTiere).containsAll(Arrays.asList(Katze)));
   }


}
