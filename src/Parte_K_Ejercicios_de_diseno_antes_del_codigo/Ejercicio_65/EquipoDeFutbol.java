package Parte_K_Ejercicios_de_diseno_antes_del_codigo.Ejercicio_65;


// Ejercicio 65: Planificar la clase EquipoDeFutbol antes de programarla,
// definiendo sus atributos, métodos y posibles objetos reales.


// Diseño antes del codigo:

// Atributos: nombre, ciudad, cantidadJugadores.

// Métodos: agregarJugador(), jugarPartido(), mostrarInfo().

// Objetos reales: un equipo profesional de primera division; un
// equipo amateur de barrio; la seleccion de futbol universitaria.

public class EquipoDeFutbol {

    String nombre;
    String ciudad;
    int cantidadJugadores;

    void agregarJugador() {

        cantidadJugadores = cantidadJugadores + 1;

    }

    void jugarPartido() {

        System.out.println( nombre + " está jugando un partido en " + ciudad );

    }

    void mostrarInfo() {

        System.out.println("Equipo: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);

    }
}
