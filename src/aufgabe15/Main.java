package aufgabe15;

public class Main {

    public static void main(String[] args) {
        Adresse a1 = new Adresse("Stuttgart", "02");
        Person p1 = new Person(1, "Alf", a1 );

        Person p2;

//        try {
//            p2 = (Person) p1.deepClone();
//
//            System.out.println("Personen:");
//            System.out.println(p1 == p2);
//
//            System.out.println("Adressen:");
//            System.out.println(p1.getAdresse() == p2.getAdresse());
//
//            System.out.println(p1);
//            System.out.println(p2);
//
//        } catch(CloneNotSupportedException e) {
//            System.out.println("Etwas ist beim klonen schief gelaufen");
//        }


    }
}
