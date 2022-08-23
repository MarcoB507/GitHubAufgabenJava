package aufgaben.aufgaben9;

import Aufgabe9.Punkt;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PunktTest {

    public static void main(String[] args){
        double a = 6.0;
        double b = 7.0;

        Punkt p1 = new Punkt(a, b);
        Punkt p2 = new Punkt(p1);

        System.out.println("p1" + "(" + p1.RueckgabeX()+", " + p1.RueckgabeY() + ")");
        System.out.println("p2" + "(" + p2.Rueckgabe3()+", " + p2.Rueckgabe4() + ")");

    }
    public void subtrahiere() {
        double c = 3.0;
        double d = 2.0;

        Punkt s1 = new Punkt(c, d);
        Punkt s2 = new Punkt(s1);
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

