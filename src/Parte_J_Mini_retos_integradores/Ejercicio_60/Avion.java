package Parte_J_Mini_retos_integradores.Ejercicio_60;

// Ejercicio 60: Crea una clase Avion con aerolinea,
// destino y pasajeros. Agrega método abordar(int cantidad).

public class Avion {

    String aerolinea;
    String destino;
    int pasajeros;

    // Sube "cantidad" pasajeros mas al avion

    void abordar(int cantidad) {

        pasajeros = pasajeros + cantidad;

    }
}
