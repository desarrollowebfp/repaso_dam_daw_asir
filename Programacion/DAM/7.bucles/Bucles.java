
public class Bucles {

    public static void main(String[] args) {

        //Bucle for
        /* for (int i = 0; i < 10; i++) {

            if (i < 9) {
                System.out.println("No soy el ultimo " + i);
            } else {
                System.out.println("Soy el ultimo " + i);
            }

        } */
        //Bucle while
        /*  int contador = 10;

        while (contador < 10) {
            System.out.println("Dentro del bucle " + contador);
            contador++;
        }

        System.out.println("Fuera del bucle " + contador); */
        //Do while
        int contador = 0;

        do {
            System.out.println("Dentro del bucle " + contador);
            contador++;
        } while (contador < 10);

    }
}
