
import java.util.Scanner;

public class Portero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CONTRASEÑA
        System.out.println("¿Tienes contraseña?");
        String secretPassword = sc.nextLine();

        if (secretPassword.equals("1234")) {
            //EDAD
            System.out.println("Alto ahí, enseñeme el DNI");
            int edad = sc.nextInt();
            if (edad < 18) {
                System.out.println("No puedes entrar hasta que cumplas 18 años");
            } else if (edad >= 18 && edad <= 60) {
                System.out.println("Adelante, disfrute de la velada");
            } else if (edad > 60 && edad <= 122) {
                System.out.println("Pase usted a la zona con asientos para que no se haga daño");
            } else {
                System.out.println("Tira por ahí");
            }
        } else {
            System.out.println("Vuelve cuando seas del club secreto");
        }

        //Por buena práctica cerramos el scanner para que detenga su ejecución
        sc.close();
    }
}
