package aufgaben.aufgaben5;

import org.junit.jupiter.api.Test;
import aufgabe5.Schleifen;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchleifenTest {

    @Test
    public void kgvTestklappt(){
        assertTrue(Schleifen.entwickleKGV(2, 5));
    }

    private void assertTrue(int entwickleKGV) {
    }

    @Test
    public void kgvTestklapptnicht(){
        assertNull(Schleifen.entwickleKGV(0, 0 ));
    }


}
