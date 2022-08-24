package aufgaben.aufgabe11;

import aufgabe11.Dreieck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreieckTest {

    @Test
    public double testeDUmfang() {
        /*
        double umfang = 0.0;
        double flaeche = 0.0;
        double a = 2.0;
        double b = 3.0;
        double c = 4.0;
        double g = 5.0;
        double h = 2.0;
        */

        Dreieck d = new Dreieck(2, 3, 4, 5, 6);

        double ergebnisUmfang = d.getUmfang();
        assertEquals(9, ergebnisUmfang, 0.02);
        return ergebnisUmfang;
    }

    @Test
    public double testeDflaeche(){

        Dreieck d2 = new Dreieck (2,3,4,3,2);

        double ergebnisFlaeche = d2.getFlaeche();
        assertEquals(5, ergebnisFlaeche, 0.01);
        return ergebnisFlaeche;
    }



}
