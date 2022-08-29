package aufgaben.aufgaben19;

import aufgabe19.PersonComparator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PersonComparatorTest {

    PersonComparator p1 = new PersonComparator(180, 80, "Max", "Mustermann");
    PersonComparator p2 = new PersonComparator(190, 87, "Max", "Mustermann");
    PersonComparator p3 = new PersonComparator(170, 85, "Max", "Mustermann");

    PersonComparator p4 = new PersonComparator(199, 83, "Max", "Mustermann");

    HashMap<PersonComparator, Integer> meineleute = new HashMap<>();

//    @Test
//    public void hashtest(){
//
//        meineleute.put(p1, -1);
//        assertEquals(meineleute.get(p1), meineleute.get(p2));
//        assertEquals(p1, p2);
//    }
//
//     @Test
//    public void comparegroesseTest(){
//        assertEquals(0, p1.comparegroesse(p2));
//        assertEquals(1, p1.comparegroesse(p3));
//        assertEquals(-1, p1.comparegroesse(p4));
//     }
//
//    @Test
//    public void comparegewichtTest(){
//        assertEquals(0, p1.comparegewicht(p2));
//        assertEquals(1, p1.comparegewicht(p3));
//        assertEquals(-1, p1.comparegewicht(p4));
//    }

}


