package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_33;


// Ejercicio 33: Implementa un constructor copia en Libro.


public class Libro {

    public String titulo;
    public String autor;
    public int paginas;


    //Constructor Copia

    Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;

    }

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
