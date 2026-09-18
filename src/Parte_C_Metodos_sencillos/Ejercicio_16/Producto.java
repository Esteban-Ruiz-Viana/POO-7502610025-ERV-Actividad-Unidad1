package Parte_C_Metodos_sencillos.Ejercicio_16;


// Ejercicio 16: aumenta el stock al reabastecer


public class Producto {

    //Atributos

    String nombre;
    double precio;
    int stock;

    //Metodo

    void mostrarProducto(){

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Precio: $ " + precio );
        System.out.println( "Stock: " + stock );

    }

    void vender (int cantidad) {

        if (cantidad <= stock) {
            stock =  stock - cantidad;

            } else {

            System.out.println("No hay suficiente stock para vender " + cantidad);

        }
    }

    void reabastecer (int cantidad) {

        stock = stock + cantidad;

    }
}
