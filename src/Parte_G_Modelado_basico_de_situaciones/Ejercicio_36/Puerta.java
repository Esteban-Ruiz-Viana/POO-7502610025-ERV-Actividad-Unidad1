package Parte_G_Modelado_basico_de_situaciones.Ejercicio_36;


// Ejercicio 36: Crear una clase Puerta con material y estado,
// y métodos para abrirla, cerrarla y mostrar su estado.


public class Puerta {

    String material;
    boolean abierta;

    void abrir() {

        abierta = true;

    }

    void cerrar() {

        abierta = false;

    }

    void mostrarEstado() {

        System.out.println( "Material: " + material );
        System.out.println( "Abierta: " + abierta );

    }
}