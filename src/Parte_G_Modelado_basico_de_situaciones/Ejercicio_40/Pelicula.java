package Parte_G_Modelado_basico_de_situaciones.Ejercicio_40;


// Ejercicio 40: Crear clase Pelicula con nombre, genero, minutos y mostrarFicha().


public class Pelicula {

    String nombre;
    String genero;
    int minutos;

    void mostrarFicha() {

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Género: " + genero );
        System.out.println( "Duración: " + minutos + " minutos" );

    }
}