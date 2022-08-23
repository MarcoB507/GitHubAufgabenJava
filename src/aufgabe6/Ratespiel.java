package aufgabe6;


public class Ratespiel {
    public static void main(String args[]) {
        int min = 0;
        int max = 100;
        int wunschzahl = 0;

        do {

            System.out.println("Random Zahl von " + min + "bis" + max + ":");
            int random_zahl = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(random_zahl);
        }
            while (wunschzahl != 70);

        System.out.println("GG");
        }
}