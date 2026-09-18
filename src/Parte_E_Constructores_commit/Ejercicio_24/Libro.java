package Parte_E_Constructores_commit.Ejercicio_24;


// Ejercicio 24: Agrega un constructor con parámetros a Libro.


public class Libro {

    public String titulo;
    public String autor;
    public int paginas;

    Libro() {}

    Libro(String titulo, String autor, int paginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }

    public void mostrarInfo() {

        System.out.println( "Título: " + titulo );
        System.out.println( "Autor: " + autor );
        System.out.println( "Páginas: " + paginas );

    }
}
