package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_34;


// Ejercicio 34: Crea un libro original y luego una copia.


public class Ejercicio_34 {

    static void main(String[]args ) {

            Libro original = new Libro("El Principito", "Antoine de Saint-Exupéry", 124);
            Libro copia = new Libro(original);

            //Libro original

            System.out.println("Libro original:");
            original.mostrarInfo();

            //Copia del libro

            System.out.println("\nCopia del libro:");
            copia.mostrarInfo();

            // Cambiamos el título de la copia para comprobar
            // que el libro original no cambia.
            copia.titulo = "El Principito (edición especial)";


            System.out.println( "\nDespues de modificar la copia:" );
            System.out.println( "Copia -> " + copia.titulo );
            System.out.println( "Original -> " + original.titulo );

    }
}
