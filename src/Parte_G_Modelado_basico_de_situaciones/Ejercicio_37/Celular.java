package Parte_G_Modelado_basico_de_situaciones.Ejercicio_37;


// Ejercicio 37: Crear clase Celular con marca, bateria y prendido,
// y métodos encender(), apagar() y cargarBateria().


public class Celular {

    String marca;
    int bateria;
    boolean prendido;


    void encender() {

        prendido = true;

    }

    void apagar() {

        prendido = false;

    }

    // Carga la bateria al 100%
    void cargarBateria() {

        bateria = 100;

    }
}