package Parte_E_Constructores_commit.Ejercicio_26;

// Ejercicio 26: Haz lo mismo con la clase Producto.

public class Ejercicio_26 {

    public static void main(String args[]) {

        // Producto 1: constructor vacío

        Producto producto1 = new Producto();
        producto1.nombre = "Cuaderno";
        producto1.precio = 3500;
        producto1.stock = 20;

        // Producto 2: constructor con parametros

        Producto producto2 = new Producto("Lapicero", 1200, 50);

        //Imprimir

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();

    }
}