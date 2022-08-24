package aufgabe11;

public class Rechteck implements GeometrischesObjekt{
    double umfang, flaeche, a, b;

    public Rechteck(){
        //umfang = 0.0;
        //flaeche = 0.0;
        a = 0.0;
        b = 0.0;
    }

    public Rechteck(/*double umfang, double flaeche,*/ double a, double b) {
        //this.umfang = umfang;
        //this.flaeche = flaeche;
        this.a = a;
        this.b = b;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double getUmfang(){
        umfang = 2 * a + 2 * b;
        return umfang;
    }

    public double getFlaeche(){
        flaeche = a * b;
        return flaeche;
    }


}
