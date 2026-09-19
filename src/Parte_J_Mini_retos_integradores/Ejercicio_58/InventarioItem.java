package Parte_J_Mini_retos_integradores.Ejercicio_58;


// Ejercicio 58: Crea una clase InventarioItem con nombre,
// cantidad y precioUnitario. Agrega método para calcular
// el valor total del inventario del objeto.


public class InventarioItem {

    String nombre;
    int cantidad;
    double precioUnitario;

    // Calcula el valor total de este item en el inventario

    double calcularValorTotal() {

        return cantidad * precioUnitario;

    }
}