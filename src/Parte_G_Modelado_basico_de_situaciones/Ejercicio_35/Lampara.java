package Parte_G_Modelado_basico_de_situaciones.Ejercicio_35;


// Ejercicio 35: Crear una clase Lampara con marca y estado,
// y métodos para encenderla, apagarla y mostrar su estado.


public class Lampara {

    String marca;
    boolean encendida;

    void encender() {

        encendida = true;

    }

    void apagar() {

        encendida = false;

    }

    void mostrarEstado() {

        System.out.println("Marca: " + marca);
        System.out.println("Encendida: " + encendida);

    }
}

