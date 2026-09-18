package Parte_G_Modelado_basico_de_situaciones.Ejercicio_39;


// Ejercicio 39: crear clase Cancion con titulo, artista, duracion y mostrarInfo

public class Cancion {

    String titulo;
    String artista;
    int duracion;

    void mostrarInfo() {

        System.out.println( "Título: " + titulo );
        System.out.println( "Artista: " + artista );
        System.out.println( "Duración: " + duracion + " segundos" );

    }
}