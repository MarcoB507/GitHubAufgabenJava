package aufgaben.aufgaben4;

import aufgabe4.BMI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITest {
//work
        @Test
        public void testetbmiBerechnung(){
            double groesse = 1.80;
            double gewicht = 80;
            double ergebnis = BMI.berechneBMI(gewicht, groesse);

            assertEquals(24.69, ergebnis, 0.01);
        }
        @Test
        public void sollteUntergewichthaben() {
            double groesse = 1.70;
            double gewicht = 50;
            double ergebnis = BMI.berechneBMI(gewicht, groesse);

            assertEquals(17.3, ergebnis, 0.01);
        }
        @Test
        public void sollteÜbergewichthaben(){
            double groesse = 1.80;
            double gewicht = 100;
            double ergebnis = BMI.berechneBMI(gewicht, groesse);

            assertEquals(30.9, ergebnis, 0.05);
    }
        @Test
        public void StarkesÜbergewicht(){
            double groesse = 1.80;
            double gewicht = 120;
            double ergebnis = BMI.berechneBMI(gewicht, groesse);

            assertEquals(37, ergebnis, 0.04);
        }

}