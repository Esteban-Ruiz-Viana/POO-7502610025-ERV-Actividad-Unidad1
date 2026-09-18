package Parte_A_Reconocimiento_Clases.Ejercicio_5;


// Ejercicio 5: Define una clase Mascota con atributos nombre, especie, edad
// y un metodo mostrarMascota().


public class Mascota {

    // Atributos

    String nombre;
    String especie;
    int edad;

    // Metodo

    void mostrarMascota() {

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Especie: " + especie );
        System.out.println( "Edad: " + edad + " años" );

    }
}
