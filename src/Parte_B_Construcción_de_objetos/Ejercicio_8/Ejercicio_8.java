package Parte_B_Construcción_de_objetos.Ejercicio_8;


// Ejercicio 8: Crea tres objetos de Producto y evidencia que, aunque
// pertenecen a la misma clase, tienen estados distintos.


public class Ejercicio_8 {

    public static void main(String args[]) {

        //Producto 1

        Producto producto1 = new Producto();
        producto1.nombre = "Cuaderno";
        producto1.precio = 3500;
        producto1.stock = 20;

        //Producto 2

        Producto producto2 = new Producto();
        producto2.nombre = "Lapicero";
        producto2.precio = 1200;
        producto2.stock = 50;

        //Producto 3

        Producto producto3 = new Producto();
        producto3.nombre = "Mochila";
        producto3.precio = 65000;
        producto3.stock = 5;

        //Imprimir

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();
        System.out.println();
        producto3.mostrarProducto();

    }
}