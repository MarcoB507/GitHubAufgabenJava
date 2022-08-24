package aufgaben.aufgabe11;

import aufgabe11.Rechteck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RechteckTest {

    @Test
    public double testeRUmfang() {

        Rechteck R = new Rechteck(2, 3);

        double ergebnisUmfang = R.getUmfang();
        assertEquals(14, ergebnisUmfang, 0.01);
        return ergebnisUmfang;
    }

    @Test
    public double testeRflaeche(){

        Rechteck R2 = new Rechteck(3, 4);

        double ergebnisFlaeche = R2.getFlaeche();
        assertEquals(12, ergebnisFlaeche, 0.01);
        return ergebnisFlaeche;
    }
}
