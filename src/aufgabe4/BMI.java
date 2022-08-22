package aufgabe4;

public class BMI {

    public static double berechneBMI(double gewicht, double groesse){
        double bmi = gewicht / (groesse * groesse);
        return bmi;
    }
    public enum Bmiclassification{
        UNTERGEWICHT, NORMALGEWICHT, ÜBERGEWICHT, SCHWERESÜBERGEWICHT
    }

    public static Bmiclassification bmiausgeben(double bmi) {
        if (bmi < 18.5) {
            return Bmiclassification.UNTERGEWICHT;
            //System.out.println("Sie haben einen bmi von kleiner als 18.5 und somit Untergewicht!");
        }
        else if (bmi <25){
            return Bmiclassification.NORMALGEWICHT;
            //System.out.println("Sie haben Normalgewicht");
        }
        else if (bmi <30){
            return Bmiclassification.ÜBERGEWICHT;
            //System.out.println("Sie haben Übergewicht");
        }
        else{
            return Bmiclassification.SCHWERESÜBERGEWICHT;
            //System.out.println("Sie haben Schweres Übergewicht");
        }
    }

}
