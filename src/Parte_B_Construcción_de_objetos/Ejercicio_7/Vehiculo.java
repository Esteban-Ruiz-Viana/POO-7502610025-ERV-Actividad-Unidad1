package Parte_B_Construcción_de_objetos.Ejercicio_7;

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
}
