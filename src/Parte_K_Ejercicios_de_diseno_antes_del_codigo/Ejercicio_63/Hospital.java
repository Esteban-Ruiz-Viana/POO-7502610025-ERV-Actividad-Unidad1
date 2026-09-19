package Parte_K_Ejercicios_de_diseno_antes_del_codigo.Ejercicio_63;


// Ejercicio 63: Planificar la clase Hospital antes de programarla,
// definiendo sus atributos, métodos y posibles objetos reales.

// Diseño antes del codigo:

// Atributos: nombre, direccion, capacidadCamas.

// Métodos: admitirPaciente(), darDeAlta(), mostrarInfo().

// Objetos reales: un hospital publico grande de una ciudad; una
// clinica privada pequeña; un hospital rural con pocas camas.


public class Hospital {

    String nombre;
    String direccion;
    int capacidadCamas;
    int camasOcupadas;

    void admitirPaciente() {

        if (camasOcupadas < capacidadCamas) {

            camasOcupadas = camasOcupadas + 1;

        } else {

            System.out.println( "No hay camas disponibles en " + nombre );

        }
    }

    void darDeAlta() {

        if (camasOcupadas > 0) {

            camasOcupadas = camasOcupadas - 1;

        }
    }

    void mostrarInfo() {

        System.out.println( "Hospital: " + nombre );
        System.out.println( "Dirección: " + direccion );
        System.out.println( "Camas ocupadas: " + camasOcupadas + "/" + capacidadCamas );

    }
}
