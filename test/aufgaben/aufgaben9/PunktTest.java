package aufgaben.aufgaben9;

import Aufgabe9.Punkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PunktTest {

    @BeforeEach
    public void initPoints(){
        Punkt p1 = new Punkt(2.0, 6.0);
        Punkt p2 = new Punkt(4.0 , 8.0);
    }

    /*public static void main(String[] args){
        double a = 6.0;
        double b = 7.0;



        System.out.println("p1" + "(" + p1.RueckgabeX()+", " + p1.RueckgabeY() + ")");
        System.out.println("p2" + "(" + p2.Rueckgabe3()+", " + p2.Rueckgabe4() + ")");

    }*/
    @Test
    public void addition() {
       //Punkt p3  = p1.addPunkt(p2);
    }

}
/*
    int x = 6;
    int y = 7;

    Punkt p1 = new Punkt(x,y);

    Punkt p2 = new Punkt(p1);


    @Test
    public void punktTesten(){

        int x,y;




    }*/

