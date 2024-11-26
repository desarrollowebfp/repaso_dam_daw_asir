/* Descripción: Diseña un programa que recomiende una película basándose en dos factores:

El género favorito del usuario (Acción, Comedia, Terror, Drama).
La duración que desea (menos de 90 minutos, entre 90 y 120 minutos, más de 120 minutos).

El programa debe:

Pedir al usuario que ingrese su género favorito y la duración deseada.
Usar condicionales para recomendar una película específica según la combinación de género y duración.

Mostrar un mensaje si el género o la duración no están disponibles. */
public class RecomendadorDePeliculas {

    public static void main(String[] args) {
        //Definimos nuestros parámetros o factores con los que recomendar una película
        String genero = args[0];
        int duracion = Integer.parseInt(args[1]);

        //Condicional/Condicionales
        if (genero.equalsIgnoreCase("Acción")) {
            if (duracion < 120) {
                System.out.println("Mad Max (90 minutos)");
            } else if (duracion >= 120 && duracion < 140) {
                System.out.println("John Wick (127 minutos)");
            } else {
                System.out.println("The Dark Knight (146 minutos)");
            }
        } else if (genero.equalsIgnoreCase("Terror")) {
            if (duracion < 120) {
                System.out.println("A Quiet Place (90 minutos)");
            } else if (duracion >= 120 && duracion < 140) {
                System.out.println("Hereditary (127 minutos)");
            } else {
                System.out.println("The Shining (146 minutos)");
            }
        } else if (genero.equalsIgnoreCase("Ciencia ficción")) {
            if (duracion < 120) {
                System.out.println("Moon (90 minutos)");
            } else if (duracion >= 120 && duracion < 140) {
                System.out.println("E.T. (127 minutos)");
            } else {
                System.out.println("Dune (146 minutos)");
            }
        } else if (genero.equalsIgnoreCase("Drama")) {
            if (duracion < 120) {
                System.out.println("Pretty Woman (90 minutos)");
            } else if (duracion >= 120 && duracion < 140) {
                System.out.println("Amor y mocos (127 minutos)");
            } else {
                System.out.println("Titanic (146 minutos)");
            }
        } else {
            System.out.println("Género no disponible");
        }
    }
}
