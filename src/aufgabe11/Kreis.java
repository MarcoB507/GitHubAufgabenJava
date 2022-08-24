package aufgabe11;

public class Kreis implements GeometrischesObjekt {
    public double umfang, flaeche, radius, pi;


    public Kreis(){
        //umfang = 0.0;
        //flaeche = 0.0;
        radius = 0.0;
        pi = 3.14159265359;
    }

    public Kreis(/*double umfang, double flaeche,*/ double radius, double pi) {
        //this.umfang = umfang;
        //this.flaeche = flaeche;
        this.radius = radius;
        this.pi = pi;
    }




    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }



    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }


    public double getUmfang(){
        umfang = 2 * radius * pi;
        return umfang;
    }

    public double getFlaeche(){
            flaeche = pi * (radius * radius);
            return flaeche;
    }
}
