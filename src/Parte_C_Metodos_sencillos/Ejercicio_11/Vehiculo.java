package Parte_C_Metodos_sencillos.Ejercicio_11;


// Ejercicio 11: aumenta la velocidad en 10


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
}