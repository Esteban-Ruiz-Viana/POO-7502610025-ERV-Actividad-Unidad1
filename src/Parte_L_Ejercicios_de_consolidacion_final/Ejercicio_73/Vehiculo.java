package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_73;


// Ejercicio 73: reescribo el Ejercicio 2 (Vehiculo), agregandole ahora
// un constructor copia.

public class Vehiculo {

    //Atributos

    String marca;
    String modelo;
    int velocidadActual;

    //Constructor copia

    Vehiculo(Vehiculo otroVehiculo) {

        this.marca = otroVehiculo.marca;
        this.modelo = otroVehiculo.modelo;
        this.velocidadActual = otroVehiculo.velocidadActual;

    //Metodo

    void mostrarEstado() {

        System.out.println( "Marca: " + marca);
        System.out.println( "Modelo: "+ modelo);
        System.out.println( "Velocidad: "+ velocidadActual + " km/h");

        }
}
