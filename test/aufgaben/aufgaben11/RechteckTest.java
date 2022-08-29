package aufgaben.aufgaben11;

import aufgabe11.Rechteck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RechteckTest {

    //Umfang des Rechtecks berechnen
    @Test
    public void testeRUmfang() {

        Rechteck R = new Rechteck(2, 3);

        double ergebnisUmfang = R.getUmfang();
        assertEquals(10, ergebnisUmfang, 0.01);
    }

    //Flächeninhalt des Rechtecks berechnen
    @Test
    public void testeRflaeche(){

        Rechteck R2 = new Rechteck(3, 4);

        double ergebnisFlaeche = R2.getFlaeche();
        assertEquals(12, ergebnisFlaeche, 0.01);
    }
}
