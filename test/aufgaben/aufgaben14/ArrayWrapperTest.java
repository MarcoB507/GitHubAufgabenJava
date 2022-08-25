package aufgaben.aufgaben14;

import aufgabe14.ArrayWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayWrapperTest {

    @Test
    public void should_add_new_element(){

        ArrayWrapper aw = new ArrayWrapper();
        aw.add(1);
        aw.add(2);

        assertEquals(1, aw.getElement(0));
        assertEquals(2, aw.getElement(1));

     }
    @Test
    public void should_double_ArraySize(){

        ArrayWrapper aw = new ArrayWrapper();
        aw.add(1);
        aw.add(2);
        aw.add(3);

        int size = aw.getArraySize();

        assertEquals(4, size);

    }
    @Test
    public void should_return_elementCount(){
        ArrayWrapper aw = new ArrayWrapper();
        aw.add(5);

        int myelements = aw.getElementCount();
        assertEquals(1, myelements);
    }
}
