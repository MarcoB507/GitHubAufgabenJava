package Aufgabe9;

public class Vektor {

    public double x;
    public double y;
    public double z;

    public Vektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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



    public void add(double x, double y, double z){

        this.setX(this.getX() + x );
        this.setY(this.getY() + y );
        this.setZ(this.getZ() + z );
    }

    public void minus(double x, double y, double z){

        this.setX(this.getX() - x);
        this.setY(this.getY() - y );
        this.setZ(this.getZ() - z );

    }

    public void multi(double multipl){

        this.setX(this.getX() * multipl );
        this.setY(this.getY() * multipl );
        this.setZ(this.getZ() * multipl );

    }

    public void div(double dividieren){

        this.setX(this.getX() / dividieren );
        this.setY(this.getY() / dividieren );
        this.setZ(this.getZ() / dividieren );

    }


}
