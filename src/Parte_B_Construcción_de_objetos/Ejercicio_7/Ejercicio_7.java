package Parte_B_Construcción_de_objetos.Ejercicio_7;


// Ejercicio 7: Crea dos objetos de Vehiculo con valores diferentes
// y muestra el estado de ambos.


public class Ejercicio_7 {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Mazda";
        vehiculo1.modelo = "CX-5";
        vehiculo1.velocidadActual = 0;

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Toyota";
        vehiculo2.modelo = "Fortune";
        vehiculo2.velocidadActual = 40;

        System.out.println("Estado del vehiculo 1:");
        vehiculo1.mostrarEstado();

        System.out.println("\nEstado del vehiculo 2:");
        vehiculo2.mostrarEstado();
    }
}