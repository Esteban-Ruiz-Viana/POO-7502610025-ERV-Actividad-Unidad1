package Parte_G_Modelado_basico_de_situaciones.Ejercicio_38;


// Ejercicio 38:
public class Ventilador {

    String marca;
    int velocidad;
    boolean encendido;

    void encender() {

        encendido = true;

    }

    void apagar() {

        encendido = false;

    }

    // Aumenta la velocidad en 1 cada vez que se llama

    void subirVelocidad() {

        velocidad = velocidad + 1;

    }
}