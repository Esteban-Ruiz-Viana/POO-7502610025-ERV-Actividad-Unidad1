package Parte_A_Reconocimiento_Clases.Ejercicio_3;


// Ejercicio 3: Define una clase Producto con atributos nombre, precio, stock
// y un metodo mostrarProducto().

public class Producto {

    //Atributos

    String nombre;
    double precio;
    int stock;

    //Metodo

    void mostrarProducto(){

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Precio: " + precio );
        System.out.println( "Stock: " + stock );

    }
}
