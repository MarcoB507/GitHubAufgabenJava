package aufgabe14;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayWrapper {
    int zahlen[];

    private int elementCount;




    public ArrayWrapper() {
        zahlen = new int[2];
        elementCount = 0;
    }



    public ArrayWrapper(int zahlengroesse) {
        zahlen = new int[zahlengroesse];
        elementCount = 0;
    }

    @Override
    public String toString() {
        return "ArrayWrapper{" +
                "zahlen=" + Arrays.toString(zahlen) +
                ", elementCount=" + elementCount +
                '}';
    }

    public void add(int z) {

        if(elementCount >= zahlen.length) {

            int[] newzahlen = new int[zahlen.length * 2];
            kopie(newzahlen);
            zahlen = newzahlen;
        }
        zahlen[elementCount] = z;
        elementCount ++;

    }

    private void kopie(int[] neuesArray){
        for (int i = 0; i < zahlen.length; i ++){
            neuesArray[i] = zahlen[i];
        }
    }

    public int getElement(int index){

        return zahlen[index];
    }

    public int getArraySize(){

       return zahlen.length;
    }

    public int getElementCount(){

//        anznewElements = mehrZahlen.length;
            return elementCount;
    }


    public static void main(String[] args) {

        ArrayWrapper aw = new ArrayWrapper();
        for (int x = 1; x <= 100; x++){
            aw.add(x);
            System.out.println(aw);
        }
    }
}
