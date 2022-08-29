package aufgaben.aufgaben18;

import aufgabe18.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {



    Person p1 = new Person("M", "B", 23);
    Person p2 = new Person("B", "M", 32);

    @Test
    public void persontrue(){

        assertTrue(p1.equals(p1));
    }

    @Test
    public void personfalse(){
        assertFalse(p2.equals(p1));
    }
}
