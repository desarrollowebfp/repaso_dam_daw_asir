
public class Pelicula {

    //Atributos/Variables
    public String titulo;
    public String director;
    public String genero;

    //El método constructor
    public Pelicula(String titulo, String director, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
    }

    //El método main que se ejecuta al lanzar Java
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula("The Matrix", "Wachowskis", "Ciencia ficción");
        System.out.println(matrix.titulo);
        System.out.println(matrix.director);
        System.out.println(matrix.genero);
    }
}
