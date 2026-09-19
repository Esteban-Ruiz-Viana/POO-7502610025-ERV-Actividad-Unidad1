package Parte_K_Ejercicios_de_diseno_antes_del_codigo.Ejercicio_64;


// Ejercicio 64: Planificar la clase Tienda antes de programarla,
// definiendo sus atributos, métodos y posibles objetos reales.

// Diseño antes del codigo:

// Atributos: nombre, direccion, totalVentasDelDia.

// Métodos: venderProducto(double valor), registrarIngreso(), mostrarInfo().

// Objetos reales: una tienda de barrio, una tienda de ropa en un
// centro comercial, una ferreteria.


public class Tienda {


    String nombre;
    String direccion;
    double totalVentasDelDia;

    void venderProducto(double valor) {

        totalVentasDelDia = totalVentasDelDia + valor;

    }

    void registrarIngreso() {

        System.out.println( "Ingreso total del día en " + nombre + ": $" + totalVentasDelDia );

    }

    void mostrarInfo() {

        System.out.println( "Tienda: " + nombre );
        System.out.println( "Dirección: " + direccion );
        System.out.println( "Ventas del día: $" + totalVentasDelDia );

    }
}