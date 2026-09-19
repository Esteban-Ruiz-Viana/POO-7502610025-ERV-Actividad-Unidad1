package Parte_K_Ejercicios_de_diseño_antes_del_codigo.Ejercicio_62;


// Ejercicio 62: Planificar la clase Biblioteca antes de programarla,
// definiendo sus atributos, métodos y posibles objetos reales.

// Diseño antes del codigo:

// Atributos: nombre, direccion, cantidadLibrosDisponibles.

// Métodos: prestarLibro(), recibirDevolucion(), mostrarInfo().

// Objetos reales: la biblioteca central de la universidad; una
// biblioteca publica municipal pequeña; una biblioteca escolar.


public class Biblioteca {

    String nombre;
    String direccion;
    int cantidadLibrosDisponibles;

    void prestarLibro() {

        if (cantidadLibrosDisponibles > 0) {

            cantidadLibrosDisponibles = cantidadLibrosDisponibles - 1;

        } else {

            System.out.println("No hay libros disponibles para prestar");

        }
    }

    void recibirDevolucion() {

        cantidadLibrosDisponibles = cantidadLibrosDisponibles + 1;

    }

    void mostrarInfo() {
        System.out.println( "Biblioteca: " + nombre );
        System.out.println( "Dirección: " + direccion );
        System.out.println( "Libros disponibles: " + cantidadLibrosDisponibles );

    }
}