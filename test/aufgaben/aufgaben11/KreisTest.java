package aufgaben.aufgaben11;

import aufgabe11.Kreis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KreisTest {

    //Umfang vom Kreis berechnen
    @Test
    public void testeKUmfang() {

        Kreis k = new Kreis(2, 3.14159265359);

        double ergebnisUmfang = k.getUmfang();
        assertEquals(12.56, ergebnisUmfang, 0.01);
    }

    //Flächeninhalt vom Kreis berechnen
    @Test
    public void testeKflaeche(){

        Kreis k2 = new Kreis(3, 3.14159265359);

        double ergebnisFlaeche = k2.getFlaeche();
        assertEquals(28.27, ergebnisFlaeche, 0.01);
    }

}
