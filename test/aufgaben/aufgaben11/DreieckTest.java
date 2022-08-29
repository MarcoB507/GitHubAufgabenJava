package aufgaben.aufgaben11;

import aufgabe11.Dreieck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreieckTest {

    //Umfang des Dreiecks berechnen
    @Test
    public void testeDUmfang() {


        Dreieck d = new Dreieck(2, 3, 4, 5, 6);

        double ergebnisUmfang = d.getUmfang();
        assertEquals(9, ergebnisUmfang, 0.02);
    }

    //Flächeninhalt des Dreiecks berechnen
    @Test
    public void testeDflaeche(){

        Dreieck d2 = new Dreieck (2,3,4,4,2);

        double ergebnisFlaeche = d2.getFlaeche();
        assertEquals(4, ergebnisFlaeche, 0.01);
    }



}
