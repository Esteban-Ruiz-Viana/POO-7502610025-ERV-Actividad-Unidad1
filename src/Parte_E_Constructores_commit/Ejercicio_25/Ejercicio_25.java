package Parte_E_Constructores_commit.Ejercicio_25;


// Ejercicio 25: Crea un objeto usando el constructor vacío y
// otro usando el constructor con parámetros.


public class Ejercicio_25 {

    static void main(String[]args ) {

            // Constructor Vacio

            Libro libro1 = new Libro();
            System.out.println("Libro creado con constructor vacio:");
            libro1.mostrarInfo();

            // Ahora le asignamos los datos a mano, despues de creado

            libro1.titulo = "El Principito";
            libro1.autor = "Antoine de Saint-Exupéry";
            libro1.paginas = 124;
            System.out.println("\nMismo libro, despues de asignarle datos:");
            libro1.mostrarInfo();

            // Objeto creado con el constructor con parametros

            Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);
            System.out.println("\nLibro creado con constructor con parametros:");
            libro2.mostrarInfo();

    }
}
