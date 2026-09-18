package Parte_C_Metodos_sencillos.Ejercicio_18;


// Ejercicio 18: aumenta la edad en 1 cada vez que se llama


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

    void cumplirAnios() {

        edad = edad + 1;

    }
}