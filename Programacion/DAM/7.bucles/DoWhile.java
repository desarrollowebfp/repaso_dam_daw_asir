
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Ver perfil");
            System.out.println("2. Editar configuración");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Evaluar la opción ingresada
            switch (opcion) {
                case 1:
                    System.out.println("Mostrando tu perfil...");
                    break;
                case 2:
                    System.out.println("Abriendo configuración...");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intenta nuevamente.");
            }

            System.out.println(); // Línea en blanco para separar iteraciones
        } while (opcion != 3);

        scanner.close();
    }
}
