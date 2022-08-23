package aufgabe5;

public class Schleifen {

    public static int entwickleKGV(int a, int b) {



        if (a*b==0){
            return 0;
        }


            int max = a < b ? b : a;
            int min = a < b ? a : b;
            int i;

            for (i = 1; (i*max)%min !=0; i++);

                System.out.println("kgv = " + i*max + "\n");
                return i*max;

    }
}
