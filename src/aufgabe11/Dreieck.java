package aufgabe11;

public class Dreieck {

    //Felder
    double umfang, flaeche, a, b, c, g, h;

    //Standardkonstruktor
    public Dreieck(){
        //umfang = 0.0;
        //flaeche = 0.0;
        a = 0.0;
        b = 0.0;
        c = 0.0;
        g = 0.0;
        h = 0.0;
    }

    //Parameterkonstruktor
    public Dreieck(/*double umfang, double flaeche,*/ double a, double b, double c, double g, double h) {
        //this.umfang = umfang;
        //this.flaeche = flaeche;
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
        this.h = h;
    }

    //get- und set-Methoden

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    //Methoden

    public double getUmfang(){
        umfang = a + b + c;
        return umfang;
    }

    public double getFlaeche(){
        flaeche = 0.5 * g * h;
        return flaeche;
    }

}
