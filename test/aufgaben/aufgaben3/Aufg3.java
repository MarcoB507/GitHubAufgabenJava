package aufgaben.aufgaben3;


import aufgabe3.Aufgabe3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Aufg3 {

    @Test
    public void durchzweiteilbar()
    {   boolean erg = Aufgabe3.Two(2);
        assertTrue(erg);
    }

    @Test
    public void nichtdurchzweiteilbar()
    {
        assertFalse(Aufgabe3.Two(3));
    }
}
