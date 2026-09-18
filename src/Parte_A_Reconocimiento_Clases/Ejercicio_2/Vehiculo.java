package Parte_A_Reconocimiento_Clases.Ejercicio_2;


// Ejercicio 2: Define una clase Vehiculo con atributos marca, modelo, velocidadActual
// y un metodo mostrarEstado().


public class Vehiculo {

    //Atributos

    String marca;
    String modelo;
    int velocidadActual;

    //Metodo

    void mostrarEstado() {

        System.out.println( "Marca: " + marca);
        System.out.println( "Modelo: "+ modelo);
        System.out.println( "Velocidad: "+ velocidadActual " km/h");

        }
}
