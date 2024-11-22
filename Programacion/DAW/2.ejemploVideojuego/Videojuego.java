
public class Videojuego {

    //Atributos
    public String titulo;
    public String consola;
    public String marca;

    //Constructor de objetos: Inicializar los valores del videojuego
    public Videojuego(String titulo, String consola, String marca) {
        this.titulo = titulo;
        this.consola = consola;
        this.marca = marca;
    }

    public static void main(String[] args) {
        //Vamos a crear un videojuego
        Videojuego supermario = new Videojuego("Super Mario Bros", "Nintendo Switch", "Nintendo");
        System.out.println(supermario.titulo);
        System.out.println(supermario.consola);
        System.out.println(supermario.marca);
    }
}
