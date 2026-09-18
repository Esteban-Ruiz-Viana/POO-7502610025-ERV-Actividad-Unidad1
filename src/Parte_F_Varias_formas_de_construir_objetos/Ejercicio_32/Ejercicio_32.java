package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_32;

// Ejercicio 32: crear dos productos usando el metodo fabrica

public class Ejercicio_32 {

    public static void main(String args[]) {

        Producto producto1 = Producto.crearProductoBasico("Cuaderno", 3500);
        Producto producto2 = Producto.crearProductoBasico("Lapicero", 1200);

        //Imprimir

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();

    }
}