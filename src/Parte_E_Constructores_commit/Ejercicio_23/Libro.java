package Parte_E_Constructores_commit.Ejercicio_23;


// Ejercicio 23: Agrega un constructor vacío a la clase Libro.


public class Libro {

    public String titulo;
    public String autor;
    public int paginas;

    Libro() {}

    public void mostrarInfo() {

        System.out.println( "Título: " + titulo );
        System.out.println( "Autor: " + autor );
        System.out.println( "Páginas: " + paginas );

    }
}
