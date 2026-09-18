package Parte_C_Metodos_sencillos.Ejercicio_12;


// Ejercicio 12: disminuye la velocidad en 10, sin dejarla negativa


public class Vehiculo {

    //Atributos

    String marca;
    String modelo;
    int velocidadActual;

    //Metodo

    void mostrarEstado() {

        System.out.println( "Marca: " + marca);
        System.out.println( "Modelo: "+ modelo);
        System.out.println( "Velocidad: "+ velocidadActual + " km/h");

    }

    void acelerar() {

        velocidadActual = velocidadActual + 10;

    }

    // La velocidad nunca puede ser negativa

    void frenar() {
        velocidadActual = velocidadActual - 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;

        }
    }
}