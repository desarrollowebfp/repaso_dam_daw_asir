
public class Bucles {

    public static void main(String[] args) {

        //Bucle for
        /* for (int i = 0; i < 3; i++) {
            System.out.println("La variable i tiene el valor: " + i);
        } */
        //Bucle while
        int contador = 0;

        while (contador <= 8) {
            System.out.println("Dentro del bucle " + contador);
            contador++;
        }

        System.out.println("Fuera del bucle " + contador);
    }
}
