package aufgabe16;

import java.util.Arrays;

public class GenericArrayWrapper <T>{

     private T[] array;

    private int elementCount;

    public GenericArrayWrapper() {
        array = (T[]) new Object[2];
        elementCount = 0;
    }

    public GenericArrayWrapper(int zahlengroesse) {
        array = (T[]) new Object[zahlengroesse];
        elementCount = 0;
    }

    @Override
    public String toString() {
        return "ArrayWrapper{" +
                "array=" + Arrays.toString(array) +
                ", elementCount=" + elementCount +
                '}';
    }

    public void add(T z) {

        if(elementCount >= array.length) {

            T[] newzahlen = (T[]) new Object[array.length * 2];
            kopie(newzahlen);
            array = newzahlen;
        }
        array[elementCount] = z;
        elementCount ++;

    }

    private void kopie(T[] neuesArray){
        for (int i = 0; i < array.length; i ++){
            neuesArray[i] = array[i];
        }
    }

    public T getElement(int index){

        return array[index];
    }

    public int getArraySize(){

        return array.length;
    }

    public int getElementCount(){

//        anznewElements = mehrZahlen.length;
        return elementCount;
    }

    public static void main(String[] args) {

        GenericArrayWrapper<Integer> gaw = new GenericArrayWrapper<>();
        GenericArrayWrapper<String> gaw2 = new GenericArrayWrapper<>();
        for (int x = 1; x <= 100; x++){
            gaw.add(x);
            gaw2.add("Hallo");
            System.out.println(gaw);
            System.out.println(gaw2);
        }
    }
}


