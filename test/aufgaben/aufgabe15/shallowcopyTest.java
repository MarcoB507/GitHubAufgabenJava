package aufgaben.aufgabe15;

import aufgabe15.Adresse;
import aufgabe15.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class shallowcopyTest {

    @Test
    public void clone_shallow() throws CloneNotSupportedException{
        Adresse a1 = new Adresse("Stuttgart", "02");
        aufgabe15.Person p1 = new Person(1, "Alf", a1 );

        Person p2 = (Person) p1.clone();

        assertNotSame(p1, p2);
    }
}
