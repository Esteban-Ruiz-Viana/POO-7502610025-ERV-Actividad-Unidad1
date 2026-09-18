package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_31;


// Ejercicio 31: crea un metodo fabrica estatico llamado crearProductoBasico.


public class Producto {

    //Atributos

    String nombre;
    double precio;
    int stock;

    // Constructor vacío

    Producto() {}

    // Constructor con parametros

    Producto(String nombre, double precio, int stock) {

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    //Crear Producto Basico

    static Producto crearProductoBasico(String nombre, double precio) {

        return new Producto (nombre, precio, 0) ;

    }


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
