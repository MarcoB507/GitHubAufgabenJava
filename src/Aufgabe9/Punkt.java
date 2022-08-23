package Aufgabe9;

public class Punkt {
    public double x;
    public double y;

    public double z;

    public Punkt p;

    public Punkt(double a, double b){
        x = a;
        y = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double RueckgabeX() {
        return x;
        }
     public double RueckgabeY(){
        return y;
        }


     public Punkt(Punkt p){
        x = p.x;
        y = p.y;
        }
     public double Rueckgabe3(){
         return x;
     }
     public double Rueckgabe4(){
        return y;
        }

    public void addPunkt(double x, Double y){
        this.setX(this.getX() +x);
        this.setY(this.getY() +y);
    }

    public void subtractPunkt(double x, Double y){
        this.setX(this.getX() -x);
        this.setY(this.getY() -y);
     }

     public  void multiplyPunkt(double multiplier){
        this.setX(this.getX() * multiplier);
        this.setY(this.getY() * multiplier);
     }

     public void dividePunkt(Double dividieren){
        this.setX(this.getX() / dividieren);
        this.setY(this.getY() / dividieren);
     }
}
/*
    //Felder
    public int x;
    public int y;

    //Standardkonstruktor
    public Punkt(Punkt p1){
        x = 0;
        y = 0;
    }

    //Parameterkonstruktor
    public Punkt(int xNew, int yNew)
    {
        x = xNew;
        y = yNew;
    }

    //set- und get-Methoden

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void verschieben(int dx, int dy){
        x += dx;
        y += dy;
    }

    public void spiegleAmUrsprung(){
        x = -x;
        y = -y;
    }*/

